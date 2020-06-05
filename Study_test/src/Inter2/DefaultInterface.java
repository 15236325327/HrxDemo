package Inter2;

public interface DefaultInterface {

    void show1();

    void show2();

    //void show3();

    default void show4(){
        System.out.println("接口中的默认方法执行");
    }

    static void  show5(){
        System.out.println("接口中的静态方法执行");
    }
}
