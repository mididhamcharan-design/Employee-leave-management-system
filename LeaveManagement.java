import java.util.Scanner;

public class LeaveManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Employee name: ");
        String name = input.nextLine();

        System.out.print("Days requested: ");
        int days = input.nextInt();

        System.out.print("Approve leave? (yes/no): ");
        String answer = input.next();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println(days + " days of leave approved for " + name + ".");
        } else {
            System.out.println("Leave request rejected for " + name + ".");
        }

        input.close();
    }
}