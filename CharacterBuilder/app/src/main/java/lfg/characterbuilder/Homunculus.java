package lfg.characterbuilder;

import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

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
    //races
    private int dwarfScore;
    private int elfScore;
    private int halflingScore;
    private int humanScore;
    private int dragonbornScore;
    private int gnomeScore;
    private int halfelfScore;
    private int halforcScore;
    private int tieflingScore;

    public Homunculus(){
        hRace = "";
        hClass = "";
        hSubrace = "";
        hBackground = "";
        barbarianScore = 0;
        fighterScore = 0;
        paladinScore = 0;
        monkScore = 0;
        rangerScore = 0;
        warlockScore = 0;
        rogueScore = 0;
        wizardScore = 0;
        clericScore = 0;
        dwarfScore = 0;
        elfScore = 0;
        halflingScore = 0;
        humanScore = 0;
        dragonbornScore = 0;
        gnomeScore = 0;
        halfelfScore = 0;
        halforcScore = 0;
        tieflingScore = 0;
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
        Log.d("parse", aString);
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
        else if(aString.equals("Dwarf")){
            dwarfScore++;
        }
        else if(aString.equals("Elf")){
            elfScore++;
        }
        else if(aString.equals("Halfling")){
            halflingScore++;
        }
        else if(aString.equals("Human")){
            humanScore++;
        }
        else if(aString.equals("Dragonborn")){
            dragonbornScore++;
        }
        else if(aString.equals("Gnome")){
            gnomeScore++;
        }
        else if(aString.equals("Half-Elf")){
            halfelfScore++;
        }
        else if(aString.equals("Half-Orc")){
            halforcScore++;
        }
        else if(aString.equals("Tiefling")){
            tieflingScore++;
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

    void displayNoobresults(TextView top, TextView middle, TextView bottom){
        String sTopRace = "";
        String sTopClass = "";
        String sMiddleRace = "";
        String sMiddleClass = "";
        String sBottomRace = "";
        String sBottomClass = "";

        int largestRace = 0;
        int largestClass = 0;
        int middleRace = 0;
        int middleClass = 0;
        int bottomRace = 0;
        int bottomClass = 0;
        //index for respective number
        int raceNumberOne = 0;
        int classNumberTwo = 0;
        int classNumberThree = 0;
        int classNumberOne = 0;
        int raceNumberTwo = 0;
        int raceNumberThree = 0;


        ArrayList<Integer> raceList = new ArrayList<>();
        raceList.add(this.dragonbornScore);
        raceList.add(this.dwarfScore);
        raceList.add(this.elfScore);
        raceList.add(this.gnomeScore);
        raceList.add(this.halflingScore);
        raceList.add(this.halforcScore);
        raceList.add(this.halfelfScore);
        raceList.add(this.humanScore);
        raceList.add(this.tieflingScore);

        ArrayList<Integer> finalRaceList = raceList;
        ArrayList<String> raceStringList = new ArrayList<>();
        raceStringList.add("Dragonborn");
        raceStringList.add("Dwarf");
        raceStringList.add("Elf");
        raceStringList.add("Gnome");
        raceStringList.add("Halfling");
        raceStringList.add("Half-Orc");
        raceStringList.add("Half-Elf");
        raceStringList.add("Human");
        raceStringList.add("Tiefling");


        for(int i = 0; i < raceList.size(); i++){
            if(raceList.get(i) > largestRace){
                //the index
                raceNumberOne = i;
                //the number to compare
                largestRace = raceList.get(i);
            }
        }
        raceList.remove(raceNumberOne);
        for(int i = 0; i < raceList.size(); i++){
            if(raceList.get(i) > middleRace){
                raceNumberTwo = i;
                middleRace = raceList.get(i);
            }
        }
        raceList.remove(raceNumberTwo);

        for(int i = 0; i < raceList.size(); i++){
            if(raceList.get(i) > bottomRace){
                raceNumberThree = i;
                bottomRace = raceList.get(i);
            }
        }

        sTopRace = raceStringList.get(raceNumberOne);
        sMiddleRace = raceStringList.get(raceNumberTwo);
        sBottomRace = raceStringList.get(raceNumberThree);

        //Do the same thing for class now. 
    }

}
