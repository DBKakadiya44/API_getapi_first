package com.example.api_getapi_first;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    MainActivity mainActivity;
    ArrayList<DataModel> list;

    public RecyclerAdapter(MainActivity mainActivity, ArrayList<DataModel> list) {
        this.mainActivity = mainActivity;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recycler_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.id.setText("ID : "+list.get(position).getId());
        holder.name.setText("NAME : "+list.get(position).getName());
        holder.username.setText("USERNAME : "+list.get(position).getUsername());
        holder.email.setText("E-mail : "+list.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id,name,username,email;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            name=itemView.findViewById(R.id.name);
            username=itemView.findViewById(R.id.username);
            email=itemView.findViewById(R.id.email);
        }
    }
}
