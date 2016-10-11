 var comboboxData;//项目与部门 field内的combobox data  
		var products = [
		    {productid:'FI-SW-01',name:'Koi'},
		    {productid:'K9-DL-01',name:'Dalmation'},
		    {productid:'RP-SN-01',name:'Rattlesnake'},
		    {productid:'RP-LI-02',name:'Iguana'},
		    {productid:'FL-DSH-01',name:'Manx'},
		    {productid:'FL-DLH-02',name:'Persian'},
		    {productid:'AV-CB-01',name:'Amazon Parrot'}
		];

$(document).ready(function () {

		
	
var comboboxData;//项目与部门 field内的combobox data  
var products = [
    {productid:'FI-SW-01',name:'Koi'},
    {productid:'K9-DL-01',name:'Dalmation'},
    {productid:'RP-SN-01',name:'Rattlesnake'},
    {productid:'RP-LI-02',name:'Iguana'},
    {productid:'FL-DSH-01',name:'Manx'},
    {productid:'FL-DLH-02',name:'Persian'},
    {productid:'AV-CB-01',name:'Amazon Parrot'}
];


function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row');
	return parseInt(tr.attr('datagrid-row-index'));
}
function editrow(target){
	$('#tt').datagrid('beginEdit', getRowIndex(target));
}
function deleterow(target){
	$.messager.confirm('Confirm','Are you sure?',function(r){
		if (r){
			$('#tt').datagrid('deleteRow', getRowIndex(target));
		}
	});
}
function saverow(target){
	$('#tt').datagrid('endEdit', getRowIndex(target));
}
function cancelrow(target){
	$('#tt').datagrid('cancelEdit', getRowIndex(target));
}
function insert(){
	var row = $('#tt').datagrid('getSelected');
	if (row){
		var index = $('#tt').datagrid('getRowIndex', row);
	} else {
		index = 0;
	}
	$('#tt').datagrid('insertRow', {
		index: index,
		row:{
			status:'P'
		}
	});
	$('#tt').datagrid('selectRow',index);
	$('#tt').datagrid('beginEdit',index);
}


$('#tt').datagrid({
	title:'Banner列表',
	iconCls:'icon-edit',
	width:1240,
	height:250,
	singleSelect:true,
	idField:'id',
	//url:'data/datagrid_data.json',
	url:'/superiorcourts/banner/list',
	//type: 'GET',
	columns:[[
		{field:'id',title:'ID',width:78},
		{field:'dwmc',title:'法院名称',width:180,align:'right',editor:{type:'numberbox',options:{precision:1}}},		
		{field:'ftmc',title:'法庭名称',width:150,align:'right',editor:{type:'numberbox',options:{precision:1}}},
		{field:'ah',title:'案号',width:190,align:'right',editor:'numberbox'},
		{field:'tc',title:'庭次',width:60,align:'right',editor:'numberbox'},
		{field:'urlVideo',title:'视频地址',width:220,editor:'text'},
		{field:'urlPic',title:'图片名称',width:280,align:'center',
			editor:{
				type:'checkbox',
				options:{
					on: 'P',
					off: ''
				}
			}
		},
		{field:'action',title:'操作',width:80,align:'center',
			formatter:function(value,row,index){
				if (row.editing){
					var s = '<a href="javascript:void(0)" onclick="saverow(this)">Save</a> ';
					var c = '<a href="javascript:void(0)" onclick="cancelrow(this)">Cancel</a>';
					return s+c;
				} else {
					/*var e = '<a href="javascript:void(0)" onclick="editrow(this)">编辑</a> ';*/
					var d = '<a href="javascript:void(0)" onclick="deleterow(this,'+row.id+')">删除</a>';
					return /*e+*/d;
				}
			}
		}
	]],
	onEndEdit:function(index,row){
		var ed = $(this).datagrid('getEditor', {
			index: index,
			field: 'productid'
		});
		row.productname = $(ed.target).combobox('getText');
	},
	onClickRow:function(index,row){
		var ed = $(this).datagrid('getEditor', {
			index: index,
			field: 'productid'
		});
		row.productname = $(ed.target).combobox('getText');
	},
	onBeforeEdit:function(index,row){
		row.editing = true;
		$(this).datagrid('refreshRow', index);
	},
	onAfterEdit:function(index,row){
		row.editing = false;
		$(this).datagrid('refreshRow', index);
	},
	onCancelEdit:function(index,row){
		row.editing = false;
		$(this).datagrid('refreshRow', index);
	}
});

});
function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row');
	return parseInt(tr.attr('datagrid-row-index'));
}
function editrow(target){
	$('#tt').datagrid('beginEdit', getRowIndex(target));
}
function deleterow(target,id){
	$.messager.confirm('Confirm','你确定删除吗?',function(r){
		if (r){
			//alert(target);
			$('#tt').datagrid('deleteRow', getRowIndex(target));
			$.ajax({
	            url : "/superiorcourts/banner/delete/" + id,
	            type : "get",	           
	            async : false
	        });
		}
	});
}
function saverow(target){
	$('#tt').datagrid('endEdit', getRowIndex(target));
}
function cancelrow(target){
	$('#tt').datagrid('cancelEdit', getRowIndex(target));
}
function insert(){
	var row = $('#tt').datagrid('getSelected');
	if (row){
		var index = $('#tt').datagrid('getRowIndex', row);
	} else {
		index = 0;
	}
	$('#tt').datagrid('insertRow', {
		index: index,
		row:{
			status:'P'
		}
	});
	$('#tt').datagrid('selectRow',index);
	$('#tt').datagrid('beginEdit',index);
}

function saveBanner() {
	$.ajax({
	    url: '/superiorcourts/banner/uploadFile',
	    type: 'POST',
	    cache: false,
	    data: new FormData($('#uploadForm')[0]),
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		$("#tt").datagrid("reload",{ });
	}).fail(function(res) {});
}

function showHello() {
	
}

function syncUnit() {
	

	
	$('#syncbutton').block({ 
		message: "处理中，请稍后..." 
    });
	//return;
	$.ajax({
	    url: '/superiorcourts/sync/unit',
	    type: 'GET',
	    cache: false,
	    async : true,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步成功！");
		
	}).fail(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步失败，请联系管理员！");
	});
	
	
}

function syncCourtRoom() {
	
	$('#syncbutton').block({ 
		message: "处理中，请稍后..." 
    });
	$.ajax({
	    url: '/superiorcourts/sync/courtroom',
	    type: 'GET',
	    cache: false,
	    async : true,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步成功！");
		
	}).fail(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步失败，请联系管理员！");
	});	
	
}

function syncDepartment() {
	
	$('#syncbutton').block({ 
		message: "处理中，请稍后..." 
    });
	$.ajax({
	    url: '/superiorcourts/sync/department',
	    type: 'GET',
	    cache: false,
	    async : true,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步成功！");
		
	}).fail(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步失败，请联系管理员！");
	});
}

function syncUser() {
	$('#syncbutton').block({ 
		message: "处理中，请稍后..." 
    });
	$.ajax({
	    url: '/superiorcourts/sync/user',
	    type: 'GET',
	    cache: false,
	    async : true,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步成功！");
		
	}).fail(function(res) {
		$('#syncbutton').unblock(); 
		alert("数据同步失败，请联系管理员！");
	});
}
