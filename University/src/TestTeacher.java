import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestTeacher {
    Address addressTeacher1;
    Address addressStudentMisha;
    Address addressStudentJack;
    Address addressStudentKolia;
    Student StudentKolia;
    Student StudentMisha;
    Student StudentJack;
    Teacher Teacher1;
    ArrayList<Student> students;
    Group group1;

    @Before
    public void setUp() throws Exception {
       addressTeacher1 = new Address("Minsk", "Gogolia", 25, 25);
         addressStudentMisha = new Address("Minsk", "lenina", 45, 16);
         addressStudentJack = new Address("Minsk", "Mira", 15, 88);
        addressStudentKolia = new Address("Mogilev", "Gaia", 16, 22);
        StudentMisha = new Student("Misha", "Ivanov", 18, "young", addressStudentMisha);
        StudentKolia = new Student("Kolia", "Sidorov", 23, "young", addressStudentKolia);
        StudentJack = new Student("Jack", "Petrov", 19, "young", addressStudentJack);
        Teacher1 = new Teacher("Sergei", "Sergeev", 40, "retired", addressTeacher1, 130);
        students = new ArrayList<>() {{
            add(StudentJack);
            add(StudentKolia);
        }};
        group1 = new Group("group1", 1, 2011,2015, students, Teacher1);
    }


    @Test
    public void oplataMonth() {
        Teacher1.setoklad(118);
        Teacher1.setpremia(0.2);
        Teacher1.oplataMonth();
        Assert.assertNotEquals(141.6, Teacher1.getoplataMonth());
    }


    @Test
    public void addStudent() {
        group1.addStudent(StudentMisha);
        Assert.assertNotNull(students.get(students.size() - 1));
        Assert.assertEquals(3, group1.students.size());
        Assert.assertEquals("Kolia", group1.students.get(2).getname());
    }
    @Test
    public void dellStudent() {
        group1.deleteStudent(StudentKolia);
        Assert.assertNotNull(students.get(students.size() - 1));
        Assert.assertEquals(1, group1.students.size());
        Assert.assertEquals("Jack", group1.students.get(0).getname());
    }
    @Test
    public void setAge() {
        StudentKolia.setAge(25);
        StudentKolia.setAge(25);
        StudentKolia.setAge(25);
        Teacher1.setAge(78);
        Assert.assertNotNull(StudentMisha.getage());
        Assert.assertNotNull(StudentKolia.getage());
        Assert.assertNotNull(StudentJack.getage());
        Assert.assertNotNull(Teacher1.getage());
        Assert.assertEquals(78, Teacher1.getage());
    }
    @After
    public void tearDown() throws Exception {
    }
}