# Ajax

## 什么是Ajax
Ajax 即“Asynchronous Javascript And XML”（异步 JavaScript 和 XML），是指一种创建交互式网页应用的网页开发技术。
通过在后台与服务器进行少量数据交换，Ajax 可以使网页实现异步更新。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。

由上面的定义可以看出，Ajax的主要目的是为了，在不需要重新加载整个网页的前提下，使网页的一部分更新。同时，为了实现部分更新，就需要前端和后台之间的数据交换，包括前端向后台提交数据和前端从后台读取数据。


## Ajax基本结构
因为学习的是jQuery中Ajax方法，所以所说的结构即是$.ajax()的结构。
$.ajax()方法中的参数很多，我在实例中使用的只是一小部分，这里只介绍实例中所需要的参数的使用，其余更多参数还将继续学习。

$.ajax({          
       	 url:"发送请求（提交或读取数据）的地址", 
         dataType:"预期服务器返回数据的类型",  
         type:"请求方式", 
         async:"true/false",
         data:{发送到/读取后台（服务器）的数据},
         success:function(data){请求成功时执行},      
         error:function(){请求失败时执行}
});


注：（这些参数均为选填，如果不设置，按默认值处理）
<1> url 默认为当前页地址
<2> dataType 可用类型：
（如果不指定，JQuery将自动根据http包mime信息返回responseXML或responseText，并作为回调函数参数传递）

xml：返回XML文档，可用JQuery处理。
html：返回纯文本HTML信息。
script：返回纯文本JavaScript代码。
json：返回json数据。
jsonp：(JSON with Padding) 是 json 的一种"使用模式"，可以让网页从别的域名（网站）那获取资料，即跨域读取数据。
text：返回纯文本字符串。
说明：对于json和jsonp的区别，本小白暂时没有深入了解，目前只知道jsonp可以跨域读取数据，有待进一步学习~
<3> type 可用类型主要为post和get两种（默认为get）

get：从指定的资源请求数据（从服务器读取数据）
post：向指定的资源提交要被处理的数据（向服务器提交数据）
<4> async 异步方式，默认为true，即异步方式。当设置为false时，为同步方式。

异步方式：ajax执行后，会继续执行ajax后面的脚本，直到服务器端返回数据后，触发ajax里的success方法，这时候执行的是两个线程。
同步方式：在没有返回值之前，同步请求将锁住浏览器，用户其它操作必须等待请求完成才可以执行。
说明：这里的同步和异步有待深入理解，以下实例均使用默认的异步方式
<5> data 请求的数据，{ }中可以填入多项数据。如果不填（一般为get请求），则读取对应地址的全部数据，此时可以在console中通过console.log(res)显示数据情况。
<6> success 和 error 两个函数 一般需要设置，方便确定请求是否成功，以及请求成功后的提示或是对数据的处理和显示。





ajax 全名 async javascript and XML(异步JavaScript和XML)

是前后台交互的能⼒ 也就是我们客户端给服务端发送消息的⼯具，以及接受响应的⼯具

AJAX 不是新的编程语言，而是一种使用现有标准的新方法。

AJAX 是与服务器交换数据并更新部分网页的艺术，在不重新加载整个页面的情况下。

是⼀个 默认异步执⾏机制的功能,AJAX分为同步（async = false）和异步（async = true）

- 什么是同步请求？(false)

 同步请求是指当前发出请求后，浏览器什么都不能做，
 必须得等到请求完成返回数据之后，才会执行后续的代码，
 相当于生活中的排队，必须等待前一个人完成自己的事物，后一个人才能接着办。
 也就是说，当JS代码加载到当前AJAX的时候会把页面里所有的代码停止加载，页面处于一个假死状态，
 当这个AJAX执行完毕后才会继续运行其他代码页面解除假死状态

- 什么是异步请求？(默认:true)

默认异步：异步请求就当发出请求的同时，浏览器可以继续做任何事，
Ajax发送请求并不会影响页面的加载与用户的操作，相当于是在两条线上，各走各的，互不影响。
一般默认值为true，异步。异步请求可以完全不影响用户的体验效果，
无论请求的时间长或者短，用户都在专心的操作页面的其他内容，并不会有等待的感


2. AJAX 的优势
不需要插件的⽀持，原⽣ js 就可以使⽤
⽤户体验好（不需要刷新⻚⾯就可以更新数据）
减轻服务端和带宽的负担
缺点：搜索引擎的⽀持度不够，因为数据都不在⻚⾯上，搜索引擎搜索不到
3. AJAX 的操作流程

