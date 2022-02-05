function onManagementButtonClick(id){

   window.location.href="/invoiceManagement?management_id="+id;
}
function onManagementButtonMove(id){
    $('#'+id).css('background-color','rgba(238 229 222)');
}
function onManagementButtonOut(id){
    $('#'+id).css('background-color','rgba(235 235 235)');
}
function onReturnButtonMove(id){
    $('#'+id).css('background-color','rgba(238 229 222)');
}
function onReturnButtonOut(id){
    $('#'+id).css('background-color','rgba(235 235 235)');
}
function onReturnButtonClick(){
    window.location.href="/"
}