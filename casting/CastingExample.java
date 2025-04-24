package casting;

//implicit casting also known as widening type casting 
//explict casting also known as narrowing type casting
//implicit casting: byte -> short -> int -> long -> float -> double
//explicit casting: double -> float -> long -> int -> short -> byte
//byte - 1byte - 8 bit
//short - 2
//int - 4
//long - 8
//float - 4
//double - 8
public class CastingExample {

    public static void main(String[] args) {
        byte b = 100;
        int i = b;
        byte c = (byte) (i + 200);
        System.out.println(c);

    }
}
