package com.atguigu.design.structual.adaptor.objMethod;

import com.atguigu.design.structual.adaptor.MoviePlayer;
import com.atguigu.design.structual.adaptor.Player;
import com.atguigu.design.structual.adaptor.Translator;
import com.atguigu.design.structual.adaptor.Zh_JpTranslator;

public class JPMoviePlayerAdapter implements Player {
    private Translator translator = new Zh_JpTranslator();
    private Player target;

    public JPMoviePlayerAdapter(MoviePlayer target) {
        this.target = target;
    }

    @Override
    public String play() {
        String play = target.play();
        String translate = translator.translate(play);
        System.out.println("日文：" + translate);
        return play;
    }
}
