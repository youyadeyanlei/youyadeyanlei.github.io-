## 集合

Collection 接口的接口 对象的集合（单列集合）
├——-List 接口：元素按进入先后有序保存，可重复
│—————-├ LinkedList 接口实现类， 链表， 插入删除， 没有同步， 线程不安全
│—————-├ ArrayList 接口实现类， 数组， 随机访问， 没有同步， 线程不安全
│—————-└ Vector 接口实现类 数组， 同步， 线程安全
│ ———————-└ Stack 是Vector类的实现类
└——-Set 接口： 仅接收一次，不可重复，并做内部排序
├—————-└HashSet 使用hash表（数组）存储元素
│————————└ LinkedHashSet 链表维护元素的插入次序
└ —————-TreeSet 底层实现为二叉树，元素排好序

Map 接口 键值对的集合 （双列集合）
├———Hashtable 接口实现类， 同步， 线程安全
├———HashMap 接口实现类 ，没有同步， 线程不安全-
│—————–├ LinkedHashMap 双向链表和哈希表实现
│—————–└ WeakHashMap
├ ——–TreeMap 红黑树对所有的key进行排序
└———IdentifyHashMap

对象的容器，定义了对多个对象进行操作的常用方法。可实现数组的功能

和数组的区别

1.数组长度固定，集合长度不固定

2.数组可以存储基本数据类型和应用类型，集合只能存储引用类型

3.操作数组的方法很少，几乎只能根据索引，

add⽅法向集合集合中添加元素 

•clear⽅法,清空集合中所有元素 

•contains⽅法 判断集合是否包含某个元素 

•isEmpty判断集合是否为空

 •remove⽅法 移除集合中元素，返回boolean类型。如果集合中不包含次元素，则删除失败 

•size()返回集合中元素的个数

 •toArray将集合转换成数组。 

•addAll 向⼀个集合中添加另⼀个集合 

•containsAll 判断⼀个集合中是否包含另⼀个集合 

•removeAll 从⼀个集合中移除另⼀个集合

java集合主要由2大体系构成，分别是Collection体系和Map体系，其中Collection和Map分别是2大体系中的顶层接口。

Collection主要有三个子接口，分别为List(列表)、Set(集)、Queue(队列)。其中，List、Queue中的元素有序可重复，而Set中的元素无序不可重复。

List中主要有ArrayList、LinkedList两个实现类；Set中则是有HashSet实现类；而Queue是在JDK1.5后才出现的新集合，主要以数组和链表两种形式存在。

Map同属于java.util包中，是集合的一部分，但与Collection是相互独立的，没有任何关系。Map中都是以key-value的形式存在，其中key必须唯一，主要有HashMap、HashTable、treeMap三个实现类。




### 1.Collectin体系集合

#### 1.Collection父接口

特点，代表一组任意类型的对象，无序，无下标，不能重复

boolean add

集合的顶层接口，不能被实例化

根接口Collection
 

i. 常用子接口

  1. List
     实现类：ArrayList、Vector、LinkedList

  2. Set
     实现类：HashSet、TreeSet

  3. 添加功能
       i. boolean add(object obj)添加一个元素
       ii. boolean addAll(Collection c)将集合c的全部元素添加到原集合元素后返回true
       iii. 添加功能永远返回true

  4. 删除功能
        i. void clear();移除所有元素
        ii. boolean remove(Object o)移除一个元素
        iii. boolean removeAll（Collection c）移除一个集合的元素，只要有一个被移除就返回true，改变原集合，删除原集合中和c中相同的元素
        iv. 删除功能只有删除成功后才返回true

  5. 判断功能
        i. boolean contain(object o)判断集合中是否包含指定的元素。
        ii. boolean containsAll(Collection c)判断原集合中是否包含指定集合c的所有元素，有则true，
        iii. boolean isEmpty()判断集合是否为空

  6. 获取功能
       i. Iterator iterator()迭代器，集合的专用方式，实现遍历的功能
       ii. Object next()获取当前元素，并移动到下一个位置
       iii. boolean hasNext()判断此位置是否有元素
       iv. 迭代器遍历实例在下面

  7. 长度功能
       i. int size()元素的个数
       ii. 数组和字符串中都是length()方法获取元素个数，集合中是size()方法
        因为object包括集合、字符串、数组，所以其不能直接用length方法。

  8. 交集功能boolean retainAll(Collection c)
        两个集合交集的元素给原集合，并判断原集合是否改变，改变则true，不变则false

  9. 把集合转换为数组
       i. Object [] toArray()

      ```java
     package cs.作业.Day720;
     
     import java.util.ArrayList;
     import java.util.Collection;
     import java.util.Iterator;
     
     /**
      * 1.添加元素
      * 2.删除元素
      * 3.遍历元素
      * 4.判断
      */
     public class Demo01 {
         public static void main(String[] args) {
             Collection collection=new ArrayList();
             collection.add("西瓜");
             collection.add("葡萄");
             collection.add("苹果");
             System.out.println(collection.size());
             System.out.println(collection);
     
             collection.remove("葡萄");
     //        collection.clear();
             System.out.println(collection.size());
             System.out.println(collection);
     
             for (Object object:collection     ) {
                 System.out.println(object);
             }
             collection.iterator();
             System.out.println(collection.size());
     
             Iterator it =collection.iterator();
             while ((it.hasNext())){
                 String o= (String) it.next();
                 System.out.println(o);
               //  it.remove();
             }
     
             System.out.println(collection.size());
     
             System.out.println(collection.contains("西瓜"));
             System.out.println(collection.size());
     
     
         }
     }
      ```







