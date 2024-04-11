package com.atguigu.design.structual.adaptor.classMethod;

import com.atguigu.design.structual.adaptor.MoviePlayer;

public class MainTest {

    public static void main(String[] args) {

        MoviePlayer player = new MoviePlayer();
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(player);
        adapter.play();

    }
}