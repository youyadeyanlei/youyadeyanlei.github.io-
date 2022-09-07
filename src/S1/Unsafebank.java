package S1;

public class Unsafebank {
    public static void main(String[] args) {
        Account account = new Account(100, "农业银行");
        //创建两个线程
        Bank youself = new Bank("自己", account, 50);
        Bank wife = new Bank("你朋友", account, 100);
        youself.start();
        wife.start();
    }
}
//账户
class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;  // 账户余额
        this.name = name;    //账户名称
    }
}

//银行
class Bank extends Thread {
    Account account;
    int nowMoney;  //手里剩余的金钱
    int AccountRunable; //取钱金额

    public Bank(String name, Account account, int AccountRunable) {
        super(name);
        this.account = account;
        this.AccountRunable = AccountRunable;
    }

    public void run() {
        //判断能否取钱
        AccountRunable();

    }

    private void AccountRunable() {
        //给账户加上一把锁
        synchronized (account){
            if (account.money - AccountRunable < 0) {
                System.out.println("抱歉，余额不足");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money = account.money - AccountRunable;
            nowMoney = nowMoney + AccountRunable;
            System.out.println(this.account.name + "账户余额为：" + account.money);
            System.out.println(this.getName() + "手里的钱：" + nowMoney);
        }

    }
}
