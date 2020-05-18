// http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=
// 430156241533f1d058c603178cc3ca0e&targetDt=
// 20120101&itemPerPage=10


var api_key= "d5a15d9dcb95edd0d7ccc221b53faa5b";
var row = 10
var targetDt = document.getElementById('date').nodeValue.trim();

function removedate(){
    document.getElementById('date').innerHTML= "";
}

function loadDate(){
    var date = document.getElementById('date').nodeValue.trim();

    var url     //TODO
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange - function(){
        if(this.readyState == 4 & this.status == 200){
            parseXML(this.responseXML)
        }
    };
    xhttp.open("GET",url,true);
    xhttp.send();
}

function parseXML(xmlDOM) {
    var table = "<tr><th>호선</th><th>역명</th><th>승차인원</th><th>하차인원</th></tr>";

    //TODO
}