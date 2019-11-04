package us.cnlist.services.cityserv.entity.rest.geo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CitySearchResponse implements Serializable {
    private Long cityId;
    private String cityName;
    private String regionName;
    private String countryName;
}
