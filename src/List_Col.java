import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephane on 17/05/2017.
 */
public class List_Col extends Garages {
    public List_Col(Voiture voiture,List<Voiture> garage) {
        super(voiture, garage);
    }

    protected List<String> List_Col=new ArrayList<String>();

    public void add_col(Voiture voiture) {
        List_Col.add(voiture.getColor());
    }
}
