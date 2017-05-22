/**
 * Created by Stephane on 17/05/2017.
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephane on 17/05/2017.
 */
public class Garages {
    protected Voiture voiture;
    protected List<Voiture> garage=new ArrayList<Voiture>();

    public Garages(){}
    public Garages(Voiture voiture, List<Voiture> garage) {
        this.voiture = this.voiture;
        this.garage = this.garage;
    }

    public List<Voiture> getGarage() {
        return garage;
    }

    public void setGarage(List<Voiture> garage) {
        this.garage = garage;
    }

    public void add_car(Voiture voiture){
        garage.add(voiture);
    }

    @Override
    public String toString() {
        return "Garage{" + garage +
                '}';
    }
}
