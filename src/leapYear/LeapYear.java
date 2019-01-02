package leapYear;

public class LeapYear {

    public boolean check(int year) {
        return year % 100 != 0 && year % 4 == 0;
    }
}
