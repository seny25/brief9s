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
<form action="TachServlet" method="post">
 
  <div class="form-group">
    <label for="titre">titre</label>
    <input type="text" class="form-control" name="titre" placeholder="titre">
  </div>
  <div class="form-group">
    <label for="description">description</label>
    <input type="text" class="form-control" name="description" placeholder="description">
  </div>
  <div class="form-group">
    <label for="status">status</label>
    <input type="text" class="form-control" name="status" placeholder="status">
  </div>
 
  <div class="form-group">
    <label for="deadline">deadline</label>
    <input type="date" class="form-control" name="deadline" placeholder="deadline">
  </div>
   <div class="form-group">
    <label for="nomcategorie">nomcategorie</label>
    <input type="text" class="form-control" name="nomcategorie" placeholder="nomcategorie">
  </div>
     <input type="submit" value="Ajouter"><br>
        <br>
     <input type="submit" value="Lister">
  
  </form>


<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
 integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" 
crossorigin="anonymous"></script>
</body>
</html>