### 2.List

特点，有序，有下标，元素可以重复

```java
package cs.作业.Day720;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List接口的使用
 * 特点有序，有下标，可以重复
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建集合对象
        List list=new ArrayList<>();
        list.add("水果");
        list.add("苹果");
        list.add("小米");
        System.out.println(list.size());
        System.out.println(list.toString());

        list.remove("水果");
        System.out.println(list.size());
        System.out.println(list.toString());

        //
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for (Object o:list
             ) {
            System.out.println(o);
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator listIterator = list.listIterator();
        System.out.println("---------------");
        //从前往后
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex()+""+listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex()+""+ listIterator.previous());
        }

        //判断
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("小米"));

    }
}
```



```java
package cs.作业.Day720;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(20);
        //自动装箱
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("+++"+list.size());
        System.out.println(list.toString());

        //list.remove("20");
     //   list.remove((Object) 20);
   //     list.remove(new Integer(30));
        System.out.println(list.toString());
//sublist
        List subList = list.subList(1, 3);
        System.out.println(subList.toString());


    }
}
```

### 3.ArrayList

数组·结构实现【数组】查询快，增删慢,不安全

1，ArrayList底层通过数组实现，随着元素的增加而动态扩容。

2，ArrayList是Java集合框架中使用最多的一个类，是一个数组队列，线程不安全集合

它继承于AbstractList，实现了List, RandomAccess, Cloneable, Serializable接口。

1，ArrayList实现List，得到了List集合框架基础功能；

2，ArrayList实现RandomAccess，获得了快速随机访问存储元素的功能，RandomAccess是一个标记接口，没有任何方法；

3，ArrayList实现Cloneable，得到了clone()方法，可以实现克隆功能；

4，ArrayList实现Serializable，表示可以被序列化，通过序列化去传输，典型的应用就是hessian协议。

默认容量大小是10，没有添加元素为0

elementDate用来存放元素的数组

**ArrayList集合的特点：**

> - 容量不固定，随着容量的增加而动态扩容（阈值基本不会达到）
> - 有序集合（插入的顺序==输出的顺序）
> - 插入的元素可以为null
> - 增删改查效率更高（相对于LinkedList来说）
> - 线程不安全



•add(int index, E element) 

•remove(int index) 

•set(int index, E element) 

•get(int index) 

•subList(int beginIndex,int endIndex) 

•list.listIterator()







### 4.LinkedList

链表结构实现，增删快，查询慢

方法和ArrayList区别不大

ArrayList区别

ArrayList必须开辟；联系的空间，查询快，增删慢

LinkedList 无需开辟联系的空间，查询慢，增删快



```java
package cs.作业.Day720;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add(1,"dddd");
        System.out.println(list);

        list.addFirst("EEE");
        list.addLast("FFF");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.getLast()+list.getFirst());

        list.push("aaa");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.poll());

    }
}
```



### 5.Vector

数组实现，查询快，增删慢

运行慢，线程安全

和ArrayList方法一样

特有的枚举器

Enumeration en=vector.element（）；



### 6.泛型



本质是参数化类型，把类型作为参数传递

泛型类、泛型接口、泛型方法

提高了代码的常用性

防止类型转换异常，提高了代码的安全性

class 类名称 <泛型标识：可以随便写任意标识号，标识指定的泛型的类型>{

  private 泛型标识 /*（成员变量类型）*/ var; 

 .....

  }
}

```java
package cs.作业.Day720;

public class Demo05 {
    //此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
    public class Generic<T> {
        //key这个成员变量的类型为T,T的类型由外部指定  
        private T key;

        public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
            this.key = key;
        }

        public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
            return key;
        }
    }
}
```

```java
/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */
class FruitGenerator<T> implements Generator<T> {
    @Override
    public T next() {
        return null;
    }
}
```

泛型只能使用引用类型，不同泛型对象不能相互复制



### 7.Set

无序没有下标，不能重复

HashSet

基于HashCode计算元素存放位置

当存入元素的哈希码相同时，会调用equals进行确认，如果相同，拒绝后者存入‘



TreeSet红黑树

基于排序实现元素不重复

对集合元素自动排序

元素对象必须实现，Comparable

通过Compare方法确认实现重复元素







### 8.Map

Hashmap、HashTable、treeMap

存储一对数据、无序、无下标，建不可以重复，值可以重复

常⽤⽅法 

•put(K key, V value)

 •get(Object key) 

•Set keySet()

 •Collection values()

 •Set> entrySet()

 •boolean containsKey(Object key)

 •boolean containsValue(Object value)

 •V remove(Object key)

 •int size()

```java
package cs.作业.Day720;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(12);
        //向map集合中添加元素
        map.put("usa", "漂亮国");
        map.put("jp", "⽇本");
        map.put("en", "英国");
        map.put("ca", "加拿⼤");
        map.put("cn", "中华⼈⺠共和国");
        map.put("cn", "中国");
        map.put("china", "中国");
        System.out.println(map);
        System.out.println(map.get("cn"));
        System.out.println(map.containsKey("ca"));
        System.out.println(map.containsValue("中国"));
        System.out.println(map.isEmpty());
//根据key移除map中的元素
        map.remove("jp");
        System.out.println(map);
//返回map集合中元素的个数
        System.out.println(map.size());
        System.out.println("=================================");
//返回map集合中所有的key
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
        System.out.println("=================================");
//返回map集合中所有的value
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("=================================");
//返回map集合中所有的key和value (Entry)
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

    }
}
```

### 9.Collections工具类





































































