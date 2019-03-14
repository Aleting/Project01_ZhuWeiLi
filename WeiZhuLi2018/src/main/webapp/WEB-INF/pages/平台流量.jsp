<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>/static/ECharts/echarts.common.min.js"></script>
</head>
<body>

<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main1" style="width: 600px;height:400px;"></div>



<div id="main2" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main1'));

    // 指定图表的配置项和数据
    option = {
        title: {
            text: '本月点击量',
//        subtext: '纯属虚构'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['点击量']
        },
        toolbox: {
            show: true,
            feature: {
                dataZoom: {
                    yAxisIndex: 'none'
                },
                dataView: {readOnly: false},
                magicType: {type: ['line', 'bar']},
                restore: {},
                saveAsImage: {}
            }
        },
        xAxis:  {
            type: 'category',
            boundaryGap: false,
            data: ['周一','周二','周三','周四','周五','周六','周日'
            ]
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                formatter: '{value} 次数'
            }
        },
        series: [
            {
                name:'点击量',
                type:'line',
                data:[110, 120, 150, 130, 120, 130, 100],
                markPoint: {
                    data: [
                        {type: 'max', name: '最大值'},
                        {type: 'min', name: '最小值'}
                    ]
                },
                markLine: {
                    data: [
                        {type: 'average', name: '平均值'}
                    ]
                }
            },

        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>





<!--   分为氛围分为
-->





<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main2'));

    // 指定图表的配置项和数据
    option = {
        title: {
            text: '本月新开店数目',
//        subtext: '纯属虚构'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['新开店数目']
        },
        toolbox: {
            show: true,
            feature: {
                dataZoom: {
                    yAxisIndex: 'none'
                },
                dataView: {readOnly: false},
                magicType: {type: ['line', 'bar']},
                restore: {},
                saveAsImage: {}
            }
        },
        xAxis:  {
            type: 'category',
            boundaryGap: false,
            data: ['1日','2日','3日','4日','5日','6日','7日','8日','9日','10日','11日','12日','13日','14日','15日','16日','17日','18日','19日','20日','21日','22日','23日','24日','25日','26日','27日','28日','29日','30日','31日']
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                formatter: '{value} 个'
            }
        },
        series: [
            {
                name:'点击量',
                type:'line',
                data:[15, 2, 1, 0, 5, 6, 12,15, 2, 1, 0, 5, 6, 12,15, 2, 1, 0, 5, 6, 12,15, 2, 1, 0, 5, 6, 12,15, 2, 1,],
                markPoint: {
                    data: [
                        {type: 'max', name: '最大值'},
                        {type: 'min', name: '最小值'}
                    ]
                },
                markLine: {
                    data: [
                        {type: 'average', name: '平均值'}
                    ]
                }
            },

        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>
