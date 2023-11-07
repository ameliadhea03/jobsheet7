import java.util.Scanner;
public class DoWhileLeaveEntitlement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;
        System.out.print("Number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("Do you want to take a leave? (y/n) = ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave number: ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("The remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("The remaining leave entitlement is not sufficient!");
                    break;
                }
             }
        } while (leaveEntitlement > 0);

    
    }
}
