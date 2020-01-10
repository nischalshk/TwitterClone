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
        tweetsList.add(new Tweets("Donald J. Trump" ,"TheRealOne","Heading to 2020 with a bang","1hr",112,1221,200, R.drawable.don));
        tweetsList.add(new Tweets("Chris Do" ,"TheBaldOne","123","1",14,14,11, R.drawable.man1));
        tweetsList.add(new Tweets("Narendra Modi" ,"9801234567","123","1",1,1,1, R.drawable.modi));
        tweetsList.add(new Tweets("Donald J. Trump" ,"TheRealOne","123","30min",12,112,102, R.drawable.don));
        tweetsList.add(new Tweets("Kp Sharma Oli" ,"Oli","123","1",1,1,1, R.drawable.kp));
        tweetsList.add(new Tweets("Barack Obama" ,"ObamaO","The catastrophic fires in Australia are the latest example of the very real and very urgent consequences of climate change.","11",11,123,114, R.drawable.obama));
        tweetsList.add(new Tweets("Chris Do" ,"9801234567","123","1",1,1,1, R.drawable.man1));
        tweetsList.add(new Tweets("Donald J. Trump" ,"TheRealOne","123","1",1,1,1, R.drawable.don));
        tweetsList.add(new Tweets("Barack Obama" ,"ObamaO","It’s on us to stay focused and protect the one planet we’ve got for the next generation","15",14,11,15, R.drawable.obama));

        TweetAdapter tweetsAdapter = new TweetAdapter(getActivity(), tweetsList);
        recylcerTweet.setAdapter(tweetsAdapter);

        //Display all the contacts in linear layour (vertically)
        recyclerTweet.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;

      
    }
}