具体操作流程：

首先通过PHP页面将数据库中的数据取出
取出后转成json格式的字符串，后利用ajax把字符串返还给前台
再利用json.parse解析通过循环添加到页面上
那么反之，前端的数据可以利用ajax提交到后台
但是后台是没有办法直接把这些数据插入到数据库中，所以要先提交到PHP页面上
最后再由PHP将数据插入到数据库中
4. AJAX 的使用
在 js 中有内置的构造函数来创建 ajax 对象

创建 ajax 对象以后，我们就使⽤ ajax 对象的⽅法去发送请求和接受响应

Ajax的一个最大的特点是无需刷新页面便可向服务器传输或读写数据(又称无刷新更新页面),这一特点主要得益于XMLHTTP组件XMLHTTPRequest对象。
XMLHttpRequest 对象方法描述


1.创建⼀个 ajax 对象

// IE9及以上
const xhr = new XMLHttpRequest()
// IE9以下
const xhr = new ActiveXObject('Mricosoft.XMLHTTP')

上⾯就有了⼀个 ajax 对象
我们就可以使⽤这个xhr 对象来发送 ajax 请求了

2.配置链接信息

XMLHttpRequest 对象属性描述(用于和服务器交换数据。)


//所有现代浏览器（IE7+、Firefox、Chrome、Safari 以及 Opera）均内建 XMLHttpRequest 对象。
const xhr = new XMLHttpRequest()
// xhr 对象中的 open ⽅法是来配置请求信息的
// 第⼀个参数是本次请求的请求⽅式 get / post / put / ...
// 第⼆个参数是本次请求的 url 
// 第三个参数是本次请求是否异步，默认 true 表示异步，false 表示同步
// xhr.open('请求⽅式', '请求地址', 是否异步)
xhr.open('get', './data.php')

上⾯的代码执⾏完毕以后，本次请求的基本配置信息就写完了

3.发送请求

//如需将请求发送到服务器，我们使用 XMLHttpRequest 对象的 open() 和 send() 方法：
const xhr = new XMLHttpRequest()
xhr.open('get', './data.php')
// 使⽤ xhr 对象中的 send ⽅法来发送请求
xhr.send()

上面代码是把配置好信息的 ajax 对象发送到服务端

 一个最基本的 ajax 请求就是上面三步 但是光有上面的三个步骤，我们确实能把请求发送到服务端 
 如果服务端正常的话，响应也能回到客户端 但是我们拿不到响应
 如果想要拿到响应，我们需要有两个前提条件
 1. 本次 HTTP 请求是成功的，也就是我们下面要说的 http 状态码为 200 ~ 299
 2. ajax 对象也有自己的状态码，用来表示本次 ajax 请求中各个阶段


5.AJAX 状态码
ajax 状态码 - xhr.readyState

是用来表示一个 ajax 请求的全部过程中的某一个状态

 readyState === 0 : 表示未初始化完成，也就是 open 方法还没有执行 
 readyState === 1 : 表示配置信息已经完成，也就是执行完 open 之后 
 readyState === 2 : 表示 send 方法已经执行完成
 readyState === 3 : 表示正在解析响应内容
 readyState === 4 : 表示响应内容已经解析完毕，可以在客户端使用了

这个时候我们就会发现，当一个 ajax 请求的全部过程中，只有当 readyState === 4 的时候，我们才可以正常使用服务端给我们的数据

所以，配合 http 状态码为 200 ~ 299

 一个 ajax 对象中有一个成员叫做 xhr.status
 这个成员就是记录本次请求的 http 状态码的 
1
2
两个条件都满足的时候，才是本次请求正常完成

