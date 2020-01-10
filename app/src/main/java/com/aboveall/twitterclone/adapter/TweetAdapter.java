package com.aboveall.twitterclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aboveall.twitterclone.R;
import com.aboveall.twitterclone.model.Tweets;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.TweetsViewHolder> {



    Context context;
    List<Tweets> tweetsList;

    public TweetAdapter(Context context, List<Tweets> tweetsList) {
        this.context = context;
        this.tweetsList = tweetsList;
    }

    @NonNull
    @Override
    public TweetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tweet_card,parent,false);
        return new TweetsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TweetsViewHolder holder, int position) {
        final Tweets tweets = tweetsList.get(position);

        holder.imgProfile.setImageResource(tweets.getImage());
        holder.nameTv.setText(tweets.getName());
        holder.usernameTv.setText(tweets.getUsername());
        holder.tweetTv.setText(tweets.getTweet());
        holder.timeTv.setText(tweets.getTime());
        holder.commentNoTv.setText(tweets.getComment());
        holder.retweetNoTv.setText(tweets.getRetweet());
        holder.likesNoTv.setText(tweets.getLikes());

    }

    @Override
    public int getItemCount() {
        return tweetsList.size();
    }

    public class TweetsViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgProfile;
        TextView nameTv,usernameTv,tweetTv,timeTv,commentNoTv,retweetNoTv,likesNoTv;

        public TweetsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            nameTv = itemView.findViewById(R.id.nameTv);
            usernameTv = itemView.findViewById(R.id.usernameTv);

            tweetTv = itemView.findViewById(R.id.tweetTv);
            timeTv = itemView.findViewById(R.id.timeTv);
            commentNoTv = itemView.findViewById(R.id.commentNoTv);
            retweetNoTv = itemView.findViewById(R.id.retweetNoTv);
            likesNoTv = itemView.findViewById(R.id.likesNoTv);



        }
    }
}



