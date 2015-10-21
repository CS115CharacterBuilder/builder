package lfg.characterbuilder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alex on 10/11/2015.
 */
public class NavBarAdapter extends ArrayAdapter<String> {

    //Local Fields: Activity to run nav bar, string array
    //to hold image names, integer array to hold image indexe
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    //Constructor
    public NavBarAdapter(Activity context, String[] itemname, Integer[] imgid) {

        //Set the context to the nav bar's layout and assign the parameters
        super(context,R.layout.activity_nav_bar,itemname);
        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    //getView - Returns a reference to an inflated row view filled
    //filled with the contents of this NavBar Adapter
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_nav_bar, null, true);

        //Each 'view' in the NavBar will consist of one image with text
        ImageView imgView = (ImageView) rowView.findViewById(R.id.nav_list_icon);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.nav_list_text);

        //Set these to the specified position in the array
        txtTitle.setText(itemname[position]);
        imgView.setImageResource(imgid[position]);

        return rowView;
    }

}
