package ChenJiPaiXuSet;

public class Student {

    private String name;
    private int MathScore;
    private int ChinaScore;

    public Student() {
    }

    public Student(String name, int mathScore, int chinaScore) {
        this.name = name;
        this.MathScore = mathScore;
        this.ChinaScore = chinaScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getChinaScore() {
        return ChinaScore;
    }

    public void setChinaScore(int chinaScore) {
        ChinaScore = chinaScore;
    }
}
