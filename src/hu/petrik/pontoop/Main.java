package hu.petrik.pontoop;

import hu.petrik.pontoop.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }

        for (Pont p : pontok) {
            System.out.println(p);
        }

        //Origótól legtávolabb eső pont - maximum kiválasztás
        int legtavolabbiPontIndex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag() < pontok[i].getOrigotolMertTavolsag()) {
                legtavolabbiPontIndex = i;
            }
        }

        System.out.printf("A legtávolabbi pont az origótól a(z) %d. pont, " +
                        "koordinátái: %s, origótól mért távolsága: %.3f\n"
                , (legtavolabbiPontIndex + 1), pontok[legtavolabbiPontIndex],
                pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag());

        System.out.printf("Az egyik pont: %s, A másik pont: %s, A két pont távolsága: %.3f\n",
                p3, p4, p3.getTavolsag(p4));

        System.out.printf("A %s pont elhelyezkedése: %s\n", p3, p3.getSiknegyedSzoveges());
        System.out.printf("A %s pont elhelyezkedése: %s\n", p2, p2.getSiknegyedSzoveges());
        System.out.printf("A %s pont elhelyezkedése: %s\n", p4, p4.getSiknegyedSzoveges());
    }
}
