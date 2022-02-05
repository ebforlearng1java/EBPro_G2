function onMouseMoveSubmitButton(id){
    $('#'+id).css('background-color','rgba(102 205 170)');
    $('#'+id).css('border-color','rgba(102 205 170)');
}
function onMouseOutSubmitButton(id){
    $('#'+id).css('background-color','white');
    $('#'+id).css('border-color','black');
}
// check  phone box
function onMouseMoveOutCheckPhone(obj_id,alert_id){
    if($('#'+obj_id).val()!=""){
        if($('#'+obj_id).val().length<=13&&$('#'+obj_id).val().length>=11){
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
// form checks
function onFormClick(){
　　// check phone and name
    if (!onMouseMoveOutCheckValue('visit_name_input','visit_name_alert')) {
        alert('名前間違いあり！');
        return false;
    }
    if(!onMouseMoveOutCheckPhone('visit_phone_input','visit_phone_alert')){
        alert('電話番号桁数間違いあり！');
        return false;
    }
    if(onMouseMoveOutCheckValue('visit_name_input','visit_name_alert')&&onMouseMoveOutCheckPhone('visit_phone_input','visit_phone_alert')){
       $('#form_obj').submit(function (e){
           alert("申請完了");
           return true;
       });
    }else {
        alert("error!");
        return false;
    }
}
