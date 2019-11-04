package us.cnlist.services.cityserv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.cnlist.services.cityserv.entity.geo.City;
import us.cnlist.services.cityserv.repository.geo.CityRepository;

import java.util.List;

@Service(value = "geoService")
public class GeoService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findCityByName(String namePattern) {
        return cityRepository.findCityByName("%" + namePattern.toUpperCase() + "%");
    }

}
