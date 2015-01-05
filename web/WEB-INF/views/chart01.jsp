<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/gmxx.css" rel="stylesheet" type="text/css" />

</head>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="${ctx}/shinowit/index"><img src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo" /></a>
        <p class="topDiv"></p>
        <p class="navLeft"></p>
        <ul>
            <li><a href="${ctx}/shinowit/index" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="${ctx}/shinowit/chart">购物车</a></li>
        </ul>
        <p class="navRight"></p>
        <p class="topDiv"></p>
        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox" />
            <input type="submit" name="go" value="搜" class="go" />
        </form>
    </div>
    <!--top end -->
    <div class="nav">
        <ul>
            <li class="first"><a href="#">新品上架</a></li>
            <li><a href="#">坚果炒货</a></li>
            <li><a href="#">补血大枣</a></li>
            <li><a href="#">经典肉类</a></li>
            <li><a href="#">进口零食</a></li>
            <li><a href="#">美味糖果</a></li>
            <li><a href="#">天然干果</a></li>
            <li><a href="#">蒙古奶酪</a></li>
            <li><a href="#">台湾牛轧糖</a></li>
            <li><a href="#">蜜饯果脯</a></li>
            <li class="last">
                <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="${ctx}/shinowit/login">登录</a><span class="Lloginfg">&nbsp;</span><a href="${ctx}/reg">注册</a></div>
            </li>
        </ul>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map" />
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#" />
            <area shape="rect" coords="540,12,633,51" href="#" />
            <area shape="rect" coords="684,12,790,53" href="#" />
            <area shape="rect" coords="830,10,953,54" href="#" />
        </map>
    </div><!--guide01 end -->
    <!--body start -->
    <div id="body">
        <div id="Login">
            <DIV id="gwc">
                <div id="step_" align="left">结算步骤: <span class="" id="shoppingstep_0">1.登录注册</span> &gt;&gt; <span class="shoppingstepcontrol" id="shoppingstep_2">2.填写核对订单信息</span> &gt;&gt; <span class="" id="shoppingstep_3">3.提交订单</span></div>
                <div id="onEdit"></div>
                <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
                <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。</DIV><IMG id="imgPointError"
                                                                                     src="<%=request.getContextPath()%>/images/jifenbuzhu.gif" useMap=#Map border=0> <MAP id="Map"
                                                                                                                                                                          name=Map><AREA shape=RECT coords=962,9,972,19
                                                                                                                                                                                         href="javascript:ClosePointError();"></MAP></DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=100% border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left><SPAN
                                id="TenPayNotice"></SPAN></TD></TR></TBODY></TABLE>
                <div id="AddressContent">
                    <!--begin-->
  <span id="Label_AddressList">
    <div class="bxSty4">
        <table width="100%" cellpadding="0" cellspacing="0" class="addDivTab tabSty01">
            <tbody>
            <tr class="addbgcolor trSty01">
                <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;<strong>商品</strong>
                </td>
            </tr>
            <tr class="addbgcolor trSty01">
                <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;<strong>地址簿 </strong>（您以前用过的地址）</td>
            </tr>
            <tr>
                <c:forEach items="${showaddress}" var="addresslistshow">
                    <table style="border:1px solid salmon;margin-top: 15px;margin-left:45px">
                        <tr>
                            <td width="65">收货人：</td>
                            <td>${addresslistshow.recman}</td>
                            <td width="15px"></td>
                            <td width="80">收货地址：</td>
                            <td width="118">${addresslistshow.recaddress}</td>
                            <td width="15px"></td>
                            <td width="80">邮政编码：</td>
                            <td>${addresslistshow.postcode}</td>
                            <td width="15px"></td>
                            <td>电话：</td>
                            <td>${addresslistshow.tel}</td>
                            <td width="15px"></td>
                            <td><a  style="cursor: hand ;color: red">修改</a></td>
                            <td width="15px"></td>
                            <td><a  style="cursor: hand;color: red">删除</a></td>
                            <td width="15px"></td>
                            <td><a href="${ctx}/shinowit/chart02" style="cursor: hand;color: red">使用这个地址</a></td>
                        </tr>
                    </table>
                </c:forEach>
                <div id="edit">
                    <div class="bxSty1">
                        <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tbody>
                            <tr class="trSty01" bgcolor="#7a7f89">
                                <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;请输入新的 <strong>配送地址</strong></td>
                            </tr>
                            <tr>
                                <td align="center" valign="top">
                                    <ul class="psAdd" align="left">
                                        <li>
                                            <p class="pSty01" align="right">收货人姓名：</p>
                                            <p class="pSty02 reusableColor3" align="left">
                                                <input name="Name" id="Name" size="22" onchange="ChecktheForm_Name()" type="text" />
                                                &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                请准确填写真实姓名，以便确保商品准确无误送达。</p>
                                        </li>
                                        <li class="conLi1"><span class="errorstring" id="errorName"></span></li>
                                        <li>
                                            <p class="pSty01" align="right">配送省份/直辖市：</p>
                                            <p>
                                                <select id="ProvinceID" name="ProvinceID" onchange="ShowCity(this.options[selectedIndex].text);CheckProvince()">
                                                    <option selected="selected" value="">--请选择--</option>
                                                    <option value="%e5%8c%97%e4%ba%ac">北京</option>
                                                    <option value="%e5%a4%a9%e6%b4%a5">天津</option>
                                                </select>
                                                &nbsp;&nbsp;市：
                                                <select id="CityID" name="CityID" onchange="ShowArea(this.options[selectedIndex].text);CheckCity()">
                                                    <option selected="selected" value="">--请选择--</option>
                                                </select>
                                                &nbsp;&nbsp;县/区：
                                                <select id="AreaID" name="AreaID" onchange="GetPostalCodeNew(this.options[this.selectedIndex].text,'CityID','ProvinceID'),ShowV(this.options[this.selectedIndex].text);CheckArea()">
                                                    <option selected="selected" value="">--请选择--</option>
                                                </select>
                                                &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; </p>
                                        </li>
                                        <li class="conLi2"><span id="errorArea"></span></li>
                                        <li>
                                            <p class="pSty01" align="right">详细地址：</p>
                                            <p class="pSty02">
                                                <input name="Address" id="Address" size="40" onchange="ChecktheForm_Address()" maxlength="500" type="text" />
                                                &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; <br />
                                                <span class="fontSty reusableColor3">862城市送货上门，货到付款。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="reusableColor1"><a href="#" target="_blank"> 查看详细的配送范围 </a></span></span> </p>
                                        </li>
                                        <li class="conLi3"><span id="errorAddress" class="errorstring"></span></li>
                                        <li>
                                            <p class="pSty01" align="right">邮政编码：</p>
                                            <p class="pSty02 reusableColor3">
                                                <input name="Zip" id="Zip" size="7" onchange="ChecktheForm_Zip()" type="text" />
                                                &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; <span id="SetPostalCode"></span> </p>
                                        </li>
                                        <li class="conLi4"><span id="errorPostal" class="errorstring"></span></li>
                                        <li>
                                            <p class="pSty01" align="right">固定电话：</p>
                                            <p class="pSty02">
                                                <input name="Tel" id="Tel" onchange="ChecktheForm_Tel()" size="12" type="text" />
                                                <span id="PhoneCode"></span> </p>
                                        </li>
                                        <li class="conLi5"><span id="errorPhone" class="errorstring"></span></li>
                                        <li>
                                            <p class="pSty01" align="right">手机：</p>
                                            <p class="pSty02 reusableColor3">
                                                <input name="Mobile" id="Mobile" size="22" onchange="ChecktheForm_Tel()" type="text" />
                                                手机与固定电话至少有一项必填 </p>
                                        </li>
                                        <li class="conLi6"><span id="errorMobile"></span></li>
                                        <li class="conLi7"><span class="addSpanSty"><a href="${ctx}/shinowit/chart02"><img src="<%=request.getContextPath()%>/images/button_pszADd.gif" alt="" border="0" onclick="#" /></a></span></li>
                                    </ul></td>
                            </tr>
                            <tr class="trSty01" bgcolor="#dcdfe5">
                                <td class="reusableColor3 xxSty01" align="left" height="26">&nbsp;&nbsp;&nbsp;&nbsp;接下来您还需要选择 配送方式、支付方式、送货时间。</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div></td>
            </tr>
            </tbody>
        </table>
        <div class="addDivPage" id="all_main_down_bottom">
            <div class="pagebtn"><span class="current">1</span>&nbsp;共1页</div>
        </div>
    </div>
    </span><!--end-->
                </div>
<SPAN
        id="leavelNotMustPresentLsit"></SPAN>
                <DIV class="sty006 reusableColor3" align=left>您在购物过程中有任何疑问，请查阅 <A
                        href="#" target=_blank><SPAN
                        class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                                    target=_blank><SPAN class="reusableColor1">联系客服</SPAN></A></DIV>
                <DL class="dobuleBorder" style="display:none;">
                    <DT><STRONG>关于"我的购物车"</STRONG> </DT>
                    <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
                    </DD></DL></DIV>
        </div>
        <br class="spacer" />
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 All Rights Reserved 冀ICP证xxxxxx号

        </p>
        <p class="design"><a href="#" target="_blank" class="link">启奥科技</a></p>
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
</body>
</html>
