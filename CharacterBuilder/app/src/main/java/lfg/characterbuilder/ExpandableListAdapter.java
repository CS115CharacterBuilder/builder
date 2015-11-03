package lfg.characterbuilder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 11/2/2015.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<SkillElement>> skillsCollections;
    private List<SkillElement> skills;

    public class SkillElement {
        String name;
        String type;
        String val;
        boolean prof;
    }

    public ExpandableListAdapter(Activity context, List<SkillElement> skills, Map<String, List<SkillElement>> skillsCollections) {
        this.context = context;
        this.skills = skills;
        this.skillsCollections = skillsCollections;
    }

    public Object getChild(int groupPosition, int childPosition) {
        return skillsCollections.get(skills.get(groupPosition)).get(childPosition);
    }

    public long getChildID(int groupPosition, int childPosition) {
        return childPosition;
    }

    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final SkillElement skill =  getChild(groupPosition, childPosition);
        final String skillType = (String) getGroup(groupPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.skillelement, null);
        }

        TextView  sName = (TextView) convertView.findViewById(R.id.sNameTxt);
        TextView sMod = (TextView) convertView.findViewById(R.id.sModTxt);
        TextView AttTxt = (TextView) convertView.findViewById(R.id.AttTxt);

        sName.setText(skill);
        sMod.setText();
        AttTxt.setText(skillType);
        }
    }

}
