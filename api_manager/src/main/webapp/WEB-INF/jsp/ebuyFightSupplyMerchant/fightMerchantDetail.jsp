<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="<%=basePath%>//"/>
    <title>自提点详情</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<div class="info">
    <form class="inputform" action="<%=basePath%>/ebuyFightSupplyMerchant/addFightMerchant.html" method="post">
        <h2>自提点详情</h2>
        <table class="info-list-02 mtop20" border="0" cellpadding="0" cellspacing="1">
            <tr>
                <td width="20%"><div class="list-name"><span class="red">*</span> 自提点名称：</div></td>
                <td>${dto.ebuyFightSupplyMerchant.name}</td>
            </tr>

            <tr class="search-input">
                <td><div class="list-name"><span class="red">*</span> 自提点城市：</div></td>
                <td>
                    ${dto.cityName}
                </td>
            </tr>


            <tr class="city-con">
                <td><div class="list-name">已选小区：</div></td>
                <td>
                    <ul class="address-list selected-box area-box">
                        <c:forEach items="${buildings}" var="item">
                            <li class="posrelative address-selected address-selected-4"
                                data-class="address-selected-4"><span class="address-name">${item.name}</span>
                            </li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>

            <tr>
                <td><div class="list-name"><span class="red">*</span> 自提点地址：</div></td>
                <td>${dto.ebuyFightSupplyMerchant.delivAddress}</td>
            </tr>
            <tr>
                <td><div class="list-name"><span class="red">*</span> 手机号码：</div></td>
                <td>${dto.ebuyFightSupplyMerchant.tel}</td>
            </tr>
        </table>

        <div class="h30"></div>
    </form>
</div>

</body>
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/jquery.common.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
    (function($){
        //表单验证
        $(".inputform").Validform({
            btnSubmit:"#sumTicket",
            tiptype:3,
            beforeSubmit: function (curform) {
                $(".inputform").attr('onsubmit', 'return false;');
            },
            callback:function(data){
                $(".inputform").ajaxSubmit(function (data) {
                    try {
                        data = eval(data);
                    } catch (e) {
                        data = eval("(" + data + ")");
                    }
                    if (data.status == '0000') {
                        alert("自提点添加成功！");
                        window.location.href = "<%=basePath%>/ebuyFightSupplyMerchant/addFightMerchant.html";
                    } else {
                        alert(data.message);
                        $(".inputform").Validform().resetStatus();
                    }
                });
            }
        });

        //修复日期选择，延迟验证
        $('.input_text.icon_dt').blur(function(){
            var $this = $(this);
            setTimeout(function(){
                $(".inputform").Validform({}).check(false,$this);
            },600);
        });

    })(jQuery);
