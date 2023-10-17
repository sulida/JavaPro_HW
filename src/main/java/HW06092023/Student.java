package HW06092023;


    class Student extends Person implements Graded {
        private Grade grade;

        public Student(String name, int age) {
            super(name, age);
            this.grade = grade;
        }



        @Override
        public Grade getGrade() {
            return grade;
        }

//        @Override
//        public Grade setGrade() {
//            return grade;
//        }


        public void setGrade(Grade grade) {
            this.grade = grade;
        }

        //        public void setGrade(Grade grade) {
//            this.grade = grade;
//        }
        @Override
        public String getDescription() {
            return "Student: " + name + ", Age: " + age;
        }

        public String getName() {
            return name;
        }
    }


