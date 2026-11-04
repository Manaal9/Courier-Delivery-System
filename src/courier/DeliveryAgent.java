package courier;

public class DeliveryAgent {

    private int agentId;
    private String name;
    private String mobile;
    private String assignedArea;
    private boolean available;

    public DeliveryAgent(int agentId, String name,
                         String mobile,
                         String assignedArea,
                         boolean available) {

        this.agentId = agentId;
        this.name = name;
        this.mobile = mobile;
        this.assignedArea = assignedArea;
        this.available = available;
    }

    // Getters
    public int getAgentId() {
        return agentId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAssignedArea() {
        return assignedArea;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAssignedArea(String assignedArea) {
        this.assignedArea = assignedArea;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display agent details
    public void displayAgent() {
        System.out.println("Agent ID: " + agentId);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Assigned Area: " + assignedArea);
        System.out.println("Available: " + available);
    }
}