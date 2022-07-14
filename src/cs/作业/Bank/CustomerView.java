package cs.作业.Bank;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("王涛", '男', 23, "001", "13");
        customerList.addCustomer(customer);
    }

    /**
     * 显示客户界面
     */
    public void enterMainmenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("\n----------客户信息管理------");
            System.out.println("     1\t添加客服\t\t");
            System.out.println("     2\t修改客服\t\t");
            System.out.println("     3\t删除客服\t\t");
            System.out.println("     4\t客服列表\t\t");
            System.out.println("     5\t退\t出\t\t\n");
            System.out.print("\t请选择（1-5）");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewMainmenu();
                    break;
                case '2':
                    modifyMainmenu();
                    break;
                case '3':
                    deleteMainmenu();
                    break;
                case '4':
                    listAllMainmenu();
                    break;
                case '5':
//                    System.out.println("退出");
//                    break;
                    System.out.println("是否确定（Y/N）退出");
                    char exit = CMUtility.readConfirmSelection();
                    if (exit == 'Y') {
                        flag = false;
                    }
                    break;
            }


//            flag=false;
        }
    }

    public void addNewMainmenu() {
        System.out.println("--------------\t客户列表\t------");
        System.out.println("姓名:");
        String name = CMUtility.readString(10);
        System.out.println("性别");
        char gender = CMUtility.readChar();
        System.out.println("年龄");
        int age = CMUtility.readInt();
        System.out.println("电话");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("-----------客户完成--------");
        } else {
            System.out.println("---------失败--------");
        }
//        System.out.println("添加");

    }

    public void modifyMainmenu() {
//        System.out.println("修改");
        Customer cust;
        int number;
        System.out.println("--------------\t客户列表\t------");
        System.out.println("请先看编号是否存在返回查看4");
        for (; ; ) {
            System.out.println("请选择修改用户的编号,-1退出");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            cust = customerList.getCustomers(number - 1);
            if (cust == null) {
                System.out.println("输入错误，重新输入");
            } else {
                break;
            }
        }
        System.out.println("原姓名" + cust.getName() + ":");
        String name = CMUtility.readString(10, cust.getName());

        System.out.println("原性别" + cust.getGender() + ":");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.println("原年龄" + cust.getAge() + ":");
        int age = CMUtility.readInt(cust.getAge());

        System.out.println("原电话" + cust.getPhone() + ":");
        String phone = CMUtility.readString(13, cust.getPhone());

        System.out.println("邮箱" + cust.getEmail() + ":");
        String email = CMUtility.readString(10, cust.getEmail());

        Customer customer = new Customer(name, gender, age, phone, email);
        customerList.replaceCustomer(number - 1, customer);
        boolean isRepalaced = customerList.replaceCustomer(number - 1, customer);

        if (isRepalaced) {
            System.out.println("--------修改完成-------");
        } else {
            System.out.println("---------修改失败--------");
        }
    }


    public void deleteMainmenu() {
//        System.out.println("删除");
        System.out.println("---------删-除--------");

        int number;
        for (; ; ) {
            System.out.println("请输入用户编号删除，-1退出");
             number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customers = customerList.getCustomers(number - 1);
            if (customers == null) {
                System.out.println("找不到，重新输入");
            } else {

                break;
            }}

            System.out.println("是否删除（Y/N）");
            char idDelee = CMUtility.readConfirmSelection();
            if (idDelee == 'Y') {
                boolean deleteCustomer = customerList.deleteCustomer(number - 1);
                if (deleteCustomer) {
                    System.out.println("删除完成");
                } else {
                    System.out.println("删除失败");
                }
            } else {
                return;
            }


    }

    public void listAllMainmenu() {
//        System.out.println("查看");
        System.out.println("--------------\t客户列表\t------");

        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有 客户界面");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] allCustomer = customerList.getAllCustomer();
            for (int i = 0; i < allCustomer.length; i++) {
                Customer all = allCustomer[i];
                System.out.println((i + 1) + "\t" + all.getName() + "\t"
                        + all.getGender() + "\t" + all.getAge() + "\t" + all.getPhone() + "\t" + all.getEmail());
            }
        }

        System.out.println("-----------客户完成--------");
    }

    public static void main(String[] args) {

        CustomerView customerView = new CustomerView();
        customerView.enterMainmenu();
    }
}
