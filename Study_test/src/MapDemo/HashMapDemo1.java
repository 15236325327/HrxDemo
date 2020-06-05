package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

    public static void main(String[] args) {

        Map<String, String> s = new HashMap<String, String>();

        /*V put(添加)​(K key,V value)将指定的值与该映射中的指定键相关联（可选操作）。 如果映射先前包含了密钥的映射，则旧值将被指定的值替换。
    （映射m被称为包含关键字k的映射，如果且仅当m.containsKey(k)将返回true 。这是map集合的添加方法。*/
        s.put("001", "黄任翔");
        s.put("001", "liuyan");
        s.put("002", "周润发");
        s.put("003", "刘德华");
        s.put("004", "郭富城");
        s.put("005", "黎明");

        /*V remove​(Object key)   （删除键值对的元素）*/
        s.remove("001", "liuyan");

        /*void clear​()   （移除所有键值对元素）*/
        //s.clear();

        /*boolean containsKey​(Object key)  （判断集合是否有指定的键）*/
        System.out.println(s.containsKey("002"));

        /*boolean containsValue​(Object value)   （判断集合是否包含指定的值）*/
        System.out.println(s.containsValue("周润发"));

        /*boolean isEmpty​()    （判断集合是否为空）*/
        System.out.println(s.isEmpty());

        /*int size()  集合长度，也就是键值对个数*/
        System.out.println(s.size());

        System.out.println(s);
    }
}
