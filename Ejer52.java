public class Ejer52 extends Library {
    public static void main(String[] args) {
        String[] players = {"","","","","","","",""};
        String[] scores = {"","","","","","","",};
        String[] winners = {"","","","","","",""};

        screen.println("Ingrese el nombre de las jugadoras a continuación: ");
        screen.println("Jugadora #1 ");
        players[0] = keyboard.nextLine();
        screen.println("Jugadora #2 ");
        players[1] = keyboard.nextLine();
        screen.println("Jugadora #3 ");
        players[2] = keyboard.nextLine();
        screen.println("Jugadora #4 ");
        players[3] = keyboard.nextLine();
        screen.println("Jugadora #5 ");
        players[4] = keyboard.nextLine();
        screen.println("Jugadora #6 ");
        players[5] = keyboard.nextLine();
        screen.println("Jugadora #7 ");
        players[6] = keyboard.nextLine();
        screen.println("Jugadora #8 ");
        players[7] = keyboard.nextLine();

        screen.println("Los partidos quedaron de la siguiente manera: ");
        screen.println("Partido1: "+players[0]+" vs "+players[7]);
        screen.println("Partido2: "+players[3]+" vs "+players[4]);
        screen.println("Partido3: "+players[5]+" vs "+players[2]);
        screen.println("Partido4: "+players[6]+" vs "+players[1]);

        screen.println("Ingrese el resultado de los partidos en formato 0-0: ");

        screen.println("Partido1: ");
        scores[0] = keyboard.nextLine();
        if (scores[0].equals("2-0")||(scores[0].equals("2-1"))){
            winners[0] = players[0];
            screen.println("La ganadora del partido1 es: "+winners[0]+", ¡Felicidades!"); 
        } else if (scores[0].equals("0-2")||(scores[0].equals("1-2"))){
            winners[0] = players[7];
            screen.println("La ganadora del partido1 es: "+winners[0]+", ¡Felicidades!"); 
        }

        screen.println("Partido2: ");
        scores[1] = keyboard.nextLine();
        if (scores[1].equals("2-0")||(scores[1].equals("2-1"))){
            winners[1] = players[3];
            screen.println("La ganadora del partido2 es: "+winners[1]+", ¡Felicidades!"); 
        } else if (scores[1].equals("0-2")||(scores[1].equals("1-2"))){
            winners[1] = players[4];
            screen.println("La ganadora del partido2 es: "+winners[1]+", ¡Felicidades!");
        }

        screen.println("Partido3: ");
        scores[2] = keyboard.nextLine();
        if (scores[2].equals("2-0")||(scores[2].equals("2-1"))){
            winners[2] = players[5];
            screen.println("La ganadora del partido3 es: "+winners[2]+", ¡Felicidades!"); 
        } else if (scores[2].equals("0-2")||(scores[2].equals("1-2"))){
            winners[2] = players[2];
            screen.println("La ganadora del partido3 es: "+winners[2]+", ¡Felicidades!");
        }

        screen.println("Partido4: ");
        scores[3] = keyboard.nextLine();
        if (scores[3].equals("2-0")||(scores[3].equals("2-1"))){
            winners[3] = players[6];
            screen.println("La ganadora del partido4 es: "+winners[3]+", ¡Felicidades!"); 
        } else if (scores[3].equals("0-2")||(scores[3].equals("1-2"))){
            winners[3] = players[1];
            screen.println("La ganadora del partido4 es: "+winners[3]+", ¡Felicidades!");
        }
        
        screen.println("Las semifinales se jugaran de la siguiente manera: ");
        screen.println("Partido5: "+winners[0]+" vs "+winners[1]);
        screen.println("Partido6: "+winners[2]+" vs "+winners[3]);

        screen.println("Ingrese el resultado de las semifinales en formato 0-0: ");

        screen.println("Partido5: ");
        scores[4] = keyboard.nextLine();
        if (scores[4].equals("2-0")||(scores[4].equals("2-1"))){
            winners[4] = winners[0];
            screen.println("La ganadora del partido5 es: "+winners[4]+", ¡Felicidades!"); 
        } else if (scores[4].equals("0-2")||(scores[4].equals("1-2"))){
            winners[4] = winners[1];
            screen.println("La ganadora del partido5 es: "+winners[4]+", ¡Felicidades!"); 
        }
        screen.println("Partido6: ");
        scores[5] = keyboard.nextLine();
        if (scores[5].equals("2-0")||(scores[5].equals("2-1"))){
            winners[5] = winners[2];
            screen.println("La ganadora del partido6 es: "+winners[5]+", ¡Felicidades!"); 
        } else if (scores[5].equals("0-2")||(scores[5].equals("1-2"))){
            winners[5] = winners[3];
            screen.println("La ganadora del partido6 es: "+winners[5]+", ¡Felicidades!"); 
        }

        screen.println("Felicidades a las finalistas. Así se jugará la final: ");
        screen.println("Partido7: "+winners[4]+" vs "+winners[5]);

        screen.println("Ingrese el resultado de la final en formato 0-0: ");
        screen.println("Partido7: ");
        scores[6] = keyboard.nextLine();
        if (scores[6].equals("2-0")||(scores[6].equals("2-1"))){
            winners[6] = winners[4];
            screen.println("La ganadora de la final es: "+winners[6]+", ¡Felicitaciones, campeona!"); 
        } else if (scores[6].equals("0-2")||(scores[6].equals("1-2"))){
            winners[6] = winners[5];
            screen.println("La ganadora de la final es: "+winners[6]+", ¡Felicitaciones, campeona!"); 
        }

    }
}