package com.example.alisubmission;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewShikigamiAdapter extends RecyclerView.Adapter<CardViewShikigamiAdapter.CardViewViewHolder > {

    private Context context;
    private ArrayList<Shikigami> listShikigami;

    public ArrayList<Shikigami> getListShikigami() {
        return listShikigami;
    }

    public void setListShikigami(ArrayList<Shikigami> listShikigami) {
        this.listShikigami = listShikigami;
    }

    public CardViewShikigamiAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewShikigamiAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_shikigami,viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewShikigamiAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        final Shikigami s = getListShikigami().get(i);

        Glide.with(context)
                .load(s.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgphoto);

        cardViewViewHolder.tvNama.setText(s.getNama());
        cardViewViewHolder.tvRemarks.setText(s.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnClickListtener(i, new CustomOnClickListtener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite " +getListShikigami().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnClickListtener(i, new CustomOnClickListtener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " +getListShikigami().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.imgphoto.setOnClickListener(new CustomOnClickListtener(i, new CustomOnClickListtener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
//                Intent intent = new Intent(context, DetailShikigamiActivity.class);
//                intent.putExtra("photo", s.getPhoto());
                Intent intent = new Intent(context, DetailShikigamiActivity.class);
            intent.putExtra("key", s);
                context.startActivity(intent);
            }
        }));


    }


    @Override
    public int getItemCount() {
        return getListShikigami().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
            ImageView imgphoto;
            TextView tvNama, tvRemarks;
            Button btnFavorite,btnShare;
            Shikigami shikigami;
            public CardViewViewHolder(View itemView){
                super(itemView);
                imgphoto = itemView.findViewById(R.id.img_item_photo);
                tvNama = itemView.findViewById(R.id.tv_item_name);
                tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
                btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
                btnShare = itemView.findViewById(R.id.btn_set_share);
            }

//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(context, DetailShikigamiActivity.class);
//            intent.putExtra("key", shikigami);
//            context.startActivity(intent);
//        }
    }
    }

