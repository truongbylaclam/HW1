import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new AssignLead class
        AssignLeads leadList = new AssignLeads();
        // A Loop for inputting user and lead as well as assign user to the lead and display
        boolean cont = true;
        while (cont) {
            System.out.println("Program to assign leads to users");
            System.out.println("0. Quit");
            System.out.println("1. Add a lead");
            System.out.println("2. Add an user");
            System.out.println("3. Assign lead");
            System.out.println("4. Display lead");
            System.out.println("Please choose a cmd (0-4): ");
            Scanner obj = new Scanner(System.in);
            int selection = obj.nextInt();
            switch (selection) {
                case 1:
                    leadList.addLead();
                    break;
                case 2:
                    leadList.addUser();
                    break;
                case 3:
                    leadList.assignLeads();
                    break;
                case 4:
                    leadList.displayLeads();
                    break;
                case 0:
                    cont = false;
                default:
                    break;
            }


        }
    }
}