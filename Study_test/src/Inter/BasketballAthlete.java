package Inter;

public class BasketballAthlete extends Athlete {

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃牛肉米饭！");
    }

    @Override
    public void study() {
        System.out.println("学习篮球!");
    }
}
