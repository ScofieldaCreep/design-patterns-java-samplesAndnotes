package com.atguigu.design.structual.adaptor;

public class MoviePlayer implements Player {
    @Override
    public String play() {
        System.out.println("正在播放：小黄片.mov");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
