<!DOCTYPE html>
<html>
<head>
    <title>Inscription Client</title>
</head>
<body>
    <h1>Inscription Client</h1>
    <form action="enregistrer_client" method="post">
        <label for="name">Nom :</label>
        <input type="text" name="name" required><br>
        <label for="email">Email :</label>
        <input type="email" name="email" required><br>
        <label for="password">Mot de passe :</label>
        <input type="password" name="password" required><br>
        <button type="submit">S'inscrire</button>
    </form>
</body>
</html>