package zadania;

import java.util.*;

public class Zadanie1 {

    public static void main(String[] args) {
        liczenieJakisRzeczy(2,5,1);
    }

    //funkcja szuka punktów calkowite dla okregu (wewnatrz i na "brzegu")

    //1 - kolo (plaska)
    //2 - walec
    //3 - stozek

    //Sorki, ze takie dlugie

    public static void liczenieRoznychRzeczyDlaBryl(double r, double h, int numer)
    {
        //liczenie pola podstawy
        double Pp = Math.PI*r*r;
        double V = 0.0;

        //sprawdzanie, czy figura jest kołem. Dla koła funkcja szuka punktów całkowitych, które znajdują się w kole.
        if(numer == 1)
        {
            List<Integer> listX = new ArrayList<>();
            List<Integer> listY = new ArrayList<>();

            int x = 0;
            int y = 0;

            //szukanie punktów calkowitych w kole i dodawanie ich do tablicy
            while(x<= r)
            {
                while(y<=r)
                {
                    if(Math.sqrt(x*x + y*y) <= r) {

                        if (x != 0 && y != 0) {
                            //pieprwsza cwiartka
                            listX.add(x);
                            listY.add(y);

                            //druga cwiartka
                            listX.add(-x);
                            listY.add(y);

                            //trzecia cwiartka
                            listX.add(-x);
                            listY.add(-y);

                            //czwartka cwiartka
                            listX.add(x);
                            listY.add(-y);
                        }
                        else if(x != 0 || y != 0)
                        {
                            listX.add(x);
                            listY.add(y);

                            if(x == 0)
                            {
                                listX.add(x);
                                listY.add(-y);
                            }
                            else {
                                listX.add(-x);
                                listY.add(y);
                            }
                        }
                        y++;
                    }
                    else
                        break;
                }
                x++;
                y=0;
            }
            listX.add(0);
            listY.add(0);


            for(int i=0;i<listX.size();i++)
            {
                System.out.println(listX.get(i) + " " + listY.get(i));
            }
        }

        //liczenie objetosci dla bryl
        else
        {
            if(numer == 2)
            {
                V = Pp * h;

            }
            else if(numer == 3)
            {
                V = (Pp * h)/3;
            }

            else
                System.out.println("Wpisano numer, dla którego nie przydzielono figury");
            System.out.println(V);
        }

    }



}
