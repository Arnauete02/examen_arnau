package com.example.examen_arnau;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Guide> mGuides;
    private Context mContext;
    private DetailFragment detailFragment;

    public MyAdapter(ArrayList<Guide> mGuides, Context mContext) {
        this.mGuides = mGuides;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.my_row, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.guideName.setText(mGuides.get(position).getGuideName());
        holder.guideCity.setText(mGuides.get(position).getGuideCity());
        holder.guidePrice.setText(mGuides.get(position).getGuidePrice());
        holder.guideImage.setImageResource(mGuides.get(position).getGuideImage());

        holder.my_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detailFragment = DetailFragment.newInstance("a", "b");
            }
        });
    }

    @Override
    public int getItemCount() {
        return mGuides.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView guideImage;
        private TextView guideName;
        private TextView guideCity;
        private TextView guidePrice;

        ConstraintLayout my_row;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            guideImage = itemView.findViewById(R.id.guideImage);
            guideName = itemView.findViewById(R.id.guideName);
            guideCity = itemView.findViewById(R.id.guideCity);
            guidePrice = itemView.findViewById(R.id.guidePrice);

            my_row = itemView.findViewById(R.id.my_row);
        }
    }
}
