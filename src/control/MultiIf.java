package control;

import java.util.Scanner;

public class MultiIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("점수를 입력해주세요. (0~100)");
        int score = in.nextInt();
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score < 70) {
            grade = "D";
        }
        System.out.println("grade = " + grade);
    }
}
