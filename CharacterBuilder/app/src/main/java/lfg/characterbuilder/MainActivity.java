package lfg.characterbuilder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {

    ViewPager viewPager = null;
    static public Character gotChar;
    static public Intent gotIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gotChar = getIntent().getParcelableExtra("characterTag");
        gotIntent = getIntent();
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

    @Override
    public void onBackPressed() {
        //Save all fields to character object SharedPreferences when back is hit
        //Open up the character's shared preferences
        SharedPreferences sharedStats = getSharedPreferences(gotChar.getUnique_id(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedStats.edit();

        //Write into the character's shared preferences with all new fields

        //Items Page
        editor.putInt("CHAR_COPPER", ItemsPage.getCopper());
        editor.putInt("CHAR_SILVER", ItemsPage.getSilver());
        editor.putInt("CHAR_GOLD", ItemsPage.getGold());

        //Background Page
        editor.putString("CHAR_NAME", BackgroundPage.getBackgroundName());
        editor.putString("CHAR_ALIGNMENT", BackgroundPage.getBackgroundAlignment());
        editor.putString("CHAR_DEITY", BackgroundPage.getBackgroundDeity());
        editor.putString("CHAR_BACKGROUND", BackgroundPage.getBackgroundText());

        editor.apply();


        super.onBackPressed();
    }
}

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }
    Character gotChar = MainActivity.gotChar;
    Intent mIntent = MainActivity.gotIntent;

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Bundle caughtStatsBundle = mIntent.getExtras();
        //declare necessary arrays for bundles
        //bundles filled with character stats
        int[] caughtStats = caughtStatsBundle.getIntArray("statsBundle");

        //bundle filled with skill/stats proficiencies
        boolean[] caughtSProf = caughtStatsBundle.getBooleanArray("sProfBundle");
        boolean[] caughtStatProf = caughtStatsBundle.getBooleanArray("statProfBundle");

        //bundles filled with item names and descriptions
        String[] caughtItem = caughtStatsBundle.getStringArray("itemBundle");
        String[] caughtItemDesc = caughtStatsBundle.getStringArray("itemDescBundle");

        //bundle filled with item proficiency types
        String[] caughtGenProf = caughtStatsBundle.getStringArray("genProfBundle");

        //bundles filled with melee and ranged weapon data
        String[] caughtMWeapon = caughtStatsBundle.getStringArray("mWeaponBundle");
        String[] caughtMWeaponDMG = caughtStatsBundle.getStringArray("mWeaponDMGBundle");
        String[] caughtMWeaponBonus = caughtStatsBundle.getStringArray("mWeaponBonusBundle");
        String[] caughtRWeapon = caughtStatsBundle.getStringArray("rWeaponBundle");
        String[] caughtRWeaponDMG = caughtStatsBundle.getStringArray("rWeaponDMGBundle");
        String[] caughtRWeaponBonus = caughtStatsBundle.getStringArray("rWeaponBonusBundle");
        int[] caughtRWeaponAmmo = caughtStatsBundle.getIntArray("rWeaponAmmoBundle");
        String[] caughtRWeaponRange = caughtStatsBundle.getStringArray("rWeaponRangeBundle");

        //bundles filled with spells data
        String[] caughtKnownSpells = caughtStatsBundle.getStringArray("knownSpellBundle");
        String[] caughtEquipSpells = caughtStatsBundle.getStringArray("equipSpellBundle");

        //creates bundle object  and adds character object to it for passing data to fragment
        Bundle bundle = new Bundle();
        bundle.putParcelable("charToStats", gotChar);

        if(position == 0) {
            //Pass stat bundle
            bundle.putIntArray("statsToFrag", caughtStats);
            bundle.putBooleanArray("statProfBundle", caughtStatProf);
            fragment = new StatPage();
            fragment.setArguments(bundle);

        }else if(position == 1) {
            //Pass skill proficiency bundle
            bundle.putIntArray("statsToFrag", caughtStats);
            bundle.putBooleanArray("sProfBundle", caughtSProf);
            fragment = new SkillsPage();
            fragment.setArguments(bundle);

        }else if(position == 2) {
            fragment = new AbilitiesPage();
            fragment.setArguments(bundle);

        }else if(position == 3) {
            bundle.putStringArray("itemBundle", caughtItem);
            bundle.putStringArray("itemDescBundle", caughtItemDesc);
            fragment = new ItemsPage();
            fragment.setArguments(bundle);

        }else if(position == 4) {
            //pass equipment and general proficiencies
            bundle.putStringArray("genProf", caughtGenProf);
            bundle.putStringArray("mWeaponBundle", caughtMWeapon);
            bundle.putStringArray("mWeaponDMGBundle", caughtMWeaponDMG);
            bundle.putStringArray("mWeaponBonusBundle", caughtMWeaponBonus);
            bundle.putStringArray("rWeaponBundle", caughtRWeapon);
            bundle.putStringArray("rWeaponDMGBundle", caughtRWeaponDMG);
            bundle.putStringArray("rWeaponBonusBundle", caughtRWeaponBonus);
            bundle.putIntArray("rWeaponAmmoBundle", caughtRWeaponAmmo);
            bundle.putStringArray("rWeaponRangeBundle", caughtRWeaponRange);
            fragment = new EquipmentPage();
            fragment.setArguments(bundle);

        }else if(position == 5) {
            fragment = new BackgroundPage();
            fragment.setArguments(bundle);

        }else{
            fragment = new SpellPage();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 7;
    }
}

