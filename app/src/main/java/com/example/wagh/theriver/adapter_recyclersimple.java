package com.example.wagh.theriver;

import android.support.v4.media.VolumeProviderCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagh on 17/1/17.
 */

public class adapter_recyclersimple extends RecyclerView.Adapter<adapter_recyclersimple.ViewHolder> {

    List<String> rlist;


    public adapter_recyclersimple()
    {
        super();

        rlist=new ArrayList<String>();

        rlist.add("Camera");
        rlist.add("Contacts");
        rlist.add("Storage");

    }


    @Override
    public adapter_recyclersimple.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View vv= LayoutInflater.from(parent.getContext()).inflate(R.layout.fmarsh,parent,false);

        ViewHolder viewHolder =new ViewHolder(vv);


        return viewHolder;
    }



   //data dalne ka kaam from list to actual textview    #repeat

    @Override
    public void onBindViewHolder(adapter_recyclersimple.ViewHolder holder, int position) {

        holder.cvtxt1.setText(rlist.get(position));

    }

    @Override
    public int getItemCount() {
        return rlist.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView cvtxt1;

        public ViewHolder(View cvtxt1)
        {
            super(cvtxt1);
            this.cvtxt1=(TextView)cvtxt1.findViewById(R.id.cvtxt1);
        }
    }


}
