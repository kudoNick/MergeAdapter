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
import com.example.mergeadapter.moder.First;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.FirstHolder> {

    List<First> firstList;
    Context context;

    public FirstAdapter(List<First> firstList, Context context) {
        this.firstList = firstList;
        this.context = context;
    }


    @NonNull
    @Override
    public FirstAdapter.FirstHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first, parent, false);
        FirstHolder firstHolder = new FirstHolder(view);

        return firstHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FirstAdapter.FirstHolder holder, final int position) {
        First first = firstList.get(position);

        String a = first.getImgHead();
        Picasso.get().load(first.getImgHead()).into(holder.imgHead);

        holder.imgHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Đây là FirstAdapter!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return firstList.size();
    }

    public class FirstHolder extends RecyclerView.ViewHolder {
        private ImageView imgHead;
        public FirstHolder(@NonNull View itemView) {
            super(itemView);
            imgHead = itemView.findViewById(R.id.imgHeadle);


        }
    }
}
