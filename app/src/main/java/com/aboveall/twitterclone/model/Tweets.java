package com.aboveall.twitterclone.model;

public class Tweets {


    private String name;
    private String username;
    private String tweet;
    private String time;
    private int comment;
    private int retweet;
    private int likes;
    private int image;

    public Tweets(String name, String username, String tweet, String time, int comment, int retweet, int likes, int image) {
        this.name = name;
        this.username = username;
        this.tweet = tweet;
        this.time = time;
        this.comment = comment;
        this.retweet = retweet;
        this.likes = likes;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getRetweet() {
        return retweet;
    }

    public void setRetweet(int retweet) {
        this.retweet = retweet;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
