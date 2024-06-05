<%@page import="com.cetpa.entities.ProductEntity"%>
<%@page import="com.cetpa.services.ProductService"%>
<html>
<body onload="makeActive('save')">
    <%
        String pidStr = request.getParameter("pid");
        String priceStr = request.getParameter("price");
		System.out.println(pidStr);
        if (pidStr != null && priceStr != null) {
            try {
                int pid = Integer.parseInt(pidStr);
                String pname = request.getParameter("name");
                String pbrand = request.getParameter("brand");
                int pprice = Integer.parseInt(priceStr);

                ProductEntity product = new ProductEntity(pid, pname, pbrand, pprice);
                ProductService.saveRecord(product);
    %>
                <%@include file="navbar.jsp"%>
                <div class="div">
                    <h1>Product record has been saved successfully</h1>
                </div>
    <%
            } catch (NumberFormatException e) {
                // Handle the case where pid or price are not valid integers
    %>
                <div class="div">
                    <h1>Error: Invalid product ID or price.</h1>
                </div>
    <%
            }
        } else {
            // Handle the case where pid or price parameters are missing
    %>
            <div class="div">
                <h1>Error: Missing product ID or price.</h1>
            </div>
    <%
        }
    %>
</body>
</html>
