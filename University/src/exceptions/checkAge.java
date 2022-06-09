package exceptions;

public class checkAge {
    public static void studentYoungAgeCheck (int age) throws TooYoungAge {
        if(age<16){
            throw new TooYoungAge("Student's age is too young");
        }
    }
    public static void teacherYoungAgeCheck (int age) throws TooYoungAge {
        if(age<25){
            throw new TooYoungAge("teacher's age is too young");
        }
    }
    public static void oldAgeCheck(int age) throws TooOldAge {
        if(age>80){
            throw new TooOldAge("Age is too old");
        }
    }
}
