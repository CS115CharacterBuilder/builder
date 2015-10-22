package lfg.characterbuilder;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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


    //Private variables for Swipe in Drawer
    private ListView Drawer_List;
    private NavBarAdapter Drawer_Adapter;
    private ActionBarDrawerToggle Drawer_Toggle;
    private DrawerLayout Drawer_Layout;
    private String Activity_Title;

    //List of all characters stored as array list of characters
    private List<Character> characters;

    @Override
    // This will call every time this activity is newly instantiated
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
        RVAdapter adapter = new RVAdapter(characters);
        adapter.setOnItemClickListener(new RVAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Toast.makeText(HomeActivity.this, "Character: " + characters.get(position).getCharacterName(), Toast.LENGTH_SHORT).show();
            }
        });
        rv.setAdapter(adapter);

        setupFAB();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    @Override
    //This will call every time this activity is newly instantiated
    public boolean onCreateOptionsMenu(Menu menu) {

        //Inflate the menu
        //This will populate the action bar with action items
        //if the action bar is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    //This will handle all action bar clicks. The action bar
    //will handle clicks on the Home/Up button, so long as you
    //specify a parent activity in AndroidManifest.xml
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
                return true;

            default:
                return super.onOptionsItemSelected(item);
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
        String[] Drawer_Text_Array = {"Dice", "Calculator", "Rules", "Noob Questionnaire"};
        Integer[] Drawer_Index_Array = {R.drawable.ic_dice, R.drawable.ic_calculator,
                                        R.drawable.ic_rules, R.drawable.ic_rules};

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
                        Toast.makeText(HomeActivity.this, "Ayy lmao, this is a test for the NoobQuestionnaire", Toast.LENGTH_SHORT).show();
                        Intent nQuestionIntent = new Intent(HomeActivity.this, NoobQuestionnaire.class);
                        startActivity(nQuestionIntent);
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

    /*End Drawer Functions */


    /* Recycle View Functions */
    //This function should populate the character cards on the home page
    //by pulling from saved data. Right now it makes fake data.
    private void populateCharacterCards(){
        characters = new ArrayList<>();
        characters.add(new Character("Testerman Stormshield", "Fighter", R.drawable.ic_warrior));
        characters.add(new Character("Mockupite Wandwhisper", "Wizard", R.drawable.ic_mage));
        characters.add(new Character("Phonylord Daggershine", "Rogue", R.drawable.ic_ranger));
        characters.add(new Character("Furrylad Featherstroker", "Druid", R.drawable.ic_mage));
        characters.add(new Character("Casterole Spellfire", "Mage", R.drawable.ic_mage));
        characters.add(new Character("Exampleor Swordbreaker", "Warrior", R.drawable.ic_warrior));
        characters.add(new Character("Health Ledger", "Priest", R.drawable.ic_mage));

    }

    /*End Recycle View Functions*/


    private void setupFAB(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(HomeActivity.this, "Launch Tutorial", Toast.LENGTH_SHORT).show();
                //Should Launch to Tutorial - jumps to fill in for now
                Intent intent = new Intent(HomeActivity.this, CharacterStats.class);
                startActivity(intent);
            }

        });

    }
}

