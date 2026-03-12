# Préparation au Travail Pratique 2 - Bibliothèque

## Énoncé sommaire
- Cet énoncé est pour préparer votre structure de code avant de recevoir l'énoncé officiel questionnaire du Travail Pratique 2

# Programme de gestion de bibliothèque

Préparer votre diagrammme UML et le skelette de votre application Java correspondant aux descriptions suivantes. Vous pouvez à tout moment demander des précisions et vérifications par votre professeur ;

1. **Classe de gestion** `Bibliotheque` :
    - Sert à répertorier les *articles* locatifs de la bibliothèque dans un *catalogue*. Les *articles* locatifs de la bibliothèque sont:
        - Des *livres*
        - De la *musique*
        - Des *films*
        - Des *jeux vidéos*
        
2. **Interfaces** :
    - `Recherche` :
        - Définit les fonctions de recherche nécessaire à un compte utilisateur ou à un compte libraire pour trouver un article dans le catalogue 
    - `Gestion` :
        - Définit les fonctions nécessaire à la gestion du catalogue (CRUD)

3. **Classes** :
    - `Compte` :
        - Représenter un compte utilisateur client de la bibliothèque
    - `Libraire` :
        - Représente un libraire gestionnaire
    - Abstraite `Article`
        - Réprésente un article
        - Les articles concrets à mettre en classe étendues
            - *Livre*
            - *Musique*
            - *Film*
            - *JeuVidéo*
    
4. **Fonctionnement** :
    - Le catalogue répertorie les articles et implémente les interfaces de recherche et de gestion
    - La *bibliothèque* répertorie les *comptes* et les *libraires*
    - Jusqu'à 12 *articles* peuvent être loué par un compte
    - Jusqu'à 3 *articles* peuvent être reservés par un compte

5. **Application** :
    - L'application concrète est un menu console où d'abord un numéro de compte est donné à l'écran
    - Ensuite, on entre dans le menu approprié si le numéro correspond à un client ou à un libraire
