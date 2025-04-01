package com.grepp.library.g_io.dto;

import java.io.Serializable;

// implements Serializable 붙여주는것만으로도 객체직렬화 가능
public class Music implements Serializable {

    private String artist;
    private String title;

    public Music(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Music{" +
            "artist='" + artist + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
