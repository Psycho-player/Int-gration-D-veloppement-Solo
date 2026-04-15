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
```

## Lancer le projet

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
