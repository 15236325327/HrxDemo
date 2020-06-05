package IoChar;

public class Student1 {

    private String Name;
    private int LanguageScores;
    private  int MathScores;
    private  int EnglishScores;

    public Student1() {
    }

    public Student1(String name, int languageScores, int mathScores, int englishScores) {
        Name = name;
        LanguageScores = languageScores;
        MathScores = mathScores;
        EnglishScores = englishScores;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLanguageScores() {
        return LanguageScores;
    }

    public void setLanguageScores(int languageScores) {
        LanguageScores = languageScores;
    }

    public int getMathScores() {
        return MathScores;
    }

    public void setMathScores(int mathScores) {
        MathScores = mathScores;
    }

    public int getEnglishScores() {
        return EnglishScores;
    }

    public void setEnglishScores(int englishScores) {
        EnglishScores = englishScores;
    }

    public  int getsum(){
        return this.LanguageScores+this.MathScores+this.EnglishScores;
    }
}
