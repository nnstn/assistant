//POST 使用 @RequestBody 接收参数
function commonpost(url,param,success,fail) {
    $.ajax({
        type: "POST",
        url: url,
        data: JSON.stringify(param),
        success: success,
        contentType: "application/json;charset=UTF-8",
        // contentType: 'application/x-www-form-urlencoded;charset=UTF-8',
        //contentType: 'multipart/form-data',
        fail:fail
    });
}