package lfg.characterbuilder;

import android.content.Context;
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

public class ItemsPage extends Fragment {
    //pulls character object
    Character gotChar = getActivity().getIntent().getParcelableExtra("characterTag");

    //declares item object
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

    @Override
     public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeIList();
        aa = new MyAdapter(this.getActivity(), R.layout.item_element, iList);
        ListView itemList = (ListView)getView().findViewById(R.id.itemList);
        itemList.setAdapter(aa);
        aa.notifyDataSetChanged();



    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        EditText GoldVal = (EditText) getView().findViewById(R.id.GoldVal);
        EditText SilverVal = (EditText) getView().findViewById(R.id.SilverVal);
        EditText CopperVal = (EditText) getView().findViewById(R.id.CopperVal);
        GoldVal.setText(gotChar.getGold());
        SilverVal.setText(gotChar.getSilver());
        CopperVal.setText(gotChar.getCopper());
        return inflater.inflate(R.layout.activity_items_page, container, false);
    }


    public void addItem(View v) {
        EditText et = (EditText) getView().findViewById(R.id.ItemName);
        EditText et2 = (EditText) getView().findViewById(R.id.ItemDescription);
        String iName = et.getText().toString(); //gets name of item from box
        String iDesc = et2.getText().toString(); // gets item description from box
        ItemElement newItem = new ItemElement(); //creates new item and fills in fields
        newItem.itemName = iName;
        newItem.itemDescription = iDesc;
        newItem.position = iList.size(); //adds newly created item to the arraylist
        iList.add(newItem);
    }

    public void clickRemove(View v) {

        int position = (Integer)v.getTag();
        iList.remove(position);
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
