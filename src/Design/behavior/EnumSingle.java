package Design.behavior;
//enum 是什么，枚举也是一个类
public enum EnumSingle {
      INSTANCE;
      public  EnumSingle getInstance(){
            return INSTANCE;
      }

}
