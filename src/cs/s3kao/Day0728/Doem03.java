package cs.s3kao.Day0728;

public class Doem03 {
    enum WeekDay {
        Mon("Monday"),Tue("Tuesday"),Wed("Wednesday"),Thu("Thursday"),Fri("Friday"),Sat("Saturday"),Sun("Sunday");
        // 以上是枚举的成员，必须先定义，而且使用分号结束
        private final String day;
        private WeekDay(String day) {
            this.day = day;
        }
        public static void printDay(int i) {
            switch(i) {
                case 1:
                    System.out.println(WeekDay.Mon);
                    System.out.println("11"+Mon+"222");
                    System.out.println(Mon.getDay());
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(WeekDay.Tue);
                    break;
                case 3:
                    System.out.println(WeekDay.Wed);
                    break;
                case 4:
                    System.out.println(WeekDay.Thu);
                    break;
                case 5:
                    System.out.println(WeekDay.Fri);
                    break;
                case 6:
                    System.out.println(WeekDay.Sat);
                    break;
                case 7:
                    System.out.println(WeekDay.Sun);
                    break;
                default:
                    System.out.println("wrong number!");
            }
        }
        public String getDay() {
            return day;
        }
    }
    public static void main(String[] args) {
        for(WeekDay day : WeekDay.values()) {
            System.out.println(day+"====>" + day.getDay());
        }
        WeekDay.printDay(1);
    }
}
