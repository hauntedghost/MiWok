package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by batman on 10/1/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_text_2, parent, false);
        }

        //Get the Miwok word object located at this position in the list
        Word MiwokTranslation = getItem(position);

        // Find the TextView in the list_text_2.xml layout with the ID text1
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokText);
        //Get the Miwok translation from the Word object and
        //set this text on the Miwok TextView
        miwokTextView.setText(MiwokTranslation.getMiwokTranslation());


        //Get the Miwok word object located at this position in the list
        Word DefaultTranslation = getItem(position);
        // Find the TextView in the list_text_2.xml layout with the ID text2
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultText);
        //Get the default translation from the Word object and
        //set this text on the default TextView
        defaultTextView.setText(DefaultTranslation.getDefaultTranslation());


        return listItemView;
    }
}
