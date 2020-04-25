function message(msg) {
    $.messager.show({
        title:'系统提示',
        msg:msg,
        timeout:1000,
        showType:'show'
    });
}
