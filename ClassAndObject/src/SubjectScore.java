public class SubjectScore {
    public  String subjectName;
    public String studentName;
    public double score;

    SubjectScore(String subjectName , String studentName , double score) {
        this.subjectName = subjectName;
        this.studentName = studentName;
        this.score = score;
    }

    double getScore() {
        return this.score;
    }

    String getStudentNameAndScore (){
        return this.studentName + this.score;
    }
    static SubjectScore compareScore(SubjectScore sc1, SubjectScore sc2){
        return (sc1.score>sc2.score)?sc1:sc2;
    }
    static double getAvg(SubjectScore sc1, SubjectScore sc2 , SubjectScore sc3){
        return (sc1.score+sc2.score+sc3.score)/3;
    }

    public static void main(String[] args) {
        SubjectScore sc1=new SubjectScore("Toan","Nam",10);
        SubjectScore sc2=new SubjectScore("Toan","Minh",1);
        SubjectScore sc3=new SubjectScore("Toan","Khanh",5);

        System.out.println(sc1.getScore());
        System.out.println(sc2.getStudentNameAndScore());
        System.out.println(compareScore(sc2,sc3).toString());
        System.out.println(getAvg(sc1,sc2,sc3));
    }
}


class Main {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 0;
        System.out.println(number1/number2);
    }
}
