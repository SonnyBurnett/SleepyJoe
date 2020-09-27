package com.example.sleepyjoe;

//
// Name:    JoeObjectViewHolder
// Purpose: Handle the viewholder, which means translate the layout of the object in the Contentview to the Recycleview
//          It is the very object that represents each item in our collection and will be used to display it.
//          In other words: Used to provide the RecyclerView with new views when needed.
//          For example when scrolling
// Author:  Taco Bakker
// Date:    12-09-2020
//

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class JoeObjectViewHolder extends RecyclerView.ViewHolder {


    public TextView JoeTitle1;
    public TextView JoeTitle2;
    public ImageView JoePicture;

    public View view;

    public JoeObjectViewHolder(View itemView) {
        super(itemView);
        JoeTitle1 = itemView.findViewById(R.id.firstLine);
        JoeTitle2 = itemView.findViewById(R.id.secondLine);
        JoePicture = itemView.findViewById(R.id.icon);
        view = itemView;
    }

}
