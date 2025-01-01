<!DOCTYPE html>
<html>
<head>
    <title>Messagerie</title>
</head>
<body>
    <h1>Messagerie</h1>
    <c:forEach var="message" items="${messages}">
        <div>
            <p><strong>De :</strong> ${message.sender.name}</p>
            <p>${message.content}</p>
            <p><em>Envoyé le : ${message.date}</em></p>
        </div>
        <hr>
    </c:forEach>
    <form action="envoyer_message" method="post">
        <label for="destinataire">Destinataire :</label>
        <select name="destinataire" required>
            <c:forEach var="user" items="${users}">
                <option value="${user.id}">${user.name}</option>
            </c:forEach>
        </select><br>
        <label for="contenu">Message :</label><br>
        <textarea name="contenu" rows="4" cols="50" required></textarea><br>
        <button type="submit">Envoyer</button>
    </form>
</body>
</html>
