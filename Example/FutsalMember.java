package Example;

public abstract class FutsalMember {

    protected String name;
    protected String id;
    protected String phoneNumber;
    protected boolean activeStatus;
    protected int attendance;

    public FutsalMember(String name, String id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.activeStatus = false;
        this.attendance = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return activeStatus;
    }

    public abstract void markAttendance();

    public void activeMemberShip() {
        if (!this.activeStatus) {
            this.activeStatus = true;
            System.out.println(name + "'s membership is now active.");
        } else {
            System.out.println(name + "'s membership is already active.");
        }
    }

    public void deactivateMembership() {
        if (activeStatus) {
            activeStatus = false;
            System.out.println(name + "'s membership is now inactive.");
        } else {
            System.out.println(name + "'s membership is already inactive.");
        }
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public void Example(){
        System.out.println("Example print");
    }

}
