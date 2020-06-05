package Extends;

public class Teacher extends  Fu{

    public Teacher(){}

    //使用带参构造需要手动添加无参构造方法，不使用时无参构造可省略
    public  Teacher(String name,String age){
        super(name,age);
    }

    public void teacher(){
        System.out.println("教书育人!");
    }
}
