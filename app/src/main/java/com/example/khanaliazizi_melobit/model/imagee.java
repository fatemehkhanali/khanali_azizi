package com.example.khanaliazizi_melobit.model;

import java.util.List;

public class imagee
{
    List<slider> slider;
    List<thumbnail_small> thumbnail_small;
    List<thumbnail> thumbnail;
    List<cover_small> cover_small;
    List<cover> cover;

    public List<com.example.khanaliazizi_melobit.model.slider> getSlider() {
        return slider;
    }

    public void setSlider(List<com.example.khanaliazizi_melobit.model.slider> slider) {
        this.slider = slider;
    }

    public List<com.example.khanaliazizi_melobit.model.thumbnail_small> getThumbnail_small() {
        return thumbnail_small;
    }

    public void setThumbnail_small(List<com.example.khanaliazizi_melobit.model.thumbnail_small> thumbnail_small) {
        this.thumbnail_small = thumbnail_small;
    }

    public List<com.example.khanaliazizi_melobit.model.thumbnail> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(List<com.example.khanaliazizi_melobit.model.thumbnail> thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<com.example.khanaliazizi_melobit.model.cover_small> getCover_small() {
        return cover_small;
    }

    public void setCover_small(List<com.example.khanaliazizi_melobit.model.cover_small> cover_small) {
        this.cover_small = cover_small;
    }

    public List<com.example.khanaliazizi_melobit.model.cover> getCover() {
        return cover;
    }

    public void setCover(List<com.example.khanaliazizi_melobit.model.cover> cover) {
        this.cover = cover;
    }
}
