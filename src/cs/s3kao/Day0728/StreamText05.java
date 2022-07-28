package cs.s3kao.Day0728;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamText05 {

        public static void main(String[] args) {
            List<Demo002.Person> personList = new ArrayList<Demo002.Person>();


            Demo002 d=new Demo002();
            personList.addAll(d.a());


            // 按工资升序排序（自然排序）
            List<String> newList = personList.stream().sorted(Comparator.comparing(Demo002.Person::getSalary)).map(Demo002.Person::getName)
                    .collect(Collectors.toList());
            // 按工资倒序排序
            List<String> newList2 = personList.stream().sorted(Comparator.comparing(Demo002.Person::getSalary).reversed())
                    .map(Demo002.Person::getName).collect(Collectors.toList());
            // 先按工资再按年龄升序排序
            List<String> newList3 = personList.stream()
                    .sorted(Comparator.comparing(Demo002.Person::getSalary).thenComparing(Demo002.Person::getAge)).map(Demo002.Person::getName)
                    .collect(Collectors.toList());
            // 先按工资再按年龄自定义排序（降序）
            List<String> newList4 = personList.stream().sorted((p1, p2) -> {
                if (p1.getSalary() == p2.getSalary()) {
                    return p2.getAge() - p1.getAge();
                } else {
                    return p2.getSalary() - p1.getSalary();
                }
            }).map(Demo002.Person::getName).collect(Collectors.toList());

            System.out.println("按工资升序排序：" + newList);
            System.out.println("按工资降序排序：" + newList2);
            System.out.println("先按工资再按年龄升序排序：" + newList3);
            System.out.println("先按工资再按年龄自定义降序排序：" + newList4);
        }
    }


