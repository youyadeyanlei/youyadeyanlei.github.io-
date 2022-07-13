package cs.作业.day713;

/**
 * 继承，子类可以继承父类的方法和属性
 */
public class Demo04 {
    private boolean isEnabled= true;
    public String a;
    public void enabld(){
        isEnabled=true;
    }
    public void disable(){
        isEnabled=false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }

    @Override
    public String toString() {
        return "Demo04{" +
                "isEnabled=" + isEnabled +
                ", a='" + a + '\'' +
                '}';
    }
}
