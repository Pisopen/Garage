import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephane on 17/05/2017.
 */
public class List_Mod extends Garages {
    public List_Mod(Voiture voiture,List<Voiture> garage) {
        super(voiture, garage);
    }
    protected List<String> List_Mod=new ArrayList<String>();
    public int get_size(){
        return List_Mod.size();
    }
    public void search_mod(String mod){
        for (int i= List_Mod.size();i>=0;i--){
            if (List_Mod.get(i)==mod){
                System.out.println("Mod exist");
                i=0;
            }
            else if (i==0 && List_Mod.get(i)!=mod){
                System.out.println("No Mod");
            }


        }
    }
    public void add_mod(Voiture voiture){
        List_Mod.add(voiture.getColor());
    }

}
