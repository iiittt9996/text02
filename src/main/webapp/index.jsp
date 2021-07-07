<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8080/springMVC_01_war_exploded/">
    <script type="text/javascript" src="js/jQuery.min.js"></script>
    <script type="text/javascript">
            $(function () {
                $('#but').click(function () {
                    $.ajax({
                        url:"some.do",
                        data:{
                            name:"zs",
                            age:"20"
                        },
                        type:"post",
                        // dataType:"json",
                        success:function (resp) {
                            alert(resp);
                        }
                    })
                })
            })
    </script>
</head>

<body>
    <form action="user/some.do" method="post">
        姓名：<input type="text" name="name"><br />
        姓名：<input type="text" name="age"><br />
        <input type="submit" value="提交数据">
    </form>
    <button id="but">按钮</button>
</body>
</html>
