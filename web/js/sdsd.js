
function f() {
        var $ = JQuery;
        $.ajax({
                url: "/searchtiezi",    //请求的url地址
                data: {"tid":1},    //参数值
                type: "POST",
                async:true,
                dataType: "json,charset=utf-8",
                success: function (data) {
                        $(".title1")[0].html(data.title.toString());
                        $(".uid")[0].html(data.uID);
                        $(".date")[0].html(data.data);
                        // $(".article")[0].html(data.article);
                        $(".article")[0].html(data.Article);
                }
        });
        $.ajax({
                url: "/searchtiezi",    //请求的url地址
                data: {"tid":2},    //参数值
                type: "POST",
                async:true ,
                dataType: "json,charset=utf-8",
                success: function (data) {
                        $(".title1")[1].html(data.title);
                        $(".uid")[1].html(data.uid);
                        $(".date")[1].html(data.date);
                        $(".article")[1].html(data.article);
                }
        });
        $.ajax({
                url: "/searchtiezi",    //请求的url地址
                data: {"tid":3},    //参数值
                type: "POST",
                async:true ,
                dataType: "json,charset=utf-8",
                success: function (data) {
                        $(".title1")[2].html(data.title);
                        $(".uid")[2].html(data.uid);
                        $(".date")[2].html(data.date);
                        $(".article")[2].html(data.article);
                }
        });
        $.ajax({
                url: "/searchtiezi",    //请求的url地址
                data: {"tid":4},    //参数值
                type: "POST",
                async:true ,
                dataType: "json,charset=utf-8",
                success: function (data) {
                        $(".title1")[3].html(data.title);
                        $(".uid")[3].html(data.uid);
                        $(".date")[3].html(data.date);
                        $(".article")[3].html(data.article);
                }
        });
        $.ajax({
                url: "/searchtiezi",    //请求的url地址
                data: {"tid":5},    //参数值
                type: "POST",
                async:true ,
                dataType: "json,charset=utf-8",
                success: function (data) {
                        $(".title1")[4].html(data.title);
                        $(".uid")[4].html(data.uid);
                        $(".date")[4].html(data.date);
                        $(".article")[4].html(data.article);
                }
        });
        // $.ajax({
        //         url: "/searchtiezi",    //请求的url地址
        //         data: {"tid":6},    //参数值
        //         type: "POST",
        //         async:false,
        //         dataType: "json",
        //         success: function (tiezi) {
        //                 $(".title1")[5].html(tiezi.title);
        //                 $(".uid")[5].html(tiezi.uid);
        //                 $(".date")[5].html(tiezi.date);
        //         }
        // });
        // $.ajax({
        //         url: "/searchtiezi",    //请求的url地址
        //         data: {"tid":7,    //参数值
        //         type: "POST",
        //         async:false,
        //         dataType: "json",
        //         success: function (tiezi) {
        //                 $(".title1")[6].html(tiezi.title);
        //                 $(".uid")[6].html(tiezi.uid);
        //                 $(".date")[6].html(tiezi.date);
        //         }
        // });
        // $.ajax({
        //         url: "/searchtiezi",    //请求的url地址
        //         data: {"tid":8},    //参数值
        //         type: "POST",
        //         async:false,
        //         dataType: "json",
        //         success: function (tiezi) {
        //                 $(".title1")[7].html(tiezi.title);
        //                 $(".uid")[7].html(tiezi.uid);
        //                 $(".date")[7].html(tiezi.date);
        //         }
        // });
        // $.ajax({
        //         url: "/searchtiezi",    //请求的url地址
        //         data: {"tid":9},    //参数值
        //         type: "POST",
        //         async:false,
        //         dataType: "json",
        //         success: function (tiezi) {
        //                 $(".title1")[8].html(tiezi.title);
        //                 $(".uid")[8].html(tiezi.uid);
        //                 $(".date")[8].html(tiezi.date);
        //         }
        // });
        // $.ajax({
        //         url: "/searchtiezi",    //请求的url地址
        //         data: {"tid":10},    //参数值
        //         type: "POST",
        //         async:false,
        //         dataType: "json",
        //         success: function (tiezi) {
        //                 $(".title1")[9].html(tiezi.title);
        //                 $(".uid")[9].html(tiezi.uid);
        //                 $(".date")[9].html(tiezi.date);
        //         }
        // });
};
window.onload = function () {
    f();
    this.f();
}