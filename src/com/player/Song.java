package com.player;

import java.util.Objects;

public class Song {
    // 歌曲编号
    private String id;
    // 歌曲名称
    private String name;
    // 歌手
    private String singer;

    public Song() {
    }

    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) && Objects.equals(name, song.name) && Objects.equals(singer, song.singer);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((singer == null) ? 0 : singer.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "歌曲信息：id为" + id + ", 歌曲名称为" + name + ", 歌手为" + singer;
    }
}
