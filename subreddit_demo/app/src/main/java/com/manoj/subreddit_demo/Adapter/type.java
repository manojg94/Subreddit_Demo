package com.manoj.subreddit_demo.Adapter;

import java.util.ArrayList;

public class type {
    private String name;

    public type(String name, ArrayList subnames) {
        this.name = name;
        this.subnames = subnames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getSubnames() {
        return subnames;
    }

    public void setSubnames(ArrayList subnames) {
        this.subnames = subnames;
    }

    private ArrayList subnames;
}
