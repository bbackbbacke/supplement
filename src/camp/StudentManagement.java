package camp;

import camp.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    // 데이터 저장소
    private static List<Student> studentStore;

    // index 관리 필드
    private static int studentIndex;
    private static final String INDEX_TYPE_STUDENT = "ST";

    // index 자동 증가
    private static String sequence() {
        studentIndex++;
        return INDEX_TYPE_STUDENT + studentIndex;
    }

    // 스캐너
    private static Scanner sc = new Scanner(System.in);

    // 수강생 등록
    public static void createStudent() {
        System.out.println("\n수강생을 등록합니다...");
        System.out.print("수강생 이름 입력: ");
        String studentName = sc.next();
        // 기능 구현 (필수 과목, 선택 과목)

        Student student = new Student(sequence(), studentName); // 수강생 인스턴스 생성 예시 코드
        // 기능 구현
        System.out.println("수강생 등록 성공!\n");
    }

    // 수강생 목록 조회
    public static void inquireStudent() {
        System.out.println("\n수강생 목록을 조회합니다...");
        // 기능 구현
        System.out.println("\n수강생 목록 조회 성공!");
    }

}