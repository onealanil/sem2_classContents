package Example;

public class RegualarMember extends FutsalMember {

    private String membershipType;

    public RegualarMember(String name, String id, String phoneNumber) {
        super(name, id, phoneNumber);
        this.membershipType = membershipType;
    }

    @Override
    public void markAttendance() {
        System.out.println("Regular member attendance");
        if (isActive()) {
            attendance++;
            System.out.println(name + "'s attendance marked. Total attendance: " + attendance);
        } else {
            System.out.println(name + " cannot mark attendance - membership is inactive.");
        }
    }

    public String getMembershipType() {
        return membershipType;
    }

   
}
