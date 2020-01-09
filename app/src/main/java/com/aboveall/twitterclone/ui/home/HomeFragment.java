package com.aboveall.twitterclone.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aboveall.twitterclone.R;
import com.aboveall.twitterclone.adapter.TweetAdapter;
import com.aboveall.twitterclone.model.Tweets;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recylcerTweet;
    private RecyclerView recyclerTweet;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recylcerTweet=root.findViewById(R.id.recyclerTweet);


        // Create a list of contacts to display in RecyclerView
        List<Tweets> tweetsList = new ArrayList<>();
        // Adding all the contacts object in list
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Raju Shrestha" ,"9801234567","123","1",1,1,1, R.drawable.man1));

        TweetAdapter tweetsAdapter = new TweetAdapter(getActivity(), tweetsList);
        recylcerTweet.setAdapter(tweetsAdapter);

        //Display all the contacts in linear layour (vertically)
        recyclerTweet.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;

      
    }
}