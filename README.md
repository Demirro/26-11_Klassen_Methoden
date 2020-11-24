# 26-11_Klassen_Methoden
Übungsaufgabe für das Programmierpraktikum im Wise 20/21 für den 26.11.2020

# Willkommen bei der dritten Übungsaufgabe.

Ihr findet im Download wieder eine Vorlage. Es geht diesmal um Klassen und Methoden. Es liegen zwei Klassen vor. Einmal *Application* und einmal *Konto*. In *Application* befindet sich die Main-Methode und ein paar Sachen die ich da eingebaut habe. Ihr sollt in *Konto* jetzt Konstruktoren und Methoden einbauen, damit die *Application*-Klasse funktioniert.

### 📝 Aufgabe:

Stellt euch vor ihr programmiert ein rudimentäres Banksystem. Ihr fangt an die Struktur für Bankkonten zu bauen. Das ist eure Klasse *Konto*. Dort sind drei Instanzvariablen (*id, name, kontostand*) mit drei **Gettern**, zwei **Konstruktoren** und zwei zusätzlichen **Methoden/Fähigkeiten** einzubauen.

#### Eure spezifischen Aufgaben sind:
- Baut Getter für die drei Instanzvariablen *id, name, kontostand*
- Erstellt zwei Konstruktoren
  - Ein Konstruktor soll als Argumente eine ID und einen Namen annehmen
  - Der andere Konstruktor soll als Argumente eine ID, einen Namen und den Kontostand annehmen
  - **Wichtig:** Es sollten dennoch alle Instanzvariablen gesetzt werden. Heißt beim ersten Konstruktor sollte automatisch ein Wert für den Kontostand gesetzt werden.
- Programmiert zwei Methoden (*einzahlen, auszahlen*)
- Einzahlen (braucht keinen Rückgabewert/return):
  - nimmt als Argument einen int an
  - fügt den gegebenen Betrag dem Kontostand hinzu
  - Gibt auf der Konsole einen Text aus, der auf den Erfolg der Transaktion und auf den neuen Kontostand hinweist
- Auszahlen (braucht keinen Rückgabewert/return):
  - nimmt als Argument einen int an
  - zieht den gegebenen Betrag dem Konto ab
  - es sollte geprüft werden, ob genug Geld auf dem Konto ist
    - Wenn ja: Betrag abziehen, Erfolgsnachricht und Kontostand ausgeben
    - Wenn nein: Fehlermeldung
  

## Tipps
- In diesem Projekt werden keine Setter benutzt. Die Setter sind deswegen aber quasi Teil der Konstruktoren
- Ihr könnt von einem Konstruktor einen anderen Konstruktor aufrufen

    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Aufzeichnung des Seminars](https://www.ilias.uni-koeln.de/ilias/ilias.php?ref_id=3638292&eid=458d2edf-ddf9-48bd-be52-331242cf4681&cmd=streamVideo&cmdClass=xoctplayergui&cmdNode=wn:os:17u:185&baseClass=ilrepositorygui)
- [📃 Methoden (Wegweiser)](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Methoden.md)
- [📃 Klassen und Objekte (Wegweiser)](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/OOP-Klassen-und-Objekte.md)
- [📃 Objekte (Wegweiser)](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Objekte-I-Initialisierung-Members-Zugriff.md)

- [📃 Java Naming Conventions](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Naming-Conventions.md)
