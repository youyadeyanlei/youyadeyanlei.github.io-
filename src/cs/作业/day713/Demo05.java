package cs.作业.day713;

public class Demo05 {
    public String name;//公共的
    protected String name1;//保护的
    private String name2;//私有的

    public String getName() {
        System.out.println(name + "获取值");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("赋值");
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }


}
