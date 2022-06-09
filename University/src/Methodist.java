import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

//Напишите реализацию функционального интерфейса в вашем проекте,
// с помощью которого можно будет преобразовать любого педагога в методиста.
// Введите новую сущность “Методист”, которая будет является сотрудником и иметь
// в своём подчинении список преподавателей.
public class Methodist extends People {

    ArrayList<Teacher> teachers;

    public Methodist(String name, String surname, int age, String gender, Address address, ArrayList<Teacher> teachers) {
        super(name, surname, age, gender, address);
        this.teachers = teachers;
    }

    @Override
    public String getname() {
        return super.getname();
    }

    @Override
    public String getsurname() {
        return super.getsurname();
    }

    @Override
    public int getage() {
        return super.getage();
    }

    @Override
    public Address getaddress() {
        return super.getaddress();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    //Function<T,R> - этот функциональный интерфейс
// принимает аргумент T и приводит его к объекту типа R,
// который и возвращается как результат
    public static Methodist converter1(Teacher teacher, ArrayList<Teacher> teachers) {
        Function<Teacher, Methodist> converter = Teacher -> new Methodist(Teacher.getname(), Teacher.getsurname(), Teacher.getage(), Teacher.getGender(), Teacher.getaddress(), teachers);
        return converter.apply(teacher);
    }

    @Override
    public String toString() {
        return super.getname() + " " + super.getsurname() + " " + super.getage() + " " + super.getGender() + " " + super.getaddress() + " " + Arrays.toString(teachers.toArray());
    }
}