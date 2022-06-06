import exceptions.TooOldAge;
import exceptions.TooYoungAge;

import static exceptions.checkAge.*;

public class Teacher extends People {

    private double oklad = 100;
    private double premia = 0.3;

    public Teacher(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    public void setoklad(double oklad) {
        if (oklad > 80 && oklad < 120)
            this.oklad = oklad;
    }

    double getoklad() {
        return oklad;
    }

    public void setpremia(double premia) {
        if (premia > 0.1 && premia < 0.4)
            this.premia = premia;
    }

    double getpremia() {
        return premia;
    }

    protected double oplataMonth() {
        double oplataMonth = oklad + oklad * premia;
        return oplataMonth;
    }

    double getoplataMonth() {
        return oplataMonth();

    }

    @Override
    public void setAge(int age) {
        try {
            teacherYoungAgeCheck(age);
            oldAgeCheck(age);
            super.setAge(age);
        } catch (TooOldAge | TooYoungAge e) {
            e.printStackTrace();//пишет где ошибка
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return super.getname() + " " + super.getsurname() + " " + super.getage() + " " + super.getaddress() + " " + this.oplataMonth();
    }
}