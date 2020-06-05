package Inter;

public class Demo {

    public static void main(String[] args) {

        Person a=new BasketballAthlete();
        a.eat();
        a=new FootballAthlete();
        a.eat();

        BasketballAthlete b=new BasketballAthlete("王海",12);
//        b.setName("王海");
//        b.setAge(12);
        System.out.println(b.getName()+":"+b.getAge());
        b.eat();
        b.study();

        FootballAthlete c=new FootballAthlete();
        c.setName("陈二");
        c.setAge(15);
        System.out.println(c.getName()+":"+c.getAge());
        c.eat();
        c.study();
        c.sayenglish();
    }
}
