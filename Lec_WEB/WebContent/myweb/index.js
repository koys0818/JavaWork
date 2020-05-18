

var loginBtn = document.getElementById("loginBtn");
var modal = document.getElementById("id01");
var close = document.getElementsByClassName("close")[0];

loginBtn.onclick = function(){
	modal.style.display = "block";
}

close.onclick = function(){
	modal.style.display = "none";
}

window.onclick = function(event){
	if(event.target == modal){
		modal.style.display = "none";
	}
}


