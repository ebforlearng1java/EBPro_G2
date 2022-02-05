
// on center menu move on button
function onMouseMoveButton(id){
    $('#'+id).css('background-color','rgba(102 205 170)');
    $('#'+id).css('border-color','rgba(102 205 170)');
}
function onMouseMoveButtonOut(id){
    $('#'+id).css('background-color','white');
    $('#'+id).css('border-color','rgba(105 105 105)');
}
// on right menu move on button
function onMouseMoveRightButton(id){
    $('#'+id).css('background-color','rgba(216 191 216)');
    $('#'+id).css('border-color','rgba(216 191 216)');
}
function onMouseMoveRightButtonOut(id){
    $('#'+id).css('background-color','white');
    $('#'+id).css('border-color','rgba(105 105 105)');
}
function onMouseMoveLeftButton(id){
    $('#'+id).css('background-color','rgba(253 245 230)');
    $('#'+id).css('border-color','rgba(253 245 230)');
}
function onMouseMoveLeftButtonOut(id){
    $('#'+id).css('background-color','white');
    $('#'+id).css('border-color','rgba(105 105 105)');
}
// onButton click
function onMouseClickButton(id){
    switch (id) {
        case 'invoice_apply':
            // 申請
            window.location.href = "/invoiceApply";
            return true;
        case 'invoice_management':
            //　管理
            window.location.href = "/invoiceList/pages";
            return true;
        case 'invoice_payment':
            // 支払い
            window.location.href = "/invoice_payment";
            return true;
        case 'invoice_search':
            //　検索
            window.location.href = "/invoice_search";
            return true;
        default:
            window.location.href="/";
            return false;

    }
}

