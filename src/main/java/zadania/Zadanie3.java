package zadania;

public class Zadanie3 {

    private static float basePrice;
    private static int discount;
    private static float priceWithDiscount;
    private static int tax;
    private static float finalPrice;
    private static String city;

    public static void metoda1() {

        //obliczanie discount
        if (basePrice < 100) {
            discount = 5;

        } else {
            if (city.equals("Katowice")) {
                discount = 15;
            } else discount = 10;
        }
        // obliczanie podatku
        if (!city.equals("Katowice")) {
            tax = 23;
        }

        //obliczanie ceny koncowej
        priceWithDiscount = (((100 - discount) / 100)) * basePrice));
        priceWithTax = priceWithDiscount + ((tax / 100) + priceWithDiscount);
    }


    private static void printRandomList() {

        System.out.println("To jest super program");

        int min = 0;
        int max = 10;
        List<Integer> lista = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int wylosowanaLiczba = r.nextInt((max - min) + 1) + min;
            lista.add(wylosowanaLiczba);
        }
        System.out.println(lista);

        lista.add(priceWithDiscount);
        lista.add(basePrice);
        lista.add(discount);

    }



        private static void printList() {
            System.out.println("To jest niesamowity program");

            int min = 0;
            int max = 10;
            List<Integer> lista = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                int wylosowanaLiczba = r.nextInt((max - min) + 1) + min;
                lista.add(wylosowanaLiczba);
            }
            System.out.println(lista);
        }
}
