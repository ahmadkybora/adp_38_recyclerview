package com.example.adp_38_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adp_38_recyclerview.Models.RecView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<RecView> userList;

    public Adapter (List<RecView> userList){
        this.userList = userList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.ViewHolder holder, int position) {
        int resource = userList.get(position).getImageview1();
        String name = userList.get(position).getTextview1();
        String msg = userList.get(position).getTextview3();
        String time = userList.get(position).getTextview2();
        String line = userList.get(position).getDivider();

        holder.setData(resource, name, msg, time, line);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;

        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview1);
            textView = itemView.findViewById(R.id.textview);
            textView = itemView.findViewById(R.id.textview2);
            textView = itemView.findViewById(R.id.textview3);
            divider = itemView.findViewById(R.id.divider);
        }

        public void setData(int resource, String name, String msg, String time, String line) {
            imageView.setImageResource(resource);
            textView.setText(name);
            textView3.setText(msg);
            textView2.setText(time);
            divider.setText(line);
        }
    }
}
