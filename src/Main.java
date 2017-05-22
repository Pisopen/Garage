import java.util.ArrayList;

/**
 * Created by Stephane on 17/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Voiture v1=new Auto("BMW","M5","Blue");
        Garages garage=new Garages();
        List g1=new List();
        garage.add_car(v1);
        g1.add_voiture(v1);
        g1.search_mod("M5");
        g1.search_col("Blue");
        g1.search_mar("BMW");
        System.out.println(g1);
        System.out.println(garage);
    }
}
