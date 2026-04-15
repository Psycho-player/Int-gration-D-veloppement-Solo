# Mise en ligne sur GitHub

1. Ouvre un terminal dans le dossier du projet.
2. Fais :

```powershell
git init
git branch -M main
git add .
git commit -m "Initial full roadmap project"
git remote add origin https://github.com/TON-USER/TON-REPO.git
git push -u origin main
```

Si le dépôt distant contient déjà quelque chose et que tu veux l'écraser :

```powershell
git push -u origin main --force
```
