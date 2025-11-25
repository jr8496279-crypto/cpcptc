<html>
<head>
</head>
<body>
<div>
<h1 style="text-align:center">CRUD Operation by using JSP and MYSQL(without API)</h1>
</div>

<div style="padding-left:50px">
  <h1>UPDATE Student</h1>
  
  <form action="addStu">
  Student ID:<input type="text" name="sid" value=${student.sid}><br/>
  Student Name:<input type="text" name="sname" value=${student.sname}><br/>
  Student Branch:<input type="text" name="branch" value=${student.branch}><br/>
  Student College:<input type="text" name="collage" value=${student.collage}><br/>
  <input type="submit"/>
  </form>
  
</div>



</body>


</html>