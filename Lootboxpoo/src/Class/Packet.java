package Class;

import java.util.Scanner;
import java.util.Random;
public class Packet {

    public String[] name;
    public String quality;
    
    // "GLOBAL" VARIABLES.
    public static int contcommon = 0;        
    public static int contrare = 0;
    public static int contleg = 0;
    public static int contalphapacks=0;
    public static String random;

    public Packet(String[] name, String quality) {
        this.name = name;
        this.quality = quality;
    }

    public Packet() {
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void packcreator() {
        String commonitem[] = {"Aluminio", "carton", "papel lustre"};
        String rareitem[] = {"\033[35mCobre", "\033[35mPlata", "\033[35mBronze", "\033[35mTitanio"};
        String legendaryitem[] = {"\033[33mOro", "\033[33mPlatino", "\033[33mDiamante", "\033[33mRubi"};

        Packet littlepacket = new Packet(commonitem, "common");
        Packet littlepacket2 = new Packet(rareitem, "\033[35mRare");
        Packet littlepacket3 = new Packet(legendaryitem, "\033[33m¡Legendary!");
        
        Random porcent= new Random();
         int total = porcent.nextInt(101);
         
       
         if (total > 0 && total <= 60) {
//             System.out.println(total);
             random= (commonitem[new Random().nextInt(commonitem.length)]);
             System.out.println(littlepacket.getQuality());
            System.out.println(random + "*OO");
            contcommon++;
           contalphapacks++;

        }
        if (total > 60 && total <= 89) {
//            System.out.println(total);
             random= (rareitem[new Random().nextInt(rareitem.length)]);
            System.out.println(littlepacket2.getQuality());
            System.out.println(random + "**O");
            contrare++;
            contalphapacks++;

        }
        if (total > 89 && total <= 100) {
//            System.out.println(total);
            random= (legendaryitem[new Random().nextInt(legendaryitem.length)]);
            System.out.println(littlepacket3.getQuality());
            System.out.println(random + "***");
            contleg++;
           contalphapacks++;

        }
    }
    public void loader(){
        Scanner input= new Scanner(System.in);
        System.out.println("loading alpha pack");
        System.out.println("Wait please.");
        try {
            Thread.sleep(1200);

        } catch (InterruptedException ex) {

        }
        System.out.println("Wait..");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException ex) {

        }
        System.out.println("Wait...");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException ex) {
        }
        System.out.println("ALPHA PACK LOADED!");
        System.out.println("===================");
        String enter = input.nextLine();
        if (enter.equals("")) {
            System.out.println("OPENING ALPHA PACK!");
            packcreator();

        }
    }
    public static void stats() {
        System.out.println("Alpha packs openeds: "+contalphapacks);
        System.out.println("Common objects obtained: " + contcommon);
        System.out.println("Rares objects obtained: " + contrare);
        System.out.println("Legendarys objects obtained: " + contleg);

    }
    
}
    
    
   


