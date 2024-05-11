package camp;

import camp.model.Score;

import java.util.List;
import java.util.Scanner;

public class ScoreManagement {

    // 데이터 저장소
    private static List<Score> scoreStore;

    // index 관리 필드
    private static int scoreIndex;
    private static final String INDEX_TYPE_SCORE = "SC";

    // index 자동 증가
    private static String sequence() {
        scoreIndex++;
        return INDEX_TYPE_SCORE + scoreIndex;
    }

    // 스캐너
    private static Scanner sc = new Scanner(System.in);

    // 수강생의 과목별 시험 회차 및 점수 등록
    public static void createScore() {
        String studentId = getStudentId(); // 관리할 수강생 고유 번호
        System.out.println("시험 점수를 등록합니다...");
        // 기능 구현
        System.out.println("\n점수 등록 성공!");
    }

    // 수강생의 과목별 회차 점수 수정
    public static void updateRoundScoreBySubject() {
        String studentId = getStudentId(); // 관리할 수강생 고유 번호
        // 기능 구현 (수정할 과목 및 회차, 점수)
        System.out.println("시험 점수를 수정합니다...");
        // 기능 구현
        System.out.println("\n점수 수정 성공!");
    }

    // 수강생의 특정 과목 회차별 등급 조회
    public static void inquireRoundGradeBySubject() {
        String studentId = getStudentId(); // 관리할 수강생 고유 번호
        // 기능 구현 (조회할 특정 과목)
        System.out.println("회차별 등급을 조회합니다...");
        // 기능 구현
        System.out.println("\n등급 조회 성공!");
    }

    private static String getStudentId() {
        System.out.print("\n관리할 수강생의 번호를 입력하시오...");
        return sc.next();
    }

}