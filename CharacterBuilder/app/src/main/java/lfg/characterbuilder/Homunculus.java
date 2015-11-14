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
    private int barbarianScore;
    private int fighterScore;
    private int paladinScore;
    private int monkScore;
    private int rangerScore;
    private int warlockScore;
    private int rogueScore;
    private int wizardScore;
    private int clericScore;

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
    void parseString(String aString){
        if(aString.equals("Barbarian")){
            this.barbarianScore++;
        }
        else if(aString.equals("Fighter")){
            fighterScore++;
        }
        else if(aString.equals("Paladin")){
            paladinScore++;
        }
        else if(aString.equals("Monk")){
            monkScore++;
        }
        else if(aString.equals("Ranger")){
            rangerScore++;
        }
        else if(aString.equals("Warlock")){
            warlockScore++;
        }
        else if(aString.equals("Rogue")){
            rogueScore++;
        }
        else if(aString.equals("Wizard")){
            wizardScore++;
        }
        else if(aString.equals("Cleric")){
            clericScore++;
        }

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
