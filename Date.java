public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int theMonth, int theDay, int theYear){
        month = theMonth;
        day = theDay;
        year = theYear;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        String result = ""; //fix
        if (month < 10){
            result += "0" + month + "/";
        }else{
            result += month + "/";
        }
        if (day < 10){
            result += "0" + day + "/";
        }else{
            result += day + "/";
        }
        if (year < 1000){
            result += "0" + year;
        }else if (year < 100){
            result += "00" + year;
        }else if (year < 10){
            result += "000" + year;
        }else{
            result += year;
        }
        return result;
    }
    public static void main(String[] args) {
        Date d1 = new Date(2, 1, 198);
        System.out.println(d1);
    }
}

// good work