<!DOCTYPE html>
<html>
<head>
    <title>Profil</title>
</head>
<body>
    <h1>Profil de ${freelancer.name}</h1>
    <p>Email : ${freelancer.email}</p>
    <p>Compétences : ${profil.skills}</p>
    <p>Expérience : ${profil.yearsOfExperience} ans</p>
    <p>Note : ${profil.rating}</p>

    <h2>Modifier Profil</h2>
    <form action="modifier_profil" method="post">
        <label for="skills">Compétences :</label>
        <input type="text" name="skills" value="${profil.skills}"><br>
        <label for="experience">Années d'expérience :</label>
        <input type="number" name="experience" value="${profil.yearsOfExperience}"><br>
        <button type="submit">Enregistrer</button>
    </form>
</body>
</html>
