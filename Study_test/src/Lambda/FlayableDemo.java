package Lambda;

public class FlayableDemo {

    public static void main(String[] args) {

        //匿名内部类
        useFly(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });

        //lamdba表达式
        useFly((s) ->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

        useFly( s -> System.out.println(s));
    }

    private static void useFly(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
}
