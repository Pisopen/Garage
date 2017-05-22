import java.util.ArrayList;

/**
 * Created by Stephane on 22/05/2017.
 */
public class List extends ArrayList {
    private Garages garages;
    private ArrayList<String> List_Mod=new ArrayList<String>();
    private ArrayList<String> List_Mar=new ArrayList<String>();
    private ArrayList<String> List_Col=new ArrayList<String>();

    public int get_size(){
        return List_Mod.size();
    }

    public void search_mod(String mod){
        for (int i=0;i<List_Mod.size();i++){
            if (List_Mod.get(i)== mod){
                System.out.println("Mod exist");
            }
            else if (i==0 && List_Mod.get(i)!=mod){
                System.out.println("No Mod");
            }


        }
    }

    @Override
    public String toString() {
        return "List{" +
                "List_Mod=" + List_Mod +
                ", List_Mar=" + List_Mar +
                ", List_Col=" + List_Col +
                '}';
    }

    public void add_voiture(Voiture voiture){
        List_Mod.add(voiture.getModele());
        List_Col.add(voiture.getColor());
        List_Mar.add(voiture.getMarque());
    }

    public void search_col(String col){
        for (int i=0;i<List_Col.size();i++){
            if (List_Col.get(i)== col){
                System.out.println("Color exist");
            }
            else if (i==0 && List_Col.get(i)!=col){
                System.out.println("No Col");
            }
        }
    }
    public void search_mar(String mar){
        for (int i=0;i<List_Mar.size();i++){
            if (List_Mar.get(i)== mar){
                System.out.println("Marque exist");
            }
            else if (i==0 && List_Mar.get(i)!=mar){
                System.out.println("No Mar");
            }


        }
    }
}
