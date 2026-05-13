<<<<<<< HEAD
# Reservation Spring Boot

Petit projet web Spring Boot avec une page de réservation.

## Fonctionnalités

- Page d'accueil avec un formulaire de réservation
- Validation des champs côté serveur
- Liste des réservations enregistrées
- Suppression d'une réservation
- Interface simple en HTML, CSS et Thymeleaf
- Stockage en mémoire pour garder le projet simple

## Technologies

- Java 17
- Spring Boot 3.5.14
- Spring Web
- Thymeleaf
- Bean Validation
- Maven

## Structure du projet

```text
src/main/java/com/example/reservation
├── ReservationApplication.java
├── controller
│   └── ReservationController.java
├── model
│   └── Reservation.java
└── service
    └── ReservationService.java

src/main/resources
├── static/css/style.css
├── templates/index.html
└── application.properties
=======
# Projet Réservations – Spring Boot 3.5.6

Ce projet reprend les parties **code** du roadmap Spring Boot 3.5.6 jusqu'aux chapitres 2, 3 et 4 :

- CRUD complet sur l'entité `Artist`
- migrations Flyway
- formulaires Thymeleaf
- notifications flash
- Spring Security avec utilisateurs en base de données
- formulaire de connexion personnalisé
- déconnexion
- routes protégées `/admin` et `/user`

## Comptes de démonstration

- **bob / 12345678** → rôle `ADMIN`
- **anna / 12345678** → rôle `MEMBER`

## Prérequis

- Java 17 minimum
- MySQL démarré
- base de données `reservations` créée

```sql
CREATE DATABASE reservations;
```

## Configuration

Vérifie `src/main/resources/application.properties` et adapte au besoin :

```properties
spring.datasource.username=root
spring.datasource.password=
>>>>>>> ca8e66bd938d6d0536c699056ddf7d8d98a80185
```

## Lancer le projet

<<<<<<< HEAD
Depuis le dossier du projet :

```bash
mvn spring-boot:run
```

Puis ouvrir :

```text
http://localhost:8080
```

## Compiler le projet

```bash
mvn clean package
```

Le fichier `.jar` sera généré dans le dossier `target/`.

## Remarque

Les réservations sont stockées en mémoire dans `ReservationService`.
Cela signifie qu'elles disparaissent lorsque l'application est arrêtée.
Pour un vrai projet, il faudrait ajouter une base de données avec Spring Data JPA, par exemple MySQL, PostgreSQL ou H2.
=======
Sous Windows PowerShell :

```powershell
.\mvnw.cmd spring-boot:run
```

Puis teste :

- <http://localhost:8080/>
- <http://localhost:8080/login>
- <http://localhost:8080/artists>
- <http://localhost:8080/admin>
- <http://localhost:8080/user>

## GitHub

Si ton dépôt GitHub est vide :

```powershell
git init
git branch -M main
git add .
git commit -m "Initial full roadmap project"
git remote add origin https://github.com/TON-USER/TON-REPO.git
git push -u origin main
```
>>>>>>> ca8e66bd938d6d0536c699056ddf7d8d98a80185
