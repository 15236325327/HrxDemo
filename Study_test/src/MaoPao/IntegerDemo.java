package MaoPao;

public class IntegerDemo {

    public static void main(String[] args) {

        //int 范围
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

       /* Integer i1=new Integer(100);
        System.out.println(i1);

       //Integer i2=new Integer(100);
        Integer i2=new Integer("abc");//For input string: "abc"
        System.out.println(i2);*/

        //只能是数字字符串
        /*Integer i1 = Integer.valueOf(100);
        System.out.println(i1);
        //Integer i2 = Integer.valueOf("abc");//For input string: "abc"
        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);*/

        int number = 100;
        //方式一
        String s1 = "" + number;
        System.out.println(s1);
        //方式二
        String s2 = String.valueOf(number);
        System.out.println(s2);

        String s = "100";
        Integer i = Integer.valueOf(s);
        System.out.println(i);
        int x = i.intValue();
        System.out.println(x);

        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
