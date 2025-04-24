// package casting;

// import java.util.ArrayList;

// abstract class GymMember {

//     String name;

//     public GymMember(String name) {
//         this.name = name;
//     }

//     public void allowEntery() {
//         System.out.println(this.name + " Gym ma entry garyo.");
//     }
// }

// class RegularMember extends GymMember {

//     public RegularMember(String name) {
//         super(name);
//     }

//     public void onlyRegularMember() {
//         System.out.println(name + " Regular member ko lagi 5% discount chha with free paani ko bottle.");
//     }
// }

// class PremiumMember extends GymMember {

//     public PremiumMember(String name) {
//         super(name);
//     }

//     public void onlyPremiumMember() {
//         System.out.println(name + " Premium member ko lagi 10% discount chha with protein shake.");
//     }
// }

// public class Example {

//     public static void main(String[] args) {
//         ArrayList<GymMember> members = new ArrayList<>();
//         members.add(new RegularMember("Susant"));
//         members.add(new PremiumMember("Yuras"));

//         for (GymMember member : members) {
//             member.allowEntery();

//             if (member instanceof RegularMember) {
//                 RegularMember rg = (RegularMember) member;
//                 rg.onlyRegularMember();

//             } else if (member instanceof PremiumMember) {
//                 PremiumMember pm = (PremiumMember) member;
//                 pm.onlyPremiumMember();
//             }

//         }

//     }
// }
