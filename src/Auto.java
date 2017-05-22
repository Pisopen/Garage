/**
 * Created by Stephane on 17/05/2017.
 */
public class Auto extends Voiture {
    public Auto(String marque, String modele, String color) {
        super(marque, modele, color);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
