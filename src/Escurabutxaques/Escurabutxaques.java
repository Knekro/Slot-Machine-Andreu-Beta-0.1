package Escurabutxaques;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Escurabutxaques {
static String[] res1 = new String[5];
static String[] res2 = new String[5];
static String[] res3 = new String[5];
static String[] pera = new String[5];
static String[] platan = new String[5];
static String[] raim = new String[5];
static String[] kiwi = new String[5];
static String[] peneaut = new String[5];

    public static void main (String[] Args) throws IOException {
        figures();
    }

    public static void figures() throws IOException {
        pera[1] = "   (   ";
        pera[2] = "  / \\  ";
        pera[3] = " (   ) ";
        pera[4] = "  `\"'  ";
        pera[0] = "       ";
        platan[0] = "       ";
        platan[1] = " ,     ";
        platan[2] = " \\`.__.";
        platan[3] = "  `._,'";
        platan[4] = "       ";
        raim[0] = "  \\    ";
        raim[1] = "  ()() ";
        raim[2] = " ()()()";
        raim[3] = "  ()() ";
        raim[4] = "   ()  ";
        kiwi[0] = "       ";
        kiwi[1] = "  ,=.  ";
        kiwi[2] = " (.`:) ";
        kiwi[3] = "  `-'  ";
        kiwi[4] = "       ";
        peneaut[0] = "  ,+.  ";
        peneaut[1] = " ((|)) ";
        peneaut[2] = "  )|(  ";
        peneaut[3] = " ((|)) ";
        peneaut[4] = "  `-'  ";
        menu();
    }

    public static void menu() throws IOException {
            System.out.println("Benvingut a la màquina escurabutxaques de l'Andreu! Introdueix 1 euro per a fer una tirada.");
        Scanner reader1 = new Scanner(System.in);
        int opcio1 = reader1.nextInt();
        if (opcio1 == 1){
            Random();
        }
        else {
            menu();
        }
    }

    public static void Random() throws IOException {
            for (int i = 0; i < 3; ++i) {
                Random r = new Random();
                int randomNumber = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                if (randomNumber == 1) {
                    switch (i) {
                        case 0:
                            res1 = pera;
                            break;
                        case 1:
                            res2 = pera;
                            break;
                        case 2:
                            res3 = pera;
                            break;
                    }
                } else if (randomNumber == 2) {
                    switch (i) {
                        case 0:
                            res1 = platan;
                            break;
                        case 1:
                            res2 = platan;
                            break;
                        case 2:
                            res3 = platan;
                            break;
                    }
                } else if (randomNumber == 3) {
                    switch (i) {
                        case 0:
                            res1 = raim;
                            break;
                        case 1:
                            res2 = raim;
                            break;
                        case 2:
                            res3 = raim;
                            break;
                    }
                } else if (randomNumber == 4) {
                    switch (i) {
                        case 0:
                            res1 = kiwi;
                            break;
                        case 1:
                            res2 = kiwi;
                            break;
                        case 2:
                            res3 = kiwi;
                            break;
                    }
                } else if (randomNumber == 5) {
                    switch (i) {
                        case 0:
                            res1 = peneaut;
                            break;
                        case 1:
                            res2 = peneaut;
                            break;
                        case 2:
                            res3 = peneaut;
                            break;
                    }
                }
            };
           imprimir();
    }

    public static void imprimir() throws IOException{
        String[] imprimir = new String[1];
        imprimir[0] = res1[0] + res2[0] + res3[0];
        System.out.println(Arrays.deepToString(imprimir));
        imprimir[0] = res1[1] + res2[1] + res3[1];
        System.out.println(Arrays.deepToString(imprimir));
        imprimir[0] = res1[2] + res2[2] + res3[2];
        System.out.println(Arrays.deepToString(imprimir));
        imprimir[0] = res1[3] + res2[3] + res3[3];
        System.out.println(Arrays.deepToString(imprimir));
        imprimir[0] = res1[4] + res2[4] + res3[4];
        System.out.println(Arrays.deepToString(imprimir));
        input();
    }

    public static void input () throws IOException {
        int x = 2;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < x * 100
                && !in.ready()) {
        }
        if (in.ready()) {
            premis();
        } else {
            Random();
        }
    }

    public static void premis () throws IOException {
        if (res1.equals(platan) && res2.equals(platan) && res3.equals(platan)){
            System.out.println("Felicitats! Has guanyat 1.000 €, el premi més gran!");
            System.out.println("Recull el premi");
            menu();
        }
        else if (res1.equals(kiwi) && res2.equals(kiwi) && res3.equals(kiwi)){
            System.out.println("Felicitats! Has guanyat 500 €!");
            System.out.println("Recull el premi");
            menu();
        }
        else if (res1.equals(pera) && res2.equals(pera) && res3.equals(pera)){
            System.out.println("Felicitats! Has guanyat 250 €!");
            System.out.println("Recull el premi");
            menu();
        }
        else if (res1.equals(raim) && res3.equals(raim) && res2.equals(raim)){
            System.out.println("Felicitats! has guanyat 100 €!");
            System.out.println("Recull el premi");
            menu();
        }
        else if (res1.equals(peneaut) && res3.equals(peneaut) && res2.equals(peneaut)){
            System.out.println("Felicitats! has guanyat 100 €!");
            System.out.println("Recull el premi");
            menu();
        }
        else if (res1.equals(res2) || res3.equals(res2) || res3.equals(res1)){
            System.out.println("Felicitats, tens una parella! Disfruta de la teva tirada gratis! Introdueix jugar per fer la teva tirada.");
            Scanner reader1 = new Scanner(System.in);
            String o = reader1.nextLine();
            if (o.equals("jugar")){
                Random();
            }
            else {
                premis();
            }
        }
        else {
            System.out.println("Ho sento, no has guanyat res!");
            System.out.println("Bona sort a la següent partida!");
            menu();
        }
    }
}
