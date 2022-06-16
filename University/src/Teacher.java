import exceptions.TooOldAge;
import exceptions.TooYoungAge;

import static exceptions.checkAge.oldAgeCheck;
import static exceptions.checkAge.teacherYoungAgeCheck;

public class Teacher extends People {
    private static double oklad = 100;
    private static double premia = 0.3;
    double oplataMonth;

    public Teacher(String name, String surname, int age, String gender, Address address, double oplataMonth){
        super(name, surname, age, gender, address);
        this.oplataMonth=oplataMonth;
    }

    public void setoklad(double oklad) {
        if (oklad > 80 && oklad < 120)
            this.oklad = oklad;
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

    protected static double oplataMonth() {
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
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return super.getname() + " " + super.getsurname() + " " + super.getage() + " " + super.getaddress() + " " + super.getGender() + " " + this.oplataMonth();
    }
}