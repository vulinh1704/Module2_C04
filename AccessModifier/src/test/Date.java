package test;

public class Date {
    protected int day;
    public static int month;


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day <= 0 || day >= 32){
           return;
        } else {
            this.day = day;
        }

    }

}


