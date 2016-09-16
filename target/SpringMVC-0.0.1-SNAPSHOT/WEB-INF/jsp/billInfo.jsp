<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Split your bills</title>
</head>
<body>

<h2>Enter bill information</h2>
<form:form method="POST" action="/SpringMVC/result">
   <table>
    <tr>
        <td><form:label path="amtAtri">Spent by Atri</form:label></td>
        <td><form:input path="amtAtri" /></td>
    </tr>
    <tr>
        <td><form:label path="amtSaurabh">Spent by Saurabh</form:label></td>
        <td><form:input path="amtSaurabh" /></td>
    </tr>
    <tr>
        <td><form:label path="amtDeb">Spent by Deb</form:label></td>
        <td><form:input path="amtDeb" /></td>
    </tr>
    <tr>
        <td><form:label path="amtVikram">Spent by Vikram</form:label></td>
        <td><form:input path="amtVikram" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>