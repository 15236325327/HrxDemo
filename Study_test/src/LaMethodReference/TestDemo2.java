package LaMethodReference;

public class TestDemo2 {

    public static void main(String[] args) {

        //原始写法
        Inter2 i2 = new Inter2() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(i2.transform("huang"));

        //匿名内部类
        useInter(new Inter2() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        });

        //Lambda表达式
        useInter(s -> {
            return s.toUpperCase();
        });

        //Lambda简略后
        useInter(s -> s.toUpperCase());

        //方法引用
        useInter(String::toUpperCase);
    }

    private static void useInter(Inter2 i2) {
        String result = i2.transform("HelloWorld");
        System.out.println(result);
    }
}
