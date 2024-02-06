package com.example.emailapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewholder> {

    private List<Items> list;
    public ClickListner clickListner;

    public MyCustomAdapter(List<Items> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // inflate
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        //it returns the whole custom layout as an object which we stores in itemView and
        // since what we are returning is a view hence the type of itemView is view
        return new MyViewholder(itemView); // returns an instance of MyViewholder
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {

        // populate

        Items items = list.get(position);
        holder.desc.setText(items.getDesc());
        holder.star.setImageResource(items.getImage());
        holder.subject.setText(items.getSubject());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public void setClickListner(ClickListner clickListner){
        this.clickListner = clickListner;

}
    public class MyViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView subject,desc;
        ImageView star;


        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.subject);
            desc = itemView.findViewById(R.id.desc);
            star = itemView.findViewById(R.id.star);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(clickListner != null){
                clickListner.onClick(v,getAdapterPosition());
            }
        }
    }



}
