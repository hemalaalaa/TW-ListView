package com.myapplicationdev.android.tw_listview;

public class Module {
    private String name;
    private boolean star;

    public Module(String name, boolean star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public boolean isStar() {
        return star;
    }

}
