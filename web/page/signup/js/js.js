$(function () {
    $("#GetName").on("click", function () {
        var name =$("#name").val();
        var pass =$("#pass").val();
        var email = $("#email").val();

        var now = new Date();
        var year = now.getFullYear(); //得到年份
        var month = now.getMonth();//得到月份
        var date = now.getDate();//得到日期
        var hour = now.getHours();//得到小时
        var minu = now.getMinutes();//得到分钟
        var sec = now.getSeconds();//得到秒

        var signupdata = year+"年"+month+"月"+date+"日 "+hour+"时"+minu+"分"+sec+"秒";

        $.ajax({
            url: "/DataInsertController",    //请求的url地址
            data: {"name": name,"email":email,"password": pass,"signupdata": signupdata},    //参数值
            type: "POST",
            dataType: "json",   //返回格式为json
            // success: function (data) {
            //     //请求成功时处理
            // }
        });
    });
});