<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription site MesEnchères</title>
</head>
<body>
<form action="jagent.jsp" method="post">

    <h1> Se connecter</h1>

<label for="username">Identifiant :</label>
<input type="text" name="identifiant" id="username"/>
<label for="password">Mot de passe :</label>
<input type ="text" name="mot de passe" id="password"/>
<a href="RecuperationMDP.html">Mot de passe oublié?</a>
<a href="CreationCompte.html" >Créer un compte</a>
<button type ="button">S'inscrire</button>
        </form>
        
    </body>
</html>

