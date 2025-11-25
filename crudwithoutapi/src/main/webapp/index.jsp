<html>
<head>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div>
<h1 style="text-align:center">CRUD Operation by using JSP and MYSQL(without API)</h1>
</div>

<div style="padding-left:50px">
  <h1>ADD Student</h1>
  
  <form action="addStu">
  Student ID:<input type="text" name="sid"/><br/>
  Student Name:<input type="text" name="sname"/><br/>
  Student Branch:<input type="text" name="branch"/><br/>
  Student College:<input type="text" name="collage"/><br/>
  <input type="submit"/>
  </form>
  
  <h1>GET Student</h1>
  <form action="getStu">
  Student ID:<input type="text" name="sid"/><br/>
  <input type="submit"/>
  </form>
  
  <h1>DELETE Student</h1>
  <form action="delStu">
  Student ID:<input type="text" name="sid"/><br/>
  <input type="submit"/>
  </form>
  
  <h1>UPDATE Student</h1>
  <form action="updStu">
  Student ID:<input type="text" name="sid"/><br/>
  <input type="submit"/>
  </form>
</div>
</body>
</html>