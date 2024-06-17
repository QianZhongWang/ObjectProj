package com.player;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String playListName;
    private List<Song> musicList;

    public PlayList() {
    }

    public PlayList(String playListName) {
        this.playListName = playListName;
        musicList = new ArrayList<Song>();
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    /**
     * 添加歌曲到播放列表
     *
     * @param song 歌曲
     */
    public void addToPlayList(Song song) {
        // 判断歌曲是否已经存在
        if (musicList.contains(song)) {
            System.out.println("歌曲已经存在！，添加失败！");
        } else {
            musicList.add(song);
            System.out.println("歌曲添加成功！");
        }
    }

    /**
     * 根据Id查询歌曲
     *
     * @param id 歌曲id
     */
    public Song searchSongById(String id) {
        Song song = null;
        for (Song s : musicList) {
            if (s.getId().equals(id)) {
                song = s;
                break;
            }
        }
        return song;
    }

    /**
     * 根据歌曲名称查询歌曲
     *
     * @param name 歌曲名称
     */
    public Song searchSongByName(String name) {
        Song song = null;
        for (Song s : musicList) {
            if (s.getName().equals(name)) {
                song = s;
                break;
            }
        }
        return song;
    }


    /**
     * 查询并显示播放列表中的所有歌曲
     */
    public void displayAllSong() {
        System.out.println("播放列表中的所有歌曲为：");
        for (Song song : musicList) {
            System.out.println(song);
        }
    }

    /**
     * 修改播放列表中的歌曲信息
     *
     * @param id   歌曲id
     * @param song 新的歌曲信息
     */
    public void updateSong(String id, Song song) {
        Song oldSong = searchSongById(id);
        if (oldSong != null) {
            musicList.remove(oldSong);
            musicList.add(song);
            System.out.println("歌曲信息修改成功！");
        } else {
            System.out.println("该歌曲不存在！");
        }
    }

    /**
     * 删除播放列表中的歌曲
     * @param id 歌曲id
     */
    public void deleteSong(String id){
        Song song = searchSongById(id);
        if (song != null) {
            musicList.remove(song);
            System.out.println("歌曲删除成功！");
        } else {
            System.out.println("该歌曲不存在！");
        }
    }


}
