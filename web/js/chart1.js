function likai(){
    var shenghui=document.getElementById("shenghui").value;
    $.ajax({
        type : "POST",
        url:"/shinowit/chart01",
        data: {items : shenghui},
        contendType:"application/json",
        success : function(){

        },
        error : function(){

        }
    })
}
