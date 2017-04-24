package com.aidb.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private String usernamel;
    private boolean favorite;

    public Gif(String name, LocalDate dateUploaded, String usernamel, boolean favorite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.usernamel = usernamel;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsernamel() {
        return usernamel;
    }

    public void setUsernamel(String usernamel) {
        this.usernamel = usernamel;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
