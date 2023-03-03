public class TimeV2 {

    private int time; 

    public TimeV2 (int theHours, int theMinutes, int theSeconds){
        time = (theHours*3600) + (theMinutes*60) + theSeconds;
    }

    public int getHours(){
        return time/3600;
    }

    public int getMinutes(){
        return (time%3600)/60;
    }

    public int getSeconds(){
        return ((time%3600)%60)%60;
    }

    public String toString(){
        String result = "";
        if (getHours() < 10){
            result += "0" + getHours() + ":";
        }else{
            result += getHours() + ":";
        }
        if (getMinutes() < 10){
            result += "0" + getMinutes() + ":";
        }else{
            result += getMinutes() + ":";
        }
        if (getSeconds() < 10){
            result += "0" + getSeconds();
        }else{
            result += getSeconds();
        }
        return result;

    } 


    public static void main(String[] args) {
        TimeV2 t1 = new TimeV2(0,0,325325);
        TimeV2 t2 = new TimeV2(0,0,21321);

        System.out.println(t1);
        System.out.println(t2);

    }
}
