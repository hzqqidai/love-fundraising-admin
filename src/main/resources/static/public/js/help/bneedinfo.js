$(function () {
    $("#jqGrid").jqGrid({
        url: '../bneedinfo/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '救助人姓名', name: 'helpName', index: 'help_name', width: 80 }, 			
			{ label: '性别 0男性 1女性', name: 'helpSex', index: 'help_sex', width: 80 }, 			
			{ label: '年龄', name: 'helpAge', index: 'help_age', width: 80 }, 			
			{ label: '身份证', name: 'helpCard', index: 'help_card', width: 80 }, 			
			{ label: '联系方式', name: 'helpTel', index: 'help_tel', width: 80 }, 			
			{ label: '地址', name: 'address', index: 'address', width: 80 }, 			
			{ label: '监护人', name: 'guardian', index: 'guardian', width: 80 }, 			
			{ label: '监护人电话', name: 'gTel', index: 'g_tel', width: 80 }, 			
			{ label: '标题', name: 'title', index: 'title', width: 80 }, 			
			{ label: '描述', name: 'describe', index: 'describe', width: 80 }, 			
			{ label: '受助人类型', name: 'helpType', index: 'help_type', width: 80 }, 			
			{ label: '0：待提交审核1：审核中2：审核通过3：审核不通过', name: 'auditStatus', index: 'audit_status', width: 80 }, 			
			{ label: '监护人身份证', name: 'gCard', index: 'g_card', width: 80 }, 			
			{ label: '监护人年龄', name: 'gAge', index: 'g_age', width: 80 }, 			
			{ label: '监护人性别0：男1：女', name: 'gSex', index: 'g_sex', width: 80 }, 			
			{ label: '省', name: 'province', index: 'province', width: 80 }, 			
			{ label: '市', name: 'city', index: 'city', width: 80 }, 			
			{ label: '县', name: 'county', index: 'county', width: 80 }, 			
			{ label: '创建人', name: 'createName', index: 'create_name', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '修改人', name: 'updateName', index: 'update_name', width: 80 }, 			
			{ label: '修改时间', name: 'updateTime', index: 'update_time', width: 80 }, 			
			{ label: '1未删除 0已删除', name: 'yn', index: 'yn', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		bNeedInfo: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.bNeedInfo = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.bNeedInfo.id == null ? "../bneedinfo/save" : "../bneedinfo/update";
			$.ajax({
				type: "POST",
			    url: url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.bNeedInfo),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: "../bneedinfo/delete",
				    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get("../bneedinfo/info/"+id, function(r){
                vm.bNeedInfo = r.bNeedInfo;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});