package lfg.characterbuilder;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gotChar = getIntent().getParcelableExtra("characterTag");
        setContentView(R.layout.activity_main);
        Character gotChar = getIntent().getParcelableExtra("characterTag");
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

}

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }
    Character gotChar = MainActivity.gotChar;

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position == 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("charToStats", gotChar);
            fragment = new StatPage();
            fragment.setArguments(bundle);
        }else if(position == 1) {
            fragment = new AbilitiesPage();
        }/*else if(position == 2) {
           fragment = new EquipmentPage();
        }else if(position == 3) {
            fragment = new ItemsPage();
        }else if(position == 4) {
            fragment = new SkillsPage();
        }else if(position == 5) {
            fragment = new BackgroundPage();
        }else if(position == 6) {
            fragment = new SpellPage();
        }else if(position == 7) {

        }*/
        return fragment;
    }

    @Override
    public int getCount() {
        return 1;
    }
}

