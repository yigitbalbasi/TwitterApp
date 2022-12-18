package com.yigitb.twitterappui.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yigitb.twitterappui.data.entity.Tweetler;
import com.yigitb.twitterappui.databinding.CardTasarimBinding;

import java.util.List;

public class TweetlerAdapter extends RecyclerView.Adapter<TweetlerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Tweetler> tweetlerListesi;

    public TweetlerAdapter(Context mContext, List<Tweetler> tweetlerListesi) {
        this.mContext = mContext;
        this.tweetlerListesi = tweetlerListesi;
    }



    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding
                .inflate(LayoutInflater.from(mContext),
                        parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Tweetler tweet = tweetlerListesi.get(position);
        CardTasarimBinding t = holder.binding;
        t.textViewKullaniciAdi.setText(tweet.getKisi_ad());
        t.textViewNick.setText(tweet.getKisi_nick());
        t.textViewSaat.setText(tweet.getZaman());
        t.textViewTweet.setText(tweet.getTweet());


        

    }

    @Override
    public int getItemCount() {
        return tweetlerListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;

        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}
