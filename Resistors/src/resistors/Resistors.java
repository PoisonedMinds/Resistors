

package resistors;
import javax.swing.*;
/**
 * @title Resistors
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-Feb-2015 12:29:51 PM
 * @purpose The purpose of this program is to
 */
public class Resistors {

    public static void main(String[] args) {
       String resistors, colours[]=new String[3];
       int one,two,three;
       resistors=JOptionPane.showInputDialog("Input a combonation of 3 colours to find their equivlent resistance. Ex. Red-Blue-Black");
       colours=resistors.toLowerCase().split("-");
       for (int i=0;i<colours.length;i++) {
           if (colours[i].equals("black")) {
               colours[i]="0";
           } else if (colours[i].equals("brown")) {
               colours[i]="1";
           } else if (colours[i].equals("red")) {
               colours[i]="2";
           } else if (colours[i].equals("orange")) {
               colours[i]="3";
           } else if (colours[i].equals("yellow")) {
               colours[i]="4";
           } else if (colours[i].equals("green")) {
               colours[i]="5";
           } else if (colours[i].equals("blue")) {
               colours[i]="6";
           } else if (colours[i].equals("violet")) {
               colours[i]="7";
           } else if (colours[i].equals("grey")) {
               colours[i]="8";
           } else if (colours[i].equals("white")) {
               colours[i]="9";
           } else {
               JOptionPane.showMessageDialog(null, "invlid colour: "+colours[i]);
               System.exit(1);
           }
       }
           one=Integer.parseInt(colours[0]);
           two=Integer.parseInt(colours[1]);
           three=Integer.parseInt(colours[2]);
           
           
           
           
           
           
           
           
           
       
       
        
        
    }

}
