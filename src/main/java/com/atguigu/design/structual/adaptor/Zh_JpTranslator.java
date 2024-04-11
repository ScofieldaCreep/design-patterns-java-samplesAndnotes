package com.atguigu.design.structual.adaptor;

public class Zh_JpTranslator implements Translator {
    @Override
    public String translate(String content) {
        if ("你好".equals(content)) {
            return "空你急哇";
        } else if ("什么".equals(content)) {
            return "纳尼";
        }
        return "******";
    }
}
