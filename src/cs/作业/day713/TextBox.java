package cs.作业.day713;

public class TextBox extends Demo04{

    private String text;

    public void setText(String text) {
        this.text = text;
    }
    public void clear(){
        text="a";
    }

    public static void main(String[] args) {
        TextBox control =new TextBox();
        control.disable();
        control.a="a";
        System.out.println(control.isEnabled());
        System.out.println(control);
    }
}
