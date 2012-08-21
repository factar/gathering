/*
 * 键盘监听事件
 */
function KeyDownListener(){
	var code = event.keyCode;
	if(code ==13 || code == "13"){
		Login();
	}
}
