package cs.作业.day711;

import java.util.Scanner;

public class Demo03 {

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
