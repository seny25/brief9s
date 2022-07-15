<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Connection</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css
/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFc
JlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="UtilisServlet" method="POST">
          nom_Utilisateur:<input type="text" name="Login" placeholder="Login"></br>
          <p></p>
          Motpass:<input type="text" name="Motpass" placeholder="Motpass"><input type="submit" value=" Supprimer"></br>
          <p></p>
          <input type="submit" value=" Connexion"></br>
           <a href="index.jsp"> S'inscrire </a>
           </form>
           
           
           
           
           
           
           
           <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
</body>
</html>