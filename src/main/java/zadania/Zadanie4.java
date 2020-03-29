package zadania;

import java.math.BigDecimal;
import java.util.List;

public class Zadanie4 {

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
