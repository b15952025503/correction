<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - PDF</title>
    <meta charset="UTF-8"/>
    <link href="http://localhost:8999/css/index.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <style>
        @page {
            size: 210mm 297mm; /*设置纸张大小:A4(210mm 297mm)、A3(297mm 420mm) 横向则反过来*/
            margin: 0.25in;
            padding: 1em;
            @bottom-center{
                content:"A310 ? 版权所有";
                font-family: SimSun;
                font-size: 12px;
                color:red;
            };
            @top-center { content: element(header) };
            @bottom-right{
                content:"第" counter(page) "页  共 " counter(pages) "页";
                font-family: SimSun;
                font-size: 12px;
                color:#000;
            };
        }
        h2{
            width: 300px;
            display: block;
            margin: 0px auto;
        }
        .tab{
            text-align: center;
            width:660px;
        }
    </style>

</head>
<body style="font-family: 'SimSun'">

<#--<h2>${title}</h2>-->

<#--<#if map?exists>
    <#list map as m>
    <div>${m.rname}</div>
        <div>${m.age}</div>
    </#list>
</#if>-->
<#--<#if map?exists>
    <#list map as m>
    <span>矫正单位:二七区矫正单位</span>
    <span>编号:${m.rno}</span>
    <span>入矫日期:${m.inAffair}</span>
<table border="1px" class="tab">
    <tr>
        <td>姓名:111</td>
        <td>${m.rname}</td>
        <td>别名:</td>
        <td>${m.Former_name}</td>
        <td>性别:</td>
        <td>${m.sex}</td>
        <td rowspan="4"><img src="file:///D:/upload/${m.photo}"  width="90" height="120" /></td>
        &lt;#&ndash;<td rowspan="4"><img src="file:///D:upload/1.jpg"  width="90" height="120" /></td>&ndash;&gt;
        &lt;#&ndash;<td rowspan="4"><img src="1.jpg;base64"  width="90" height="120" /></td>&ndash;&gt;
    </tr>
    <tr>
        <td>民族:</td>
        <td>${m.tpname}</td>
        <td>出生年月:</td>
        <td>${m.birthday}</td>
        <td>文化程度:</td>
        <td>${m.ename}</td>
    </tr>
    <tr>
        <td>职业:</td>
        <td colspan="2">${m.position}</td>
        <td>政治面貌:</td>
        <td colspan="2">${m.pname}</td>
    </tr>
    <tr>
        <td>身份证:</td>
        <td colspan="5">
            ${m.idcard}
        </td>
    </tr>
    <tr>
        <td>籍贯:</td>
        <td colspan="2">${m.Native_place}</td>
        <td>户籍所在地:</td>
        <td colspan="3">${m.household_registration}</td>
    </tr>
    <tr>
        <td>居住地址:</td>
        <td colspan="4">${m.address}</td>
        <td>婚姻状况:</td>
        <td>${m.Marital_status}</td>
    </tr>
    <tr>
        <td>判决书号:</td>
        <td>${m.jNo}</td>
        <td>判决机关:</td>
        <td>${m.courtName}</td>
        <td>判决日期:</td>
        <td colspan="2">${m.judgmentDate}</td>
    </tr>
    <tr>
        <td>矫正期限:</td>
        <td colspan="2">${m.affairDate}</td>
        <td>附加刑:</td>
        <td colspan="3">${m.Supplementary_punishments}</td>
    </tr>
    <tr>
        <td>罪名:</td>
        <td colspan="6">${m.charges}</td>
    </tr>
    <tr>
        <td>判决处罚:</td>
        <td colspan="6">${m.Verdict_penalty}</td>
    </tr>
    <tr>
        <td>刑期变化情况:</td>
        <td colspan="6"></td>
    </tr>
    <tr>
        <td>奖惩情况:</td>
        <td colspan="6"></td>
    </tr>
    <tr>
        <td rowspan="2">社会矫正期限:</td>

        <td colspan="2">${(m.originalDate)!}</td>

        <td colspan="2">${m.endDate}</td>
        <td>判罚执行类别:</td>
        <td>${m.rgname}</td>
    </tr>
</table>
    </#list>
</#if>-->
</body>
</html>
