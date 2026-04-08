# Chapitre 2 - CRUD Artist Spring Boot

Projet prêt à l'emploi pour le chapitre 2 du roadmap Spring Boot.

## Contenu
- Spring Boot 3.5.6
- Spring Web
- Spring Data JPA
- Thymeleaf
- Flyway
- Validation
- CRUD complet sur l'entité `Artist`

## Pré-requis
- Java 17+
- MySQL démarré
- Base de données `reservations` créée

## Base de données
```sql
CREATE DATABASE reservations;
```

## Configuration
Modifie si nécessaire `src/main/resources/application.properties` :
- `spring.datasource.username`
- `spring.datasource.password`

## Lancement
```bash
./mvnw spring-boot:run
```
Sous Windows :
```bash
mvnw.cmd spring-boot:run
```

## URLs utiles
- http://localhost:8080/
- http://localhost:8080/artists
- http://localhost:8080/artists/create

## Commit Git conseillé
```bash
git add .
git commit -m "Chapitre 2 CRUD Artist prêt"
git push
```
