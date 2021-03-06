package lfg.characterbuilder;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    Character gotChar;

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
    private String proficiencies;
    private String profTxt = "";
    private String[] m_weapons_held;
    private String[] m_weapons_bonus;
    private String[] m_weapons_damage;
    private String[] r_weapons_held;
    private String[] r_weapons_bonus;
    private String[] r_weapons_damage;
    private int[] r_weapons_ammo;
    private String[] r_weapons_range;
    private String armorName;
    private String armorMod;
    static EditText aName;
    static EditText aMod;

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
    public void onCreate(Bundle savedInstanceState) {
        Bundle args = getArguments();
        gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
        m_weapons_held = args.getStringArray("mWeaponBundle");
        m_weapons_bonus = args.getStringArray("mWeaponBonusBundle");
        m_weapons_damage = args.getStringArray("mWeaponDMGBundle");
        r_weapons_held = args.getStringArray("rWeaponBundle");
        r_weapons_bonus = args.getStringArray("rWeaponBonusBundle");
        r_weapons_damage = args.getStringArray("rWeaponDMGBundle");
        r_weapons_ammo = args.getIntArray("rWeaponAmmoBundle");
        r_weapons_range = args.getStringArray("rWeaponRangeBundle");
        armorName = gotChar.getArmorName();
        armorMod = gotChar.getArmorMod();

        createList();
        Log.d("equip page", "creatlist called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        View fragmentView = inflater.inflate(R.layout.activity_equipment_page, container, false);
        mView = fragmentView;
        proficiencies = gotChar.getProficiencies();


        //Load the Melee/Ranged Weapons Arrays

        /*m_weapons_held = args.getStringArray("mWeaponBundle");
        m_weapons_bonus = args.getStringArray("mWeaponBonusBundle");
        m_weapons_damage = args.getStringArray("mWeaponDMGBundle");
        r_weapons_held = args.getStringArray("rWeaponBundle");
        r_weapons_bonus = args.getStringArray("rWeaponBonusBundle");
        r_weapons_damage = args.getStringArray("rWeaponDMGBundle");
        r_weapons_ammo = args.getIntArray("rWeaponAmmoBundle");
        r_weapons_range = args.getStringArray("rWeaponRangeBundle");*/

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
        //createList();
        //Log.d("equip page", "creatlist called");
        TextView prof = (TextView) mView.findViewById(R.id.profTxt);
        prof.setText(proficiencies);
        aName = (EditText) mView.findViewById(R.id.ArmorName);
        aName.setText(gotChar.getArmorName());
        aMod = (EditText) mView.findViewById(R.id.ArmorMod);
        aMod.setText(gotChar.getArmorMod());

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
        //loop creates melee weapons list
        /*for(int i = 0; i < m_weapons_held.length; i++) {
            mWeapon temp = new mWeapon();
            temp.Name = m_weapons_held[i];
            temp.Damage = m_weapons_damage[i];
            temp.AB = m_weapons_bonus[i];
            mWList.add(temp);
        }

        //loop creates ranged weapons list
        for(int i = 0; i< r_weapons_held.length; i++) {
            rWeapon temp = new rWeapon();
            temp.Name = r_weapons_held[i];
            temp.Damage = r_weapons_damage[i];
            temp.AB = r_weapons_bonus[i];
            temp.Ammo = r_weapons_ammo[i];
            temp.Range = r_weapons_range[i];
            rWList.add(temp);
        }*/
    }


    public static String getArmorName(){
        if (aName == null) return "NOSAVE";
        String rArmorName = aName.getText().toString();
        return rArmorName;
    }

    public static String getArmorMod(){
        if (aMod == null) return "NOSAVE";
        String rArmorMod = aMod.getText().toString();
        return rArmorMod;
    }

    public static String getMeleeWeaponsName(){
        if(mWList == null) return "NOSAVE";
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
        if(mWList == null) return "NOSAVE";
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
        if(mWList == null) return "NOSAVE";
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
        if(rWList == null) return "NOSAVE";
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
        if(rWList == null) return "NOSAVE";
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
        if(rWList == null) return "NOSAVE";
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
        if(rWList == null) return "NOSAVE";
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
        if(rWList == null) return "NOSAVE";
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
