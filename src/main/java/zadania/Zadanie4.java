package zadania;

import java.math.BigDecimal;
import java.util.List;

public class Zadanie4 {

    //metoda ktora liczy pola figur
    //jesli jeden warunek to kwadratu
    //jesli dwa warunki to prostokata
    //jesli 3 warunki to trojkata
    // jesli czyKolo = true liczy pole kola
    //jesli wiecej to daje informacje ze dane nieprawidlowe
    public void metoda(boolean czyKolo, double ... args){
        czyKolo=true;
        if(args.length == 1){
            System.out.println("pole kwadratu: " + args[0]*args[0]);
        }else if(args.length == 2){
            System.out.println("pole porostokata: " + args[0]*args[1]);
        }else if(args.length == 3){
            double polowaObwodu = (args[0]+args[1]+args[2])/2;
            System.out.println("pole trojkata: " + Math.sqrt(polowaObwodu*(polowaObwodu-args[0])*(polowaObwodu-args[1])*(polowaObwodu-args[2])));
        }else if(czyKolo){
            System.out.println("pole kola: " + Math.PI*Math.pow(2,args[0]));
        }else {
            System.out.println("dane niepoprawne");
        }
    }

    public void wyswietlMacierzTransponowana(int[][] array){
        //wyswietla macierz przed transponowaniem
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        //transponowanie
        int [][] newArray = new int[array[1].length][array.length];
        for (int i = 0; i < array[1].length; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i][j] = array[j][i];
            }
        }

        //wyswietlenie macierzy po transponowaniu
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[1].length; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void sumaPrzekatnejMacierzy(int[][] array){
        //sprawdzenie czy macierz jest kwadratowa
        if(!(array.length == array[1].length)){
            System.out.println("macierz nie jest kwadratowa");
        }else {
            //wyswietlenie macierzy
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            //suma przekatnej
            int suma = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array[1].length; j++) {
                    suma += array[i][j];
                    break;
                }
            }
            System.out.println("suma przekatnej"+suma);
        }
    }


}
