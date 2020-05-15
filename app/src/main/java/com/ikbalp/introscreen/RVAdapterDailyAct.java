package com.ikbalp.introscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapterDailyAct extends RecyclerView.Adapter<RVAdapterDailyAct.ViewHolderDailyact> {

    String data1[], data2[];
    int images[];
    Context context;

    public RVAdapterDailyAct(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public ViewHolderDailyact onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.row_dailyact, parent, false);
        return new ViewHolderDailyact(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDailyact holder, int position) {
        holder.dailyact_text.setText(data1[position]);
        holder.desc_dailyact_text.setText(data2[position]);
        holder.img_dailyact_view.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderDailyact extends RecyclerView.ViewHolder {

        TextView dailyact_text, desc_dailyact_text;
        ImageView img_dailyact_view;

        public ViewHolderDailyact(@NonNull View itemView) {
            super(itemView);
            dailyact_text = itemView.findViewById(R.id.dailyact_text);
            desc_dailyact_text = itemView.findViewById(R.id.desc_dailyact_text);
            img_dailyact_view = itemView.findViewById(R.id.img_dailyact_view);

        }
    }
}
