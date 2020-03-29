package zadania;

public class Zadanie1 {


    public static void main(String[] args) {
        metoda1(2,1,1);
    }
    //Jeśli figura jest kołem funkcja szuka punktów calkowite dla okregu (wewnatrz i na "brzegu")

    //1 - koło (płaska)
    //2 - walec
    //3 - stożek

    public static void metoda1(double r, double h, int numer)
    {
        //liczenie pola podstawy
        double Pp = Math.PI*r*r;
        double V = 0.0;

        //sprawdzanie, czy figura jest kołem. Dla koła funkcja szuka punktów całkowitych, które znajdują się w kole.
        if(numer == 1) {
            int x = 0;
            int y = 0;

            while(x<= r)
            {
                while(y<=r)
                {
                    if(Math.sqrt(x*x + y*y) <= r) {
                        if (x != 0 && y != 0) {
                            System.out.println(x + " "+ y); //pierwsza cwiartka
                            System.out.println(-x + " " + y); //druga cwiartka
                            System.out.println(-x + " " + -y); //trzecia cwiartka
                            System.out.println(x + " " + -y); //czwarta cwiartka
                        } else if (x != 0 || y != 0) {
                            System.out.println(x + " " + y);
                            if (x == 0)
                                System.out.println(x + " "+ -y);
                            else System.out.println(-x + " "+ y);
                        }
                        y++;
                    }
                    else
                        break;
                }
                x++;
                y=0;
            }
            System.out.println("0 0");
        }
        //liczenie objetosci dla bryl
        else
        {
            if(numer == 2)
                V = Pp * h;
            else if(numer == 3)
                V = (Pp * h)/3;
            else
                System.out.println("Wpisano numer, dla którego nie przydzielono figury");
            System.out.println(V);
        }
    }


    public static boolean podzielnaPrzez6(int liczba)
    {
        boolean przez2 = false;
        boolean przez3 = false;
        if(liczba % 2 == 0)
        {
            przez2 = true;
        }
        if(liczba % 3 == 0)
        {
            przez3 = true;
        }
        return przez2 && przez3;
    }

    public static boolean podzielnaPrzez15(int liczba)
    {
        boolean przez3 = false;
        boolean przez5 = false;
        if(liczba % 3 == 0)
        {
            przez3 = true;
        }
        if(liczba % 5 == 0)
        {
            przez5 = true;
        }
        return przez3 && przez5;
    }

}
