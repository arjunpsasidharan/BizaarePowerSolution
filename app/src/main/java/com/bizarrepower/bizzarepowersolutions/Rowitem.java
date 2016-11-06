package com.bizarrepower.bizzarepowersolutions;

/**
 * Created by Bizarre on 18-10-2016.
 */
public class Rowitem {
    private int imageid;
    private String title;
    private String desc;


    public Rowitem(int imageid, String title, String desc) {
        this.imageid = imageid;
        this.title = title;
        this.desc = desc;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return title + "\n "+ desc;
    }
}


