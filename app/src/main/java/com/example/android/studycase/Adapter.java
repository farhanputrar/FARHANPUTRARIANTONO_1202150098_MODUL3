package com.example.android.studycase;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by u farhan putra riantono 25/02/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private GradientDrawable gradient;
    private ArrayList<Model> data;
    private Context konteks;

    Adapter(Context konteks, ArrayList<Model> data) {
        this.data = data;
        this.konteks = konteks;

        gradient = new GradientDrawable();
        gradient.setColor(Color.CYAN);

        Drawable drawable = ContextCompat.getDrawable(konteks, R.drawable.ades);
        if (drawable != null) {
            gradient.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(konteks, LayoutInflater.from(konteks).inflate(R.layout.listbarang, parent, false), gradient);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Model currentModel = data.get(position);

        holder.bindTo(currentModel);
        Glide.with(konteks).load(currentModel.getImage()).into(holder.mImage);
    }

    @Override
    public int getItemCount(){ return data.size(); }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView image;
        private TextView title;
        private TextView info;
        private Context kontex;
        private Model newmodel;
        private GradientDrawable gradient;

        ViewHolder (Context context, View itemView GradientDrawable gradientDrawable){
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.FotoIkon);
            title = (TextView) itemView.findViewById(R.id.Judul);
            info = (TextView) itemView.findViewById(R.id.TeksDeskrip);

            konteks = context;
            gradient = gradientDrawable;

            itemView.setOnClickListener(this);
        }

        void bindTo (Model currentModel){
            title.setText(currentModel.getTitle());
            info.setText(currentModel.getInfo());

            newmodel = currentModel;

            Glide.with(kontex).load(currentModel.getImage()).placeholder(gradient).into(image);
        }

        public void onClick(View view) {
            Intent detail = Model.starter(kontex, newmodel.getTitle(), newmodel.getImage());
            mContext.startActivity(detail);
        }


    }

}