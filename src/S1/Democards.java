package S1;

import java.util.*;

/*
1. 定义一副扑克牌（包含数字和花色），然后模拟斗地主，提供洗牌、发牌等功能。


 */
public class Democards {
    public static void main(String[] args) {
        //1.买牌
        //1.1定义一个双列集合，键：表示牌的编号，值：表示具体的牌，规则：编号越小牌越小
        Map<Integer,String> pokers = new HashMap<>();

        //1.2定义一个单列集合，用来存储所有牌的的编号
        List<Integer> list =new ArrayList<>();
        //1.3具体的买牌动作

        //普通牌52张
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♣","♥","♦"};
        //通过循环嵌套获取普通牌
        int num = 0;
        for (String number : nums) {
            for (String color : colors) {
                String poker = color+number;
                //将牌的编号和具体的牌放到双列集合中，
                pokers.put(num,poker);
                //将牌的编号放到单列集合中
                list.add(num);
                //每添加一张，编号自增1
                num++;
            }
        }
        //大小王
        //添加小王
        pokers.put(num,"小王");
        list.add(num++);
        //添加大王
        pokers.put(num,"大王");
        list.add(num++);
        //打印牌
       /* System.out.println("所有的牌："+pokers);
        System.out.println("编号："+list);*/

//        步骤2,3：洗牌和发牌
//        分析：
//        1.使用Collections工具类的shuffle()方法打乱牌堆集合的顺序
//        2.分别创建三个玩家集合对象和底牌集合对象
//        3.遍历牌堆的每一张牌，分别将索引对3取模的值为0.1.2的牌放到三个玩家集合中，将最后三张 存放到底牌集合中
        //洗牌
        Collections.shuffle(list);
        //System.out.println("洗好牌后的编号："+list);
        //发牌
        //3.1定义4个集合，分别表示3个玩家，底牌
        List<Integer> dipai = new ArrayList<>();
        List<Integer> zhaoyun = new ArrayList<>();
        List<Integer> caocao = new ArrayList<>();
        List<Integer> liubei = new ArrayList<>();
        //3.2具体的发牌动作，将索引和3取余，决定发给谁
        for(int i= 0;i<list.size();i++){
            //获取编号
            Integer pokerNum = list.get(i);
            if(i>=list.size()-3){
                //底牌i
                dipai.add(pokerNum);
            }else if(i%3 ==0){
                zhaoyun.add(pokerNum);
            }else if(i%3 ==1){
                caocao.add(pokerNum);
            }else if(i%3 ==2){
                liubei.add(pokerNum);
            }
        }
        //查看具体的牌
        System.out.println("-------------------------------");
        System.out.println("斗地主在线洗牌发牌：");
        System.out.println("1号:"+printPoker(zhaoyun,pokers));
        System.out.println("2号:"+printPoker(caocao,pokers));
        System.out.println("3号:"+printPoker(liubei,pokers));
        System.out.println("底牌:"+printPoker(dipai,pokers));
    }

    /*4.定义一个方法看牌
        方法名：printPoker
           参数列表:List<Integer>,Map<Integer,String>;
             返回值:String*/
    public  static String printPoker(List<Integer> nums,Map<Integer,String> pokers){
        //1.对牌的编号进行升序排列
        Collections.sort(nums);
        //2.遍历牌的编号集合，获取每一个编号
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //num就是要查找具体牌的编号
            //3.根据编号去双列集合中查找该编号对应的具体牌
            String poker =pokers.get(num);
            //4.将获取到的牌进行拼接
            sb.append(poker+" ");
        }
        //5.将最后的拼接的结果返回即可
        String str = sb.toString();
        return str.trim();
    }
}


