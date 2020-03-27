package zadania;

public class Zadanie3 {

    private float basePrice;
    private int discount;
    private float priceWithDiscount;
    private int tax;
    private float finalPrice;
    private String city;


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
}
