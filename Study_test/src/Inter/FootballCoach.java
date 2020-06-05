package Inter;

public class FootballCoach extends Coach implements SayEnglish{

    public FootballCoach() {
    }

    public FootballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教足球！");
    }

    @Override
    public void eat() {
        System.out.println("吃鸡米饭！");
    }

    @Override
    public void sayenglish() {
        System.out.println("说英语!");
    }
}
