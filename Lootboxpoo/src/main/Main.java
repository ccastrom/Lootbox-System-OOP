
package main;
import Class.Packet;
import java.util.Scanner;
import java.util.Random;
import static Class.Packet.contalphapacks;
import static Class.Packet.random;


public class Main {

    
    public static void main(String[] args) {
        Packet auxobject= new Packet();
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("Welcome to the program!");

        while (true) {
            System.out.println("==================");
            System.out.println("MENÚ");
            System.out.println("==================");

            System.out.println("1.- Open alpha pack");
            System.out.println("2.- Exit");
            System.out.println("3.- Stats");
            if(contalphapacks>0){
                System.out.println("Last object claimed: "+random);
            }
            System.out.println("------------------------");
            op = input.nextInt();
            if (op == 1) {
                System.out.println("================");
                System.out.println("1.-Open alpha pack");
                System.out.println("================");
                auxobject.loader();
            }

            if (op == 2) {
                System.out.println("end of the software");
                break;
            }
            if (op == 3) {
                System.out.println("Stats");
                auxobject.stats();

                System.out.println();

            }
            if (op < 1) {
                System.out.println("Invalid option");
            }
            if (op > 3) {
                System.out.println("invalid option");
            }
        
       
            
        }
        
        
    }
}
    

