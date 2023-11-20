public class Ejer51 extends Library {
    public static void main(String[] args) {
        int numdec = 0;
        String numrom = "";
        int numdectemp = 0;

        screen.println("Ingrese un número entero entre 1 y 3999: ");
        numdec = keyboard.nextInt();
        
        if (numdec/3000 == 1){
            numrom += "MMM";
            numdectemp = numdec%3000;
        } else if (numdec/2000 == 1){
            numrom += "MM";
            numdectemp = numdec%2000;
        } else if (numdec/1000 == 1){
            numrom += "M";
            numdectemp = numdec%1000;
        }
        if (numdectemp/900 == 1){
            numrom += "CM";
            numdectemp = numdectemp%900;
        } else if (numdectemp/800 == 1){
            numrom += "DCCC";
            numdectemp = numdectemp%800;
        } else if (numdectemp/700 == 1){
            numrom += "DCC";
            numdectemp = numdectemp%700;
        } else if (numdectemp/600 == 1){
            numrom += "DC";
            numdectemp = numdectemp%600;
        } else if (numdectemp/500 == 1){
            numrom += "D";
            numdectemp = numdectemp%500;
        } else if (numdectemp/400 == 1){
            numrom += "CD";
            numdectemp = numdectemp%400;
        } else if (numdectemp/300 == 1){
            numrom += "CCC";
            numdectemp = numdectemp%300;
        } else if (numdectemp/200 == 1){
            numrom += "CC";
            numdectemp = numdectemp%200;
        } else if (numdectemp/100 == 1){
            numrom += "C";
            numdectemp = numdectemp%100;
        }
        if (numdectemp/90 == 1){
            numrom += "XC";
            numdectemp = numdectemp%90;
        } else if (numdectemp/80 == 1){
            numrom += "LXXX";
            numdectemp = numdectemp%80;
        } else if (numdectemp/70 == 1){
            numrom += "LXX";
            numdectemp = numdectemp%70;
        } else if (numdectemp/60 == 1){
            numrom += "LX";
            numdectemp = numdectemp%60;
        } else if (numdectemp/50 == 1){
            numrom += "L";
            numdectemp = numdectemp%50;
        } else if (numdectemp/40 == 1){
            numrom += "XL";
            numdectemp = numdectemp%40;
        } else if (numdectemp/30 == 1){
            numrom += "XXX";
            numdectemp = numdectemp%30;
        } else if (numdectemp/20 == 1){
            numrom += "XX";
            numdectemp = numdectemp%20;
        } else if (numdectemp/10 == 1){
            numrom += "X";
            numdectemp = numdectemp%10;
        }

        screen.println(numrom);
        
    }
}
