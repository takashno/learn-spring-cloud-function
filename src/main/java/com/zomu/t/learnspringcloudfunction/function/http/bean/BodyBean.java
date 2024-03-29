package com.zomu.t.learnspringcloudfunction.function.http.bean;

import java.io.Serializable;

/**
 * Body Bean.
 */
public class BodyBean implements Serializable {

    private String name;

    private String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
