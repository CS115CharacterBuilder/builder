package lfg.characterbuilder;


import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Alex on 10/12/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private static ClickListener clickListener;
    private static LongClickListener longClickListener;
    private List<Character> characters;
    private static final int FOOTER_VIEW = 1;

    //Constructor for RVAdapter//
    RVAdapter(List<Character> characters){
        this.characters = characters;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        //View v;

       //if(i == FOOTER_VIEW){
           // v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false); //potential bug here
            //FooterViewHolder vh = new FooterViewHolder(v);
            //return vh;
        //}

        //else {
            View v2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false);
            CharacterViewHolder cvh = new CharacterViewHolder(v2);
            return cvh;
        //}

    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int i){

        try {
            if (holder instanceof CharacterViewHolder) {
                CharacterViewHolder cvh = (CharacterViewHolder) holder;
                //Do character stuff - seperate function?
                cvh.charName.setText(characters.get(i).getCharacterName());
                cvh.charClass.setText(characters.get(i).getCharacterClass());
                cvh.charPhoto.setImageResource(characters.get(i).getPhotoId());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount(){
        return characters.size();
    }

    @Override
    public int getItemViewType(int position){
        if (position == characters.size()){
            //Add footer here
            return FOOTER_VIEW;
        }
        return super.getItemViewType(position);
    }


    public void setOnItemClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void setOnLongItemClickListener(LongClickListener longClickListener){
        this.longClickListener = longClickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }

    public interface LongClickListener {
        void onLongItemClick(int position, View v);
    }


    public void deleteItem(int position){
        characters.remove(position);
        notifyItemRemoved(position);
    }

    public void insertItem(int position, Character newCharacter){
        characters.add(position, newCharacter);
        notifyItemInserted(position);
    }


    //Sub-Class: CharacterView Holder//
    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView charName;
        TextView charClass;
        ImageView charPhoto;

        //Constructor for CharacterViewHolder class
        CharacterViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            //itemView.setOnClickListener(clickListener);
            charName = (TextView)itemView.findViewById(R.id.character_name);
            charClass = (TextView)itemView.findViewById(R.id.character_class);
            charPhoto = (ImageView)itemView.findViewById(R.id.character_photo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(getAdapterPosition(), v);
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v){
                    longClickListener.onLongItemClick(getAdapterPosition(),v);
                    return true;
                }
            });


        }

        //@Override
        //public void onClick(View v){
             //clickListener.onItemClick(getAdapterPosition(), v);
        //}

    }

    //FootViewHolder Sub-class
    public class FooterViewHolder extends RecyclerView.ViewHolder {
        public FooterViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    clickListener.onItemClick(getAdapterPosition(), v);
                }
            });
        }
    }











}
