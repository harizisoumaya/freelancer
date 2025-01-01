<!DOCTYPE html>
<html>
<head>
    <title>Projets Disponibles</title>
</head>
<body>
    <h1>Projets Disponibles</h1>
    <c:forEach var="project" items="${projects}">
        <div>
            <h3>${project.title}</h3>
            <p>${project.description}</p>
            <p>Budget : ${project.budget}</p>
            <form action="postuler" method="post">
                <input type="hidden" name="projectId" value="${project.id}">
                <button type="submit">Postuler</button>
            </form>
        </div>
    </c:forEach>
</body>
</html>
