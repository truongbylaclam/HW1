class Lead {
    private String name;
    private String email;
    private String country;
    private User assignedUser;
    // Class initialization for lead
    public Lead(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }
    // Getter function for name, email, country and their user
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public User getAssignedUser() {
        return assignedUser;
    }
    // Set user for the lead
    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
}