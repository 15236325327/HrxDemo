package LaMethodReference;

public class TestDemo1 {

    public static void main(String[] args) {

        Inter1 in = new Inter1() {
            @Override
            public int transform(String s) {
                return Integer.parseInt(s);
            }
        };
        System.out.println(in.transform("778778"));

        useInter(s -> {
            return Integer.parseInt(s);
        });

        useInter(s -> Integer.parseInt(s));

        useInter(Integer::parseInt);
    }
    private static void useInter(Inter1 i1){
        int i = i1.transform("1008611");
        System.out.println(i);
    }
}
