package org.seydanurdemir.address;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    public long id;
    public String country;
    public String province;
    public String district;
    public String neighbourhood;
    public String street;
    public String apartmentBuilding;
    public String buildingNo;
    public String floor;
    public String apartmentNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return id == address.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
                "\"country\":\"" + country + "\"," +
                "\"province\":\"" + province + "\"," +
                "\"district\":\"" + district + "\"," +
                "\"neighbourhood\":\"" + neighbourhood + "\"," +
                "\"street\":\"" + street + "\"," +
                "\"apartmentBuilding\":\"" + apartmentBuilding + "\"," +
                "\"buildingNo\":\"" + buildingNo + "\"," +
                "\"floor\":\"" + floor + "\"," +
                "\"apartmentNo\":\"" + apartmentNo + "\"" +
                "}";
    }
}
