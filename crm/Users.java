import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private boolean isOnline;
    private List<Lead> assignedLeads;
    // Initialize the User class
    public User(String name, boolean isOnline) {
        this.name = name;
        this.isOnline = isOnline;
        this.assignedLeads = new ArrayList<>();
    }
    // Return the username
    public String getName() {
        return name;
    }
    // Return if the user is online
    public boolean isOnline() {
        return isOnline;
    }
    // Set online status
    public void setOnline(boolean online) {
        isOnline = online;
    }
    // Return the lead of the user
    public List<Lead> getAssignedLeads() {
        return assignedLeads;
    }
    // Add Lead to the user
    public void addAssignedLead(Lead lead) {
        this.assignedLeads.add(lead);
    }
}