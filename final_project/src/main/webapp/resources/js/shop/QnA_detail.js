    let list_btn = document.querySelector(".list_btn");
    
    list_btn.addEventListener('click',function(){
    	if('${sessionScope.login_id}'== 'admin'){
    		location.href="QnA_admin"
    	}
    		
    	else{
    		location.href="QnA" 
    	}
    	
    	
    	
    });