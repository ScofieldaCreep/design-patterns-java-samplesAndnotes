package com.atguigu.design.structual.adaptor.classMethod;

import com.atguigu.design.structual.adaptor.Player;
import com.atguigu.design.structual.adaptor.Zh_JpTranslator;

/*
 * 类结构模型，适配转换到了翻译器的功能上
 * */
public class JPMoviePlayerAdapter extends Zh_JpTranslator implements Player {
    private Player target;

    public JPMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {
        String play = target.play();
        String translate = translate(play);
        System.out.println("日文:" + translate);
        return "haha" + play;
    }
}
