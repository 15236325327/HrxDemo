package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map获取功能
public class MapObtain {

    public static void main(String[] args) {

        Map<Integer, String> s = new HashMap<Integer, String>();

        s.put(21, "黄任翔");
        s.put(22, "郭靖");
        s.put(23, "刘德华");
        s.put(24, "陈真");


        /*V get​(Object key)返回指定键映射到的值，如果此映射不包含该键的映射，则返回null 。*/
        System.out.println(s.get(21));
        System.out.println(s.get(23));

        /*Set<K> keySet​() 获取所有键的集合*/
        Set<Integer> s1 = s.keySet();
        for (Integer i : s1) {
            System.out.println(i);
        }

        /*Collection<V> values​()  获取所有值得集合*/
        //System.out.println(s.values());//这个自己写的不对，但能运行
        Collection<String> values = s.values();
        for (String i : values) {
            System.out.println(i);
        }

        /*Set<Map.Entry<K,V>> entrySet​()  获取所有键值对对象的集合*/
        //System.out.println(s.entrySet());//这个自己写的不对，但能运行
        Set<Map.Entry<Integer, String>> entries = s.entrySet();
        for (Map.Entry<Integer,String> i : entries){
            System.out.println(i.getKey()+i.getValue());
        }
    }
}
