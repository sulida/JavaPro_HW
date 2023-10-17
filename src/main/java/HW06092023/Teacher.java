package HW06092023;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Teacher extends Person {
        private Grade teacherGrade;
    private Map<Student, Grade> studentGrades = new HashMap<>();

    public Teacher(String name, int age) {
        super(name, age);
        this.teacherGrade = teacherGrade;
    }

    public void gradeStudent(Student student) {
        Random rand = new Random();
        int randomGrade = rand.nextInt(Grade.values().length);
        Grade randomStudentGrade = Grade.values()[randomGrade];
        studentGrades.put(student, randomStudentGrade);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Teacher: " + name + ", Age: " + age +  "\n");
        description.append("Student Grades:\n");
        for (Map.Entry<Student, Grade> entry : studentGrades.entrySet()) {
            description.append(entry.getKey().getName()).append(": ").append(entry.getValue()).append("\n");
        }
        return description.toString();
    }
    }


