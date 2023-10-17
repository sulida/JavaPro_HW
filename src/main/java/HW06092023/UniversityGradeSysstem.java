package HW06092023;

class UniversityGradeSystem {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Student1", 20),
                new Student("Student2", 22),
                new Student("Student3", 21)
        };

        Teacher[] teachers = {
                new Teacher("Teacher1", 35),
                new Teacher("Teacher2", 40)
        };

        GradeManagementSystem system = new GradeManagementSystem(students, teachers);
        system.gradeStudents();
        system.processStudents();
        system.processTeachers();
//        system.gradeStudents();
//        system.processStudents();
    }
}