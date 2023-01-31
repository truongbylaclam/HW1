import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AssignLeads {
    private List<Lead> leads;
    private List<User> users;
    // AssignLeads class initialization
    public AssignLeads() {
        this.leads = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Assign lead to each Users
    public void assignLeads() {

        for (Lead lead : leads) {
            if (lead.getAssignedUser() == null) {
                for (User user : users) {
                    if (user.isOnline() && user.getAssignedLeads().size() < 1) {
                        lead.setAssignedUser(user);
                        user.addAssignedLead(lead);
                        break;
                    }
                }
            }
        }
    }

    // Display the lead along with their user
    public void displayLeads() {

        System.out.println("Name\t\tCountry\t\tEmail\t\tAssigned User");
        System.out.println("-----------------------------------------------------------------");
        // Using catch try block to catch exception
        try {
            for (Lead lead : leads) {
                String assignedUser = lead.getAssignedUser() != null ? lead.getAssignedUser().getName() : "Not assigned";
                System.out.println(lead.getName() + "\t\t" + lead.getCountry() + "\t\t" + lead.getEmail() + "\t\t" + lead.getAssignedUser().getName());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Function to  add user to the memory
    public void addUser() {
        Scanner userData = new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String username = userData.nextLine();
        System.out.println("Is the user online");
        String online = userData.nextLine();
        boolean onlineStatus = false;
        if (online.equals("true") || online.equals("yes"))
        {
            onlineStatus = true;
        }
        User newUser = new User(username, onlineStatus);
        this.users.add(newUser);
    }

    // Add lead to the memory
    public void addLead() {
        Scanner leadData = new Scanner(System.in);
        String name, email, country;
        System.out.println("Enter the lead name: ");
        name = leadData.nextLine();
        System.out.println("Enter the lead email: ");
        email = leadData.nextLine();
        System.out.println("Plase enter the lead country: ");
        country = leadData.nextLine();
        Lead newLead = new Lead(name, email, country);
        this.leads.add(newLead);
    }


}