<!DOCTYPE html>
<html>
<head>
    <title>Tableau de Bord</title>
</head>
<body>
    <h1>Tableau de Bord</h1>
    <h2>Projets en cours</h2>
    <c:forEach var="project" items="${ongoingProjects}">
        <div>
            <h3>${project.title}</h3>
            <p>${project.description}</p>
        </div>
    </c:forEach>
    <h2>Messages récents</h2>
    <c:forEach var="message" items="${recentMessages}">
        <div>
            <p><strong>De :</strong> ${message.sender.name}</p>
            <p>${message.content}</p>
        </div>
    </c:forEach>
    <h2>Notifications</h2>
    <c:forEach var="notification" items="${notifications}">
        <div>
            <p>${notification.content}</p>
        </div>
    </c:forEach>
</body>
</html>
