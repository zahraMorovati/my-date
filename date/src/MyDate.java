public class MyDate {

    private int day, month, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValidDate(int year, int month, int day) {

        if (year < 9999 && year >= 1) {
            if (month <= 12 && month >= 1) {
                if (day <= getMonthLastDay(month) && day >= 1)
                    return true;
            }
        }
        return false;
    }

    public int getMonthLastDay(int month) {

        for (MonthName name : MonthName.values()) {
            if (name.monthNumber == month) {
                return name.monthLastDay;
            }
        }
        return -1;
    }

    public MonthName getMonthName(int month) {

        for (MonthName name : MonthName.values()) {
            if (name.monthNumber == month) {
                return name;
            }
        }
        return null;
    }

    public void nextDay() {
        if (day == getMonthLastDay(month)) {
            if (month == 12) {
                setDay(1);
                setMonth(1);
                setYear(year + 1);
            } else {
                setDay(1);
                setMonth(month + 1);
            }

        } else {
            setDay(day + 1);
        }

    }

    public String toString() {
        String day = Integer.toString(this.day);
        String year = Integer.toString(this.year);
        MonthName month = getMonthName(this.month);


        return day + " " + month + " " + year;

    }

}
