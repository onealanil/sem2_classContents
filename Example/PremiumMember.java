package Example;

public class PremiumMember extends FutsalMember {

    private String membershipType;

    public PremiumMember(String name, String id, String phoneNumber) {
        super(name, id, phoneNumber);
        this.membershipType = membershipType;
    }

    @Override
    public void markAttendance() {
        System.out.println("premium member attendance");
        if (isActive()) {
            attendance++;
            System.out.println(name + "'s attendance marked. Total attendance: " + super.getAttendance());
        } else {
            System.out.println(name + " cannot mark attendance - membership is inactive.");
        }
        if (super.getAttendance() == 30) {
            System.out.println("Congratulations! You have completed 30 days of attendance.");
        }
    }

    public String getMembershipType() {
        return membershipType;
    }
}