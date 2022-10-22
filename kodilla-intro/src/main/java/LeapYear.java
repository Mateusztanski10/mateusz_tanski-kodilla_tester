public class LeapYear {
    public static void main(String[] args) {
        int year =2000;
        if (year % 4 != 0){
            System.out.println("Not a leap year");
        }
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("Leap year");
        }
        if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
            System.out.println("Not a leap year");
        }
    }
}
