package camp.model;

import java.util.HashMap;

public class Subject {
    private String subjectId;
    private String subjectName;
    private String subjectType;
   public static final int MANDATORY_MIN = 3;
   public static final int CHOICE_MIN = 2;

    public Subject(String seq, String subjectName, String subjectType) {
        this.subjectId = seq;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
    }

    public static void addSubjects(Student student, String subjectType, int minNum){
        boolean subjectAddFlag;
        HashMap<String, Subject> subjectMap;
    }

    // Getter
    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectType() {
        return subjectType;
    }

}
