package Databases;
import java.util.*;
/**
 * Created by AndrewMiller on 10/31/15.
 */
public class ClassData extends Data {
    ArrayList<Data> cd = new ArrayList<Data>();

    Data barbarianFeatures = new Data();

    public void setBarbarianFeatures(Data barbarianFeatures) {
        barbarianFeatures.abilName = "Barbarian Class Features";
        barbarianFeatures.dClass = "Barbarian";
        barbarianFeatures.dlevel = 1;
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int rages[] = {2,2,3,3,3,4,4,4,4,4,4,5,5,5,5,5,6,6,6,100};
        int rageDam[] = {2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4};
        barbarianFeatures.profbonus = pbonus;
        barbarianFeatures.classPoints = rages;
        barbarianFeatures.ragedamage = rageDam;
        


    }

    public ArrayList<Data> getCd() {




        return cd;
    }
}
