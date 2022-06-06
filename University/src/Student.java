import exceptions.TooOldAge;
import exceptions.TooYoungAge;

import static exceptions.checkAge.oldAgeCheck;
import static exceptions.checkAge.studentYoungAgeCheck;

public class Student extends People {
    /*Создайте класс Address, который содержит поля: город, улица, дом, квартира.
     Создайте классы Teacher и Student,  которые содержит поля: имя, фамилия, возраст, адрес типа Address.
      Класс Teacher должен содержать метод расчеты заработной платы за месяц.
      Cоздайте класс группа, который хранит в себе название группы, курс, одного ученика, преподавателя - куратора (Teacher).
      Необходимо создать группу, с методом изменения ученика в группе, с возможностью изменения куратора,
      у которого должна быть возможность изменить его заработную плату.*/
    public Student(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    @Override
    public void setAge(int age) {
        try {
            studentYoungAgeCheck(age);
            oldAgeCheck(age);
            super.setAge(age);
        } catch (TooOldAge | TooYoungAge e) {
			e.printStackTrace();//пишет где ошибка
			System.out.println(e.getMessage());
        }
    }


    @Override
    public String toString() {
        return super.getname() + " " + super.getsurname() + " " + super.getage() + " " + super.getaddress();
    }
}