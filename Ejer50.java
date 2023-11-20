public class Ejer50 extends Library {
    
    public static void main(String[] args) {
    
        String placa= "";
        String numpyp= "";
        int numpypint= 0;
        String dia= "";
        int dia1= 0;
        String citypyp= "";

        screen.println("Ingrese la placa del vehiculo en formato AAA-000");
        placa = keyboard.nextLine();
        screen.println("Ingrese el día en el que va a transitar: ");
        dia = keyboard.nextLine();
        
        numpyp = placa.substring(6);
        numpypint = Integer.parseInt(numpyp);

        if (dia.equalsIgnoreCase("Lunes")){
            dia1 = 1;
        } else if (dia.equalsIgnoreCase("Martes")){
            dia1 = 2;
        } else if (dia.equalsIgnoreCase("Miercoles")){
            dia1 = 3;
        } else if (dia.equalsIgnoreCase("Jueves")){
            dia1 = 4;
        } else if (dia.equalsIgnoreCase("Viernes")){
            dia1 = 5;
        }


        if (dia1 == 1 && (numpypint == 0 || numpypint == 1 )){
            citypyp += "Manizales, ";
        } else if (dia1 == 2 && (numpypint == 2 || numpypint == 3 )){
            citypyp += "Manizales, ";
        } else if (dia1 == 3 && (numpypint == 4 || numpypint == 5 )){
            citypyp += "Manizales, ";
        } else if (dia1 == 4 && (numpypint == 6 || numpypint == 7 )){
            citypyp += "Manizales, ";
        } else if (dia1 == 5 && (numpypint == 8 || numpypint == 9 )){
            citypyp += "Manizales, ";
        }

        if (dia1 == 1 && (numpypint == 0 || numpypint == 9 )){
            citypyp += "Pereira, ";
        } else if (dia1 == 2 && (numpypint == 1 || numpypint == 8 )){
            citypyp += "Pereira, ";
        } else if (dia1 == 3 && (numpypint == 2 || numpypint == 7 )){
            citypyp += "Pereira, ";
        } else if (dia1 == 4 && (numpypint == 3 || numpypint == 6 )){
            citypyp += "Pereira, ";
        } else if (dia1 == 5 && (numpypint == 4 || numpypint == 5 )){
            citypyp += "Pereira, ";
        }

        if (dia1 == 1 && (numpypint == 8 || numpypint == 9 )){
            citypyp += "Medellin, ";
        } else if (dia1 == 2 && (numpypint == 6 || numpypint == 7 )){
            citypyp += "Medellin, ";
        } else if (dia1 == 3 && (numpypint == 4 || numpypint == 5 )){
            citypyp += "Medellin, ";
        } else if (dia1 == 4 && (numpypint == 2 || numpypint == 3 )){
            citypyp += "Medellin, ";
        } else if (dia1 == 5 && (numpypint == 0 || numpypint == 1 )){
            citypyp += "Medellin, ";
        }

        if (dia1 == 1 && (numpypint == 1 || numpypint == 2 )){
            citypyp += "Barranquilla, ";
        } else if (dia1 == 2 && (numpypint == 3 || numpypint == 4 )){
            citypyp += "Barranquilla, ";
        } else if (dia1 == 3 && (numpypint == 5 || numpypint == 6 )){
            citypyp += "Barranquilla, ";
        } else if (dia1 == 4 && (numpypint == 7 || numpypint == 8 )){
            citypyp += "Barranquilla, ";
        } else if (dia1 == 5 && (numpypint == 9 || numpypint == 0 )){
            citypyp += "Barranquilla, ";
        }

        if (dia1 == 1 && (numpypint == 8 || numpypint == 9 )){
            citypyp += "Armenia, ";
        } else if (dia1 == 2 && (numpypint == 0 || numpypint == 1 )){
            citypyp += "Armenia, ";
        } else if (dia1 == 3 && (numpypint == 2 || numpypint == 3 )){
            citypyp += "Armenia, ";
        } else if (dia1 == 4 && (numpypint == 4 || numpypint == 5 )){
            citypyp += "Armenia, ";
        } else if (dia1 == 5 && (numpypint == 6 || numpypint == 7 )){
            citypyp += "Armenia, ";
        }

        if (dia1 == 1 && (numpypint == 2 || numpypint == 7 )){
            citypyp += "Bogotá, ";
        } else if (dia1 == 2 && (numpypint == 3 || numpypint == 8 )){
            citypyp += "Bogotá, ";
        } else if (dia1 == 3 && (numpypint == 4 || numpypint == 9 )){
            citypyp += "Bogotá, ";
        } else if (dia1 == 4 && (numpypint == 0 || numpypint == 5 )){
            citypyp += "Bogotá, ";
        } else if (dia1 == 5 && (numpypint == 1 || numpypint == 6 )){
            citypyp += "Bogotá, ";
        }

        if (dia1 == 1 && (numpypint == 3 || numpypint == 4 )){
            citypyp += "Bucaramanga, ";
        } else if (dia1 == 2 && (numpypint == 5 || numpypint == 6 )){
            citypyp += "Bucaramanga, ";
        } else if (dia1 == 3 && (numpypint == 7 || numpypint == 8 )){
            citypyp += "Bucaramanga, ";
        } else if (dia1 == 4 && (numpypint == 9 || numpypint == 0 )){
            citypyp += "Bucaramanga, ";
        } else if (dia1 == 5 && (numpypint == 1 || numpypint == 2 )){
            citypyp += "Bucaramanga, ";
        }

        if (dia1 == 1 && (numpypint == 1 || numpypint == 6 )){
            citypyp += "Cartagena, ";
        } else if (dia1 == 2 && (numpypint == 2 || numpypint == 7 )){
            citypyp += "Cartagena, ";
        } else if (dia1 == 3 && (numpypint == 3 || numpypint == 8 )){
            citypyp += "Cartagena, ";
        } else if (dia1 == 4 && (numpypint == 9 || numpypint == 4 )){
            citypyp += "Cartagena, ";
        } else if (dia1 == 5 && (numpypint == 0 || numpypint == 5 )){
            citypyp += "Cartagena, ";
        }

        screen.println("Ciudades en las que habrá pico y placa: "+citypyp);
    }
}