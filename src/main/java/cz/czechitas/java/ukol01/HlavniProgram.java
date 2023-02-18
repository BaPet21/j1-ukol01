package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu
        //prasato
        zofka.setLocation(600,600);
        nakresliDomecek(zofka);
        zofka.turnRight(135);
        zofka.move(80);

        predniNohy(zofka);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);

        zofka.turnRight(50);
        zofka.move(118);

        zofka.penDown();
        zadniNohy(zofka);

        // slunko
        zofka.setLocation(150, 120);
        /*osmiuhelnik(zofka);
        kolecko(zofka);*/
        nakresliSlunko(zofka);

        // DOMY
        zofka.setLocation(120, 240);
        zofka.turnLeft(130);
        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
        zofka.turnLeft(45);
            udelejMezeru(zofka);
       }
        zofka.setLocation(120, 480);
        nakresliDomecek(zofka);

        zofka.setLocation(1040, 480);
        zofka.turnLeft(45);
        nakresliDomecek(zofka);






    }

        public static void main (String[]args){
            new HlavniProgram().start();
        }

    private void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.move(80);
            zofka.turnRight(90);
            zofka.move(120);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(56.6);
        zofka.turnRight(90);
        zofka.move(56.6);

        }
        private void predniNohy(Turtle zofka){
            zofka.turnLeft(35);
            zofka.move(40);

            zofka.turnRight(180);
            zofka.move(40);
            zofka.turnLeft(105);
            zofka.move(40);

        }
        private void zadniNohy(Turtle zofka){
            zofka.turnRight(55);
            zofka.move(40);

            zofka.turnRight(180);
            zofka.move(40);
            zofka.turnLeft(105);
            zofka.move(40);

        }
    private void osmiuhelnik (Turtle zofka){
        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(50);}

    }

    private void kolecko (Turtle zofka){
        for (int i = 0; i < 20; i++) {
            zofka.turnRight(25);
            zofka.move(20);
        }

    }
    private void nakresliSlunko (Turtle zofka){
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15);
            zofka.move(10);
            if (i%2==0){
                zofka.turnLeft(90);
                zofka.move(30);
                zofka.turnRight(180);
                zofka.move(30);
                zofka.turnLeft(90);}
        }

    }
    private void udelejMezeru (Turtle zofka){
        zofka.penUp();
        //zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();

    }
}




