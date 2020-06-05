package ClassLoder;

public class ClassLoderDemo1 {

    public static void main(String[] args) {

        ClassLoader sys = ClassLoader.getSystemClassLoader();
        System.out.println(sys);

        ClassLoader parent = sys.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}
