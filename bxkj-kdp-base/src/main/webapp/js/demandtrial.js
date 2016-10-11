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
	title:'推荐点播列表',
	iconCls:'icon-edit',
	width:1240,
	height:250,
	singleSelect:true,
	idField:'id',
	//url:'data/datagrid_data.json',
	url:'/superiorcourts/recdemand/serverlist',
	//type: 'GET',
	columns:[[
		{field:'id',title:'ID',width:78},
		{field:'ah',title:'案号',width:180,align:'right',editor:{type:'numberbox',options:{precision:1}}},		
		{field:'tc',title:'庭次',width:50,align:'right',editor:{type:'numberbox',options:{precision:1}}},	
		{field:'ftmc',title:'法庭名称',width:150,align:'right',editor:{type:'numberbox',options:{precision:1}}},
		{field:'cbbm',title:'承办部门',width:170,align:'right',editor:'numberbox'},
		{field:'picUrl',title:'图片名称',width:150,align:'right',editor:'numberbox'},
		{field:'action',title:'选择图片',width:280,align:'center',
			formatter:function(value,row,index){
				if (row.editing){
					var s = '<a href="javascript:void(0)" onclick="saverow(this)">Save</a> ';
					var c = '<a href="javascript:void(0)" onclick="cancelrow(this)">Cancel</a>';
					return s+c;
				} else {
					/*var e = '<a href="javascript:void(0)" onclick="editrow(this)">编辑</a> ';*/
					var d = '<form id="uploadForm" method="POST"><input type="hidden" id="id" name="id" value="" /><input	id="file" name="file" onchange="document.getElementById(\'file\').value = this.value;" type="file" style="width: 170px;" />'
					+'<input id="save" type="button" value="保存" onclick="savePic(this,'+row.id+')" style="width: 70px;" /></form>'
					return /*e+*/d;
				}
			}
		},
		{field:'action1',title:'是否生效',width:180,align:'center',
			formatter:function(value,row,index){
				//alert(row.validateFlag);
				if(row.dispalyFlag == 1) {
					var d = '<input id="save" type="button" value="失效" onclick="validate(this,'+row.id+')" style="width: 70px;" />'
				} else {
					var d = '<input id="save" type="button" value="生效" onclick="invalidate(this,'+row.id+')" style="width: 70px;" />'
					
				}
				if (row.editing){
					var s = '<a href="javascript:void(0)" onclick="saverow(this)">Save</a> ';
					var c = '<a href="javascript:void(0)" onclick="cancelrow(this)">Cancel</a>';
					return s+c;
				} else {
					/*var e = '<a href="javascript:void(0)" onclick="editrow(this)">编辑</a> ';*/
				//	var d = '<input id="save" type="button" value="生效" onclick="savePic(this,'+row.id+')" style="width: 70px;" />'
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

function savePic(target,id) {
		
	//alert(id);
	var index = getRowIndex(target);
	$('#uploadForm')[index].id.value = id;
	$.ajax({
	    url: '/superiorcourts/recdemand/uploadFile',
	    type: 'POST',
	    cache: false,
	    data: new FormData($('#uploadForm')[index]),
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		$("#tt").datagrid("reload",{ });
	}).fail(function(res) {});
}

function validate(target,id) {
	
	//alert(id);
	$.ajax({
	    url: '/superiorcourts/recdemand/status/'+id+'/0',
	    type: 'GET',
	    cache: false,	   
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		$("#tt").datagrid("reload",{ });
	}).fail(function(res) {});
}

function invalidate(target,id) {
	
	//alert(id);
	$.ajax({
	    url: '/superiorcourts/recdemand/status/'+id+'/1',
	    type: 'GET',
	    cache: false,	   
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		$("#tt").datagrid("reload",{ });
	}).fail(function(res) {});
}

function syncUnit() {
	$.ajax({
	    url: '/superiorcourts/sync/unit',
	    type: 'GET',
	    cache: false,
	    async : false,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		
	}).fail(function(res) {});
}

function syncCourtRoom() {
	$.ajax({
	    url: '/superiorcourts/sync/courtroom',
	    type: 'GET',
	    cache: false,
	    async : false,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		
	}).fail(function(res) {});	
	
}

function syncDepartment() {
	$.ajax({
	    url: '/superiorcourts/sync/department',
	    type: 'GET',
	    cache: false,
	    async : false,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		
	}).fail(function(res) {});
}

function syncUser() {
	$.ajax({
	    url: '/superiorcourts/sync/user',
	    type: 'GET',
	    cache: false,
	    async : false,	  
	    processData: false,
	    contentType: false
	}).done(function(res) {
		alert(res)
		
	}).fail(function(res) {});
}
