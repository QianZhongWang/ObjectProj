### 类
- 歌曲类  Song
- 播放列表类 PlayList
- 播放器类 PlayListCollection
- 测试类 TestDemo

### Song类


- 属性
    - 歌曲id String id
    - 歌曲名字 String name
    - 歌手 String singer
- 方法
    - 构造方法
    - get/set方法
    - hashCode()和equals()方法
    - toString() 方法：输出歌曲的id、名字、歌手信息

### PlayList类
- 属性
    - 播放列表名称 String playListName
    - 歌曲列表 ArrayList<Song> musicList
- 方法
    - 构造方法
    - get/set方法
    - 将歌曲添加到播放列表中 public boolean addToPlayList(Song song)
    - 显示播放列表中所有歌曲 public void displayAllSong()
    - 通过id查询歌曲 public Song searchSongById(String id)
    - 通过名字查询歌曲 public Song searchSongByName(String name)
    - 修改歌曲 public boolean updateSong(String id, Song song)

### PlayListCollection类
- 属性
    - 存放播放列表的集合(playListMap): Map<String, PlayList>
- 方法
    - 构造方法
    - getter/setter方法
    - 添加播放列表 public void addPlayList(PlayList playList)
    - 删除播放列表 public void deletePlayList(PlayList playList)
    - 通过名字查询播放列表 public PlayList searchPlayListByName(String playListName)
    - 显示所有播放列表 public void displayListName()
