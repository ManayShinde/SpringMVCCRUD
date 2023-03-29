  <%@page	isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Update Patient</title>
  </head>
  <body>
   <div  class="text-center">
    <h1>update Patient</h1>
    </div>
    
  <div class="container mt-3 card" style="width: 35rem;" >
    
     <form action="${pageContext.request.contextPath}/handleupdatepatient" method="post">
    
     <div class="mb-3">
        <label for="pid" class="form-label">PID</label>
       <input type="number" class="form-control" id="pid" name="pid" value="${patientinfo.pid}">   
      </div>
     
     <div class="mb-3">
         <label for="FirstName" class="form-label">FirstName</label>
    <input type="text" class="form-control" id="fname" name="Name" value="${patientinfo.name }">
    </div>
    
    <div class="mb-3">
         <label for="LastName" class="form-label">LastName</label>
    <input type="text" class="form-control" id="lname"  name="Lname"  value="${patientinfo.lname }">
    
    </div>
    
    
    <div class="mb-3">
          <label for="Mob" class="form-label">Mob</label>
          <input type="number" class="form-control" id="exampleInputEmail1" name="Mob" value="${patientinfo.mob}">
   </div>
    
     
      <div class="mb-3">
         <label for="email" class="form-label">Email</label>
         <input type="email" class="form-control" id="email" name="Email" value="${patientinfo.email }">
   </div>
     
      <div class="mb-3">
        <label for="" class="form-label">Address</label>
        <input type="text" class="form-control" id="address" name="Address" value="${patientinfo.address }">
       </div>
     
       <div class="container mt-3 text-center">
            <a href="${pageContext.request.contextPath}/" class="btn btn-outline-success ">Back</a>
         
           <button type="submit" class="btn  btn-primary">Update</button>
     </div>
      
      
     
     </form>
     </div>
  
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>