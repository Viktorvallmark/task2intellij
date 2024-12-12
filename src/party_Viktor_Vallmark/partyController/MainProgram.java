package party_Viktor_Vallmark.partyController;

import java.util.Scanner;

/* Author: Viktor Vallmark
 * Computer id: aq2560
 * Program: Datateknik
 * *
 * */
public class MainProgram {

    public static void main(String[] args) {
        // default value to make compilations
        // possible.
        /*
         * Write code to read the number of guests to start with from the user by
         * using one of
         * - JOptionPane
         * - Scanner and prompt
         */
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        int num = Integer.parseInt(scan.next());
        Controller controller = new Controller(num);
        scan.close();
    }
}
