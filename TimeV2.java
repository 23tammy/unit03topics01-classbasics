public class TimeV2 {

    private int time; 

    public TimeV2 (int theHours, int theMinutes, int theSeconds){
       
    }

    public int getHours(){
        return time/3600;
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
        TimeV2 t1 = new TimeV2(13,9,8);
        System.out.println(t1);
    }
}
