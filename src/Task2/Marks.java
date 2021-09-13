package Task2;

abstract class Marks {
    int chemistryGrade;
    int biologyGrade;
    int mathGrade;
    int historyGrade;
    abstract void getPercentage();
}
class StudentA extends Marks{
    StudentA(int chem, int bio, int math){
        this.chemistryGrade=chem;
        this.biologyGrade=bio;
        this.mathGrade=math;
    }

    @Override
    void getPercentage() {
        double average = (double) (chemistryGrade+biologyGrade+mathGrade)/3;
        System.out.println(average);
    }
}
class StudentB extends Marks{
    StudentB(int chem, int bio, int math, int hist){
        this.chemistryGrade=chem;
        this.biologyGrade=bio;
        this.mathGrade=math;
        this.historyGrade=hist;
    }

    @Override
    void getPercentage() {
        double average = (double) (chemistryGrade+biologyGrade+mathGrade+historyGrade)/4;
        System.out.println(average);
    }
}