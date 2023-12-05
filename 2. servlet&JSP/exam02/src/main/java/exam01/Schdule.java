package exam01;

public class Schdule {
    private int year;
    private int month;
    private int day;
//art + insert 를 누르면 겟터셋터 : 정보은닉과 캡슐화를 위해 사용


    @Override
    public String toString() {
        return "Schdule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    void showDate(){
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if (day > 28) day = 28;

        this.day = day;
    }

}
