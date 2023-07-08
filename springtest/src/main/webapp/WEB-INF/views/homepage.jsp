<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>Benvenuto</h1>

<a href="search">Accedi alla pagina di ricerca per Product Line</a>

<br>

<c:forEach var="product" items="${products}">
 Codice: <c:out value="${product.productcode}" />
 Nome : <c:out value="${product.productname}" />
 Prezzo: <c:out value="${product.buyprice}" />
 <br>
 <br>
</c:forEach>

