
# Exercice — Conservatoire (héritage, polymorphisme)

## Énoncé détaillé

# Développement d'un programme d'orchestre d'un conservatoire de musique

1. **Classe** `Orchestre` :
    - Sert à gérer les musiciens au sein de l'orchestre (Ajouter ou retirer un musicien)
    - Accès aux musiciens de l'orchestre par getter

2. **Interfaces** :
    - `Cordiste`
        - `Colophane()` : Met de la colophane sur son archet
    - `Ventiste`
        - `Évacuer()` : Évacuer le condensat accumulé dans l'instrusment par la clé d'eau
    - `Percusionniste()`
        - `Refeutrage()` : Refeutre les baguettes ou marteaux de l'instrument de percussion

3. **Classes** :
    - `Violoniste`, `Violoncelliste` implémentent `Cordiste`
        - `Accorder` : Accorde son instrument
            - Après avoir joué 4 fois, l'instrument est désaccordé
        - `Jouer()` : Fait jouer de son instrument à cordes
            - Doit être **accordé** et doit avoir de la **colophane** sur son archet pour jouer de la musique
            - Après avoir joué 30 fois, il n'y a plus de colophane sur l'archet
    - `Altiste` étend `Violoniste`
        - `Accorder` : Accorde son instrument
            - Après avoir joué 3 fois, l'instrument est désaccordé
        - `Jouer()` : Fait jouer de son instrument à cordes
            - Doit **seulement avoir de la colophane** sur son archet pour jouer de la musique
    - `Trompettiste`, `Clarinettiste` implémentent `Ventistes`
        - `Accorder` : Accorde son instrument
            - Après avoir joué 7 fois, l'instrument est désaccordé
        - `Jouer()` : Fait jouer de son instrument à vent
            - Doit être **accordé** et doit avoir **évacué** le condensat pour jouer de la musique
            - **Après avoir joué 1 fois, l'instrument est plein de condensat**
    - `Timbalier`, `Pianiste` implémentent `Percusionniste`
        - `Accorder` : Accorde son instrument
            - `Timablier` : Après avoir joué 2 fois, l'instrument est désaccordé
            - `Pianiste` : Après avoir joué 100 fois, l'instrument est désaccordé
        - `Jouer()` : Fait jouer de son instrument de percussion
            - Doit avoir du feutre sur ses baguettes ou marteaux pour jouer de la musique
            - Après avoir joué 50 fois, les baguettes n'ont plus de feutre
    - `ChefOrchestre`
        - `Accorder()` : **Fait accorder tous les musiciens ET préparer leurs instruments (colophane, condensat, feutrage)**
        - `Jouer()` : Fait jouer de tous les musiciens dans le conservatoire
            - Peut seulement faire jouer tous les musiciens si ceux-ci sont tous accordés et qu'ils sont prêt à jouer (colophane, condensat, feutrage)
        - **Pour nous aider, lors de la création du chef d'orchestre, passer au constructeur l'`Orchestre`**
    - Prendre en compte les aspects suivants:
        - Retenir le nombre de fois que le musicien a joué de son instrument
        - Retenir les différents états **accordé, colophane, condensat, feutrage** pour savoir si le musicien peut jouer

4. **Abstraction** :
    - Déterminer la classe abstraite approprié pour les musiciens.

5. **Exécution**
    - Faire un orchestre, y ajouter toutes les classes de musicien et un chef d'orchestre
    - Faire accorder, préparer et jouer toute l'orchestre à l'aide du chef d'orchestre.
