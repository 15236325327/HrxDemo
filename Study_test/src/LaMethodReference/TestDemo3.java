package LaMethodReference;

public class TestDemo3 {

    public static void main(String[] args) {

        useInter((s,x,y) ->{
            return s.substring(x,y);
        });

        useInter((s,x,y) -> s.substring(x,y));

        //第一个参数作为调用者，后面的参数全部传递给该方法做参数
        useInter(String::substring);



    }

    private static void useInter(Inter3 i3){
        String s = i3.Intercept("abcdefghigklmnopqrstuvwxyz",0,5);
        System.out.println(s);
    }
}