</script>
<script type="text/javascript">
    $(function(){
        //选择城市/小区
        var $addressSelectedLi = $('.address-selected.dsn'),
                addressSelectedNum = 0,
                selectCountNum = 0,
                selectCityCountNum = 0,
                realNum;
        function addDeleteAddress(obj01, obj02, countNum){

            //选择城市/小区
            function singleInfoSelect(){
                $(document).on("click", obj01, function(){
                    var $this = $(this);
                    var $thisSelectInput = $this.parents('tr').next('.city-con').find('.select-input');
                    var $thisSelectedBox = $this.parents('tr').next('.city-con').find('.selected-box');

                    if(!$this.hasClass('on')){
                        if(obj01 == '.address-list.search-box.area-box li'){
                            if($('.address-list.selected-box.area-box').html() != ''){
                                countNum = $('.address-list.selected-box.area-box li').length;
//                                console.log('length',$('.address-list.selected-box.area-box li').length, 'countNum', countNum);
                            }else{
                                countNum = 0;
                            }
                        }

                        if(obj01 == '.address-list.search-box.city-box li' && countNum == 1){
                            alert('只能选择一个城市，请先删除已选城市！');
                            return false;
                        }

                        var addressSelectedClass = 'address-selected-';
                        addressSelectedNum += 1;

                        addressSelectedClass = addressSelectedClass + addressSelectedNum;

                        var $addressSelectedLiClone = $addressSelectedLi.clone(true);
                        var thisName = $this.find('.address-name').text();

                        $this.addClass('on ' + addressSelectedClass).attr('data-class',addressSelectedClass);
                        $addressSelectedLiClone.find('.address-name').text(thisName);
                        $addressSelectedLiClone.removeClass('dsn').addClass(addressSelectedClass).attr('data-class',addressSelectedClass).appendTo($thisSelectedBox);

                        var id;
                        if(obj01 == '.address-list.search-box.city-box li'){
                            id = $this.find('span').attr('data-itemid');
                            $addressSelectedLiClone.append('<input type="hidden" id="cityId" value="'+id+'">');
                        } else {
                            id = $this.find('span').attr('data-itemid');
                            $addressSelectedLiClone.append('<input type="hidden" name="buildingIds" value="'+id+'">');
                        }

                        countNum += 1;
                        //已选城市，校验通过
                        $thisSelectInput.val(countNum);
                        $(".inputform").Validform({}).check(false, $thisSelectInput);
                    }else{
                        var thisUnSelectedClass = $this.attr('data-class');
                        $this.removeClass();
                        $('.selected-box').find('.' + thisUnSelectedClass).remove();

                        countNum -= 1;
//                        console.log('selectCountNum',selectCountNum,'countNum',countNum);
                        //没有选择城市，校验不通过
                        if(countNum == 0){
                            $thisSelectInput.val('');
                            $(".inputform").Validform({}).check(false, $thisSelectInput);
                        }
                        if(obj01 == '.address-list.search-box.city-box li'){
                            $('.address-list.search-box.area-box, .address-list.selected-box.area-box').html('');
                            $('.address-list.selected-box.area-box').siblings('.select-input').val('');
                            $(".inputform").Validform({}).check(false, $('.address-list.selected-box.area-box').siblings('.select-input'));
                        }
                    }
                    //重置页面高度
                    window.parent.TuneHeight();
                });

                //删除城市/小区
                $(document).on("click", obj02, function(){
                    var $this = $(this);
                    var $thisSelectInput = $this.parents('.address-list').siblings('.select-input');
                    var thisDeleteClass = $this.parent('li').attr('data-class');
                    if($('.' + thisDeleteClass)){
                        $('.' + thisDeleteClass).removeClass('on');
                    }
                    $this.parent('li').remove();

                    countNum -= 1;
                    //没有选择城市，重新校验，不通过
                    if(obj02 == '.address-list.selected-box.city-box li .icon-delete'){
                        $thisSelectInput.val('');
                        $(".inputform").Validform({}).check(false, $thisSelectInput);
                        $('.address-list.search-box.area-box, .address-list.selected-box.area-box').html('');
                        $('.address-list.selected-box.area-box').siblings('.select-input').val('');
                        $(".inputform").Validform({}).check(false, $('.address-list.selected-box.area-box').siblings('.select-input'));
                    }else{
                        if(countNum == 0){
                            $thisSelectInput.val('');
                            $(".inputform").Validform({}).check(false, $thisSelectInput);
                        }
                    }
                    //重置页面高度
                    window.parent.TuneHeight();
                });
            };
            return {
                singleInfoSelect: singleInfoSelect
            };
        }(realNum);

        var citySelectFunc = addDeleteAddress('.address-list.search-box.city-box li', '.address-list.selected-box.city-box li .icon-delete', selectCityCountNum),
                areaSelectFunc = addDeleteAddress('.address-list.search-box.area-box li', '.address-list.selected-box.area-box li .icon-delete', selectCountNum);

        citySelectFunc.singleInfoSelect();
        areaSelectFunc.singleInfoSelect();

        //搜索内容
        function ajaxSearch(url,objBox){
            $.getJSON(url, function(data){

                var $objBox = $(objBox);
                var searchList = '';

                $.each(data, function (i, aaList) {
                    //小区搜索，带详细地址
                    if(aaList.addressDesc){
                        if(aaList.name.indexOf(currentVal) > -1 || aaList.addressDesc.indexOf(currentVal) > -1){
                            searchList += '<li><span class="address-name" data-itemid="'+aaList.id+'">' + aaList.name + '</span><br><span class="grey">地址：' + aaList.addressDesc + '</span></li>';
                        }
                        //城市搜索，不带详细地址
                    }else if (aaList.name.indexOf(currentVal) > -1) {
                        searchList += '<li><span class="address-name" data-itemid="'+aaList.id+'">' + aaList.name + '</span></li>';
                    }
                });

                if(searchList == ''){
                    searchList = '<span>' + '没有找到相关内容' + '</span>';
                }
                $objBox.html(searchList);
                //重置页面高度
                window.parent.TuneHeight();
            });
        }

        //开始搜索
        $('.input-btn').click(function(){
            var url = '<%=basePath%>' + $(this).attr('data-url');
            var city = $('#city').val();
            city = encodeURI(city, "utf-8");
            var gb = $('#building').val();
            gb = encodeURI(gb, "utf-8");
            if(url.indexOf('addressCity') > -1) {
                url = url + '?name=' + city;
            }else if(url.indexOf('groupBuildingJson') > -1) {
                var cityId = $('#cityId').val();
                url = url + '?name=' + gb + '&cityId=' + cityId;
            }
            var thisSearchBox = $(this).parents('tr').next('.city-con').find('.search-box');
            currentVal = $.trim($(this).siblings('.input_text').val());
            if(!currentVal == ''){
                ajaxSearch(url,thisSearchBox);
            }
        });
    });

</script>
</html>
