package lfg.characterbuilder;

/**
 * Created by Andy on 10/25/2015.
 *
 * This class serves as a transit between the questionnaire and the character sheet.
 */


public class Homunculus{
    private String hRace;
    private String hClass;
    private String hSubrace;
    private String hBackground;

    public Homunculus(){
        hRace = "";
        hClass = "";
        hSubrace = "";
        hBackground = "";
    }

    void setRace(String _race){
        hRace = _race;
    }
    void sethClass(String _class){
        hClass = _class;
    }
    void setBackGround(String _background) {
        hBackground=_background;
    }
    void setSubrace(String _subrace){
        hSubrace = _subrace;
    }

    String getRace(){
        return hRace;
    }
    String getSubrace(){
        return hSubrace;
    }
    String getBackGround(){
        return hBackground;
    }
    String getHClass(){
        return hClass;
    }
}
