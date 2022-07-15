<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
 integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

</head>
<body>


 <form action="UtilisServlet" method="POST">
 <div class="container">
 <div class="row">
 
 <div class="col-md-6">
 
     <div class="form-group">
    <label for="nom">nom</label>
    <input type="text" class="form-control" id="nom" placeholder="nom">
  </div>
   <div class="form-group">
    <label for="prenom">prenom</label>
    <input type="text" class="form-control" id="prenom" placeholder="prenom">
  </div>
 </div>

 <div class="col-md-6">
   <div class="form-group">
    <label for="nomutilisateur">nom utilisateur</label>
    <input type="text" class="form-control" id="nomutilisateur" placeholder="nomutilisateur">
    <input type="submit" value="Ajouter">
     <br>
         <input type="submit" value="Supprimer">
         
  </div>
   </div>
   
       
</form>
 
 </div>
 </div>
 
 



<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
 integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
 crossorigin="anonymous"></script>
</body>
</html>       