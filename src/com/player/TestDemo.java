package com.player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
//        testDemo.testSong();
//        testDemo.testPlayList();
//        testDemo.testPlayListCollection();
        testDemo.test();

    }


    // 主菜单
    public void mainMenu() {
        System.out.println("*********************************");
        System.out.println("          **主菜单**");
        System.out.println("          1--播放列表管理");
        System.out.println("          2--播放器管理");
        System.out.println("          0--退出");
        System.out.println("*********************************");
    }

    // 播放列表管理菜单
    public void playListMenu() {
        System.out.println("*********************************");
        System.out.println("          **播放列表管理**");
        System.out.println("          1--将歌曲添加到主播放列表");
        System.out.println("          2--将歌曲添加到普通播放列表");
        System.out.println("          3--通过歌曲id查询播放列表中的歌曲");
        System.out.println("          4--通过歌曲名称查询播放列表中的歌曲");
        System.out.println("          5--修改播放列表中的歌曲");
        System.out.println("          6--删除播放列表中的歌曲");
        System.out.println("          7--显示播放列表中的所有歌曲");
        System.out.println("          8--导出歌单");
        System.out.println("          9--返回上一级菜单");
        System.out.println("*********************************");
    }

    // 播放器管理菜单
    public void playerMenu() {
        System.out.println("*********************************");
        System.out.println("          **播放器管理**");
        System.out.println("          1--向播放器添加播放列表");
        System.out.println("          2--从播放器删除播放列表");
        System.out.println("          3--通过名字查询播放列表信息");
        System.out.println("          4--显示所有播放列表名称");
        System.out.println("          5--导出播放列表");
        System.out.println("          9--返回上一级菜单");
        System.out.println("*********************************");
    }

    public void test() {
        Scanner scanner = new Scanner(System.in);
        int input = 0, input1 = 0, input2 = 0;
        TestDemo testDemo = new TestDemo();
        // 创建播放列表集合对象
        PlayListCollection playListCollection = new PlayListCollection();
        // 创建主播放列表
        PlayList mainPlayList = new PlayList("主播放列表");
        playListCollection.addPlayList(mainPlayList);
        PlayList favouritePlayList = null;
        while (true) {
            testDemo.mainMenu();
            System.out.println("请输入对应的数字选择功能：");
            try {

                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入有误，请重新输入！");
                scanner.next();
                continue;
            }

            if (input == 0) {
                System.out.println("感谢使用！");
                break;
            }
            switch (input) {
                case 1:
                    while (true) {
                        testDemo.playListMenu();
                        System.out.println("请输入对应的数字，对播放列表进行管理：");
                        try {
                            input1 = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("输入有误，请重新输入！");
                            scanner.next();
                            continue;
                        }
                        if (input1 == 9) {
                            break;
                        }
                        switch (input1) {
                            case 1:
                                // 将歌曲添加到主播放列表
                                System.out.println("请输入要添加的歌曲数量：");
                                int num = 0;
                                try {
                                    num = scanner.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("输入有误，请重新输入！");
                                    scanner.next();
                                    continue;
                                }
                                for (int i = 1; i <= num; i++) {
                                    System.out.println("请输入第" + i + "首歌曲信息：");
                                    String id = null, name = null, singer = null;
                                    try {
                                        System.out.println("请输入歌曲id：");
                                        id = scanner.next();
                                        System.out.println("请输入歌曲名称：");
                                        name = scanner.next();
                                        System.out.println("请输入演唱者：");
                                        singer = scanner.next();

                                    } catch (InputMismatchException e) {
                                        System.out.println("输入有误，请重新输入！");
                                        scanner.next();
                                        continue;
                                    }
                                    Song song = new Song(id, name, singer);
                                    // 将歌曲添加到主播放列表
                                    mainPlayList.addToPlayList(song);
                                }
                                break;
                            case 2:
                                // 将歌曲添加到普通播放列表
                                System.out.println("请输入要添加的播放列表名称：");
                                String playListName = null;
                                try {
                                    playListName = scanner.next();
                                } catch (InputMismatchException e) {
                                    System.out.println("输入有误，请重新输入！");
                                    scanner.next();
                                    continue;
                                }
                                favouritePlayList = playListCollection.searchPlayListByName(playListName);
                                if (favouritePlayList == null) {
                                    System.out.println("该播放列表不存在！,请现在播放器中创建！");
                                    break;
                                }

                                System.out.println("请输入要添加的歌曲数量：");
                                int num1 = 0;
                                try {
                                    num1 = scanner.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("输入有误，请重新输入！");
                                    scanner.next();
                                    continue;
                                }
                                for (int i = 1; i <= num1; i++) {
                                    System.out.println("请输入第" + i + "首歌曲信息：");
                                    String id = null, name = null, singer = null;
                                    System.out.println("请输入歌曲id：");
                                    id = scanner.next();

                                    // 通过id查询歌曲
                                    Song song = mainPlayList.searchSongById(id);
                                    if (song == null) {
                                        // 如果不存在则创建新的添加，并且添加到主播放列表
                                        System.out.println("该歌曲在主播放列表中不存在，继续输入相关信息！");
                                        System.out.println("请输入歌曲名称：");
                                        name = scanner.next();
                                        System.out.println("请输入演唱者：");
                                        singer = scanner.next();
                                        Song song1 = new Song(id, name, singer);
                                        mainPlayList.addToPlayList(song1);
                                        favouritePlayList.addToPlayList(song1);
                                    } else {
                                        // 如果存在则直接添加到播放列表
                                        favouritePlayList.addToPlayList(song);
                                    }
                                }
                                break;
                            case 3:
                                // 通过歌曲id查询播放列表中的歌曲
                                break;
                            case 4:
                                // 通过歌曲名称查询播放列表中的歌曲
                                break;
                            case 5:
                                // 修改播放列表中的歌曲
                                break;
                            case 6:
                                // 删除播放列表中的歌曲
                                break;
                            case 7:
                                // 显示播放列表中的所有歌曲
                                break;
                            case 8:
                                // 导出歌单
                                break;
                            default:
                                System.out.println("输入有误，请重新输入！");
                                break;
                        }
                    }
                    break;
                case 2:
                    // 播放器管理
                    testDemo.playerMenu();
                    System.out.println("请输入对应的数字，对播放器进行管理：");
                    try {
                        input2 = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("输入有误，请重新输入！");
                        scanner.next();
                        continue;
                    }
                    if (input2 == 9) {
                        break;
                    }
                    switch (input2) {
                        case 1:
                            // 向播放器添加播放列表
                            System.out.println("请输入要添加的播放列表名称：");
                            String playListName = null;
                            try {
                                playListName = scanner.next();
                            } catch (InputMismatchException e) {
                                System.out.println("输入有误，请重新输入！");
                                scanner.next();
                                continue;
                            }
                            favouritePlayList = new PlayList(playListName);
                            playListCollection.addPlayList(favouritePlayList);
                            break;
                        case 2:
                            // 从播放器删除播放列表
                            break;
                        case 3:
                            // 通过名字查询播放列表信息
                            break;
                        case 4:
                            // 显示所有播放列表名称
                            break;
                        case 5:
                            // 导出播放列表
                            break;
                        default:
                            System.out.println("输入有误，请重新输入！");
                            break;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }

        }

    }

    // 对歌曲类Song进行测试的方法
    public void testSong() {
        Song song1 = new Song("1", "七里香", "周杰伦");
        Song song2 = new Song("1", "七里香", "周杰伦");
        Song song3 = new Song("2", "发如雪", "周杰伦");

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
        System.out.println("song1和song2是否相等：" + song1.equals(song2));
        System.out.println("song1和song3是否相等：" + song1.equals(song3));
    }

    // 对播放列表类PlayList进行测试的方法
    public void testPlayList() {
        PlayList playList = new PlayList("我的最爱");
        Song song1 = new Song("1", "七里香", "周杰伦");
        Song song2 = new Song("2", "发如雪", "周杰伦");
        Song song3 = new Song("3", "夜曲", "周杰伦");

        playList.addToPlayList(song1);
        playList.addToPlayList(song2);
        playList.addToPlayList(song3);
        playList.addToPlayList(song1);

        playList.displayAllSong();

        // 根据id查询歌曲
        Song song = playList.searchSongById("2");
        if (song != null) {
            System.out.println("查询结果为：" + song);
        } else {
            System.out.println("该歌曲不存在！");
        }

        // 根据名称查询歌曲
        Song song4 = playList.searchSongByName("夜曲");
        if (song4 != null) {
            System.out.println("查询结果为：" + song4);
        } else {
            System.out.println("该歌曲不存在！");
        }
        // 修改歌曲信息
        Song songUpdate = new Song("s005", "蜗牛与黄鹂鸟", "李健");
        playList.updateSong("1", songUpdate);
        playList.displayAllSong();
        // 删除歌曲
        playList.deleteSong("s005");
        playList.displayAllSong();


    }

    // 测试类
    public void testPlayListCollection() {
        Song song1 = new Song("1", "七里香", "周杰伦");
        Song song2 = new Song("1", "七里香", "周杰伦");
        Song song3 = new Song("2", "发如雪", "周杰伦");
        // 创建一个主播放列表
        PlayList mainPlayList = new PlayList("主播放列表");
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        mainPlayList.addToPlayList(song3);
        mainPlayList.displayAllSong();
        System.out.println("*******************");
        // 定义一个新的播放列表，从主播放列表中添加歌曲进来
        PlayList favouritePlayList = new PlayList("最喜欢的歌曲");
        Song song4 = new Song("4", "以父之名", "周杰伦");
        favouritePlayList.addToPlayList(song4);
        favouritePlayList.addToPlayList(mainPlayList.searchSongById("2"));
        favouritePlayList.addToPlayList(mainPlayList.getMusicList().get(1));
        favouritePlayList.displayAllSong();
        System.out.println("*******************");
        // 创建播放列表集合对象
        PlayListCollection playListCollection = new PlayListCollection();
        playListCollection.addPlayList(mainPlayList);
        playListCollection.addPlayList(favouritePlayList);

        PlayList playList = playListCollection.searchPlayListByName("最喜欢的歌曲");
        System.out.println("最喜欢的列表中的所有歌曲为：");
        playList.displayAllSong();

        // 删除播放列表信息
        System.out.println("********删除播放列表信息***********");
        System.out.println("删除前的播放列表：");
        playListCollection.displayAllPlayList();
        playListCollection.deletePlayList(favouritePlayList);
        System.out.println("删除后的播放列表：");
        playListCollection.displayAllPlayList();


//        playListCollection.displayAllPlayList();


    }
}
