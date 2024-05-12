package camp;

import camp.model.Status;
import camp.model.Student;
import camp.model.Subject;

import java.util.*;

import static camp.CampManagementApplication.SUBJECT_TYPE_CHOICE;
import static camp.CampManagementApplication.SUBJECT_TYPE_MANDATORY;
import static camp.model.Subject.*;

public class StudentManagement {
    // 데이터 저장소
    private static List<Student> studentStore;
    private static List<Subject> subjectStore;

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
        List<Subject> subjectList = new ArrayList<>();
        String mandatorySubject = sc.next();
        for (Subject s : subjectStore) {
            if (mandatorySubject.equals(s.getSubjectName())) {
                subjectList.add(s);// 필수 과목 입력받기
            }
        }

        String choiceSubject = sc.next();
        for (Subject s : subjectStore) {
            if (choiceSubject.equals(s.getSubjectName())) {
                subjectList.add(s);// 선택 과목 입력받기
            }
        } // 선택 과목 입력받기
        Student student = new Student(sequence(), studentName, subjectList); // 수강생 인스턴스 생성 예시 코드

        studentStore.add(student);


        // 기능 구현
        System.out.println("수강생 등록 성공!\n");
    }

    // 수강생 목록 조회
    public static void inquireStudent(List<Student> studentStore) {
        System.out.println("\n수강생 목록을 조회합니다...");
        for (Student students : studentStore) {
            System.out.println("[" + students.getStudentId() + "]");
            System.out.println("이름 : " + students.getStudentName());
            System.out.println("\n수강생 목록 조회 성공!");
        }
    }


    //학생 이름 정확히 받기
    private static String getExactStudentId(String studentName) {
        List<Student> sameNameStudentList = new ArrayList<>();
        for (Student student : studentStore) {
            if (student.getStudentName().equals(studentName)) ;
            {
                sameNameStudentList.add(student);
            }
        }

        if (sameNameStudentList.size() > 1) {
            while (true) {
                try {
                    System.out.println("====================");
                    System.out.println("해당 이름을 가진 수강생 목록입니다!");
                    inquireStudent(sameNameStudentList);
                    System.out.println("====================");
                    System.out.println("수강생의 번호를 입력해주세요! (숫자만 입력) : ");
                    int studentNum = sc.nextInt();
                    for (Student student : sameNameStudentList) {
                        if (student.getStudentId().equals(INDEX_TYPE_STUDENT + studentNum)) {
                            return student.getStudentId();
                        }
                    }
                    System.out.println("올바른 수강생 번호를 입력해주세요!");
                } catch (InputMismatchException e) {
                    System.out.println("숫자를 입력해주세요!");
                    sc.nextLine();
                }
            }

        } else if (sameNameStudentList.isEmpty()) {
            System.out.println("이름이 일치하는 수강생이 없습니다!");
            return "Invalid";
        } else {
            return sameNameStudentList.get(0).getStudentId();
        }
    }
}
