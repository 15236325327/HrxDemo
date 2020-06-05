package MapDemo;

public class Student {

    private int ID;
    private  String name;


    public Student() {
    }

    public Student(int ID,String name) {
        this.name = name;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
