$(document).ready(function () {

});
var success="success"
function equals(str1,str2) {
    if(str1==str2)
    {
        return true
    }else {
        return false
    }
}


function login() {
    var username=$("#username").val()
    var pwd=$('#password').val()
    if(username==''||pwd==''||username==null||pwd==null)
    {
      layer.alert("用户名或密码不能为空")
    }else {
        var param=$('#loginForm').serializeArray()
        $.ajax({
            type: "POST",
            url:ctx+"/loginDo",
            data:param,
            success:function (data) {
                layer.msg(data.msg)
                if(equals(success,data.status)){
                    window.location.href="index";
                }
            },
            error:function (data) {
                layer.alert("服务器异常")
            }
        })
    }

}
