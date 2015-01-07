$(document).ready(function(){
    $.ajax({
        type : "GET",
        url : _path+"/shinowit/province",
        success : function(msg){
            $(msg).each(function () {
                var opt = $("<option/>").text(this.name).attr("value", this.shengid).attr("id",this.shengid);
                $("#shengid").append(opt);
            })
        }
    });

});
//市级查询
function showproince(){
    $.ajax({
        type : "POST",
        url : _path+"/shinowit/city",
        data : {provinceid:$("#shengid").val()},
        success : function(msg){
            $(msg).each(function () {
                var opt = $("<option/>").text(this.shiname).attr("value", this.shiid).attr("data",this.shiname);
                $("#shiid").append(opt);
            })
        }
    })

}
//区级查询
function showarea(){
    $.ajax({
        type : "POST",
        url : _path+"/shinowit/county",
        data : {cityid:$("#shiid").val()},
        success : function(msg){
            $(msg).each(function () {
                var opt = $("<option/>").text(this.quname).attr("value", this.quid);
                $("#quid").append(opt);
            })
        }
    })
}
