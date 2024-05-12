package camp.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String studentName;

    private List<Subject> subjectList;



    public Student(String seq, String studentName, List<Subject> subjectList) {
        this.studentId = seq;
        this.studentName = studentName;
        this.subjectList = subjectList;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

}
