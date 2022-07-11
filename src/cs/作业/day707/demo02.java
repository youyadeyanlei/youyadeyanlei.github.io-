package cs.作业.day707;

public class demo02 {
    public static void main(String[] args) {

        String[] name={"a","b","c","d","e","f"};
        int[][] groups=getGroupByName(name,2);
        for (int i = 0; i <groups.length ; i++) {
            System.out.println("组号"+i+1+"编号");
         //   int[] groups1 =getGroupByName(i);
        }
    }

    /**
     *
     * @param name 保存人员姓名的数组
     * @param count 每组多少人
     * @return
     */
    public static int[][] getGroupByName(String[] name,int count){
        //1.计算多少组
        int perpeo =name.length;
        boolean flag = (perpeo%count==0);
        int groups =flag?perpeo/count:(perpeo/count)+1;
        //2.创建一个二维数组，保存数组号及其人员编制
        int[][] arr=new int[groups][count];
        int counter=0;
        //3.遍历数组
        for (int i = 0; i <groups ; i++) {
            int[] name1=arr[i];
            for (int j = 0; j <name1.length ; j++) {
                if (name1.length-1<counter){
                    arr[i][j]=0;
                }else {
                arr[i][j]=counter;}
                counter++;
            }
        }
        return arr;
    }

}
