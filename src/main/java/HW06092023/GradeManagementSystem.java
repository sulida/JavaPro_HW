package HW06092023;

class GradeManagementSystem {
    private Student[] students;
    private Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void processStudents() {
        for (Student student : students) {
            System.out.println(student.getDescription());
        }
    }

    public void processTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getDescription());
        }
    }

    public void gradeStudents() {
        for (Teacher teacher : teachers) {
            for (Student student : students) {
                teacher.gradeStudent(student);
            }
        }
    }
}