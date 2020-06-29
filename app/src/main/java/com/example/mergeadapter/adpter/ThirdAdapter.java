package com.example.mergeadapter.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mergeadapter.R;
import com.example.mergeadapter.moder.Third;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.ThirdHolder> {

    List<Third> thirdList;
    Context context;

    public ThirdAdapter(List<Third> thirdList, Context context) {
        this.thirdList = thirdList;
        this.context = context;
    }


    @NonNull
    @Override
    public ThirdAdapter.ThirdHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.third, parent, false);
        ThirdHolder thirdHolder = new ThirdHolder(view);

        return thirdHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ThirdAdapter.ThirdHolder holder, int position) {
        Third third = thirdList.get(position);

        Picasso.get().load(third.getImgThird()).into(holder.imgThird);

        holder.imgThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Đây là ThirdAdapter!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return thirdList.size();
    }

    public class ThirdHolder extends RecyclerView.ViewHolder {
        private ImageView imgThird;
        public ThirdHolder(@NonNull View itemView) {
            super(itemView);

            imgThird = itemView.findViewById(R.id.imgThird);

        }
    }
}
