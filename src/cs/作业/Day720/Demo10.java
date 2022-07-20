//package cs.作业.Day720;
//
//public class Demo10 {
//    final  V putVal(int hash, K key, V value, boolean onlyIfAbsent,
//                          boolean evict) {
////tab表⽰存放Node节点的数据 p表⽰当前节点 n表⽰⻓度 i表⽰节点在数组中的下标
//        Node<K, V>[] tab;
//        Node<K, V> p;
//        int n, i;
////判断数组如果为空或者数组⻓度为0，那么就对数组进⾏扩容，数组默认初始⼤⼩为16
//        if ((tab = table) == null || (n = tab.length) == 0)
//            n = (tab = resize()).length;
////将数组的⻓度-1与hash值进⾏与运算(计算的结果⼀定是0~数组⻓度-1)得到元素应该存放的下标
////如果当前下标位置为空，那么直接将Node节点存放在当前位置
//        if ((p = tab[i = (n - 1) & hash]) == null)
//            tab[i] = newNode(hash, key, value, null);
////如果当前位置不为空(分为三种情况)
//        else {
//            Node<K, V> e;
//            K k;
////情况1：要添加的元素与当前位置上的元素相同(hash(hashCode)、key(equals)⼀致),则直接替换
//            if (p.hash == hash &&
//                    ((k = p.key) == key || (key != null && key.equals(k))))
//                e = p;
////情况2:如果要添加的元素是红⿊树节点，那么将其添加到红⿊树上
//            else if (p instanceof TreeNode)
//                e = ((TreeNode<K, V>) p).putTreeVal(this, tab, hash, key, value);
////情况3:如果要添加的元素是链表，则需要遍历
//            else {
//                for (int binCount = 0; ; ++binCount) {
////将当前元素的下⼀个节点赋给e
////如果e为空，则创建新的元素节点放在当前位置的下⼀个元素上，并退出循环
//                    if ((e = p.next) == null) {
//                        p.next = newNode(hash, key, value, null);
////如果链表的元素个数⼤于8个(且当数组中的元素个数⼤于64)，则将其转换成红⿊树
//                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
//                            treeifyBin(tab, hash);
//                        break;
//                    }
////要添加的元素与当前位置上的元素相同(hash(hashCode)、key(equals)⼀致),则直接退出循
//                    if (e.hash == hash &&
//                            ((k = e.key) == key || (key != null && key.equals(k))))
//                        break;
//                    p = e;
//                }
//            }
////如果返回的e不为null
//            if (e != null) { // existing mapping for key
////将e的值赋给oldValue
//                V oldValue = e.value;
//                if (!onlyIfAbsent || oldValue == null)
//                    e.value = value;
//                afterNodeAccess(e);
////返回以前的值(当添加的元素已经存在返回的是以前的值)
//                return oldValue;
//            }
//        }
//
//        ++modCount;
////如果数组的元素个数⼤于阈值则进⾏扩容
//        if (++size > threshold)
//            resize();
//        afterNodeInsertion(evict);
//        return null;
//    }
//3.14.6resize过程原
//}
//            }
