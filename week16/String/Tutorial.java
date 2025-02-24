public class Tutorial {
    public static void main(String[] args) {

        /***Defining ths Strings ************** */
        String name = "Anil";
        String name1 = new String("Anil");


        /**********breaking string to charArray() */
        char [] name_char_array = name.toCharArray();


        /************Create char array to string ************ */
        char [] name_char = {'A', 'n', 'i', 'l'};
        String name2 = new String(name_char);

        //getClass().getSimpleName() for getting the variable type



        /************************Some important operation of strings ***************************** */
        
        /***********concatenation***************/

        //Using '+' operator
        String firstName = "Anil";
        String lastName = "Bhandari";
        

        String fullName = firstName + lastName;  
        // System.out.println(fullName);

        //Using concat() method
        String firstName1 = "Samkisha";
        firstName1 = firstName1.concat(" Adhikari");
        // System.out.println(firstName1);

        /***********String comparision***************
        //using '==' operator


        //using equals() method

        //using equalsIgnoreCase() method

        //using compareTo() method


        /**************Substring in java *************** */
        //using substring() method

        //using substring() method with two parameters


        /**************String length in java *************** */
        //using length() method

        //charAt() method


        /**************String toLowerCase() and toUpperCase() in java *************** */


        /**************String trim() in java *************** */


        /**************String replace() in java *************** */
        String rep = "abbabbacc";

        //index: 4

        String rep1 = rep.replace('a', 'b');
        // System.out.println(rep1);
        int indexOfb = rep.indexOf('b', 3);
        String rep2 = rep.substring(0, indexOfb);
        String rep3 = rep.substring(indexOfb+1);
        String all = rep2 + "a" + rep3;
        System.out.println(all);



        /**************String split() in java *************** */
        String sp = "Anil Bhandari";
        String [] sp1 = sp.split(" ");
        

        /***************indexOf() method */
   

        /*******************contains() method */

        /******************* getChars()  */
        String name3 = "Anilbhandari";
        char [] name3_char = new char[6];
        name3.getChars(0, 5, name3_char, 0);
        // System.out.println(name3_char);

        //getChars will copy the characters from the string to the char array.
        //parameters accepts the starting index, ending index, char array, and starting index of char array.


        //********************breaking strings to char ******************** */
        //using toCharArray() method

    }
}
