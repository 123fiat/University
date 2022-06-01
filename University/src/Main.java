import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        Address addressStudentMisha = new Address("Minsk", "lenina", 45, 16);
        Address addressStudentJack = new Address("Minsk", "Mira", 15, 88);
        Address addressStudentKolia = new Address("Mogilev", "Gaia", 16, 22);
        Address addressTeacher1 = new Address("Minsk", "Gogolia", 25, 25);
        Address addressTeacher2 = new Address("Mogilev", "Minskaya", 10, 17);

        Student StudentMisha = new Student("Misha", "Ivanov", 18, addressStudentMisha);
        Student StudentKolia = new Student("Kolia", "Sidorov", 23, addressStudentKolia);
        Student StudentJack = new Student("Jack", "Petrov", 19, addressStudentJack);

        //  System.out.println(StudentMisha);
        //  System.out.println(StudentJack);

        Teacher Teacher1 = new Teacher("Sergei", "Sergeev", 40, addressTeacher1);
        Teacher Teacher2 = new Teacher("Vassily", "Vasiliev", 50, addressTeacher2);

        //System.out.println(Teacher1);
        //   System.out.println(Teacher2);

        // Student[] students1 = new Student[]{StudentMisha, StudentJack, StudentKolia};
        ArrayList<Student> students = new ArrayList<>() {{
            add(StudentJack);
            add(StudentKolia);
            add(StudentMisha);
        }};
        Group group = new Group("group1", 1, students, Teacher2);

        System.out.println(group);

    group.deleteStudent(StudentMisha);
    System.out.println(group);
        group.addStudent(StudentMisha);
        System.out.println(group);
//        group.mass(students1);
//        Student[] studenti = group.getStudents();
//        group.mass(studenti);
//        System.out.println(Teacher1.getoklad());
//        System.out.println(Teacher1.getoplataMonth());
//        Teacher1.setoklad(119);
//        System.out.println(Teacher1.getoklad());
//        System.out.println(Teacher1.getoplataMonth());
//
//        System.out.println(group);
//        addressTeacher2.setcity("Vitebsk");
//        System.out.println(group);
    }
}