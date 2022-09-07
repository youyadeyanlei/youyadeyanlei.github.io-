### 一、什么是JSON?

JSON 是用于存储和传输数据的格式。
JSON 通常用于服务端向网页传递数据 。
JSON 指的是 JavaScript 对象表示法（JavaScript Object Notation）
JSON 是轻量级的文本数据交换格式
JSON 独立于语言：JSON 使用 Javascript语法来描述数据对象，但是 JSON 仍然独立于语言和平台。JSON 解析器和 JSON 库支持许多不同的编程语言。 目前非常多的动态（PHP，JSP，.NET）编程语言都支持JSON
JSON 具有自我描述性，更易理解


# 二、JSON的语法规则

JSON语法是JavaScript语法的子集

## 具体规则：

1. 数据在名称/值对中
2. 数据由逗号分隔
3. 大括号 {} 保存对象
4. 中括号 [] 保存数组，数组可以包含多个对象

### 1.JSON名称/值对

- JSON数据的书写格式：

```javascript
key:value//键/值，也叫键值对
```

- 名称/值对包括字段名称（在双引号中），后面写一个冒号，然后是值：

```javascript
“name”:"JSON PRACTICE"
```

这很容易理解，等价于这条 JavaScript 语句：

```javascript
name="JSON PRACTICE"
```

### 2.JSON的值的类型

JSON的值可以是：

##### 1. 数字（整数或者浮点数）

```javascript
{“age”:30}
```

##### 2. 字符串（在双引号中）

```javascript
{"name":"JSON PRACTICE"}
```

##### 3. 逻辑值（true或false）

```javascript
{"isKey":true}
```

##### 4. 数组（在中括号中），数组可包含多个对象

##### 

```javascript
[
    { key1 : value1-1 , key2:value1-2 }, 
    { key1 : value2-1 , key2:value2-2 }, 
    { key1 : value3-1 , key2:value3-2 }, 
    ...
    { keyN : valueN-1 , keyN:valueN-2 }, 
]
```

##### 5. 对象（在大括号中）

```javascript
{key1 : value1, key2 : value2, ... keyN : valueN }
```

##### 6. null

```javascript
{"curriculum":null}
```

## JSON使用JavaScript语法

因为 JSON 使用 JavaScript 语法，所以无需额外的软件就能处理 JavaScript 中的 JSON。通过 JavaScript，您可以创建一个对象数组，并像这样进行赋值：



```javascript
var sites = [
    { "name":"baidu" , "url":"www.baidu.com" }, 
    { "name":"google" , "url":"www.google.com" }, 
    { "name":"weibo" , "url":"www.weibo.com" }
];
```

访问对象数组中的元素

```javascript
name1=sites[0].name;
```

结果是:`name1=www.baidu.com`
还可以像这样修改数据：`sites[0].name="Learning"`

## JSON文件

- JSON 文件的文件类型是 `.json`
- JSON 文本的 MIME 类型是 `application/json`

# 三、JSON和JS转换

### 1.JSON.parase()方法

JSON 通常用于与服务端交换数据。
在接收服务器数据时一般是字符串。

JSON.parase()方法作用：将JSON数据转换为JS对象



```javascript
JSON.parse(text[, reviver])
//text:必需， 一个有效的 JSON 字符串
//reviver: 可选，一个转换结果的函数， 将为对象的每个成员调用此函数。
```

- **JSON解析实例：**
  例如我们从服务器接收到了如下数据：

- 数据：

```javascript
{ "name":"baidu","site":"www.baidu.com" }
```

我们可以使用 JSON.parse() 方法处理以上数据，将其转换为 JavaScript 对象：

```javascript
var obj = JSON.parse('{"name":"baidu","site":"www.baidu.com" }');
```

我们可以这样来使用：

```javascript
sites=obj.name+" "+obj.site
```

sites的值为：`百度 www.baidu.com`

- **从服务端接受JSON数据**
  我们可以使用 AJAX 从服务器请求 JSON 数据，并解析为 JavaScript 对象。

```javascript
var xmlhttp = new XMLHttpRequest();
xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        myObj = JSON.parse(this.responseText);
        document.getElementById("demo").innerHTML = myObj.name;
    }
};
xmlhttp.open("GET", "/try/ajax/json_demo.txt", true);
xmlhttp.send();
```

- **从服务端接收数组的 JSON 数据**
  如果从服务端接收的是数组的 JSON 数据，则 JSON.parse 会将其转换为 JavaScript 数组：

```javascript
var xmlhttp = new XMLHttpRequest();
xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        myArr = JSON.parse(this.responseText);
        document.getElementById("demo").innerHTML = myArr[1];
    }
};
xmlhttp.open("GET", "/try/ajax/json_demo_array.txt", true);
xmlhttp.send();
```

