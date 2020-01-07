package com.aboveall.twitterclone.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aboveall.twitterclone.R;
import com.airbnb.lottie.LottieAnimationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class IntroFragment extends Fragment {


    @BindView(R.id.intro_lottie_animation_view)
    LottieAnimationView mLottie;
    private Unbinder mUnbinder;

    public static IntroFragment newInstance(Context context) {
        return (IntroFragment) IntroFragment.instantiate(context, IntroFragment.class.getName());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_splash, container, false);
        mUnbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        mLottie.playAnimation();
    }

    @Override
    public void onStop() {
        super.onStop();
        mLottie.cancelAnimation();
    }
}