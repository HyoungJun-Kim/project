let login_id = document.querySelector(".sesseionlogin_id");
    
    let checkadminboxbtn = document.querySelector("#checkadminboxbtn");
    let checkadmintype = document.querySelectorAll(".checkadmintype");
    let asked = document.querySelector(".asked");
    
   
    
    asked.addEventListener('click', function(){
    	location.href="asked_Question";
    }); 
    
    
   
    
    checkadminboxbtn.addEventListener('click', function(){
    	for(let i=0; i<checkadmintype.length; i++){
    		if(checkadmintype[i].checked == true){
//    			console.log(checkadmintype[i].value);
    			document.sk.submit();
    		}
    	}
    		
    });