package Lambda;

public class Eatableimpl implements Eatable {

    @Override
    public void eat() {
        System.out.println("一天一苹果，医生远离我");
    }
}