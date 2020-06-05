package Lambda;

public class EatableDemo {

    public static void main(String[] args) {

        //普通方式
        Eatable e=new Eatableimpl();
        e.eat();
        useEatable(e);

       //匿名内部类
       useEatable(new Eatable() {
           @Override
           public void eat() {
               System.out.println("一天一苹果，医生远离我");
           }
       });

       //lambda表达式
        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        });
    }

    private static void useEatable(Eatable e){

        e.eat();

    }
}
