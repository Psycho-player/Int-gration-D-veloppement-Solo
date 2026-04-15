# Mise en place depuis zéro

## 1. Créer la base MySQL
```sql
CREATE DATABASE reservations;
```

## 2. Configurer l'accès MySQL
Dans `src/main/resources/application.properties`, adapte :
- `spring.datasource.username`
- `spring.datasource.password`

## 3. Lancer le projet
Sous Windows PowerShell, à la racine du dossier du projet :
```powershell
mvnw.cmd spring-boot:run
```

Puis ouvre :
- http://localhost:8080/
- http://localhost:8080/artists

## 4. Nouveau dépôt GitHub vide
Crée un dépôt GitHub vide :
- sans README
- sans .gitignore
- sans licence

## 5. Initialiser Git localement
Dans PowerShell, à la racine du projet :
```powershell
git init
git branch -M main
git add .
git commit -m "Initial Spring Boot CRUD project"
```

## 6. Connecter GitHub
Remplace l'URL ci-dessous par celle de ton dépôt :
```powershell
git remote add origin https://github.com/TON-USER/TON-REPO.git
git push -u origin main
```

## 7. Pour les commits suivants
```powershell
git add .
git commit -m "Ton message"
git push
```
