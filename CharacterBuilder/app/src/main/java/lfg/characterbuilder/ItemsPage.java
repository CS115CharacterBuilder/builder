package lfg.characterbuilder;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
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
import java.util.HashSet;
import java.util.Set;

public class ItemsPage extends Fragment {
    protected View mView;
    //pulls character object
    Character gotChar;

    //declares item object
    String[] itemNames;
    String[] itemDesc;

    //Currency Textfields
    static EditText GoldVal;
    static EditText SilverVal;
    static EditText CopperVal;

    public class ItemElement {
        ItemElement() {
        };

        public String itemName;
        public String itemDescription;
        public int position;

    }

    public static ArrayList<ItemElement> iList;

    //adapter to create item object cards
    private class MyAdapter extends ArrayAdapter<ItemElement> {
        int resource;
        Context context;

        public MyAdapter(Context context, int resource, ArrayList<ItemElement> items) {
            super(context, resource, items);
            this.context = context;
        }

        public View getView(int position, View convertView, final ViewGroup parent) {
            LinearLayout newView;
            final ItemElement i = getItem(position);

            if(convertView == null) {
                newView = new LinearLayout(getContext());
                String inflater = Context.LAYOUT_INFLATER_SERVICE;
                LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
                vi.inflate(R.layout.item_element, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            Button iRem = (Button) newView.findViewById(R.id.removeButton);
            iRem.setTag(position);
            iRem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = (int) v.getTag();
                    aa.remove(getItem(position));
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
                    editor.putString("CHAR_INAME", getItemNames());
                    editor.putString("CHAR_IDESC", getItemDesc());
                    editor.apply();
                }
            });

            TextView itemName = (TextView) newView.findViewById(R.id.itemName);
            TextView itemDesc = (TextView) newView.findViewById(R.id.itemDesc);

            itemName.setText(i.itemName);
            itemDesc.setText(i.itemDescription);

            return newView;
        }
    }

    private MyAdapter aa;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
        Bundle args = getArguments();
        itemNames = args.getStringArray("itemBundle");
        itemDesc = args.getStringArray("itemDescBundle");
        iList = new ArrayList<ItemElement>();
        if(itemNames == null){
            String[] tempNames = new String[2];
            tempNames[0] = "Bag";
            tempNames[1] = "Rock";
            itemNames = tempNames;
            Log.d("GOT", "IT1");
        }
        if(itemDesc == null){
            String[] tempDesc = new String[2];
            tempDesc[0] = "It's a nice little bag for carrying currency";
            tempDesc[1] = "It rocks!";
            itemDesc = tempDesc;
            Log.d("GOT", "IT2");
        }
        initializeIList();
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.activity_items_page, container, false);
        this.mView = fragmentView;
        super.onCreateView(inflater, container, savedInstanceState);
        //get character objet
        //gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
        //Bundle args = getArguments();
        //itemNames = args.getStringArray("itemBundle");
        //itemDesc = args.getStringArray("itemDescBundle");
        //get item names and descriptions from character object
        //itemNames = gotChar.getItemNames();
        //itemDesc = gotChar.getItemDescriptions();
        //creates list
        //iList = new ArrayList<ItemElement>();
        //initializeIList();
        //creates add button
        Button iAdd = (Button) mView.findViewById(R.id.addBtn);
        iAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) mView.findViewById(R.id.ItemName);
                EditText et2 = (EditText) mView.findViewById(R.id.ItemDescription);
                String iName = et.getText().toString(); //gets name of item from box
                String iDesc = et2.getText().toString(); // gets item description from box
                ItemElement newItem = new ItemElement(); //creates new item and fills in fields
                newItem.itemName = iName;
                newItem.itemDescription = iDesc;
                newItem.position = iList.size(); //adds newly created item to the arraylist
                aa.add(newItem);
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
                editor.putString("CHAR_INAME", getItemNames());
                editor.putString("CHAR_IDESC", getItemDesc());
                editor.apply();
            }
        });
        aa = new MyAdapter(this.getActivity(), R.layout.item_element, iList);
        ListView itemList = (ListView)mView.findViewById(R.id.itemList);
        itemList.setAdapter(aa);
        //refreshes page when iList is updated
        aa.notifyDataSetChanged();
        GoldVal = (EditText) mView.findViewById(R.id.GoldVal);
        SilverVal = (EditText) mView.findViewById(R.id.SilverVal);
        CopperVal = (EditText) mView.findViewById(R.id.CopperVal);
        GoldVal.setText(Integer.toString(gotChar.getGold()));
        SilverVal.setText(Integer.toString(gotChar.getSilver()));
        CopperVal.setText(Integer.toString(gotChar.getCopper()));
        GoldVal.setGravity(Gravity.CENTER_HORIZONTAL);
        SilverVal.setGravity(Gravity.CENTER_HORIZONTAL);
        CopperVal.setGravity(Gravity.CENTER_HORIZONTAL);
        return this.mView;
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
        editor.putString("CHAR_INAME", getItemNames());
        editor.putString("CHAR_IDESC", getItemDesc());
        editor.apply();
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
        //Rewrite it's data string in shared preferences
        SharedPreferences sharedStats = getActivity().getSharedPreferences(gotChar.getUnique_id(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedStats.edit();
        editor.putString("CHAR_INAME", getItemNames());
        editor.putString("CHAR_IDESC", getItemDesc());
        editor.apply();
    }

    public void initializeIList() {
        for(int i = 0; i < itemNames.length; i++) {
            ItemElement IE = new ItemElement();
            IE.itemName = itemNames[i];
            IE.itemDescription = itemDesc[i];
            IE.position = i;
            iList.add(IE);
        }
    }

    public static int getCopper(){
        if(CopperVal == null) return -1;
        return Integer.parseInt(CopperVal.getText().toString());
    }

    public static int getSilver(){
        if(SilverVal == null) return -1;
        return Integer.parseInt(SilverVal.getText().toString());
    }

    public static int getGold(){
        if(GoldVal == null) return -1;
        return Integer.parseInt(GoldVal.getText().toString());
    }

    public static String getItemNames(){
        if(iList == null) return "NOSAVE";
        String[] newItemNames = new String[iList.size()];
        for(int i = 0; i < iList.size(); ++i ){
            newItemNames[i] = iList.get(i).itemName;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newItemNames.length; i++){
            statsString.append(newItemNames[i]).append(",");
        }
        return statsString.toString();
    }

    public static String getItemDesc(){
        if(iList == null) return "NOSAVE";
        String[] newItemDesc = new String[iList.size()];
        for(int i = 0; i < iList.size(); ++i ){
            newItemDesc[i] = iList.get(i).itemDescription;
        }
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < newItemDesc.length; i++){
            statsString.append(newItemDesc[i]).append(",");
        }
        return statsString.toString();
    }

}
