package Lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AddableDemo {

    public static void main(String[] args) {

        //lambda表达式
        useAdd((a,b)->{
            return a+b;
        });

        Addable a=new Addable() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(a.add(10,50));

        Addable b=(c,d)->{
            return c+d;
        };
        System.out.println(b.add(20,50));

    }

    private static void useAdd(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
