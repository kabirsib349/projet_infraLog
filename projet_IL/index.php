<?php
include('script.php');
?>

<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Catalogue de Produits - Café</title>
  <link rel="stylesheet" href="styles.css"> <!-- pour relier à la page CSS-->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
  <header>
    <h1>Catalogue de Produits</h1>
    <nav class="nav">
    <ul class="nav nav-pills">
      <li class="nav-item">
        <a class="nav-link" href="accueil.php">Accueil</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" aria-current="catalogue de produits" href="index.php">Catalogue de Produits</a>
      </li>
    </ul>
    </nav>
  </header>
  <main class="catalogue">
    <?php
    // Afficher chaque produit sous forme de carte
    foreach ($products as $product) {
    ?>
    <a href="produit.php?id=<?php echo $product['product_id']; ?>" class="no-underline">
      <div class="product-card">
        <!--<img src="images/<?php echo $product['image']; ?>" alt="<?php echo $product['name']; ?>">-->
        <h2><?php echo $product['name']; ?></h2>
        <!--<p><?php echo $product['description']; ?></p>-->
        <p class="price"><?php echo $product['price']; ?>€</p>
        <button type="button" class="btn btn-success">+</button>
      </div>
    </a>
    <?php
    }
    ?>
  </main>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>
