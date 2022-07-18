
class CodeChallenge1_DrawWithForLoop_ExtraComments {
    public static void main(String[] args) {

    /*

    ************
    ************
    ************
    ************
    ************

    Print this box shape using a for loop.
    Remember \n means next line.
    */

        // Less code, storing a string requires less memory

        String iLoveYou = "************\r"; // start variables with lower case -The word "i" starts with an uppercase if it's only the letter "i"

        System.out.println("\n");

        for (int counter = 0; counter < 5; counter++) {

            System.out.println(iLoveYou); // no nxseed to break out of loop, use counter
        }

    /*

    String[] ILoveYou = { "************", "************", "************", "************", "************" };

    for (String L : ILoveYou) {
      System.out.println("\n");
      System.out.println("************");
      System.out.println("************");
      System.out.println("************");
      System.out.println("************");
      System.out.println("************");

      break;
    }
    */
    }
}