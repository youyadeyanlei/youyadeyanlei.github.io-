# 2022年7月11日

## 案列

```java
/**
 * <p>需求：输入贷款金额、贷款年利率、贷款时长（年），输出月还款金额</p>
 * <p>计算公式：M = P[i(1+i)^n]/[(1+i)^n -1]</p>
 * <ol>
 *     <li>M：月还款金额</li>
 *     <li>P：贷款金额</li>
 *     <li>i：贷款年利率</li>
 *     <li>n：贷款时长（年）</li>
 * </ol>
 *
 * <p>相关的输入的校验</p>
 * <ol>
 *      <li>贷款金额：1,000 ～ 1,000,000</li>
 *      <li>贷款年利率：1 ～ 5</li>
 *      <li>贷款时长：1 ～ 30</li>
 * </ol>
 *
 * @param args 控制台参数
 */
```



### 代码

```java
package com.think.mortgage;

import java.util.Scanner;

public class Main {

    /**
     * <p>需求：输入贷款金额、贷款年利率、贷款时长（年），输出月还款金额</p>
     * <p>计算公式：M = P[i(1+i)^n]/[(1+i)^n -1]</p>
     * <ol>
     *     <li>M：月还款金额</li>
     *     <li>P：贷款金额</li>
     *     <li>i：贷款年利率</li>
     *     <li>n：贷款时长（年）</li>
     * </ol>
     *
     * @param args 控制台参数
     */
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12; // 年中的月数
        final byte PERCENT = 100; // 百分数单位

        Scanner scanner = new Scanner(System.in);

        // 输入贷款金额
        int principal;
        System.out.print("Principal：");
        while (true){
            System.out.println("输入贷款金额");
            principal=scanner.nextInt();
            if (principal>=1_000&&principal<=1_000_000)break;
            System.out.println("输入错误，请重新输入");
        }

        // 输入贷款金额
        int years;
        int numOfMonths;
        while (true){
            System.out.print("Years：");
            years = scanner.nextInt();
            if (years>= 1&&years<= 30)break;
            System.out.println("输入错误");
        }
        numOfMonths = years * MONTHS_IN_YEAR;



        // 输入贷款年利率
        float interest;
        while (true){
            System.out.print("Interest：");
             interest = scanner.nextFloat();
             if (interest >= 1&& interest <= 5)break;
            System.out.println("输入错误");
        }

        float rate = interest/ PERCENT / MONTHS_IN_YEAR;

        // BigDecimal

        double exp1 = Math.pow(1 + rate, numOfMonths);
        double mortgage = principal * rate * exp1 / (exp1 - 1);

        System.out.println(mortgage);

    }

}
```



### 代码优化

```java
 /**
     * <p>需求：输入贷款金额、贷款年利率、贷款时长（年），输出月还款金额</p>
     * <p>计算公式：M = P[i(1+i)^n]/[(1+i)^n -1]</p>
     * <ol>
     *     <li>M：月还款金额</li>
     *     <li>P：贷款金额</li>
     *     <li>i：贷款年利率</li>
     *     <li>n：贷款时长（年）</li>
     * </ol>
     *
     * <p>相关的输入的校验</p>
     * <ol>
     *      <li>贷款金额：1,000 ～ 1,000,000</li>
     *      <li>贷款年利率：1 ～ 5</li>
     *      <li>贷款时长：1 ～ 30</li>
     * </ol>
     *
     * @param args 控制台参数
     */
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12; // 年中的月数
        final byte PERCENT = 100; // 百分数单位
        // 输入贷款金额
        int principal = (int) readNumber("Principal", 1_000, 1_000_000);
        int years = (int) readNumber("Years", 1, 30);
        int numOfMonths = years * MONTHS_IN_YEAR;
        // 输入贷款年利率
        float interest = readNumber("Interest", 1, 5);
        float rate = interest / PERCENT / MONTHS_IN_YEAR; // 年利率转换为月利率
        double mortgage = calcMortgage(principal, rate, numOfMonths);

        // 从数字格式化器中获取一个现金格式化器
        String format = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(format);

    }

    public static double calcMortgage(int principal, float rate, int numOfMonths) {
        double exp1 = Math.pow(1 + rate, numOfMonths);
        return principal * rate * exp1 / (exp1 - 1);
    }

    /**
     * <p>从控制台读取输入参数</p>
     */
    public static float readNumber(String prompt, int min, int max) {
        float number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt+ "：");
            number = scanner.nextFloat();
            if (number >= min && number <= max) break; // 跳出循环体，进入下一步输入环节

            System.out.println(prompt + " must be between " + min + " and " + max + ".");
        }
        return number;
    }

}
```



## 作业

```java
// 编写一个工具类，能随机生成如下信息
// 1、随机生成指定长度的字符串（字符串内容选择范围为[A-Za-z]）
// 2、随机生成1-100之间的整数
// 3、随机生成性别字符串(male / female)

// 利用上述的工具类，按照要求创建以下信息集合
// 1、创建一个长度为100的学生数组
// 2、学生姓名随机生成
// 3、要求学生的性别男女比例为1:1
// 4、学生的年龄构成为[18, 20)占20%，[20-25) 占50%，其余占30%

// 按照如下要求输出所有学员信息
// 1、输出学员信息列表
// 2、输出实际生成的学生统计信息（男女比例，年龄比例）

// 将生成的学员信息集合导出至Excel
// 可参考如下官方文档：
// https://easyexcel.opensource.alibaba.com/docs/current/

// 生成一下时间有关统计信息
// 1、输出生成学生集合的耗时
// 2、输出导出为excel文件的耗时
// 将集合的长度分别定为 100 、 10_000 、100_000 
```













