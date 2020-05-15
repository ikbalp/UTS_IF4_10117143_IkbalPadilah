package com.ikbalp.introscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapterMusic extends RecyclerView.Adapter<RVAdapterMusic.ViewHolderMusic> {
    String data1[], data2[];
    int images[];
    Context context;

    public RVAdapterMusic(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public RVAdapterMusic.ViewHolderMusic onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.row_music, parent, false);
        return new RVAdapterMusic.ViewHolderMusic(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapterMusic.ViewHolderMusic holder, int position) {
        holder.listtitlemusic.setText(data1[position]);
        holder.listmusic.setText(data2[position]);
        holder.img_music_view.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderMusic extends RecyclerView.ViewHolder {

        TextView listtitlemusic, listmusic;
        ImageView img_music_view;

        public ViewHolderMusic(@NonNull View itemView) {
            super(itemView);
            listtitlemusic = itemView.findViewById(R.id.listtitlemusic);
            listmusic = itemView.findViewById(R.id.listmusic);
            img_music_view = itemView.findViewById(R.id.img_music_view);

        }
    }
}


