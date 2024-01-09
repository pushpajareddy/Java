import java.util.*;
class Pushpa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Entry date: "+day+"/"+month+"/"+year);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
