# EXERCICES PRATIQUES SUR l'HÉRITAGE

## 1. Conception UML

En équipe de 2, proposez le schéma UML (au format `.puml`) d'une application qui manipulerait des objets des classes `Rectangle`, `Carre` et `Triangle` :

- a) Définir une structure de classe appropriée mettant en application l'héritage entre les classes. Il est permis d'ajouter des classes, en autant que les 3 classes demandées soient incluses dans le diagramme.
- b) Définir les attributs des différentes classes et les ajouter au diagramme, avec les bons niveaux de visibilité.
- c) Définir les méthodes des différentes classes et les ajouter au diagramme, avec les bons niveaux de visibilité.
- d) Les objets doivent être comparables entre eux (comment?).
- e) On doit pouvoir évaluer l'égalité de 2 objets avec `.equals()`. Vous pouvez auto-générer la méthode et la modifier selon vos critères.

## 2. Implémentation

Faire l'implémentation des classes du modèle défini à l'exercice précédent.

- a) Créer 3 objets de chacune des classes `Rectangle`, `Carre` et `Triangle` afin de tester les différentes méthodes : constructeurs, *getters*, *setters*, toString(), autres méthodes particulières.
- b) Mettre les objets dans 3 `ArrayList` : `ArrayList<Rectangle>`, `ArrayList<Carre>` et `ArrayList<Triangle>`. Tester le tri des objets.
- c) Tester la méthode `.equals()` entre vos objets.

## 3. Maintenance

Coup de théâtre! Votre application doit maintenant pouvoir gérer 2 nouvelles classes : `Cercle` et `Losange`. Êtes-vous en mesure de **directement** les ajouter à l'application sans rien *briser*?

Sinon, quelles modifications sont nécessaires? Ces problèmes d'évolutivité (*scalability*) auraient-ils pu être évités en concevant le système de classe différemment au départ?
