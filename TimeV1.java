public class TimeV1 {

    private int hours;
    private int minutes;
    private int seconds; 

    public TimeV1 (int theHours, int theMinutes, int theSeconds){
        hours = theHours;
        minutes = theMinutes;
        seconds = theSeconds;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public String toString(){
        String result = "";
        hours += 12;
        if (hours > 24){
            hours %= 24;
        }

        if (hours < 10){
            result += "0" + hours + ":";
        }else{
            result += hours + ":";
        }
        if (minutes < 10){
            result += "0" + minutes + ":";
        }else{
            result += minutes + ":";
        }
        if (seconds < 10){
            result += "0" + seconds;
        }else{
            result += seconds;
        }
        return result;

    } 


    public static void main(String[] args) {
        TimeV1 t1 = new TimeV1(13,9,8);
        System.out.println(t1);
    }
}
// good