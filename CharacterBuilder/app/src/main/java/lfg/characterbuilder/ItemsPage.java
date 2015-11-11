package lfg.characterbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class ItemsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_page);


    }


        public class ItemElement {
            ItemElement() {
            };

            public String itemName;
            public String itemDescription;
            public int position;

        }

        public ArrayList<ItemElement> iList;

        public void addItem(View v) {
            EditText et = (EditText) findViewById(R.id.ItemName);
            EditText et2 = (EditText) findViewById(R.id.ItemDescription);
            String iName = et.getText().toString(); //gets name of item from box
            String iDesc = et2.getText().toString(); // gets item description from box
            ItemElement newItem = new ItemElement(); //creates new item and fills in fields
            newItem.itemName = iName;
            newItem.itemDescription = iDesc;
            newItem.position = iList.size(); //adds newly created item to the arraylist
            iList.add(newItem);
        }

        public void clickRemove(View v) {

            //int pos = ItemElement.position;
            //iList.remove(pos);
        }




}
