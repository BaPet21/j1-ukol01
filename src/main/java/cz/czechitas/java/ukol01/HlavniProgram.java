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

        // jmeno
        zofka.setLocation(180, 730);
        zofka.turnLeft(135);
       pismenoP(zofka);
        zofka.setLocation(360, 730);
        zofka.turnRight(110);
        pismenoE(zofka);
        zofka.setLocation(540, 730);
        zofka.turnRight(90);
        pismenoT(zofka);
        zofka.setLocation(720, 730);
        zofka.turnRight(90);
        pismenoR(zofka);
        zofka.setLocation(900, 730);
        zofka.turnLeft(135);
        pismenoA(zofka);

        zofka.setLocation(1080, 730);


    }


    public static void main(String[] args) {
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

    private void predniNohy(Turtle zofka) {
        zofka.turnLeft(35);
        zofka.move(40);

        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(105);
        zofka.move(40);

    }

    private void zadniNohy(Turtle zofka) {
        zofka.turnRight(55);
        zofka.move(40);

        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(105);
        zofka.move(40);

    }

    private void osmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(50);
        }

    }

    private void kolecko(Turtle zofka) {
        for (int i = 0; i < 20; i++) {
            zofka.turnRight(25);
            zofka.move(20);
        }

    }

    private void nakresliSlunko(Turtle zofka) {
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15);
            zofka.move(10);
            if (i % 2 == 0) {
                zofka.turnLeft(90);
                zofka.move(30);
                zofka.turnRight(180);
                zofka.move(30);
                zofka.turnLeft(90);
            }
        }

    }

    private void udelejMezeru(Turtle zofka) {
        zofka.penUp();
        //zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();

    }

    private void pismenoP(Turtle zofka) {
        zofka.move(80);
        zofka.turnRight(90);
        for (int i = 0; i < 16; i++) {
            zofka.turnRight(10);
            zofka.move(5);
        }
    }

    private void pismenoE(Turtle zofka) {
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);

        zofka.turnLeft(90);
        zofka.move(39);

        zofka.turnLeft(90);
        zofka.move(32);
        zofka.turnRight(180);
        zofka.move(32);

        zofka.turnLeft(90);
        zofka.move(40);

        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);

    }

    private void pismenoT(Turtle zofka) {
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(40);
    }

    private void pismenoR(Turtle zofka) {
        zofka.move(80);
        zofka.turnRight(90);
        for (int i = 0; i < 16; i++) {
            zofka.turnRight(10);
            zofka.move(5);
        }
        zofka.turnLeft(115);
        zofka.move(35);
    }
    private void pismenoA(Turtle zofka){
        zofka.turnRight(25);
        zofka.move(80);
        zofka.turnRight(130);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(65);
        zofka.move(36);

    }

}



