$(document).ready(function () {


});


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
            url:ctx+"/login",
            data:param,
            success:function (data) {
              console.log(data.status)
            },
            error:function (data) {
                console.log(data.status)
            }
        })
    }

}
$("#btn_login").on('click',function () {

});