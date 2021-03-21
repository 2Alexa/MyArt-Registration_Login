# MyArt-Registration_Login


<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/2Alexa/MyArt-Registration_Login">
    <img src="https://de.wikipedia.org/wiki/Ilja_Jefimowitsch_Repin#/media/Datei:Bridge_in_Abramtsevo_by_Repin.jpg" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">My Art Projekt</h3>

  <p align="center">
    Login_Registrierung_Kunst
    <br />
    <a href="https://github.com/github_2Alexa/MyArt-Registration_Login"><strong>Erkunde die Dokumentation»</strong></a>
    <br />
    <br />
    <a href="https://github.com/github_MyArt-Registration_Login">View Demo</a>
    ·
    <a href="https://github.com/github_MyArt-Registration_Login">Report Bug</a>
    ·
    <a href="https://github.com/github_MyArt-Registration_Login">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Inhaltsverzeichnis</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">&Uumlber das Projekt</a>
      <ul>
        <li><a href="#built-with">Aufbau</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Installation</a>
      <ul>
        <li><a href="#installation">Lass uns es starten</a></li>
      </ul>
    </li>
    <li><a href="#contact">Kontakt</a></li>
    <li><a href="#acknowledgements">Referenzen</a></li>
  </ol>
</details>



## Über das Projekt


In diesem Projekt werden auf der Webseite Kunstwerke, in 3 verschieden Gefühlebenen aungezeigt. 
Dabei handelt es sich um die Gefühlsebene: fröhlich, düster und positiv. Diese werden als Navigations Button auf der Webseite angezeigt. 
Nach dem bedienen des jeweiligen Button der Gefühlsebene, 
wird durch ein Random ein generiertes Bild dir angezeigt. Die Bilder sind in dem SQL Daten File abgelegt. 

Im Weiterem können wir über eine Rest Schnittstelle User regestrieren und die Logindaten von dem User anlegen. 
Diese Funktion dient uns später für den Ausbau der Software. 

Die MyArt Software soll bei Fertigstellung, dem User sich über die Homepage registrieren und einlogen lassen können. 
Der User kann Bilder und Sound mit deklarierten Fegühlsebene hochladen in die Datenbank. 
Die Software wird daraufhin über Random Kunstwerke über jeweiligen Tag der Gefühlsebene,
zu einem Kunstwerk zusammenführen.
Als Beispiel: ein Picasso Bild (blaue Welle) mit positivem Tag, wird mit einem Sound( Wasserrauschen), 
mit positiven Tag zu einem Kunstwerk mit positivem Tag.
Durch diese später geplante Erneuerung wird es möglich sein nicht nur Bilder sondern ganze Kunstwerke, 
bestehend aus eine Bild und Sound auf der Webseite anzeigen zu lassen.


### Aufbau des Codes

User Daten anlegen und User einloggen:

Wir legen eine Model User und UserDto an, die beinhalten die angewendete Daten des Users. Die Repository dient ein Schnittstelle, 
die verweist mit welche Daten gearbeitet wird. Über den Controller, bei dem User wenden wir den RestController an und nutzen PostMapping,
um die User Daten in h2 Datenbank zu setzen. Das gleiche werden wir in mit dem Login erstellen. 
Zu erwähnen ist, dass die User und Login Funktion in jetzigen Stand des Projekts noch meine relavate Rolle spielen. 
Wir legen die User und Login Daten über den Entwickler Tool RESTED im Browser Chrome an, siehe dazu Erklärung im Installation.
Beispiel User, beachte dabei: 
Post / http://localhost:8080/users
content-type = application/json


Kunstbilder:

Wir legen 4 Model für Art, Tag, ArtDto und TagDto. Im weiterem für beide ein Repository an. 
Es handelt sich bei dem ArtController, um eine Annotation Controller, hier wenden wir kein Annotation RestController, zu jetzigem Stand an. 

Datenbank:
Das Objekt "Art" besteh aus einer URL-Adresse und Namen. Das Objekt "Tag" besteht aus einem Namen. Beide Objekte besitzen eine ID. 
Für beide Objekte besteht eine Annotation Entity( verbunden mit Tabelle in Datenbank). Es besteht eine m:n Beziehung. 
Diese Beziehung ist über ManyToMany deklariert.
Sprich das Objekt Art kann mehrere Tags haben und das Objekt Tag kann mehrer Art Objekte haben.

Es sind dadurch 3 neue Tabellen entstanden in h2 Datenbank: art, tag und art_tag.

Um die Flexibilität für die Anpasung der Gefühlsebenen und der Kunstwerke habe ich mich entschieden eine File data.sql anzulegen.
Dadurch können beliebig Bilder eingefügen werden, die Annotation der Bilder mit verschieden Gefühlebene/Tag anpassen und neue Tags einfügen.
(siehe den Link in Referenzen zur  weiteren Erklärung)
JPA stellt die Anfrage zur Datenbank auf.

Webseite:

Die Webseite ist durch ArtController und Thymeleaf aufgebaut. Wir liefern den Wert "Home" zurück, dies bedeutet dass die Webseite home.html aus dem templates aufgebaut wird. 
Die Datei home.html muss unter src/main/resources/templates/ zufinden sein. 
Der Controller führt das Model Art und Tag aus und alle Atrribute werden in die html Datei überliefert.
Über die th:text Annotation werden die Texte von Model Klasse angezeigt und über th:src kann die Adresse der Bilder geliefert werden.


### Installation 

* []() instaliere Java JDK 8 ( suche auf Google java.com)
* []() instaliere Intellij IDEA CE runter (benutzen Google um die offizielle Seite für den Intellij Download)
* []() H2 Datenbase muss du nicht downloaden, wir benutzen den Browser, um die Daten in der H2 Datenbank zu checken
       http://localhost:8080/h2-console
* []() instaliere Chrome (Browser, Download über anderen Browser) Wir werden die User Daten über Rested einfügen.
       (Befolge bei Chrome,Einstellungen, Entwicklertool, Rested... oder diesen Link: 
       chrome-extension 
       https://eelcnbccaccipfolokglfhhmapdchbfg/dist/index.html
* []() instaliere MYSQL (über Google den Download)


<!-- GETTING STARTED -->
## Lass uns es starten

Das Projekt wird automatisch von start.spring.io generiert: https://start.spring.io/ .
Wir benutzen die folgende "Dependency": 
* []() spring web( bauen eine Web Seite)
* []() spring data jpa (bin bauen eine App mit Datenbank-> das wird für die erweiterung des Projekts benötigt)
* []() Thymeleaf ( bauen Web Seite und zeigen die Daten aus der Datenbank)
* []() Devtools ( schneller testen)
* []() H2 (interne Datenbank)

Wir verweisen in application.properties, dass wir h2 Datenbank nutzen. Dort können wir auch username und password für die Datenbank anlegen.
Ich hab standartmässig sa und password behalten.

Um die lokal abgelgten Daten auf h2 Datenbank zu sehen, verwende die Adresse http://localhost:8080/h2-console in deinem Browser.

## Nutzung der Projekts




<!-- CONTACT -->
## Contact

Instagram:
Project Link: [https://github.com/2Alexa/MyArt-Registration_Login](https://github.com/2Alexa/MyArt-Registration_Login)



<!-- ACKNOWLEDGEMENTS -->
## Referenzen

* []() https://www.baeldung.com/jpa-many-to-many
* []() https://www.baeldung.com/thymeleaf-in-spring-mvc
* []() https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
* []() https://stackoverflow.com/questions/24279186/fetch-random-records-using-spring-data-jpa
* []() https://commons.wikimedia.org/wiki/Vincent_van_Gogh



