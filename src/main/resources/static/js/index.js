$(document).ready(function () {
    $.ajax({
        type: "POST",
        url:ctx+"/getVote",
        data:{},
        success:function (data) {
            if(data.status=="success"){
                $("#voteTitle").text(data.data[0].voteTitle)
                 var options=new Array()
                options=data.data[0].voteOption
            var htmls=""
                 $.each(function(i,options){
                     htmls=htmls+'<label><input name="" type=\"radio\" value="" />options[i].optionValue</label>'
                 })
                $("#selectOption").append(htmls)
            }
        },
        error:function (data) {
            layer.alert("服务器异常")
        }
    })
})
function getVote() {

}