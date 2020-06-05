package LaMethodReference;

public class TestDemo {

    public static void main(String[] args) {

        Inter i=new Inter() {
            @Override
            public void show(String s) {
                System.out.println(s);
            }
        };
        i.show("也就一般帅");


        useInter((s)->{
            System.out.println("不，你是真的帅");
        });

        useInter(System.out :: println);
    }

    private static void useInter(Inter i){
        i.show("你好帅");
    }
}
