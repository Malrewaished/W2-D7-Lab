public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime() {

}
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second) {
        if(hour >= 0 && hour <=23 ) {
            setHour(hour);
        }
        if (minute >= 0 && minute <= 59){
            setMinute(minute);
        }
        if (second >= 0 && second <= 59){
            setSecond(second);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String leadingHour = String.format("%02d", hour);
        String leadingMinute = String.format("%02d", minute);
        String leadingSecond = String.format("%02d", second);
        return leadingHour+":"+leadingMinute+":"+leadingSecond;
    }

    public MyTime nextSecond(){
        if (second==59) {
            this.second = 0;
            nextMinute();
        } else {
            this.second++;
        }
        return this;
    }
    public MyTime nextMinute(){
        if (minute==59) {
            this.minute = 0;
            this.second = 0;
            nextHour();
        } else {
            this.minute++;
        }
        return this;
    }
    public MyTime nextHour(){
        if (hour==23) {
            setTime(0,0,0);
        } else {
            this.hour++;
        }
        return this;
    }

    public MyTime previousSecond(){
        if (second==0) {
            this.second = 0;
            previousMinute();
        } else {
            this.second--;
        }
        return this;
    }
    public MyTime previousMinute(){
        if (minute==0) {
            previousHour();
        } else {
            this.minute--;
        }
        return this;
    }
    public MyTime previousHour(){
        if (hour==0) {
            this.hour=23;
        } else {
            this.hour--;
        }
        return this;
    }

}
