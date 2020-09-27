package com.example.sleepyjoe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

//
// Name:    JoeObjectAdapter
// Purpose: Handle the Adpter, which means connect the datamodel to the Reccycleview
//          Connection to the Recyclerview is done via the ViewHolder.
//          The Adapter is called to create new items (in the form of ViewHolders).
//          Provides the viewholders with data.
//          Returns information about data (how many items…).
// Author:  Taco Bakker
// Date:    12-09-2020
//


public class JoeObjectAdapter extends RecyclerView.Adapter<JoeObjectViewHolder> {


    private Context context;
    public List<JoeObject> listJoeObject;
    private OnItemClickListener mListener;

    //
    // Constructor, this is where the initial data is passed to the adapter
    //
    public JoeObjectAdapter(Context context, List<JoeObject> listJoeObject) {
        this.context = context;
        this.listJoeObject = listJoeObject;
    }

    // Make the items clickable with a clicklistener

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @Override
    public JoeObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        return new JoeObjectViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(final JoeObjectViewHolder holder, final int position) {
        final JoeObject joeObject = listJoeObject.get(position);        // find the position in the list
        holder.JoePicture.setImageResource(joeObject.getmJoePicture()); // and change the contents
        holder.JoeTitle1.setText(joeObject.getmJoeTitle1());            // with the new values
        holder.JoeTitle2.setText(joeObject.getmJoeTitle2());            // from the array with the get-methods
    }

    @Override
    public int getItemCount() {
        return listJoeObject.size();
    }

}
