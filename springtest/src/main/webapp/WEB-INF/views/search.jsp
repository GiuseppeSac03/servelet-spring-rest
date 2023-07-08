<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h1>Cerca prodotti per product line</h1>

<form method="GET" action="productline" >
  <label for="productline">product line</label><br>
  <input type="text" id="productline" name="productline"><br>
   <input type="submit" value="Submit">
</form>
   
   <c:forEach var="product" items="${products}">
 	 Codice: <c:out value="${product.productcode}" />
	 Nome : <c:out value="${product.productname}" />
	 Prezzo: <c:out value="${product.buyprice}" />
	 <br>
	 <br>
	</c:forEach>

