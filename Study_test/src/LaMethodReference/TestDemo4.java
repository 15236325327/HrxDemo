package LaMethodReference;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestDemo4 {

    public static void main(String[] args) {
        Inter4 i=new Inter4() {
            @Override
            public void transform(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        i.transform("helloworld");


        useInter(new Inter4() {
            @Override
            public void transform(String s) {
                System.out.println(s.toUpperCase());
            }
        });

        useInter((s) -> {
            System.out.println(s.toUpperCase());
        });

        useInter(s -> System.out.println(s.toUpperCase()));

        Test4 i4=new Test4();
        useInter(i4::method);
    }

    private static void useInter(Inter4 i4){
       i4.transform("helloworld");
    }
}
