var ss = $.noConflict();
ss(document).ready(function(){
    ss("#UserName").blur(function(){
       if((ss("#UserName").val()==="")||(ss("#UserName").val().length<1)){
           ss("#id1").text("邮箱不能为空");
           return;
        }
       if((!ss("#UserName").val().match(/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/))){
            ss("#id1").text("邮箱不符合规范");
            return;
        }else{
           ss.ajax({
                type : "POST",
                url : _path+"/shinowit/loginemail",
                data : {valid:ss("#UserName").val()},
                dataType : "Text",
                success : function(msg){
                    ss("#id1").text(msg);
                },
                error : function(msg){
                    ss("#id1").text(msg);
                }
           })
           ss("#UserName")
           ss("#id1").text("");
       }
    });
    ss("#PassWord").blur(function(){
        if((ss("#PassWord").val()==="")||(ss("#PassWord").val().length<1)){
            ss("#id2").text("密码不能为空")
        }else{
            ss("#id2").text("");
        }

    })
});
