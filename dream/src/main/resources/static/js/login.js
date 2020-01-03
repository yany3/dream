
function login() {
    var username = $('#username');
    var password = $('#password');

    $.ajax({
        url: "/login",
        data: {"username": username,"password":password},
        type: "POST",
        dataType: "json",
        success: function (data) {
            if (data == "0000") {
                location.href('www.baidu.com');
            }else {
                alert("auth error")
            }
        }
    });
}