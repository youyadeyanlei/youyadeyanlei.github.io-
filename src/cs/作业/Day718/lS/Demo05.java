package cs.作业.Day718.lS;

public class Demo05 {
    public static void main(String[] args) {

        Light[] Ls=new Light[3];
        Ls[0] =new LightA();
        Ls[1] =new LightB();
        Ls[2] =new LightC();
        Lamp lamp=new Lamp();
        for (int i = 0; i <Ls.length ; i++) {
            lamp.setLight(Ls[i]);
            lamp.on();
        }
    }
}
class Lamp{
    private Light light;


    public void on(){
        light.shine();
    }

    public void setLight(Light light) {
        this.light=light;
    }
}
interface Light{
    void shine();
}
class LightA implements Light{

    @Override
    public void shine() {
        System.out.println("A");
    }
}
class LightB implements Light{

    @Override
    public void shine() {
        System.out.println("B");
    }
}
class  LightC implements Light{

    @Override
    public void shine() {
        System.out.println("c");

    }
}
