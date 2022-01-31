package com.hibernate.hibernate.json.array.model;

import java.util.Objects;

public class Address {

    private String streetName;

    private String buildingNo;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(streetName+buildingNo);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Address))
            return false;

        Address other = (Address) obj;

        return other.getBuildingNo().equals(this.buildingNo) && other.getStreetName().equals(this.streetName);
    }
}
