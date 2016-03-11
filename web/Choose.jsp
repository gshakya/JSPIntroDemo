<%-- 
    Document   : Choose
    Created on : Mar 10, 2016, 9:28:25 PM
    Author     : grsky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Choose</title>
  </head>
  <body>
    <form method='post' action='ChooseServlet'>
      <p>Is JSP cool?</p>
      <input class= 'RadioState' type='radio' value='1' name='radioJSPCool' ${jsp.checkedYes}><span>Yes</span><br/>
      <input class= 'RadioState' type='radio' value='0' name='radioJSPCool' ${jsp.checkedNo}><span>No</span><br/>
      <input type='submit' name='btnSubmit' value='Submit'/>
      <p>Is JSF way cool?</p>
      <input class= 'RadioState' type='radio' value='1' name='JSFwayCool' ${jsf.checkedYes}><span>Yes</span><br/>
      <input class= 'RadioState' type='radio' value='0' name='JSFwayCool' ${jsf.checkedNo}><span>No</span><br/>
      <input type='submit' name='btnSubmit' value='Submit'/>
      <p>Is the moon made of cheese?</p>
      <input class= 'RadioState' type='radio' value='1' name='moonCheese' ${moon.checkedYes}><span>Yes</span><br/>
      <input class= 'RadioState' type='radio' value='0' name='moonCheese' ${moon.checkedNo}><span>No</span><br/>
      <input type='submit' name='btnSubmit' value='Submit'/>
 
    </form>
  </body>
</html>