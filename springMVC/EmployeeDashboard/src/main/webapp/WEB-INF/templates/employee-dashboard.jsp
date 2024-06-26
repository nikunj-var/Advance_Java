<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="add-css.jsp" %>
<html>
  <body>
    <div class="div">
      <label class="h1">Employee Dashboard</label>
    </div>
    <div class="container">
      <div class="card col-md-12 mx-auto">
        <div class="card-body">
          <a href="add" class="btn btn-primary fa fa-user-plus">Add Employee</a>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="card col-md-12 mx-auto">
        <div class="card-body">
          <c:if test="${elist!=[]}">
            <div class="div">
              <label class="h3" style="color:red">Employee dashboard has no record</label>
            </div>
          </c:if>
          <c:if test="${elist!=[]}">
            <table class="table table-hover">