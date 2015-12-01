package lfg.characterbuilder;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.FloatingActionButton;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private ListView Drawer_List;
    private NavBarAdapter Drawer_Adapter;
    private ActionBarDrawerToggle Drawer_Toggle;
    private DrawerLayout Drawer_Layout;
    private String Activity_Title;
    private RVAdapter adapter;
    private int delete_dialog;
    private List<Character> characters = new ArrayList<>();
    static final int NEW_CHARACTER_REQUEST = 0;

    /* Activity Functions */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the layout to that specified in "activity_home.xml"
        setContentView(R.layout.activity_home);

        //Drawer Setup Handles and it's required specified layout
        Drawer_List = (ListView) findViewById(R.id.nav_list_view);
        Drawer_Layout = (DrawerLayout)findViewById(R.id.nav_drawer_layout);
        Activity_Title = getTitle().toString();

        //Recycle View Setup Handles and it's required layout manager
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(HomeActivity.this);
        rv.setLayoutManager(llm);

        //Set up Drawer and Inflate it
        addDrawerItems();
        setupDrawer();

        //Set up Recycle View and Inflate it
        populateCharacterCards();
        adapter = new RVAdapter(characters);

        //Handle Clicks on any Card
        adapter.setOnItemClickListener(new RVAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Character sendChar = characters.get(position);
                int[] statsToPass;
                //Intent intent = new Intent(HomeActivity.this, CharacterStats.class);

                //Grab the stats and format them back into an array
                SharedPreferences sharedStats = getSharedPreferences(sendChar.getUnique_id(), Context.MODE_PRIVATE);
                String statsString = sharedStats.getString("CHAR_STATS", "NULL");
                if (statsString == "NULL") { statsToPass = sendChar.getStats();}
                else {
                    String[] statsStringArray = statsString.split(",");
                    int[] statsArray = new int[statsStringArray.length];
                    for (int i = 0; i < statsArray.length; ++i) {
                        statsArray[i] = Integer.parseInt(statsStringArray[i]);
                    }
                    statsToPass = statsArray;
                }

                //Pass the stats
                Bundle statsBundle = new Bundle();
                statsBundle.putIntArray("statsBundle", statsToPass);

                //Pass proficiencies
                boolean[] sProfToPass = sendChar.getSkillproficiencies();
                statsBundle.putBooleanArray("sProfBundle", sProfToPass);
                boolean[] statProfToPass = sendChar.getStatsproficiencies();
                statsBundle.putBooleanArray("statProfBundle", statProfToPass);


                //Grab the item names and format them back into an array
                String itemsHeldString  = sharedStats.getString("CHAR_INAME", "NULL");
                String[] item_held_to_pass;
                if(itemsHeldString == "NULL") { item_held_to_pass = sendChar.getItemNames(); }
                else { item_held_to_pass = itemsHeldString.split(",");}
                statsBundle.putStringArray("itemBundle", item_held_to_pass);

                //Grab the item descriptions and format them back into an array
                String itemsDescString  = sharedStats.getString("CHAR_IDESC", "NULL");
                String[] item_desc_to_pass;
                if(itemsHeldString == "NULL") { item_desc_to_pass = sendChar.getItemDescriptions(); }
                else { item_desc_to_pass = itemsDescString.split(",");}
                statsBundle.putStringArray("itemDescBundle", item_desc_to_pass);

                //Grab the weapon names descriptions and format them back into an array
                String meleeWeaponsString  = sharedStats.getString("CHAR_MWEAPONSNAME", "NULL");
                String[] melee_weapons_name_to_pass;
                if(meleeWeaponsString == "NULL") { melee_weapons_name_to_pass = sendChar.getmWeapons(); }
                else { melee_weapons_name_to_pass = meleeWeaponsString.split(",");}
                statsBundle.putStringArray("mWeaponBundle", melee_weapons_name_to_pass);

                //Grab the weapon bonus descriptions and format them back into an array
                String meleeBonusString  = sharedStats.getString("CHAR_MWEAPONSBONUS", "NULL");
                String[] melee_weapons_bonus_to_pass;
                if(meleeBonusString == "NULL") { melee_weapons_bonus_to_pass = sendChar.getmWeaponBonus(); }
                else { melee_weapons_bonus_to_pass = meleeBonusString.split(",");}
                statsBundle.putStringArray("mWeaponBonusBundle", melee_weapons_bonus_to_pass);

                //Grab the weapon damage descriptions and format them back into an array
                String meleeDamageString  = sharedStats.getString("CHAR_MWEAPONSDAMAGE", "NULL");
                String[] melee_weapons_damage_to_pass;
                if(meleeDamageString == "NULL") { melee_weapons_damage_to_pass = sendChar.getmWeaponDamage();}
                else { melee_weapons_damage_to_pass = meleeDamageString.split(",");}
                statsBundle.putStringArray("mWeaponDMGBundle", melee_weapons_damage_to_pass);

                //Grab the ranged name descriptions and format them back into an array
                String rangedWeaponsString  = sharedStats.getString("CHAR_RWEAPONSNAME", "NULL");
                String[] ranged_weapons_name_to_pass;
                if(rangedWeaponsString == "NULL") { ranged_weapons_name_to_pass = sendChar.getrWeapons();}
                else { ranged_weapons_name_to_pass = rangedWeaponsString.split(",");}
                statsBundle.putStringArray("rWeaponBundle", ranged_weapons_name_to_pass);

                //Grab the ranged name descriptions and format them back into an array
                String rangedBonusString  = sharedStats.getString("CHAR_RWEAPONSBONUS", "NULL");
                String[] ranged_weapons_bonus_to_pass;
                if(rangedBonusString == "NULL") { ranged_weapons_bonus_to_pass = sendChar.getrWeaponBonus();}
                else { ranged_weapons_bonus_to_pass = rangedBonusString.split(",");}
                statsBundle.putStringArray("rWeaponBonusBundle", ranged_weapons_bonus_to_pass);

                //Grab the ranged name descriptions and format them back into an array
                String rangedDamageString  = sharedStats.getString("CHAR_RWEAPONSDAMAGE", "NULL");
                String[] ranged_weapons_damage_to_pass;
                if(rangedDamageString == "NULL") { ranged_weapons_damage_to_pass = sendChar.getrWeaponDamage();}
                else { ranged_weapons_damage_to_pass = rangedDamageString.split(",");}
                statsBundle.putStringArray("rWeaponDMGBundle", ranged_weapons_damage_to_pass);


                //Grab the ranged range descriptions and format them back into an array
                String rangedAmmoString  = sharedStats.getString("CHAR_RWEAPONSAMMO", "NULL");
                String[] ranged_ammo_string_array;
                int[] ranged_weapons_ammo_to_pass;
                if(rangedAmmoString == "NULL") { ranged_weapons_ammo_to_pass = sendChar.getrWeaponAmmo();}
                else {
                    ranged_ammo_string_array = rangedAmmoString.split(",");
                    int[] parsedArray = new int[ranged_ammo_string_array.length];
                    for(int i = 0; i < parsedArray.length; ++i){
                        if(ranged_ammo_string_array[i] != null && !ranged_ammo_string_array[i].isEmpty() )
                        parsedArray[i] = Integer.parseInt(ranged_ammo_string_array[i]);
                    }
                    ranged_weapons_ammo_to_pass = parsedArray;
                }
                statsBundle.putIntArray("rWeaponAmmoBundle", ranged_weapons_ammo_to_pass);


                //Grab the ranged range descriptions and format them back into an array
                String rangedRangeString  = sharedStats.getString("CHAR_RWEAPONSRANGE", "NULL");
                String[] ranged_weapons_range_to_pass;
                if(rangedRangeString == "NULL") { ranged_weapons_range_to_pass = sendChar.getrWeaponRange();}
                else { ranged_weapons_range_to_pass = rangedRangeString.split(",");}
                statsBundle.putStringArray("rWeaponRangeBundle", ranged_weapons_range_to_pass);



                String[] prof_to_pass = sendChar.getProficiencies();
                statsBundle.putStringArray("genProfBundle", prof_to_pass);


                /* Spells not implemented
                String[] known_spell_to_pass = sendChar.getKnownSpells();
                statsBundle.putStringArray("knownSpellBundle", known_spell_to_pass);
                String[] equip_spells_to_pass = sendChar.getEquipped_spells();
                statsBundle.putStringArray("equipSpellBundle", equip_spells_to_pass);*/

                //Pass the character
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("characterTag", sendChar);
                intent.putExtras(statsBundle);
                startActivity(intent);
            }
        });

        //Handle Long Clicks on any Card
        adapter.setOnLongItemClickListener(new RVAdapter.LongClickListener() {
            @Override
            public void onLongItemClick(int position, View v) {
                DialogFragment dialog = new DeleteDialog();
                String delete_char_name = characters.get(position).getCharacterName();
                String title = "Delete "+delete_char_name+"?";
                String message = "Are you sure you would like to delete "+delete_char_name+"?";
                Bundle args = new Bundle();
                args.putString("title", title);
                args.putString("message", message);
                args.putInt("position", position);
                dialog.setArguments(args);
                dialog.setTargetFragment(dialog, delete_dialog);
                dialog.show(getFragmentManager(), "tag");
            }
        });

        rv.setAdapter(adapter);

        setupFAB();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        reloadCharacterCards();

        //This may cause performance issues
        reloadSPManager();
        //

        //Update this to notifyItemChanged(position) to increase efficiency
        adapter.notifyDataSetChanged();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu
        //This will populate the action bar with action item if the action bar is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Special Case - Drawer Toggle was selected
        if(Drawer_Toggle.onOptionsItemSelected(item)) return true;


        //Find out the index id of what action item was selected
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                //Implement a new intent activity here. This would pass the control
                //to a new activity on the activity stack. For now just show a toast.
                Toast.makeText(HomeActivity.this, "Implement Settings", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeActivity.this, ProductTour.class);
                startActivity(intent);


            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        //Ideally, create a switch statement here if more than one request
        if(requestCode == NEW_CHARACTER_REQUEST){
            if(resultCode == RESULT_OK){
                Character newResultChar = data.getParcelableExtra("newCharacterTag");
                createCharacter(characters.size(), newResultChar);
            }
        }
    }


    /* Drawer Functions */

    private void setupDrawer(){

        Drawer_Toggle = new ActionBarDrawerToggle(HomeActivity.this, Drawer_Layout,
                R.string.drawer_open, R.string.drawer_close){

            //Calls when Drawer is opened
            public void onDrawerOpened(View drawerView){
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }

            //Calls when Drawer is closed
            public void onDrawerClosed(View view){
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(Activity_Title);
                invalidateOptionsMenu();
            }
        };

        Drawer_Toggle.setDrawerIndicatorEnabled(true);
        Drawer_Layout.setDrawerListener(Drawer_Toggle);
    }

    private void addDrawerItems() {
        String[] Drawer_Text_Array = {"Dice", "Calculator", "Rules", "Experienced Questionnaire", "Noob Questionnaire"};
        Integer[] Drawer_Index_Array = {R.drawable.ic_dice, R.drawable.ic_calculator,
                                        R.drawable.ic_rules, R.drawable.ic_rules, R.drawable.ic_rules};

        Drawer_Adapter = new NavBarAdapter(this, Drawer_Text_Array, Drawer_Index_Array);
        Drawer_List.setAdapter(Drawer_Adapter);

        Drawer_List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch ((int) id) {
                    case 0:
                        Toast.makeText(HomeActivity.this, "Implement Dice", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(HomeActivity.this, DiceRollerMenu.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(HomeActivity.this, "Implement Calculator", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(HomeActivity.this, "Implement Rules", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(HomeActivity.this, "Ayy lmao, this is a test for the ExQuestionnaire", Toast.LENGTH_SHORT).show();
                        Intent exQuestionIntent = new Intent(HomeActivity.this, ExQuestionnaire.class);
                        startActivity(exQuestionIntent);
                        break;
                    case 4:
                        Toast.makeText(HomeActivity.this, "Ayy lmao, this is a test for the NoobQuestionnaire", Toast.LENGTH_SHORT).show();
                        Intent noobQuestionIntent = new Intent(HomeActivity.this, NoobQuestionnaire.class);
                        startActivity(noobQuestionIntent);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        Drawer_Toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        Drawer_Toggle.onConfigurationChanged(newConfig);
    }


    /* Recycle View Functions */

    private void populateCharacterCards(){
        initialLoad();
        //reloadCharacterCards();
    }

    private void initialLoad(){
        SharedPreferences sp_mngr = getSharedPreferences("SP_MANAGER", Context.MODE_PRIVATE);
        int char_size = sp_mngr.getInt("CHAR_COUNT", -1);
        //Toast.makeText(HomeActivity.this,"Size:"+char_size, Toast.LENGTH_SHORT).show();
        for (int i = 0; i < char_size; ++i){
            //Get the SP_File unique ID name associated with the indexed character
            String sp_file_name = sp_mngr.getString(Integer.toString(i), "0");

            //Get the actual SP_file now that we have it's name
            SharedPreferences sp_file = getSharedPreferences(sp_file_name, Context.MODE_PRIVATE);
            String unique_id_loaded = sp_file_name;

            //Load all the singleton variables from the character SP
            String char_name_loaded = sp_file.getString("CHAR_NAME", "ERROR_LOADING");
            String char_class_loaded = sp_file.getString("CHAR_CLASS", "ERROR_LOADING");

            int char_photoId_loaded = sp_file.getInt("CHAR_PHOTO", 0);

            //Create the character and inflate it with the singleton variables
            Character loadedCharacter = new Character(unique_id_loaded, char_name_loaded, char_class_loaded, char_photoId_loaded);

            loadedCharacter.setCharacterRace(sp_file.getString("CHAR_RACE", "Human"));
            loadedCharacter.setCharacterSubRace(sp_file.getString("CHAR_SUBRACE", "Human"));
            loadedCharacter.setType(sp_file.getString("CHAR_BACKGROUND", "Empty"));

            loadedCharacter.setCopper(sp_file.getInt("CHAR_COPPER", 0));
            loadedCharacter.setSilver(sp_file.getInt("CHAR_SILVER", 0));
            loadedCharacter.setGold(sp_file.getInt("CHAR_GOLD", 0));

            loadedCharacter.setClassPoints(sp_file.getInt("CHAR_POINTS", 0));

            loadedCharacter.setAlignment(sp_file.getString("CHAR_ALIGNMENT", "No Alignment"));
            loadedCharacter.setDeity(sp_file.getString("CHAR_DEITY", "No Deity"));
            loadedCharacter.setType(sp_file.getString("CHAR_BACKGROUND", "No Background Set"));

            //Add the completed character to the home screen roster
            characters.add(loadedCharacter);

        }
    }

    private void reloadCharacterCards(){
        //For each character, re-read it's stored character stats
        for (int i = 0; i < characters.size(); ++i) {
            SharedPreferences sp_char = getSharedPreferences(characters.get(i).getUnique_id(), Context.MODE_PRIVATE);
            String updatedName = sp_char.getString("CHAR_NAME", "VOID_NAME");
            String updatedClass = sp_char.getString("CHAR_CLASS", "VOID_CLASS");
            int updatedPhoto = sp_char.getInt("CHAR_PHOTO", 0);

            characters.get(i).setCharacterRace(sp_char.getString("CHAR_RACE", "Human"));
            characters.get(i).setCharacterSubRace(sp_char.getString("CHAR_SUBRACE", "Human"));
            characters.get(i).setType(sp_char.getString("CHAR_BACKGROUND", "Empty"));
            characters.get(i).setCharacterName(updatedName);
            characters.get(i).setCharacterClass(updatedClass);
            characters.get(i).setPhotoId(updatedPhoto);
            characters.get(i).setCopper(sp_char.getInt("CHAR_COPPER", 0));
            characters.get(i).setSilver(sp_char.getInt("CHAR_SILVER", 0));
            characters.get(i).setGold(sp_char.getInt("CHAR_GOLD", 0));

            characters.get(i).setClassPoints(sp_char.getInt("CHAR_POINTS", 0));

            characters.get(i).setAlignment(sp_char.getString("CHAR_ALIGNMENT", "No Alignment"));
            characters.get(i).setDeity(sp_char.getString("CHAR_DEITY", "No Deity"));
            characters.get(i).setType(sp_char.getString("CHAR_BACKGROUND", "No Background Set"));

        }
    }

    private void reloadSPManager(){
        SharedPreferences sp_mngr = getSharedPreferences("SP_MANAGER", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp_mngr.edit();
        //For every character in the array, update it's position-id pair in the SP_MNGR
        for (int i = 0; i < characters.size(); ++i){
            String temp = characters.get(i).getUnique_id();
            editor.putString(Integer.toString(i), temp);
            editor.apply();
        }
        editor.putInt("CHAR_COUNT", characters.size());
        editor.apply();
        //Toast.makeText(HomeActivity.this,"Size loaded into char_size:"+characters.size(), Toast.LENGTH_SHORT).show();
    }

    protected void deleteCharacter(int position){

        //Grab SP_Manager, the to-be deleted file's name, and the to-be deleted file
        SharedPreferences sp_mngr = getSharedPreferences("SP_MANAGER", Context.MODE_PRIVATE);
        String temp = characters.get(position).getUnique_id();
        SharedPreferences sp_file = getSharedPreferences(temp, Context.MODE_PRIVATE);

        //Case: The file doesn't exist at the file name path
        if (sp_file == null) return;

            //Otherwise, clear the contents at the unique id name,
            //then remove the unique_id from the SP_Manager
        else{
            SharedPreferences.Editor sp_file_editor = sp_file.edit();
            sp_file_editor.clear();
            sp_mngr.edit().remove(temp);
        }

        //Alert the RVAdapter and re-initialize the SP_manager
        adapter.deleteItem(position);
        reloadSPManager();

        View coordLayoutView = findViewById(R.id.coordview);
        Snackbar.make(coordLayoutView, "Character Deleted", Snackbar.LENGTH_LONG)
               .setAction("UNDO", null).show();
    }

    protected void createCharacter(int position, Character newCharacter){
        adapter.insertItem(position, newCharacter);
        reloadSPManager();
    }


    /* Floating Action Button Functions */

    private void setupFAB(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(HomeActivity.this, "Launch Tutorial", Toast.LENGTH_SHORT).show();
                //Should Launch to Tutorial - jumps to fill in for now
                Intent intent = new Intent(HomeActivity.this, NewCharacterCreation.class);
                startActivityForResult(intent, NEW_CHARACTER_REQUEST);
            }

        });

    }


}

