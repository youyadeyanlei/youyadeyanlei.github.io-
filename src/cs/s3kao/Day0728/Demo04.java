package cs.s3kao.Day0728;

public class Demo04 {

        public enum Color {
            RED("红色",1),GREEN("绿色",2),WHITE("白色",3),YELLOW("黄色",4);
            // 成员变量
            private String name;
            private int index;
            // 构造方法
            private Color(String name,int index) {
                this.name = name;
                this.index = index;
            }
            // 覆盖方法
            @Override
            public String toString() {
                return this.index + "-" + this.name;
            }
        }
        public static void main(String[] args) {
            //System.out.println(Color.RED.toString());    // 输出：1-红色

            for (Color s : Color.values()){
                System.out.println(s.toString());
            }
        }

}
