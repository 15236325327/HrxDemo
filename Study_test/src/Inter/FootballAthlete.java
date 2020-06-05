package Inter;

public class FootballAthlete extends Athlete implements SayEnglish {

    public FootballAthlete() {
    }

    public FootballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习足球！");
    }

    @Override
    public void eat() {
        System.out.println("吃羊肉米饭！");
    }

    @Override
    public void sayenglish() {
        System.out.println("学习说英语！");
    }
}
