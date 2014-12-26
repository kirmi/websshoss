<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/26
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.form.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $('#form1').submit(function(){
                var options = {
                    target:'#Tip', //后台将把传递过来的值赋给该元素
                    url:'<%=request.getContextPath()%>/test/form', //在这里就是提交给后台的路径在这里就是你要问的你们工作那里有什么做开发
                    type:'POST',//这个是提交的方式决定用get或者post提交
                    success: function(msg){
                        $('#Tip').val(msg)
                    } //在这里就是后台给前台返回的值msg里面包含着“注册成功”，
                };
                $('#form1').ajaxSubmit(options);
                return false; //为了不刷新页面,返回false，反正都已经在后台执行完了，没事！
        })
        });
    </script>
</head>
<body>

    <form id="form1" method="post">
        姓名<input type="text" name="username"/>
        密码<input type="text" name="userpass"/>
        显示<input type="text" id="Tip" />
        <input type="submit"/>
    </form>

</body>
</html>
