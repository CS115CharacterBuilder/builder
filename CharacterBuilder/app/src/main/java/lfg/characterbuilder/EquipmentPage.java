package lfg.characterbuilder;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EquipmentPage extends Fragment {

    protected View mView;

    public class mWeapon {
        mWeapon() {
        };
        String Name;
        String AB;
        String Damage;
    }

    public class rWeapon {
        rWeapon() {
        };
        String Name;
        String AB;
        String Damage;
        int Ammo;
        String Range;
    }

    private static ArrayList<mWeapon> mWList = new ArrayList<mWeapon>();
    private static ArrayList<rWeapon> rWList = new ArrayList<rWeapon>();
    private String[] proficiencies;
    private String profTxt = "";
    private String[] m_weapons_held;
    private String[] m_weapons_bonus;
    private String[] m_weapons_damage;
    private String[] r_weapons_held;
    private String[] r_weapons_bonus;
    private String[] r_weapons_damage;
    private int[] r_weapons_ammo;
    private String[] r_weapons_range;

    //adapter for melee weapons
    private class mAdapter extends ArrayAdapter<mWeapon> {
        int resource;
        FragmentActivity context;
        public mAdapter(FragmentActivity context, int resource, List<mWeapon> mWList) {
            super(context, resource, mWList);
            this.context = context;
            resource = resource;
            context = context;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout newView;
            final mWeapon m = getItem(position);

            if(convertView == null) {
                newView = new LinearLayout(getContext());
                String inflater = Context.LAYOUT_INFLATER_SERVICE;
                LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
                vi.inflate(R.layout.mweapon_element, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            Button remove = (Button) newView.findViewById(R.id.mWRemove);
            remove.setTag(position);
            remove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = (Integer)v.getTag();
                    mW.remove(getItem(position));
                }
            });
            //set to load stored weapons
            EditText mName = (EditText) newView.findViewById(R.id.mWeaponVal);
            mName.setText(m.Name);
            EditText mAB = (EditText) newView.findViewById(R.id.mABVal);
            mAB.setText(m.AB);
            EditText mDmg = (EditText) newView.findViewById(R.id.mDmgVal);
            mDmg.setText(m.Damage);
            return newView;
        }
    }
    private mAdapter mW;

    //adapter for ranged weapons
    private class rAdapter extends ArrayAdapter<rWeapon> {
        int resource;
        FragmentActivity context;
        public rAdapter(FragmentActivity context, int resource, List<rWeapon> rWList) {
            super(context, resource, rWList);
            this.context = context;
            resource = resource;
            context = context;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout newView;
            final rWeapon r = getItem(position);

            if(convertView == null) {
                newView = new LinearLayout(getContext());
                String inflater = Context.LAYOUT_INFLATER_SERVICE;
                LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
                vi.inflate(R.layout.rweapon_element, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            Button remove = (Button) newView.findViewById(R.id.rWRemove);
            remove.setTag(position);
            remove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = (Integer)v.getTag();
                    rW.remove(getItem(position));
                }
            });
            //set to load stored weapons
            EditText rName = (EditText) newView.findViewById(R.id.rWeaponVal);
            rName.setText(r.Name);
            EditText rAB = (EditText) newView.findViewById(R.id.rABVal);
            rAB.setText(r.AB);
            EditText rDmg = (EditText) newView.findViewById(R.id.rDmgVal);
            rDmg.setText(r.Damage);
            EditText rAmmo = (EditText) newView.findViewById(R.id.rAmmoVal);
            rAmmo.setText(Integer.toString(r.Ammo));
            EditText rRange = (EditText) newView.findViewById(R.id.rRangeVal);
            rRange.setText(r.Range);
            return newView;
        }
    }
    private rAdapter rW;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        View fragmentView = inflater.inflate(R.layout.activity_equipment_page, container, false);
        mView = fragmentView;
        Bundle args = getArguments();
        //proficiencies = gotChar.getProficiencies;
        //create buttons
        Button mAdd = (Button) mView.findViewById(R.id.mWeapAdd);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWeapon w = new mWeapon();
                mW.add(w);
            }
        });

        Button rAdd = (Button) mView.findViewById(R.id.rWeapAdd);
        rAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rWeapon r = new rWeapon();
                rW.add(r);
            }
        });
        //creates the arraylists with weapons and refreshes when arraylists are updated
        createList();
        EditText prof = (EditText) mView.findViewById(R.id.profTxt);
        prof.setText(profTxt);
        mW = new mAdapter(this.getActivity(), R.layout.mweapon_element, mWList);
        rW = new rAdapter(this.getActivity(), R.layout.rweapon_element, rWList);
        ListView mWeaponsList = (ListView) mView.findViewById(R.id.mWeaponsList);
        ListView rWeaponsList = (ListView) mView.findViewById(R.id.rWeaponsList);
        mWeaponsList.setAdapter(mW);
        rWeaponsList.setAdapter(rW);
        mW.notifyDataSetChanged();
        rW.notifyDataSetChanged();
        return this.mView;
    }


    public void createList() {
        //loop creates string to put into proficiencies
        for(int i = 0; i < 1/*proficiencies.length*/; i++) {
            profTxt = "A bunch of proficiencies";//profTxt + " " + proficiencies[i];
        }
        //loop creates melee weapons list
        for(int i = 0; i < 1/*m_weapons_held.length*/; i++) {
            mWeapon temp = new mWeapon();
            temp.Name = "Tester M";//m_weapons_held[i];
            temp.Damage = "8";//m_weapons_damage[i];
            temp.AB = "40";//m_weapons_bonus[i];
            mWList.add(temp);
        }

        //loop creates ranged weapons list
        for(int i = 0; i < 1/*r_weapons_held.length*/; i++) {
            rWeapon temp = new rWeapon();
            temp.Name = "Tester R";//r_weapons_held[i];
            temp.Damage = "12";//r_weapons_damage[i];
            temp.AB = "40";//r_weapons_bonus[i];
            temp.Ammo = 5;//r_weapons_ammo[i];
            temp.Range = "100";//r_weapons_range[i];
            rWList.add(temp);
        }
    }


    public static String getMeleeWeaponsName(){
        String[] newMeleeNames = new String[mWList.size()];
        for(int i = 0; i < mWList.size(); ++i ){
            newMeleeNames[i] = mWList.get(i).Name;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newMeleeNames.length; i++){
            statsString.append(newMeleeNames[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getMeleeWeaponsBonus(){
        String[] newMeleeBonus = new String[mWList.size()];
        for(int i = 0; i < mWList.size(); ++i ){
            newMeleeBonus[i] = mWList.get(i).AB;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newMeleeBonus.length; i++){
            statsString.append(newMeleeBonus[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getMeleeWeaponsDamage(){
        String[] newMeleeDamage = new String[mWList.size()];
        for(int i = 0; i < mWList.size(); ++i ){
            newMeleeDamage[i] = mWList.get(i).Damage;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newMeleeDamage.length; i++){
            statsString.append(newMeleeDamage[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getRangedWeaponsName(){
        String[] newRangedNames = new String[rWList.size()];
        for(int i = 0; i < rWList.size(); ++i ){
            newRangedNames[i] = rWList.get(i).Damage;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newRangedNames.length; i++){
            statsString.append(newRangedNames[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getRangedWeaponsBonus(){
        String[] newRangedBonus = new String[rWList.size()];
        for(int i = 0; i < rWList.size(); ++i ){
            newRangedBonus[i] = rWList.get(i).AB;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newRangedBonus.length; i++){
            statsString.append(newRangedBonus[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getRangedWeaponsDamage(){
        String[] newRangedDamage = new String[rWList.size()];
        for(int i = 0; i < rWList.size(); ++i ){
            newRangedDamage[i] = rWList.get(i).Damage;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newRangedDamage.length; i++){
            statsString.append(newRangedDamage[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getRangedWeaponsAmmo(){
        String[] newRangedAmmo = new String[rWList.size()];
        for(int i = 0; i < rWList.size(); ++i ){
            newRangedAmmo[i] = Integer.toString(rWList.get(i).Ammo);
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newRangedAmmo.length; i++){
            statsString.append(newRangedAmmo[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getRangedWeaponsRange(){
        String[] newRangedRange = new String[rWList.size()];
        for(int i = 0; i < rWList.size(); ++i ){
            newRangedRange[i] = Integer.toString(rWList.get(i).Ammo);
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newRangedRange.length; i++){
            statsString.append(newRangedRange[i]).append(",");
        }
        return statsString.toString();
    }

}
