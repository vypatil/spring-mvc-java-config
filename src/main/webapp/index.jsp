<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>India Details</title>
</head>
<body >
    <h3>Enter India Details :</h3>
  
    <form action="saveIndia" method="post">
        <table>
  
            <tr>
                <td>stateName:</td>
                <td><input type="text" name="stateName" /></td>
            </tr>  
            <tr>
                <td>district:</td>
                <td><input type="text" name="district" /></td>
            </tr>  
            
        </table>
  
        <input type="submit" value="Submit Details">
  
    </form>

    <h3>View All data Details :</h3>

  <form action="showAllindiadata" method="get">
          <table>
               <input type="submit" value="View All data Details">
  		  </table>
  </form>
  
</body>
</html>
