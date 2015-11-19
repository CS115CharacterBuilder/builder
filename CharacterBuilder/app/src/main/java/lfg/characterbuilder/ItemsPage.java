package lfg.characterbuilder;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ItemsPage extends Fragment {
    protected View mView;
    //pulls character object
    Character gotChar = getActivity().getIntent().getParcelableExtra("characterTag");

    //declares item object
    String[] itemNames = gotChar.getItemNames();
    String[] itemDesc = gotChar.getItemDescriptions();

    public class ItemElement {
        ItemElement() {
        };

        public String itemName;
        public String itemDescription;
        public int position;

    }

    public ArrayList<ItemElement> iList;

    //adapter to create item object cards
    private class MyAdapter extends ArrayAdapter<ItemElement> {
        int resource;
        Context context;

        public MyAdapter(Context context, int resource, ArrayList<ItemElement> items) {
            super(context, resource, items);
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout newView;
            final ItemElement i = getItem(position);

            if(convertView == null) {
                newView = new LinearLayout(getContext());
                String inflater = Context.LAYOUT_INFLATER_SERVICE;
                LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
                vi.inflate(resource, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            TextView itemName = (TextView) newView.findViewById(R.id.itemName);
            TextView itemDesc = (TextView) newView.findViewById(R.id.itemDesc);

            itemName.setText(i.itemName);
            itemDesc.setText(i.itemDescription);
            newView.setTag(position);

            return newView;
        }
    }

    private MyAdapter aa;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.activity_items_page, container, false);
        this.mView = fragmentView;
        super.onCreateView(inflater, container, savedInstanceState);
        initializeIList();
        for(int i = 0; i < itemNames.length; i++) {
            ItemElement IE = new ItemElement();
            IE.itemName = itemNames[i];
            IE.itemDescription = itemDesc[i];
            IE.position = i;
            iList.add(IE);
        }
        aa = new MyAdapter(this.getActivity(), R.layout.item_element, iList);
        ListView itemList = (ListView)mView.findViewById(R.id.itemList);
        itemList.setAdapter(aa);
        //refreshes page when iList is updated
        aa.notifyDataSetChanged();
        EditText GoldVal = (EditText) mView.findViewById(R.id.GoldVal);
        EditText SilverVal = (EditText) mView.findViewById(R.id.SilverVal);
        EditText CopperVal = (EditText) mView.findViewById(R.id.CopperVal);
        GoldVal.setText(gotChar.getGold());
        SilverVal.setText(gotChar.getSilver());
        CopperVal.setText(gotChar.getCopper());
        return inflater.inflate(R.layout.activity_items_page, container, false);
    }


    public void addItem(View v) {
        EditText et = (EditText) mView.findViewById(R.id.ItemName);
        EditText et2 = (EditText) mView.findViewById(R.id.ItemDescription);
        String iName = et.getText().toString(); //gets name of item from box
        String iDesc = et2.getText().toString(); // gets item description from box
        ItemElement newItem = new ItemElement(); //creates new item and fills in fields
        newItem.itemName = iName;
        newItem.itemDescription = iDesc;
        newItem.position = iList.size(); //adds newly created item to the arraylist
        iList.add(newItem);
        //declare new arraylists to add into shared preferences
        ArrayList<String> newNames = new ArrayList<String>();
        ArrayList<String> newDesc = new ArrayList<String>();
        //loop to fill arraylists with names and descriptions
        for(int i = 0; i < iList.size(); i++) {
            ItemElement ti = iList.get(i);
            String name = ti.itemName;
            String desc = ti.itemDescription;
            newNames.add(name);
            newDesc.add(desc);
        }
        //Open up it's sp file and make an editor
        SharedPreferences sharedStats = getActivity().getSharedPreferences(gotChar.getUnique_id(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedStats.edit();
        //declares new sets and fills with arraylists to be stored
        Set<String>  newItemNames = new HashSet<String>();
        newItemNames.addAll(newNames);
        Set<String> newItemDesc = new HashSet<String>();
        newItemDesc.addAll(newDesc);
        editor.apply();
        gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
        itemNames = gotChar.getItemNames();
        itemDesc = gotChar.getItemDescriptions();

    }

    public void clickRemove(View v) {

        int position = (Integer)v.getTag();
        iList.remove(position);
        ArrayList<String> newNames = new ArrayList<String>();
        ArrayList<String> newDesc = new ArrayList<String>();
        //loop to fill arraylists with names and descriptions
        for(int i = 0; i < iList.size(); i++) {
            ItemElement ti = iList.get(i);
            String name = ti.itemName;
            String desc = ti.itemDescription;
            newNames.add(name);
            newDesc.add(desc);
        }
        //Open up it's sp file and make an editor
        SharedPreferences sharedStats = getActivity().getSharedPreferences(gotChar.getUnique_id(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedStats.edit();
        //declares new sets and fills with arraylists to be stored
        Set<String>  newItemNames = new HashSet<String>();
        newItemNames.addAll(newNames);
        Set<String> newItemDesc = new HashSet<String>();
        newItemDesc.addAll(newDesc);
        editor.apply();
        gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
        itemNames = gotChar.getItemNames();
        itemDesc = gotChar.getItemDescriptions();
    }

    public void initializeIList() {
        String[] items = gotChar.getItemNames();
        String[] itemDesc = gotChar.getItemDescriptions();
        for(int i = 0; i < items.length; i++) {
            ItemElement IE = new ItemElement();
            IE.itemName = items[i];
            IE.itemDescription = itemDesc[i];
            IE.position = i;
            iList.add(IE);
        }
    }



}
