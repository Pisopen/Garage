/**
 * Created by Stephane on 17/05/2017.
 */
public class Voiture {
    protected String marque;
    protected String modele;
    protected String color;

    public Voiture(String marque, String modele, String color) {
        this.marque = marque;
        this.modele = modele;
        this.color = color;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
