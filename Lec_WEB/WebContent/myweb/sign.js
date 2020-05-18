window.onscroll = function () {
    scrollFunction()
  };
  
  window.onload = function () {
    showImage()
  };
  
  function scrollFunction() {
    if (document.body.scrollTop > 57 || document.documentElement.scrollTop > 57) {
      document.getElementById("movia").style.top = "-70px";
      document.getElementById("navigator").style.position = "fixed";
      document.getElementById("navigator").style.top = "0px";
      document.getElementById("bg-text1").style.top = "24%";
      document.getElementById("bg-text2").style.top = "24%";
      document.getElementById("bg-text3").style.top = "24%";
    } else {
      document.getElementById("movia").style.top = "0px";
      document.getElementById("navigator").style.position = "relative";
      document.getElementById("navigator").style.top = "0px";
      document.getElementById("bg-text1").style.top = "32%";
      document.getElementById("bg-text2").style.top = "32%";
      document.getElementById("bg-text3").style.top = "32%";
    }
  };
