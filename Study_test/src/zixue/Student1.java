package zixue;

public class Student1 {

    private String name;
    private String sex;

    //无参构造方法
    public Student1() {
    }

    //有参构造方法
    public Student1(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    //set 方法
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //get 方法
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    //输出方法
    public void show() {
        System.out.println(name + ":" + sex);
    }

}
