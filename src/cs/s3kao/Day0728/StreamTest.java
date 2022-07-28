package cs.s3kao.Day0728;

import cs.作业.Day718.lianx.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(7, 5, 3, 6, 9, 5, 2, 1);
//
//        //遍历输出
//        list.stream()
//                .filter(x -> x > 5) //过滤大于5的
//                .forEach(System.out::println);
//        //匹配第一个
//        Optional<Integer> first = list.stream()
//                .filter(x -> x > 5)
//                .findFirst();
//
//        System.out.println(first.get());
//
//        Optional<Integer> any = list.parallelStream()
//                .filter(x -> x > 2)
//                .findAny();
//        System.out.println(any+"------"+any.get());

        List<Demo002.Person> list1 = new ArrayList<>();
        Demo002 d=new Demo002();

        list1.addAll(d.a());
        List<Demo002.Person> collect3 = list1.stream()
                .sorted(Comparator.comparing(Demo002.Person::getAge).reversed())
                .collect(Collectors.toList());
        collect3.forEach(System.out::println);
        List<Demo002.Person> collect = list1.stream()
                .filter(salary -> salary.getSalary() > 8000)
                .collect(Collectors.toList());
        collect.stream()
                .forEach(System.out::println);

//        for (Demo002.Person coll : collect) {
//            System.out.println(coll.toString());
//        }
        List<String> collect1 = list1.stream()
                .filter(salary -> salary.getSalary() > 7500)
                .map(Demo002.Person::getName)
                .collect(Collectors.toList());
        collect1.stream()
                .forEach(System.out::println);

        List<Demo002.Person> collect2 = list1.stream()
                .map(person -> {
                    person.setSalary(person.getSalary() + 1000);
                    return person;
                }).collect(Collectors.toList());

        collect2.forEach(System.out::println);

    }
}