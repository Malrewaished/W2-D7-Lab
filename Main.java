public class Main {

    public static void main(String[] args) {
        MyTime myTime1 = new MyTime(23, 59, 59);
        MyTime myTime2 = new MyTime(23, 59, 59);
        System.out.println(myTime1);
        myTime1.nextHour();
        System.out.println(myTime1);
        myTime1.nextMinute();
        System.out.println(myTime1);
        myTime1.nextSecond();
        System.out.println(myTime1);
        System.out.println("-----------");

        System.out.println(myTime1);
        myTime1.previousHour();
        System.out.println(myTime1);
        myTime1.previousMinute();
        System.out.println(myTime1);
        myTime1.previousSecond();
        System.out.println(myTime1);
    }


}
