function onMouseMoveOutCheckPhone(obj_id,alert_id){
    if($('#'+obj_id).val()!=""){
        if($('#'+obj_id).val().length<=12&&$('#'+obj_id).val().length>=10){
            $('#'+alert_id).attr('src','/image/invoice_apply/success.png');
            $('#'+alert_id).show();
            $('#' + obj_id).css('background-color', 'rgba(102 205 170)');
            return true;
        }else {
            $('#'+alert_id).attr('src','/image/invoice_apply/wrong.png');
            $('#'+alert_id).show();
            $('#' + obj_id).css('background-color', 'rgba(250 128 114)');
            return  false;
        }
    }else {
        $('#'+alert_id).attr('src','/image/invoice_apply/wrong.png');
        $('#'+alert_id).show();
        $('#' + obj_id).css('background-color', 'rgba(250 128 114)');
        return false;
    }
}
function onMouseMoveOutCheckValue(obj_id,alert_id) {
    if ($('#' + obj_id).val() != "") {
        if ($('#' + obj_id).val().length <= 6) {
            $('#' + alert_id).attr('src', '/image/invoice_apply/success.png');
            $('#' + obj_id).css('background-color', 'rgba(102 205 170)');
            $('#' + alert_id).show();
            return true;
        } else {
            $('#' + alert_id).attr('src', '/image/invoice_apply/wrong.png');
            $('#' + obj_id).css('background-color', 'rgba(250 128 114)');
            $('#' + alert_id).show();
            return false;
        }
    }else {
        $('#' + alert_id).attr('src', '/image/invoice_apply/wrong.png');
        $('#' + obj_id).css('background-color', 'rgba(250 128 114)');
        $('#' + alert_id).show();
        return false;
    }
}
function onSubmitButtonMove(id){
    $('#'+id).css('background-color','rgba(102 205 170)');
    $('#'+id).css('border-color','rgba(102 205 170)');
}
function onSubmitButtonOut(id){
    $('#'+id).css('background-color','white');
    $('#'+id).css('border-color','gray');
}
function onBackButtonMove(id){
    $('#'+id).css('background-color','rgba(255 228 196)');
    $('#'+id).css('border-color','rgba(255 228 196)');
}
function onBackButtonOut(id){
    $('#'+id).css('background-color','white');
    $('#'+id).css('border-color','gray');
}

function onSubmitButtonClick(){
    // check value
    if (!onMouseMoveOutCheckValue('visit_name_input','visit_name_alert')) {
        alert('名前間違いあり！');
        return false;
    }else if(!onMouseMoveOutCheckPhone('visit_phone_input','visit_phone_alert')){
        alert('電話番号桁数間違いあり！');
        return false;
    }else {
        $('#form_obj').submit(function (e){
            alert("更新完了");
            return true;
        });
    }
}

function onBackButtonClick(){
    window.location.href="/invoiceList/pages"
}