package duotai;

public class Demo {

    public static void main(String[] args) {

        Animal a=new Cat();
        a.setName("jia fei");
        a.setAge(5);
        System.out.println(a.getName()+":"+a.getAge());

        Cat c=(Cat)a;
        c.eat();
        c.playgame();

        a=new Dog("pig",6);
        System.out.println(a.getName()+a.getAge());


    }
}
