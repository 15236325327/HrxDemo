package Inter2;

public class DefaultMethod {

    public static void main(String[] args) {

        DefaultInterface d1=new DefaultInterImpl1();
        d1.show1();
        d1.show2();
        d1.show4();
        //d1.show5();

        DefaultInterface.show5();
    }
}
