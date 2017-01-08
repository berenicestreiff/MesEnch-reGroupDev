<%@ page language="java" contentType="text/html; charset= UTF8"
    pageEncoding="UTF8"%>
    
<!DOCTYPE html>

<head>

<title>Connexion au compte</title>
</head>
 <body>
 <form>
<h1> Se connecter à mon espace</h1>
<form action="jagent.jsp" method="post">

<label for="username">Identifiant:</label>
<input type="text" name="username" id="username"/>
<label for="password">Mot de passe:</label>
<input type ="text" name="password" id="password"/>
<label for="passwordconfirm">Confirmer le mot de passe:</label>
<input type ="text" name="passwordconfirm" id="passwordconfirm"/>
<button>S'inscrire</button>
</form>
 </body>
</html>