readyStateChange
在 ajax 对象中有一个事件，叫做 readyStateChange 事件
这个事件是专⻔用来监听 ajax 对象的 readyState 值改变的的行为
也就是说只要 readyState 的值发生变化了，那么就会触发该事件
所以我们就在这个事件中来监听 ajax 的 readyState 是不是到 4 了
   const xhr = new XMLHttpRequest() xhr.open('get', './data.php')
	xhr.send()
	xhr.onreadyStateChange = function () {
	// 每次 readyState 改变的时候都会触发该事件
	// 我们就在这里判断 readyState 的值是不是到 4
	// 并且 http 的状态码是不是 200 ~ 299
	if (xhr.readyState === 4 && /^2\d{2|$/.test(xhr.status)) {
	// 这里表示验证通过
	// 我们就可以获取服务端给我们响应的内容了 }
}

使用 ajax 发送请求时携带参数
我们使用 ajax 发送请求也是可以携带参数的
参数就是和后台交互的时候给他的一些信息
但是携带参数get 和 post两个方式还是有区别的
GET 还是 POST？

与 POST 相比，GET 更简单也更快，并且在大部分情况下都能用。

然而，在以下情况中，请使用 POST 请求：

 无法使用缓存文件（更新服务器上的文件或数据库）
 向服务器发送大量数据（POST 没有数据量限制）
 发送包含未知字符的用户输入时，POST 比 GET 更稳定也更可靠

发送一个带有参数的 get 请求

get 请求的参数就直接在 url 后面进行拼接就可以

const xhr = new XMLHttpRequest()
// 直接在地址后面加一个 ?，然后以 key=value 的形式传递 // 两个数据之间以 & 分割
xhr.open('get', './data.php?a=100&b=200')
xhr.send()

这样服务端就能接受到两个参数 一个是 a，值是 100，一个是 b，值是 200

发送一个带有参数的 post 请求

post 请求的参数是携带在请求体中的，所以不需要再 url 后面拼接

	const xhr = new XMLHttpRequest() xhr.open('post', './data.php')
	// 如果是用 ajax 对象发送 post 请求，必须要先设置一下请求头中的 content- type
	// 告诉一下服务端我给你的是一个什么样子的数据格式 xhr.setRequestHeader('content-type', 'application/x-www-form- urlencoded')
	// 请求体直接再 send 的时候写在 () 里面就行
	// 不需要问号，直接就是 'key=value&key=value' 的形式 xhr.send('a=100&b=200')


// 1. 创建 ajax 对象
let xhr = new XMLHttpRequest()
// 2. 配置请求信息 xhr.open(‘GET’, ‘./test.php’, true)
// 3. 发送请求 xhr.send()
// 4. 接受响应 xhr.onload = function () {
console.log(xhr.responseText) }

6.AJAX封装
.

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <script>
            /*
                type 代表 请求方式
                url  代表 请求url路径
                data 代表 发送数据
                success 代表 下载数据成功以后执行的函数
                error   代表 下载数据失败以后执行的函数
            */
            function $ajax({type = "get", url, data, success, error}){
                var xhr = null;
                try{
                    xhr = new XMLHttpRequest();
                }catch(error){
                    xhr = new ActiveXObject("Microsoft.XMLHTTP")
                }

```json
            if(type == "get" && data){
                url += "?" + querystring(data);
            }

            xhr.open(type, url, true);

            if(type == "get"){
                xhr.send();
            }else{
                 //设置提交数据格式
                xhr.setRequestHeader("content-type", "application/x-www-form-urlencoded");
                data ? xhr.send(querystring(data)) : xhr.send();
            }
            xhr.onreadystatechange = function(){
                if(xhr.readyState == 4){
                    if(xhr.status == 200){
                        if(success){
                            success(xhr.responseText);
                        }
                    }else{
                        if(error){
                            error("Error：" + xhr.status);
                        }
                    }
                }
            }
        }
        function querystring(obj){
            var str = '';
            for(var attr in obj){
                str += attr + "=" + obj[attr] + "&";
            }
            return str.substring(0, str.length - 1);
        }

        window.onload = function(){
            var aBtns = document.getElementsByTagName("button");
            /*
                当我们下载完数据以后需要对数据的处理方式不一样
                【注】$ajax，我们需要按照传参的顺序，依次传入我们的参数。
            */

            aBtns[0].onclick = function(){
                $ajax({
                    url: "code14/1.get.php",
                    data: {
                        username: "小明",
                        age: 18,
                        password: "123abc"
                    },
                    success: function(result){
                        alert("GET请求到的数据：" + result);
                    },
                    error: function(msg){
                        alert("GET请求数据错误：" + msg);
                    }
                })
            }

            aBtns[1].onclick = function(){
                $ajax({
                    type: "post",
                    url: "code14/2.post.php",
                    data: {
                        username: "小花",
                        age: 18,
                        password: "123abc"
                    },
                    success: function(result){
                        alert("POST请求到的数据：" + result);
                    },
                    error: function(msg){
                        alert("POST请求数据错误：" + msg);
                    }
                })
            }
        }
    </script>
</head>
<body>
    <button>GET请求</button>
    <button>POST请求</button>
</body></html>
```




