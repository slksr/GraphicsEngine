# GraphicsEngine
SEB-OGP Lesweek 10 GraphicsEngine opdracht. Doel van deze opdracht is om aan de hand van UML Klassen- en Sequencediagrammen een applicatie te ontwikkelen.

Deze applicatie is gebouwd met IntelliJ en maakt gebruik van Processing 3 core library. Gebruik je de IDE van Eclipse dan die je dit project te importeren in een workspace.


## Branches
De code is onderverdeeld in diverse branches zodat je de stappen kunt volgen.

### Main branch:
Deze branch bevat de laatste versie van de applicatie

### Voorbereiding branch:
Project opgezet aan de hand van het Klassendiagram

### 2_rechthoek_plaatsen branch:
Implemenatie van methoden en Rechthoek plaatsen in het window en koppelen aan HalloReageerder.

### 3_rechthoek_beweging branch:
- De rechthoek verplaatsen in het window. 
- Het Klassendiagram van deel 1 [GraphicsEngine](GraphicsEngine/ontw/GraphicsEngine_1.pdf)

### 4_weergave_container branch:
- Refactor klassenstructuur
- Implementatie van WeergaveObjectContainer
- 2 nieuwe rechthoeken

### 5_aanpassing_interface branch:
- Aanpassing van de interface IReageerder.
- Muisklik op HalloReageerder zorgt nu voor een versnelling.

### 6_reageerders_refactoring branch:
- Toevoegen Reageerders Kleur en Snelheid refactoring.
- Refactoring geefWeer(..) in WeergaveObject, geen link meer met GraphicsEngineApp.
- Container en Figuur referentie naar GraphicsEngineApp.

### 7_BoundingBox branch:
- Bounding Box in de WeergaveObjectContainer.


