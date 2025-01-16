<?php
try {
    // Connexion à la base de données
    $mysqlClient = new PDO('mysql:host=localhost;dbname=mocha;charset=utf8', 'root', '');
    // Activation des exceptions en cas d'erreur
    $mysqlClient->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (Exception $e) {
    die('Erreur : ' . $e->getMessage());
}

// Récupérer l'ID depuis l'URL
$product_id = isset($_GET['id']) ? intval($_GET['id']) : 0;

if ($product_id <= 0) {
    echo "ID de produit invalide.";
    exit;
}

try {
    // Préparer une requête pour récupérer les informations du produit
    $sql = "SELECT * FROM products WHERE product_id = :id";
    $stmt = $mysqlClient->prepare($sql);
    $stmt->bindValue(':id', $product_id, PDO::PARAM_INT); // Assurez-vous que le paramètre correspond au nom dans la requête SQL
    $stmt->execute();

    // Vérifie si le produit existe
    $product = $stmt->fetch(PDO::FETCH_ASSOC);
    if (!$product) {
        echo "Produit introuvable.";
        exit;
    }
} catch (Exception $e) {
    die('Erreur lors de la récupération des données : ' . $e->getMessage());
}
?>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo htmlspecialchars($product['name']); ?></title>
</head>
<body>
    <h1><?php echo htmlspecialchars($product['name']); ?></h1>
    <img src="<?php echo htmlspecialchars($product['image_url']); ?>" alt="<?php echo htmlspecialchars($product['name']); ?>">
    <p>Description : <?php echo htmlspecialchars($product['description']); ?></p>
    <p>Catégorie : <?php echo htmlspecialchars($product['category']); ?></p>
    <p>Prix : <?php echo htmlspecialchars($product['price']); ?>€</p>
</body>
</html>
