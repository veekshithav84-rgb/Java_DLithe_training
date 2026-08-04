package interfaces;

        interface Nsam{
            void cse_dept();
            void com_Dept();
            void math_dept();
            void languages();
        }
        class Student implements  Nsam{


            @Override
            public void cse_dept() {
                System.out.println("Student from cse department");
            }

            @Override
            public void com_Dept() {
                System.out.println("Student from commerce department");
            }

            @Override
            public void math_dept() {
                System.out.println("Student from math department");
            }

            @Override
            public void languages() {
                System.out.println("Student from language department");
            }
        }
        public class Sample{
            public static void main(String[] args) {
                Student s=new Student();
                s.cse_dept();
                s.com_Dept();
                s.math_dept();
                s.languages();
            }
        }
