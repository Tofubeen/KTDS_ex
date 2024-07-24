package com.ktdsuniversity.edu.lesson.staticexam.Quest.class_method;

public class ClassMethodExamMain {

    public static void main(String[] args) {
        // isValidAge 메소드 테스트
        int age = 25;
        int minAge = 18;
        int maxAge = 30;
        boolean isValid = ClassMethodExam.isValidAge(age, minAge, maxAge);
        System.out.println("나이 " + age + "는 " + minAge + "와 " + maxAge + " 사이에 있습니다: " + isValid);

        // getCourseCredit 메소드 테스트
        double average = 85.0;
        double courseCredit = ClassMethodExam.getCourseCredit(average);
        System.out.println("평균 " + average + "의 환산 학점: " + courseCredit);

        // getABCDE 메소드 테스트
        ClassMethodExam exam = new ClassMethodExam();
        String grade = exam.getABCDE(courseCredit);
        System.out.println("환산 학점 " + courseCredit + "의 등급: " + grade);
    }
}
