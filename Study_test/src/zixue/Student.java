package zixue;
//学生类
public class Student {

    private String name;
    private int age;

    //无参构造方法
    public Student(){}

    //有参构造方法
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    //set 方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //get 方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + age);
    }
}
