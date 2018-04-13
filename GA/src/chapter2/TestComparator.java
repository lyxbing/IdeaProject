package chapter2;
import java.util.Comparator;

class Student {
    private String name;
    private double score;
    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }
    public double getScore(){
        return this.score;
    }
    @Override
    public String toString() {
        return "姓名:"+this.name+",分数:"+this.score;
    }

}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1,Student o2) {
        if(o1.getScore() > o2.getScore()){
            return 1;
        }else if(o1.getScore() < o2.getScore()){
            return -1;
        }else{
            return 0;
        }
    }
}
public class TestComparator {

    public static void main(String[] args) {

        Student[] sts = new Student[]{
                new Student("小戴",60),
                new Student("小王",90),
                new Student("老王",80),
                new Student("小萱",95)
        };

        java.util.Arrays.sort(sts, new StudentComparator());
        System.out.println(java.util.Arrays.toString(sts));
    }
}

