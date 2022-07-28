package cs.s3kao.Day0728;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main02 {

        class Employee {
            Employee() {
            }
        }

        public static void main(String[] args) {
            Main02 main02 = new Main02();
            main02.test1();
// Function<T,R> T-参数类型，R-返回值类型
            Function<Integer, String[]> func2 = String[]::new;
            String[] arr2 = func2.apply(10);
            System.out.println(Arrays.toString(arr2)+"2");


            BinaryOperator<Integer> oper = (a, b) -> a + b;
            Integer value = oper.apply(3, 5);
            System.out.println(value+"3");
        }

        private void test1() {
            Supplier<Employee> sup2 = Employee::new;
            Supplier<Employee> sup3 =Employee::new;
            System.out.println(sup2.get()+"1");
        }


}
