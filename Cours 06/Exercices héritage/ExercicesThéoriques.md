# EXERCICES THÉORIQUES SUR l'HÉRITAGE

## 1. Inscrivez les termes manquants pour chacun des énoncés

1. Java ne permet que l'héritage _________________.

2. L'une des clés de la puissance de la programmation orientée objet provient de la réutilisation logicielle fournie par _____________________.

3. Grâce à l'héritage, une nouvelle classe hérite des variables d'instance et des méthodes d'une super classe définie auparavant. Cette nouvelle classe se nomme _____________________.

4. Par l'héritage simple, une classe hérite que ___________________________________.

5. Java ne permet pas l'héritage _____________________________________________.

6. Par héritage multiple, on entend qu'une classe hérite de _____________________________.

7. Une sous-classe représente un ensemble plus ___________________ d'objets que sa super classe.

8. Une sous-classe ne peut pas accéder aux membres _____________ de sa super classe.

9. Une sous-classe peut accéder aux membres d'accès ______________  et ___________ et au niveau de package de sa super classe.

10. La sous-classe doit se retrouver dans le même package que sa super classe pour en utiliser les membres à accès ________________________.

11. Un constructeur de la sous-classe appelle toujours _____________________________ en premier lieu, que ce soit de manière explicite ou implicite, pour créer et _____________________ les membres de la sous-classe hérités de la super classe.

12. L'héritage permet la réutilisation ________________, qui économise du temps lors du ___________________________ des programmes.

13. Tout objet d'une _________________________ correspond également à un objet de sa __________________________________________ tandis que l'inverse n'est pas vrai.

14. Le mécanisme de l'héritage implique qu'une classe devient soit:  
    une ______________  qui fournit des attributs et des comportements à d'autres classes ou soit qu'elle hérite d'attributs et de comportements en tant que __________________

15. L'héritage permet la création de nouvelles _______________  à partir d'anciennes en absorbant leurs _________________  et leurs ____________________ tout en ajoutant les fonctionnalités dont les nouvelles classes ont besoin.

16. Une _______________ est une classe incomplète qu'on ne peut pas instancier et qui sert de modèle pour d'autres classes.

17. Une méthode _______________ est une méthode sans implémentation, déclarée avec le mot-clé abstract dans une classe abstraite.

18. Tout objet d'une ______________________ correspond également à un objet de sa ______________________.

19. Une _______________ est un contrat qui définit ce qu'une classe doit faire, mais pas comment elle le fait.

20. Une relation de type EST UN entre 2 classes correspond à un lien d'________________.

21. Une relation de type A UN entre 2 classes correspond à un lien de ________________.

22. Les méthodes de la super classe qui ne doivent pas être accessibles aux sous-classes par le mécanisme de l'héritage seront déclarés comme _______________ dans la super classe.

23. Une super classe peut posséder ___________________ sous-classes.

24. Les interfaces permettent les _______________ multiples, contrairement aux classes.

25. Inscrivez une courte définition de l'héritage simple.

26. Inscrivez une courte définition de l'héritage multiple.

27. Inscrivez une courte définition du terme substitution ou redéfinition.

28. Inscrivez une courte définition du terme surcharge.

29. Inscrivez trois avantages d'utiliser l'héritage.

30. Lorsqu'il y a substitution d'une méthode de la sous-classe, on doit utiliser le mot _________________________ pour faire référence à la méthode de la super classe.

31. Le mot clé `protected` devant le nom d'un membre signifie que: _____________________________________________________________________.

32. Quand on est au niveau de la sous-classe, qu'est-ce que je peux faire par rapport à la super classe?  
    a) On peut ajouter des ____________________________  par rapport à la super classe.  
    b) On peut ajouter des _____________________________ par rapport à la super classe.  
    c) On peut effectuer de la ____________________________ par rapport aux méthodes de la super classe.

33. Quel mode d'accès devons-nous utiliser pour les attributs quand nous utilisons l'héritage ?

34. Si une classe `Alpha` hérite d'une classe `Beta`, alors la classe `Alpha` s'appelle la _____________  classe et la classe `Beta` en est la ______________________ classe.

35. Les quatre modificateurs d'accès sont: ____________________, ____________________, ____________________, ____________________.

36. Un objet d'une ________________  classe peut se traiter comme un objet de sa ____________________________  classe correspondante.

37. Une sous-classe appelle n'importe quel membre qui n'est pas privé de la super classe en utilisant le mot clé ____________________ comme préfixe à l'appel d'une méthode.

38. Une classe abstraite peut contenir des méthodes _______________ qui ont une implémentation complète.

39. Les interfaces en Java permettent _______________ multiple pour les classes qui les implémentent.

40. Pour qu'une classe implémente une interface, elle utilise le mot-clé _______________ suivi du nom de l'interface.

## 2. Inscrivez vrai ou faux pour chacun des énoncés

1. Lorsqu'une super classe fournit une méthode, ses sous-classes peuvent la remplacer mais cela n'est pas obligatoire.

2. Une super classe représente habituellement un nombre plus élevé d'objets que sa sous-classe.

3. Une sous-classe possède normalement moins de fonctionnalités que sa super classe.

4. Lorsqu'on utilise l'héritage, dans la classe Test (même *package*), on peut...  
    a. créer un objet de la super classe?  
    b. créer un objet d'une des sous-classes?  
    c. accéder directement aux attributs de la super classe?  
    d. faire référence à la super classe par le mot super?

5. On peut utiliser dans une sous-classe, l'instruction super.super.toString().

6. Une super classe a normalement plus d'attributs que ses sous-classes.

7. Le chaînage des constructeurs paramétrés se fait de façon automatique avec la super classe.

8. Dans une méthode de la sous-classe, on peut utiliser directement le nom des attributs de la super classe?  
    a. Si les attributs sont `private`  
    b. Si les attributs sont `public`  
    c. Si les attributs sont `protected`

9. Dans le constructeur par défaut d'une sous-classe on n'est pas obligé d'inscrire l'appel au constructeur par défaut de la super classe.

10. Dans la classe Test on a accès directement aux attributs `protected` de la super classe.
  
11. L'appel du constructeur par défaut de la super classe dans le constructeur par défaut de la sous-classe, doit toujours être la première instruction de celle-ci?

12. Une super classe spécifie la généralité de ses sous-classes.

13. Java n'autorise que l'héritage multiple.

14. Tout objet d'une super classe peut aussi être un objet d'une sous-classe.

15. Une classe abstraite peut être instanciée avec le mot-clé new.

16. Les interfaces peuvent contenir des méthodes avec implémentation grâce au mot-clé default.

17. Une classe peut hériter d'une classe abstraite et implémenter plusieurs interfaces simultanément.

18. Les méthodes abstraites dans une interface sont implicitement public et abstract.

19. Une classe abstraite peut avoir des constructeurs, même si elle n'est pas instanciable.

20. Les attributs dans une interface sont implicitement public, static et final.
