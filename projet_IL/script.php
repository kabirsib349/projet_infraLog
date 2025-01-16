<?php
try {
    $mysqlClient = new PDO('mysql:host=localhost;dbname=mocha;charset=utf8', 'root', ''); //connexion, utilisateur, mdp
} catch (Exception $e) {
    die('Erreur : ' . $e->getMessage());
}

// récupération de la table 'PRODUCTS'
$request = 'SELECT * FROM products';
$productsStatement = $mysqlClient->prepare($request);
$productsStatement->execute();
$products = $productsStatement->fetchAll();
?>


