
import java.util.ArrayList;

public class Register {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;


    public Register() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public void addScore(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfPoints(Integer minimum){
        if (minimum == null) {
            minimum = 0;
        }
        if(points.size() == 0){
            return -1;
        } else {
            double sum = 0;
            int count = 0;
            for (int point: points){
                if (point >= minimum){
                    sum += point;
                    count++;
                }
            }
            return (sum/count);
        }
    }
    public double passPercentage(int minimum) {
        int passing = 0, participants = 0;
        for (int received : this.points) {
            if (received >= minimum) {
                passing++;
            }
            participants++;
        }

        return 100* (double) passing/participants;
    }

}
