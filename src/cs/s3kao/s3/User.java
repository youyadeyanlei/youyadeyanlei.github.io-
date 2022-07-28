package cs.s3kao.s3;

public class User {
    public static final String name1 ="[a-zA-Z0-9]{8,}";

    public static final String password1 = "([a-zA-Z0-9+$]){8,}";

    public static final String IDCard1 ="[0-9+x]{18}";
    private String name;
    private String password;
    private String IDCard;
    private int age;
    private boolean sex=true;

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

       // this.name = name;

        try {
          //  System.out.println(name.matches(name1));
            if( name.matches(name1)==false){
               throw  new Exception("输入错误");
            }
            this.name = name;
        }catch (Exception e) {
            System.out.println("name错误");
            this.name = "错误";
        }


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            if (password.matches(password1)== false){
                throw new Exception("错误");
            }
            this.password = password;
        } catch (Exception e) {
            System.out.println("密码错误");
            this.password = "错误";
        }

    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        try {
            if (IDCard.matches(IDCard1) == false){
                throw new Exception("错误");
            } this.IDCard = IDCard;
        } catch (Exception e) {
            System.out.println("密码错误");
            this.IDCard = "错误";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0&&age>120){
            System.out.println("错误");
            this.age=-1;
        }else {
            this.age = age;
        }

    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        if (sex==true){
            this.sex = true;
        }else {
            this.sex = false;
        }


    }
//"^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$"
}
