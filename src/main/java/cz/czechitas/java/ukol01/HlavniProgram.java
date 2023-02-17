package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu
        //prasato

        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        //trojuhel
        zofka.turnRight(45);
        zofka.move(70.7);
        zofka.turnRight(90);
        zofka.move(70.7);

        zofka.turnRight(135);
        zofka.move(100);
        //nohy

        zofka.turnRight(35);
        zofka.move(50);
        zofka.turnLeft(125);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(125);
        zofka.penDown();
        zofka.move(50);

        zofka.turnRight(125);
        zofka.move(150);
        // druha noha
        zofka.turnRight(125);
        zofka.move(50);
        zofka.turnLeft(125);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(125);
        zofka.penDown();
        zofka.move(50);







        /*private void nakresliPrasatko(){
            for (int i = 0; i < 2; i++) {
                zofka.move(100);
                zofka.turnRight(90);
                zofka.move(150);
            }
        }

     private void nakresliNohy(){
                    for (int j = 0; j < 2; j++) {

                    }
                }*/








    }



    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
