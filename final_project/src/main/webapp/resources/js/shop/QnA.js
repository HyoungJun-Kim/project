let login_id = document.querySelector(".sesseionlogin_id");
    let QnA_Title_btn = document.querySelector("#QnA_Title_btn");
    let checkboxbtn = document.querySelector("#checkboxbtn");
    let checktype = document.querySelectorAll(".checktype");
    let asked = document.querySelector("#QnA_Title_btnAsked");
    
    QnA_Title_btn.addEventListener('click',function(){
    	if(login_id.value!=null && login_id.value!=''){
//    		console.log(login_id);
    		location.href="Question";
    	}else{
    		alert("로그인 후 이용해주세요!");
    		location.href="/login";
    	}
    	
    });
    
    asked.addEventListener('click', function(){
    	location.href="asked_Question";
    }); 
    
    
    checkboxbtn.addEventListener('click', function(){
    	for(let i=0; i<checktype.length; i++){
    		if(checktype[i].checked == true){
//    			console.log(checktype[i].value);
    			document.sk.submit();
    		}
    	}
    		
    })