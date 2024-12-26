import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        System.out.println("Input an hour: ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if (hour >= 9 && hour < 22) {
            System.out.println("It's open!");
        } else if (hour > 24 || hour < 0) {
            System.out.println("Error");
        }
        else {
            System.out.println("It's closed!");
        }
    }
}