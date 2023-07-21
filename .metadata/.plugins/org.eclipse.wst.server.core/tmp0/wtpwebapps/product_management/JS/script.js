/*function makeActive(){
	
	var an = document.getElementById("home")
	
	an.style.backgroundColor = "red";
	
	
}*/
function makeActive(linkid){
	var an = document.getElementById(linkid)
	an.style.backgroundColor = "red";	
}

function validateInput(){
	var flag = true;
	if(document.getElementById("id").value == ""){
		document.getElementById("spanid").innerHTML =  "Product id is required";
		document.getElementById("spanid").style.color = "red";
		document.getElementById("spanid").style.fontSize = "14px";
		flag = false;
	}
	else{
		document.getElementById("spanid").innerHTML =  "";
	}
	if(document.getElementById("name").value == ""){
		document.getElementById("spanname").innerHTML =  "Product name is required";
		document.getElementById("spanname").style.color = "red";
		document.getElementById("spanname").style.fontSize = "14px";
		flag = false;
	}
	else{
		document.getElementById("spanname").innerHTML =  "";
	}
	if(document.getElementById("price").value == ""){
		document.getElementById("spanprice").innerHTML =  "Product price is required";
		document.getElementById("spanprice").style.color = "red";
		document.getElementById("spanprice").style.fontSize = "14px";
		flag = false;
	}
	else{
		document.getElementById("spanprice").innerHTML =  "";
	}
	if(document.getElementById("quantity").value == ""){
		document.getElementById("spanquantity").innerHTML =  "Product quantity is required";
		document.getElementById("spanquantity").style.color = "red";
		document.getElementById("spanquantity").style.fontSize = "14px";
		flag = false;
	}
	else{
		document.getElementById("spanquantity").innerHTML =  "";
	}
	return flag;
}

function checkvalue(id){
	if(id.value == ""){
		document.getElementById("spanid").innerHTML =  "Product id is required";
		document.getElementById("spanid").style.color = "red";
		document.getElementById("spanid").style.fontSize = "14px";
	}
	else{
		document.getElementById("spanid").innerHTML =  "";
	}
}
