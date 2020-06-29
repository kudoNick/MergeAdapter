package com.example.mergeadapter.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mergeadapter.R;
import com.example.mergeadapter.moder.Second;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondHolder> {

    List<Second> secondList;
    Context context;

    public SecondAdapter(List<Second> secondList, Context context) {
        this.secondList = secondList;
        this.context = context;
    }


    @NonNull
    @Override
    public SecondAdapter.SecondHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.second, parent, false);
        SecondHolder secondHolder = new SecondHolder(view);
        return secondHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SecondAdapter.SecondHolder holder, int position) {
        Second second = secondList.get(position);

        holder.tvBody.setText(second.getBody());

        Picasso.get().load(second.getImgBody()).into(holder.imgBody);
    }

    @Override
    public int getItemCount() {
        return secondList.size();
    }

    public class SecondHolder extends RecyclerView.ViewHolder {

        private TextView tvBody;
        private ImageView imgBody;
        public SecondHolder(@NonNull View itemView) {
            super(itemView);

            tvBody = itemView.findViewById(R.id.tvBody);
            imgBody = itemView.findViewById(R.id.imgBody);
        }
    }
}
