package com.example.exprecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.VH> {
    Context c;

    public CustomAdapter(Context c) {
        this.c = c;
    }

    @NonNull
    @Override
    public CustomAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V=LayoutInflater.from(c).inflate(R.layout.layout_item,parent  ,false);
        VH myVH = new VH (V);
        return myVH;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.VH holder, int position) {
    holder.txtNom.setText(Animal.getLstAnimals().get(position).getNom());
    holder.img.setImageResource(Animal.getLstAnimals().get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return Animal.getLstAnimals().size();
    }

    public class VH extends  RecyclerView.ViewHolder {
        private TextView txtNom;
        private ImageView img;
        public VH(@NonNull View itemView) {
            super(itemView);
            txtNom=(TextView) itemView.findViewById(R.id.txtNom);
            img=(ImageView) itemView.findViewById(R.id.img);

        }

    }
}
