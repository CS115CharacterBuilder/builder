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
        String Ammo;
        String Range;
    }

    private ArrayList<mWeapon> mWList = new ArrayList<mWeapon>();
    private ArrayList<rWeapon> rWList = new ArrayList<rWeapon>();

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
                vi.inflate(resource, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            Button remove = (Button) newView.findViewById(R.id.mWRemove);
            remove.setTag(position);
            //set to load stored weapons
            EditText mName = (EditText) newView.findViewById(R.id.mWeaponVal);
            EditText mAB = (EditText) newView.findViewById(R.id.mABVal);
            EditText mDmg = (EditText) newView.findViewById(R.id.mDmgVal);


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
                vi.inflate(resource, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            Button remove = (Button) newView.findViewById(R.id.rWRemove);
            remove.setTag(position);
            //set to load stored weapons
            EditText rName = (EditText) newView.findViewById(R.id.rWeaponVal);
            EditText rAB = (EditText) newView.findViewById(R.id.rABVal);
            EditText rDmg = (EditText) newView.findViewById(R.id.rDmgVal);
            EditText rAmmo = (EditText) newView.findViewById(R.id.rAmmoVal);
            EditText rRange = (EditText) newView.findViewById(R.id.rRangeVal);


            return newView;
        }
    }
    private rAdapter rW;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //input list of proficiencies
        /*ArrayList<String> proficiencies = new ArrayList<String>();
         *String ProfList = ""
         * for(int i = 0; i < proficiencies.size(); i++) {
         *      ProfList = ProfList + proficiencies.get(i) + " ";
         * }
         * ProfList.setText(ProfList);
         */
        //creates the arraylists with weapons and refreshes when arraylists are updated
        /*mW = new mAdapter(this.getActivity(), R.layout.mweapon_element, mWList);
        rW = new rAdapter(this.getActivity(), R.layout.rweapon_element, rWList);
        ListView mWeaponsList = (ListView)getView().findViewById(R.id.mWeaponsList);
        ListView rWeaponsList = (ListView)getView().findViewById(R.id.rWeaponsList);
        mWeaponsList.setAdapter(mW);
        rWeaponsList.setAdapter(rW);
        mW.notifyDataSetChanged();
        */rW.notifyDataSetChanged();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        View fragmentView = inflater.inflate(R.layout.activity_equipment_page, container,false);
        mView = fragmentView;
        mW = new mAdapter(this.getActivity(), R.layout.mweapon_element, mWList);
        rW = new rAdapter(this.getActivity(), R.layout.rweapon_element, rWList);
        ListView mWeaponsList = (ListView) mView.findViewById(R.id.mWeaponsList);
        ListView rWeaponsList = (ListView) mView.findViewById(R.id.rWeaponsList);
        mWeaponsList.setAdapter(mW);
        rWeaponsList.setAdapter(rW);
        mW.notifyDataSetChanged();
        rW.notifyDataSetChanged();
        return inflater.inflate(R.layout.activity_equipment_page, container, false);
    }

    //adds new melee weapons to list
    public void addMWeapon() {
       mWeapon w = new mWeapon();
        mWList.add(w);
    }

    //removes melee weapon from list
    public void removeMWeapon(View v) {
        int position = (Integer)v.getTag();
        mWList.remove(position);
    }

    //adds new ranged weapon to list
    public void addRWeapon() {
        mWeapon w = new mWeapon();
        mWList.add(w);
    }

    //removes ranged weapon from list
    public void removeRWeapon(View v) {
        int position = (Integer)v.getTag();
        mWList.remove(position);
    }
}
