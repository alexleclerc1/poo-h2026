
# Exercice — Anti‑virus (polymorphisme)

## Énoncé détaillé

1. **Créez la classe abstraite** `MoteurDetection` :
   - champ protégé `nom` (String) ;
   - constructeur pour initialiser `nom` ;
   - méthode **abstraite** `void detecter()`.

3. **Créez trois classes concrètes** de moteurs :
   - `MoteurParNom` — **étend** `MoteurDetection`;
   - `MoteurParTaille` — **étend** `MoteurDetection`;
   - `MoteurParRegex` — **étend** `MoteurDetection`.

   Dans **chacune** des trois classes, **surcharger** `detecter()` (override) pour **afficher** un message distinct, par exemple :
   - `[Détection par NOM] Vérification du NOM du fichier...`
   - `[Détection par TAILLE] Vérification de la TAILLE du fichier...`
   - `[Détection par REGEX] Analyse du CONTENU (regex)...`

4. **Dans une classe `Main`**, créez une **liste** de moteurs :
   ```java
   List<MoteurDetection> moteurs = List.of(
       new MoteurParNom(),
       new MoteurParTaille(),
       new MoteurParRegex()
   );
   ```

   Parcourez la liste et appelez **la même méthode** sur chaque élément :
   ```java
   for (MoteurDetection m : moteurs) {
       m.detecter(); // appel polymorphe (liaison dynamique)
   }
   ```
---