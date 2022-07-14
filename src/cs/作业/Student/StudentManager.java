package cs.作业.Student;

import java.util.Scanner;

/**
 * 学生管理系统
 *
 * @author think
 */

public class StudentManager {

    private Student[] students; // 数组是Java中最基本的数据容器

    public StudentManager() {
        // students = new Student[10];
        this(10);
    }

    public StudentManager(int defaultSize) {
        students = new Student[defaultSize];
    }

    public StudentManager(int defaultSize, String msg) {
        students = new Student[defaultSize];
    }

//    public void showMenu() {
//
//        System.out.printf("***********菜单***********\r\n");
//        System.out.println("-------------------------");
//        System.out.printf("1 进入系统\r\n");
//        System.out.printf("0 退出信息\r\n");
//    }

    public void addStuInfo(){

    }

    public void del() {

    }

    public void run() {
        while (true){

            //展示菜单
            ShowMenu.showMenu();
            //读取用户输入
            Scanner scanner=new Scanner(System.in);
            int option=scanner.nextInt();
            //根据用户输入操作
        //清屏


            if (option==0)break;
//            // 先制造一些随机数据
//            createRandomData();
            else showData();

        }


    }

    private void showData() {
//        for (Student s : students) {
//            // System.out.println(s.getName() + "-" + s.getAge());
//            System.out.printf("[%s]:%-2d\r\n" , s.getName(), s.getAge());
//        }
        System.out.println("看见学生数据");
    }

    private void createRandomData() {
        for (int i = 0; i < students.length; i++) {
            // Student stu = new Student("学员" + i, i);
            // students[i] = stu;
            students[i] = new Student("学员" + i, i);
        }
    }

}
