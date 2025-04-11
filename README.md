# University Product Management System

## Description
Le système de gestion des produits de l'université permet de gérer différents types de produits (comme des équipements électroniques) dans un environnement universitaire. Ce projet inclut la création de produits, la recherche, le filtrage et l'affichage des produits en fonction de différents critères comme le nom, le prix et la quantité en stock.

## Fonctionnalités
- **Ajout de produits** : Ajouter de nouveaux produits dans le système (le code pour l'ajout est actuellement commenté).
- **Affichage des produits** : Afficher tous les produits présents dans le système.
- **Recherche de produits** :
  - Recherche par nom de produit (ex: produits contenant "C").
  - Recherche par prix (ex: produits dont le prix est supérieur à 100).
  - Recherche avec des expressions comme "%C%" pour filtrer les produits dont le nom contient certaines lettres.
  
## Technologies utilisées
- **Back-end** : Java avec Spring Boot
- **Base de données** : MySQL (ou autre base de données selon votre configuration)

## Installation

### Prérequis
Assurez-vous d'avoir les outils suivants installés :
- [JDK 17+](https://openjdk.java.net/)
- [MySQL](https://www.mysql.com/) (ou une autre base de données selon votre projet)
- [Maven](https://maven.apache.org/)
- [IDE (IntelliJ IDEA, Eclipse)](https://www.jetbrains.com/idea/)

### Étapes d'installation

1. Clonez le dépôt du projet :
   ```bash
   git clone https://github.com/votre-utilisateur/university-product-management.git
