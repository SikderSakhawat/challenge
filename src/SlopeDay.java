public class SlopeDay {
    private int hours;
    private int minutes;
    private int seconds;
    private int days;

    public SlopeDay(int seconds){
        this.seconds = seconds;
        this.minutes = seconds / 60;
        this.hours = seconds / 3600;
        this.days = seconds / 86400;
    }

    public void displayTimer(){
        if(days > 0) System.out.println(days + " days " + hours % 24 + " hours " + minutes % 60 + " minutes " + seconds % 60 + " seconds");
        else if (hours > 0) System.out.println(hours % 24 + " hours " + minutes % 60 + " minutes " + seconds % 60 + " seconds");
        else if (minutes > 0) System.out.println(minutes % 60 + " minutes " + seconds % 60 + " seconds");
        else if (seconds > 0) System.out.println(seconds % 60 + " seconds");
        else System.out.println("NOW");
    }
}