- **异常情况**
  **解析数据**
  JSON 不能存储 Date 对象。
  如果你需要存储 Date 对象，需要将其转换为字符串。
  之后再将字符串转换为 Date 对象。
- 

```javascript
var text = '{ "name":"baidu", "initDate":"2013-12-14", "site":"www.baidu.com"}';
var obj = JSON.parse(text);
obj.initDate = new Date(obj.initDate);
 
document.getElementById("demo").innerHTML = obj.name + "创建日期: " + obj.initDate;
```

我们可以启用 JSON.parse 的第二个参数 reviver，一个转换结果的函数，对象的每个成员调用此函数。

```javascript
var text = '{ "name":"baidu", "initDate":"2013-12-14", "site":"www.baidu.com"}';
var obj = JSON.parse(text, function (key, value) {
    if (key == "initDate") {
        return new Date(value);
    } else {
        return value;
}});
 
document.getElementById("demo").innerHTML = obj.name + "创建日期：" + obj.initDate;
```

**解析函数**
JSON 不允许包含函数，但你可以将函数作为字符串存储，之后再将字符串转换为函数。

```javascript
var text = '{ "name":"baidu", "alexa":"function () {return 10000;}", "site":"www.baidu.com"}';
var obj = JSON.parse(text);
obj.alexa = eval("(" + obj.alexa + ")");
 
document.getElementById("demo").innerHTML = obj.name + " Alexa 排名：" + obj.alexa();
```

```
不建议在 JSON 中使用函数。
```

### 2.JSON.stringlfy()方法

JSON 通常用于与服务端交换数据。
在向服务器发送数据时一般是字符串。
JSON.stringlfy()方法的作用：将 JavaScript 对象转换为字符串。

串。

```javascript
JSON.stringify(value[, replacer[, space]])
//value:必需， 要转换的 JavaScript 值（通常为对象或数组）。
//replacer: 可选。用于转换结果的函数或数组。如果 replacer 为函数，则 JSON.stringify 将调用该函数，并传入每个成员的键和值。使用返回值而不是原始值。如果此函数返回 undefined，则排除成员。根对象的键是一个空字符串：""。如果 replacer 是一个数组，则仅转换该数组中具有键值的成员。成员的转换顺序与键在数组中的顺序一样。当 value 参数也为数组时，将忽略 replacer 数组。
//space:可选，文本添加缩进、空格和换行符，如果 space 是一个数字，则返回值文本在每个级别缩进指定数目的空格，如果 space 大于 10，则文本缩进 10 个空格。space 也可以使用非数字，如：\t。
```

- **JavaScript 对象转换**
  例如我们向服务器发送以下数据：

```javascript
var obj = { "name":"baidu", "site":"www.baidu.com"};
```

我们使用 JSON.stringify() 方法处理以上数据，将其转换为字符串：

```javascript
var myJSON = JSON.stringify(obj);
```

myJSON 为字符串。我们可以将 myJSON 发送到服务器：

```javascript
var obj = { "name":"baidu","site":"www.baidu.com"};
var myJSON = JSON.stringify(obj);
document.getElementById("demo").innerHTML = myJSON;
```

- **JavaScript 数组转换**
  我们也可以将 JavaScript 数组转换为 JSON 字符串：

```javascript
var arr = [ "Google", "Baidu", "Taobao", "Facebook" ];
var myJSON = JSON.stringify(arr);
```

myJSON 为字符串。我们可以将 myJSON 发送到服务器:

```javascript
var arr = [ "Google", "baidu", "Taobao", "Facebook" ];
var myJSON = JSON.stringify(arr);
document.getElementById("demo").innerHTML = myJSON;
```

- **异常情况**
  **解析数据**
  JSON 不能存储 Date 对象。
  JSON.stringify() 会将所有日期转换为字符串。

```javascript
var obj = { "name":"baidu", "initDate":new Date(), "site":"www.baidu.com"};
var myJSON = JSON.stringify(obj);
document.getElementById("demo").innerHTML = myJSON;
```

之后你可以再将字符串转换为 Date 对象。
**解析函数**
JSON 不允许包含函数，JSON.stringify() 会删除 JavaScript 对象的函数，包括 key 和 value。

```javascript
var obj = { "name":"baidu", "alexa":function () {return 10000;}, "site":"www.baidu.com"};
var myJSON = JSON.stringify(obj);
 
document.getElementById("demo").innerHTML = myJSON;
```

我们可以在执行 JSON.stringify() 函数前将函数转换为字符串来避免以上问题的发生：

```javascript
var obj = { "name":"baidu", "alexa":function () {return 10000;}, "site":"www.baidu.com"};
obj.alexa = obj.alexa.toString();
var myJSON = JSON.stringify(obj);
 
document.getElementById("demo").innerHTML = myJSON
```