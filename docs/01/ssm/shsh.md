```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<!-- 如果这个页面没有使用任何 JSTL ，HTML也可以 -->

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <%-- 当发生用户选择单选框导致了值发生变化的时候，那么： --%>
    <%-- select标签的name和某一个被选中的option的value，这两个将会作为一个键值对提交给后台 --%>
    <select id="officeId" name="officeId" onchange="findEmpListByOfficeId()"></select>
    <%-- 使用form提交 --%>
    <%-- <form action="/emp">
        <input type="hidden" name="method" value="findByKeyword">
        <input id="keyword" type="text" name="keyword"><button type="submit">搜索</button>
    </form> --%>
    <input id="keyword" type="text" name="keyword" value="${kw}"><button type="button" onclick="findByKeyword()">搜索</button>
    <br>
    <button type="button" onclick="toUpdate()">新增</button>
    <br>
    <table>
        <thead>
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>职位</th>
                <th>薪水</th>
                <th>上司</th>
                <th>部门编号</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody id="tb">
            <c:forEach var="emp" items="${empList}">
                <tr>
                    <td>${emp.employeeId}</td>
                    <td>${emp.firstName.concat(" . ").concat(emp.lastName)}</td>
                    <td>${emp.jobTitle}</td>
                    <td>${emp.salary}</td>
                    <td>${emp.reportsTo}</td>
                    <td>${emp.officeId}</td>
                    <td>
                        <button type="button" >删除</button>
                        <button type="button" onclick="toUpdate(${emp.employeeId})">更新</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <script>
    
    function submitOffice(e) {
        // 本质上是浏览器从一个新的地址获取到页面的代码
        location.href = "/emp?method=findByOfficeId&officeId=" + e.target.value;
    }

    let findByKeyword = () => {
        // DOM 操作 Document Object Model
        // let inputNode = document.getElementById("keyword");
        // let value = inputNode.value;
        // console.log(value);

        // // 使用xpath来获取元素节点
        // value = document.querySelector("#keyword").value;
        // console.log(value);

        // let nodes = document.querySelector("thead tr");
        // console.log(nodes);

        let value = document.querySelector("#keyword").value;
        location.href = "/emp?method=findByKeyword&keyword=" + value;
    };

    let toUpdate = (empId) => {
        // 不能直接跳转过去，因为这个页面上有一些数据需要从DB查询出来
        // location.href = "/update.jsp";
        console.log(empId);
        
        if(empId)
            location.href = "/emp?method=toUpdate&employeeId=" + empId;
        else // 新增，empId undefined
            location.href = "/emp?method=toUpdate";
    };

    </script>

    <%-- <script src="./js/myjQuery.js"></script> --%>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <script src="./js/index.js"></script>
    <script src="./js/office.js"></script>
    <script src="./js/employee.js"></script>
</body>

</html>
```