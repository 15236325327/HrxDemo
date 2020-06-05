package ClassLoder;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        //最方便
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c2);
        System.out.println("--------");

        Student s=new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3);
        System.out.println("--------");

        //灵活性高
        Class<?> c4 = Class.forName("ClassLoder.Student");
        System.out.println(c4);
    }
}
