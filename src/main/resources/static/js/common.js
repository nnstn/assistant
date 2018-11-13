function commonpost(url,param,success,fail) {
    $.ajax({
        type: "POST",
        url: url,
        data: param,
        success: success,
        fail:fail
    });
}