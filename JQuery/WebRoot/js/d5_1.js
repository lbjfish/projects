/*
	当整个页面加载完毕之后，会产生
	load事件，对应的事件处理函数会
	执行。
	页面加载完成，则dom树肯定已经创建，
	则可以对dom树做操作了(比如访问
	相应的dom节点，对该节点绑订相应的
	事件处理函数)。
	
*/
window.onload = function () {
	var obj = document.getElementById("d1");
	//绑订单击事件处理函数。
	obj.onclick = function () {
		//this.innerHTML = "love java";
		$(this).html('love java');
	};
};

