/**
 * Created by Stephane on 17/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Voiture v1=new Auto("BMW","M5","Blue");
        Garages garage=new Garages();
        Garages g1=new List_Mod(v1,garage);
        g1.add_car(v1);
        System.out.println(g1);
    }
}
