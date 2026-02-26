# SOLUTIONS AUX EXERCICES SUR L'HÉRITAGE

## 1. Réponses aux exercices théoriques

### Exercice 1 : Phrases trouées

1. Java ne permet que l'héritage **simple**.

2. L'une des clés de la puissance de la programmation orientée objet provient de la réutilisation logicielle fournie par **l'héritage**.

3. Grâce à l'héritage, une nouvelle classe hérite des variables d'instance et des méthodes d'une super classe définie auparavant. Cette nouvelle classe se nomme **sous-classe**.

4. Par l'héritage simple, une classe hérite que **d'une seule super classe**.

5. Java ne permet pas l'héritage **multiple** (pour les classes).

6. Par héritage multiple, on entend qu'une classe hérite de **plusieurs super classes**.

7. Une sous-classe représente un ensemble plus **restreint**/**défini** d'objets que sa super classe.

8. Une sous-classe ne peut pas accéder aux membres **`private`** de sa super classe.

9. Une sous-classe peut accéder aux membres d'accès **`protected`**, **`public`** et au niveau de package de sa super classe.

10. La sous-classe doit se retrouver dans le même package que sa super classe pour en utiliser les membres à accès **package**.

11. Un constructeur de la sous-classe appelle toujours **le constructeur de la super classe** en premier lieu, que ce soit de manière explicite ou implicite, pour créer et **initialiser** les membres de la sous-classe hérités de la super classe.

12. L'héritage permet la réutilisation **de code**, qui économise du temps lors du **développement** des programmes.

13. Tout objet d'une **sous-classe** correspond également à un objet de sa **super classe** tandis que l'inverse n'est pas vrai.

14. Le mécanisme de l'héritage implique qu'une classe devient soit:  
    une **super classe** qui fournit des attributs et des comportements à d'autres classes ou soit qu'elle hérite d'attributs et de comportements en tant que **sous-classe**

15. L'héritage permet la création de nouvelles **classes** à partir d'anciennes en absorbant leurs **attributs** et leurs **méthodes** tout en ajoutant les fonctionnalités dont les nouvelles classes ont besoin.

16. Une **classe abstraite** est une classe incomplète qu'on ne peut pas instancier et qui sert de modèle pour d'autres classes.

17. Une méthode **abstraite** est une méthode sans implémentation, déclarée avec le mot-clé abstract dans une classe abstraite.

18. Tout objet d'une **sous-classe** correspond également à un objet de sa **super classe**.

19. Une **interface** est un contrat qui définit ce qu'une classe doit faire, mais pas comment elle le fait.

20. Une relation de type EST UN entre 2 classes correspond à un lien d'**héritage**.

21. Une relation de type A UN entre 2 classes correspond à un lien de **composition**.

22. Les méthodes de la super classe qui ne doivent pas être accessibles aux sous-classes par le mécanisme de l'héritage seront déclarés comme **private** dans la super classe.

23. Une super classe peut posséder **plusieurs** sous-classes.

24. Les interfaces permettent **l'implémentation** multiples, contrairement aux classes.

25. Inscrivez une courte définition de l'héritage simple.  
   **Réponse :** L'héritage simple permet à une classe de dériver d'une seule super classe.

26. Inscrivez une courte définition de l'héritage multiple.  
   **Réponse :** L'héritage multiple permet à une classe de dériver de plusieurs super classes (non supporté en Java pour les classes, mais possible via interfaces).

27. Inscrivez une courte définition du terme substitution ou redéfinition.  
   **Réponse :** La substitution (ou redéfinition) est le fait de redéfinir une méthode héritée dans une sous-classe pour modifier son comportement.

28. Inscrivez une courte définition du terme surcharge.  
   **Réponse :** La surcharge est la définition de plusieurs méthodes avec le même nom mais des signatures différentes (paramètres différents).

29. Inscrivez trois avantages d'utiliser l'héritage.  
    **Réponse :**  
    - Réutilisation de code.  
    - Extensibilité/Évolutivité (ajout de nouvelles fonctionnalités sans modifier le code existant).  
    - Polymorphisme (traiter des objets de sous-classes comme des objets de la super classe).

30. Lorsqu'il y a substitution d'une méthode de la sous-classe, on doit utiliser le mot **super** pour faire référence à la méthode de la super classe.

31. Le mot clé `protected` devant le nom d'un membre signifie que: **Le membre est accessible aux sous-classes et aux classes du même package.**

32. Quand on est au niveau de la sous-classe, qu'est-ce que je peux faire par rapport à la super classe?  
    a) On peut ajouter des **attributs** par rapport à la super classe.  
    b) On peut ajouter des **méthodes** par rapport à la super classe.  
    c) On peut effectuer de la **substitution** par rapport aux méthodes de la super classe.

33. Quel mode d'accès devons-nous utiliser pour les attributs quand nous utilisons l'héritage ?  
   **Réponse :** `protected` (pour permettre l'accès aux sous-classes tout en protégeant contre l'accès externe).

34. Si une classe Alpha hérite d'une classe `Beta`, alors la classe `Alpha` s'appelle la **sous-classe** et la classe `Beta` en est la **super classe**.

35. Les quatre modificateurs d'accès sont: **public**, **private**, **protected**, **package (default)**.

36. Un objet d'une **sous-classe** peut se traiter comme un objet de sa **super classe** correspondante.

37. Une sous-classe appelle n'importe quel membre qui n'est pas privé de la super classe en utilisant le mot clé **super** comme préfixe à l'appel d'une méthode.

38. Une classe abstraite peut contenir des méthodes **concrètes** qui ont une implémentation complète.

39. Les interfaces en Java permettent **l'implémentation** multiple pour les classes qui les implémentent.

40. Pour qu'une classe implémente une interface, elle utilise le mot-clé **implements** suivi du nom de l'interface.

### Exercice 2 : Vrai ou faux

1. Lorsqu'une super classe fournit une méthode, ses sous-classes peuvent la remplacer mais cela n'est pas obligatoire.  
   **Vrai**

2. Une super classe représente habituellement un nombre plus élevé d'objets que sa sous-classe.  
   **Vrai**

3. Une sous-classe possède normalement moins de fonctionnalités que sa super classe.  
   **Faux** (elle a au moins les mêmes, plus des supplémentaires)

4. Lorsqu'on utilise l'héritage, dans la classe Test (même package), on peut...  
    a. créer un objet de la super classe? **Vrai**  
    b. créer un objet d'une des sous-classes? **Vrai**  
    c. accéder directement aux attributs de la super classe? **Faux** (dépend du modificateur d'accès)  
    d. faire référence à la super classe par le mot super? **Faux** (super est utilisé dans les sous-classes)

5. On peut utiliser dans une sous-classe, l'instruction super.super.toString().  
   **Faux** (super.super n'existe pas)

6. Une super classe a normalement plus d'attributs que ses sous-classes.  
   **Vrai**

7. Le chaînage des constructeurs paramétrés se fait de façon automatique avec la super classe.  
   **Faux** (il faut appeler super() explicitement si nécessaire)

8. Dans une méthode de la sous-classe, on peut utiliser directement le nom des attributs de la super classe?  
    a. Si les attributs sont `private` **Faux**  
    b. Si les attributs sont `public` **Vrai**  
    c. Si les attributs sont `protected` **Vrai**

9. Dans le constructeur par défaut d'une sous-classe on est pas obligé d'inscrire l'appel au constructeur par défaut de la super classe.  
   **Faux** (il est appelé implicitement)

10. Dans la classe Test on a accès directement aux attributs `protected` de la super classe.  
    **Faux** (seulement via des objets ou dans les sous-classes)

11. L'appel du constructeur par défaut de la super classe dans le constructeur par défaut de la sous-classe, doit toujours être la première instruction de celle-ci?  
    **Vrai**

12. Une super classe spécifie la généralité de ses sous-classes.  
    **Vrai**

13. Java n'autorise que l'héritage multiple.  
    **Faux** (Java autorise l'héritage simple pour les classes, multiple pour les interfaces)

14. Tout objet d'une super classe peut aussi être un objet d'une sous-classe.  
    **Faux** (l'inverse est vrai)

15. Une classe abstraite peut être instanciée avec le mot-clé new.  
    **Faux**

16. Les interfaces peuvent contenir des méthodes avec implémentation grâce au mot-clé default.  
    **Vrai**

17. Une classe peut hériter d'une classe abstraite et implémenter plusieurs interfaces simultanément.  
    **Vrai**

18. Les méthodes abstraites dans une interface sont implicitement public et abstract.  
    **Vrai**

19. Une classe abstraite peut avoir des constructeurs, même si elle n'est pas instanciable.  
    **Vrai**

20. Les attributs dans une interface sont implicitement public, static et final.  
    **Vrai**
