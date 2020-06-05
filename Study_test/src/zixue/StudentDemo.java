package zixue;

public class StudentDemo {

    public static void main(String[] args) {

        //创建对象
        Student s=new Student();

        //给成员变量赋值
        s.setName("黄任翔");
        s.setAge(21);

        //获取成员变量
        s.show();


        //使用get方法获取
        System.out.println(s.getName()+"----"+s.getAge());

    }
}
