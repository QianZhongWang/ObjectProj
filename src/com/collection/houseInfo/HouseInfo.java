package com.collection.houseInfo;

public class HouseInfo {
    private String houseId; // 房屋编号
    private String houseName; // 房屋名称
    private String houseAddress; // 房屋地址
    private String houseType; // 房屋类型

    public HouseInfo() {
    }

    public HouseInfo(String houseId, String houseName, String houseAddress, String houseType) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.houseAddress = houseAddress;
        this.houseType = houseType;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "房屋编号：" + houseId +
                "，\n房屋名称：" + houseName +
                "，\n房屋地址：" + houseAddress +
                "，\n房屋类型：" + houseType;
    }
}
