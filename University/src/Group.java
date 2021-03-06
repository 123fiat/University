import java.util.ArrayList;
import java.util.Arrays;

public class Group {
	/*Создайте класс Address, который содержит поля: город, улица, дом, квартира.
	 Создайте классы Teacher и Student,  которые содержит поля: имя, фамилия, возраст, адрес типа Address. 
	  Класс Teacher должен содержать метод расчеты заработной платы за месяц.
	  Cоздайте класс группа, который хранит в себе название группы, курс, одного ученика, преподавателя - куратора (Teacher).
	  Необходимо создать группу, с методом изменения ученика в группе, с возможностью изменения куратора, 
	  у которого должна быть возможность изменить его заработную плату.
	  -	добавить методы удаления ученика из группы и добавления в группу
// размерность массива учеников в группе задается через конструктор
1. найти нужного ученика в массиве (с помощью перебора - цикла)
2. удалить это значение из массива (присвоить ему null)
3. уменьшить массив на 1 элемент (создать новый массив с размерностью меньшей на 1, перезаписать значения из старого массива в новый)
4. присвоить переменной с массивом учеников новый массив*/

    private String tytle;
    private int course;
    // private Student[] students;
    private int yearStartStuding;
    private int yearFinishStuding;
    ArrayList<Student> students;
    private Teacher teacher;

    public Group(String tytle, int course, int yearStartStuding, int yearFinishStuding, ArrayList<Student> students, Teacher teacher) {
        this.tytle = "group1";
        this.course = 1;
        this.yearStartStuding = yearStartStuding;
        this.yearFinishStuding = yearFinishStuding;
        this.students = students;
        this.teacher = teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return this.tytle + "\n" + this.course + "\n" + this.yearStartStuding + "\n" + this.yearFinishStuding + "\n" + Arrays.toString(students.toArray()) + "\n" + this.teacher.toString();
    }

    ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void deleteStudent(Student delStudent) {
        students.remove(delStudent);
    }

    public void addStudent(Student addStudent) {
        students.add(addStudent);
    }

    public int getYearStartStuding() {
        return yearStartStuding;
    }

    public void setYearStartStuding(int yearStartStuding) {
        this.yearStartStuding = yearStartStuding;
    }

    public int getYearFinishStuding() {
        return yearFinishStuding;
    }

    public void setYearFinishStuding(int yearFinishStuding) {
        this.yearFinishStuding = yearFinishStuding;
    }
}
    /* public void deleteStudent(Student delStudent) {
         Student[] students1 = new Student[students.length - 1];
         for (int i = 0; i < students.length; i++) {
             if (students[i] == delStudent) ;
             students[i] = null;
             for (int y = i; y < students.length - 1; y++) {
                 students[y] = students[y+1];
             }
         }
                 for (int i = 0; i < students1.length; i++) {
                     students1[i] = students[i];
         }
         students = students1;
     }*/

       /*for (int i = 0; i < students.size(); i++) {
       if (students.get(i)== delStudent){
           students.remove(delStudent);
       }*/

    /* public void addStudent(Student addStudent) {
         Student[] students1 = new Student[students.length + 1];
         for (int i = 0; i < students.length; i++) {
             students1[i] = students[i];
             students1[students.length] = addStudent;
         }
         this.students = students1;
     }
     */
