package com.player;

import java.util.HashMap;
import java.util.Map;

// 播放列表集合类
public class PlayListCollection {
    Map<String, PlayList> playListMap; // 存放播放列表集合

    public PlayListCollection() {
        playListMap = new HashMap<String, PlayList>();
    }

    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    /**
     * 向播放列表集合中添加播放列表
     *
     * @param playList 播放列表
     */
    public void addPlayList(PlayList playList) {
        playListMap.put(playList.getPlayListName(), playList);
    }

    /**
     * 根据播放列表名称查询播放列表
     *
     * @param playList 播放列表
     */
    public void deletePlayList(PlayList playList) {
        playListMap.remove(playList.getPlayListName());
    }

    /**
     * 根据播放列表名称查询播放列表
     * @param playListName 播放列表名称
     * @return 播放列表
     */
    public PlayList searchPlayListByName(String playListName) {
        PlayList playList = null;
        if (playListMap.containsKey(playListName)) {
            playList = playListMap.get(playListName);
        }
        return playList;
    }

    /**
     * 显示所有播放列表名称
     */
    public void displayAllPlayList() {
        for (String key : playListMap.keySet()) {
            System.out.println(key);
        }
    }

}
