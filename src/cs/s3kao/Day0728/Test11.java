package cs.s3kao.Day0728;




public class Test11 {
    public static void main(String[] args) {
        Action userAction =new UserAction();
        ActionProxy proxy = new ActionProxy(userAction);
        proxy.doAction();
    }


}
class ActionProxy implements Action {
    private Action target;

    public ActionProxy(Action target) {
        this.target = target;
    }
    public void doAction() {
        long startTime = System.currentTimeMillis();
        target.doAction();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
interface Action {
    public void doAction();
}
class UserAction implements Action {

    @Override
    public void doAction() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("开始");
        }
    }
}