package com.example.adarshkumar.book;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListItem listItem=listItems.get(position);

        holder.semester.setText(listItem.getSemester());
        holder.code.setText(listItem.getCode());
        holder.name.setText(listItem.getName());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,Download.class);
                intent.putExtra("downloadLink",listItem.getDownloadlink());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public  class  ViewHolder extends  RecyclerView.ViewHolder{

        public TextView semester;
        public TextView code;
        public  TextView name;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            semester=(TextView) itemView.findViewById(R.id.semester);
            code=(TextView) itemView.findViewById(R.id.code);
            name=(TextView) itemView.findViewById(R.id.name);
            linearLayout=(LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}