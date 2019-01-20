import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySales {

    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();

        fillTheList(sales);
        System.out.println(currency.format(
        sales.stream()
            .filter((sale) -> sale.item.equals("DVD"))
            .map((sale) -> sale.price)
            .reduce
             (0.0, (price1, price2) -> price1 + price2)));
    }
  
    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Book", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));
    }
}
