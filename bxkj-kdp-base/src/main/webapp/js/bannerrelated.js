$(document).ready(function () {

var unitUrl = "/superiorcourts/unit/all/list";
$.getJSON(unitUrl, function(json) {
	$('#txtShouName').combobox({
		data : json,
		valueField : 'fydm',
		textField : 'dwmc',
		onSelect : function(record) {
			//alert("test");
			//alert(record.fydm + " " + record.dwmc);
			var countUrl = "/superiorcourts/courtroom/all/"+record.fydm;
			$.getJSON(countUrl, function(json) {
				$('#txtPipeRowName').combobox({
					data : json,
					valueField : 'ftbs',
					textField : 'ftmc',
					onSelect : function(record) {
						//alert("test");
						//alert(record.ftbs + " " + record.ftmc);
						var trialmixUrl = "/superiorcourts/trialmix/list/"+record.ftbs+"/2";
						$.getJSON(trialmixUrl, function(json) {
							$('#txtPipeName').combobox({
								data : json,
								valueField : 'ajbs',
								textField : 'ah',
								onSelect : function(record) {
									//alert("record.ajbs="+record.ajbs);
									var trialtcUrl = "/superiorcourts/trialmix/listtc/"+record.ajbs+"/2";
									$.getJSON(trialtcUrl, function(json) {
										$('#txtTc').combobox({
											data : json,
											valueField : 'tc',
											textField : 'tc',
											onSelect : function(record) {
												
											}
										});
									});	
								
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