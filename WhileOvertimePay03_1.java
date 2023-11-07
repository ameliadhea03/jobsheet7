import java.util.Scanner;
public class WhileOvertimePay03_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployee, overtimeHours;
        double overtimePay = 0, totalOvertimepay = 0;
        String position;

        System.out.print ("Employee number = ");
        numEmployee = input.nextInt();

        int i = 0;

        while (i < numEmployee) {
            System.out.print("Position of employee "+(i+1)+" (director, manager, staff) = ");
            position = input.next();
            System.out.print("Employee "+(i+1)+" overtime hours = ");
            overtimeHours = input.nextInt();
            i++;

            if (position.equalsIgnoreCase("director")) {
                continue;
            }else if (position.equalsIgnoreCase("manager")) {
                overtimePay = overtimeHours * 100000;
            }else if (position.equalsIgnoreCase("staff")) {
                overtimePay = overtimeHours * 75000;
            }else {
                System.out.println("Invalid Position!");
                i--;
                overtimePay = totalOvertimepay * 0;
            }

            totalOvertimepay+= overtimePay;
        }
        System.out.println("Total of Overtime Pay = " + totalOvertimepay);

    }

}