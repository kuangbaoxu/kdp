$(document).ready(function () {

var unitUrl = "/superiorcourts/unit/list";
$.getJSON(unitUrl, function(json) {
	$('#txtShouName').combobox({
		data : json,
		valueField : 'fydm',
		textField : 'dwmc',
		onSelect : function(record) {
			//alert("test");
			alert(record.fydm + " " + record.dwmc);
			var countUrl = "/superiorcourts/courtroom/list"+record.fydm;
			$.getJSON(countUrl, function(json) {
				$('#txtPipeRowName').combobox({
					data : json,
					valueField : 'ftbs',
					textField : 'ftmc',
					onSelect : function(record) {
						//alert("test");
						//alert(record.ftbs + " " + record.ftmc);
						var trialmixUrl = "/superiorcourts/trialmix/"+record.ftbs;
						$.getJSON(trialmixUrl, function(json) {
							$('#txtPipeName').combobox({
								data : json,
								valueField : 'ajbs',
								textField : 'ah',
								onSelect : function(record) {
									//alert("test");
									//alert(record.ajbs + " " + record.ah);
									//var unitUrl = "/unit/list"+record.fydm;
								}
							});
						});	
					}
				});
			});	
		}
	});
});	

//******************************************************************************************************//*
//下面的俩个是组件，
//二层Combo
var piperowCombx = $("#txtPipeRowName")
	.combobox({
				loader : function(param, success, error) {
					$.ajax({
								url : '/superiorcourts/courtroom/'
										+ $("#txtShouName").combobox(
												"getValue") + '',
								dataType : 'json',
								success : function(data) {
									data.unshift({
										ftbs : '',
										ftmc : '全部'
									});
									success(data);
								},
								error : function() {
									error.apply(this, arguments);
								}
							});
				},
				valueField : 'fydm',
				textField : 'dwmc',
				value : '',
				editable : false
			});

//三层Combo
var pipeCombx = $("#txtPipeName")
	.combobox({
				loader : function(param, success, error) {
					$.ajax({
								url : '/superiorcourts/trialmix/'
										+ $("#txtPipeRowName").combobox(
												"getValue") + '',
								dataType : 'json',
								success : function(data) {
									data.unshift({
										ajbs : '',
										ah : '全部'
									});
									success(data);
								},
								error : function() {
									error.apply(this, arguments);
								}
							});
				},
				valueField : 'ajbs',
				textField : 'ah',
				value : '',
				editable : false
			});
	
});