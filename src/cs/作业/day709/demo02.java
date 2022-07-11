package cs.作业.day709;

public class demo02 {
    public static void main(String[] args) {

        BaseSeva user = new User();
        user.setiSave(new FileSave());
        user.add("44");
    }
}

interface ISave {
    public void save(String data);
}

class FileSave implements ISave {
    @Override
    public void save(String data) {
        System.out.println("baocun" + data);
    }
}

class NetSave implements ISave {

    @Override
    public void save(String data) {
        System.out.println("22" + data);
    }
}

abstract class BaseSeva {
    private ISave iSave;

    public void setiSave(ISave iSave) {
        this.iSave = iSave;
    }

    public void add(String data) {
        System.out.println("+++");
        iSave.save(data);
        System.out.println("baocun");
    }
}

class User extends BaseSeva {

}
