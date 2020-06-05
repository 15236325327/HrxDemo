package ClassLoder;

public class Student{

    private  String name;
    int age;
    public String address;

    public Student() {
    }

    private Student(String name){
        this.name=name;
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void function(){
        System.out.println("function执行完毕！");
    }

    public void method1(String name){
        System.out.println("method1执行完毕！");
        System.out.println(name);
    }

    public void method2(){
        System.out.println("method2执行完毕");
    }

    public void method3(String name,int age){
        System.out.println("method3执行完毕");
        System.out.println(name+"刚刚"+age+"!");
    }

    @Override
    public String toString() {
        return
                "name:" + name +
                " age:" + age +
                " address:" + address;
    }
}
