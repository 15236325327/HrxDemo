package lianxi;

public class Text1 {

    //定义成员变量
    private String name;
    private String age;
    private String sex;

    //无参构造
    public Text1() {
    }

    //带参
    public Text1(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    //set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //get方法
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}