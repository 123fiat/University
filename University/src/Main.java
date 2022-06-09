import java.util.ArrayList;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {


        Address addressStudentMisha = new Address("Minsk", "lenina", 45, 16);
        Address addressStudentJack = new Address("Minsk", "Mira", 15, 88);
        Address addressStudentKolia = new Address("Mogilev", "Gaia", 16, 22);
        Address addressTeacher1 = new Address("Minsk", "Gogolia", 25, 25);
        Address addressTeacher2 = new Address("Mogilev", "Minskaya", 10, 17);
        Address addressMethodist = new Address("Minsk", "Minskaya", 15, 15);
        Student StudentMisha = new Student("Misha", "Ivanov", 18, "young", addressStudentMisha);
        Student StudentKolia = new Student("Kolia", "Sidorov", 23, "young", addressStudentKolia);
        Student StudentJack = new Student("Jack", "Petrov", 19, "young", addressStudentJack);

        Teacher Teacher1 = new Teacher("Sergei", "Sergeev", 40, "retired", addressTeacher1);
        Teacher Teacher2 = new Teacher("Vassily", "Vasiliev", 50, "young", addressTeacher2);
        Teacher1.setoklad(119);
        Teacher2.setoklad(118);
        Teacher1.setpremia(0.15);
        Teacher2.setpremia(0.2);
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(Teacher1);
        teachers.add(Teacher2);

        teachers.stream()
                .forEach(System.out::println);
        teachers.stream()
                .filter(x -> x.getGender() == "retired")
                .forEach(System.out::println);
        teachers.stream()
                .filter(x -> x.getoplataMonth() >= 140)
                .forEach(System.out::println);

        Methodist methodist1 = Methodist.converter1(Teacher1, teachers);

        System.out.println(methodist1);

        Student[] students1 = new Student[]{StudentMisha, StudentJack, StudentKolia};
        ArrayList<Student> students = new ArrayList<>() {{
            add(StudentJack);
            add(StudentKolia);
            add(StudentMisha);
        }};
        Group group1 = new Group("group1", 1, 2018, 2023, students, Teacher2);
        Group group2 = new Group("group1", 1, 2022, 2027, students, Teacher2);
        ArrayList<Group> groups = new ArrayList<>() {{
            add(group1);
            add(group2);
        }};
        groups.stream()
                .filter(x -> x.getYearStartStuding() >= 2018 && x.getYearStartStuding() <= 2020)
                .forEach(System.out::println);
        teachers.stream()
                .sorted(Comparator.comparing(Teacher::getsurname))
                .forEach(System.out::println);
//
//        System.out.println(group);
//
//    group.deleteStudent(StudentMisha);
//    System.out.println(group);
//        group.addStudent(StudentMisha);
//        System.out.println(group);
//        StudentJack.setAge(15);
//        Teacher2.setAge(19);
//        System.out.println(StudentJack.getage());
//

////        group.mass(students1);
////        Student[] studenti = group.getStudents();
////        group.mass(studenti);
////        System.out.println(Teacher1.getoklad());
////        System.out.println(Teacher1.getoplataMonth());
////        Teacher1.setoklad(119);
////        System.out.println(Teacher1.getoklad());
////        System.out.println(Teacher1.getoplataMonth());
////
////        System.out.println(group);
////        addressTeacher2.setcity("Vitebsk");
////        System.out.println(group);
    }
}