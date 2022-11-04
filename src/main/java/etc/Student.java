package etc;

public class Student {

    private String name;
    private String major;
    private int classNum;
    private int avgScore;
    
    public Student(String name, String major, int classNum, int avgScore) {
        this.name = name;
        this.major = major;
        this.classNum = classNum;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }
    
}
