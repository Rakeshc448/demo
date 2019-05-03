package com.mobotechnology.bipinpandey.retrofit_handdirty.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NoticeList {

    @SerializedName("results")
    private ArrayList<Results> results;

    public ArrayList<Results> getNoticeArrayList() {
        return results;
    }

    public void setNoticeArrayList(ArrayList<Results> noticeArrayList) {
        this.results = noticeArrayList;
    }
}