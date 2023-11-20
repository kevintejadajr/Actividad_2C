public class Ejer53 extends Library {
    
    public static void main(String[] args) {
        String numrom = "";
        String numromtemp = "";
        int numarab = 0;

        screen.println("Ingrese un número romano entre I(1) y MMMCMXCIX(3999): ");
        numrom = keyboard.nextLine().trim().toUpperCase();
        numromtemp = numrom;
        
        if (numromtemp.startsWith("MMM")){
            numarab += 3000;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("MM")){
            numarab += 2000;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("M")){
            numarab += 1000;
            numromtemp = numromtemp.substring(1);
        }
        if (numromtemp.startsWith("CM")){
            numarab += 900;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("DCCC")){
            numarab += 800;
            numromtemp = numromtemp.substring(4);
        } else if (numromtemp.startsWith("DCC")){
            numarab += 700;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("DC")){
            numarab += 600;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("D")){
            numarab += 500;
            numromtemp = numromtemp.substring(1);
        } else if (numromtemp.startsWith("CD")){
            numarab += 400;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("CCC")){
            numarab += 300;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("CC")){
            numarab += 200;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("C")){
            numarab += 100;
            numromtemp = numromtemp.substring(1);
        }
        if (numromtemp.startsWith("XC")){
            numarab += 90;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("LXXX")){
            numarab += 80;
            numromtemp = numromtemp.substring(4);
        } else if (numromtemp.startsWith("LXX")){
            numarab += 70;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("LX")){
            numarab += 60;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("L")){
            numarab += 50;
            numromtemp = numromtemp.substring(1);
        } else if (numromtemp.startsWith("XL")){
            numarab += 40;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("XXX")){
            numarab += 30;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("XX")){
            numarab += 20;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("X")){
            numarab += 10;
            numromtemp = numromtemp.substring(1);
        }
        if (numromtemp.startsWith("IX")){
            numarab += 9;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("VIII")){
            numarab += 8;
            numromtemp = numromtemp.substring(4);
        } else if (numromtemp.startsWith("VII")){
            numarab += 7;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("VI")){
            numarab += 6;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("V")){
            numarab += 5;
            numromtemp = numromtemp.substring(1);
        } else if (numromtemp.startsWith("IV")){
            numarab += 4;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("III")){
            numarab += 3;
            numromtemp = numromtemp.substring(3);
        } else if (numromtemp.startsWith("II")){
            numarab += 2;
            numromtemp = numromtemp.substring(2);
        } else if (numromtemp.startsWith("I")){
            numarab += 1;
            numromtemp = numromtemp.substring(1);
        }
        screen.println("El número romano "+numrom+" en número arábico es: "+numarab);
        
    }
}