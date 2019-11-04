package us.cnlist.services.cityserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.cnlist.services.cityserv.entity.geo.City;
import us.cnlist.services.cityserv.entity.rest.geo.CitySearchResponse;
import us.cnlist.services.cityserv.error.BadRequestError;
import us.cnlist.services.cityserv.error.ObjectDoesNotExist;
import us.cnlist.services.cityserv.services.GeoService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/search/city")
public class CityController {

    @Autowired
    private GeoService geoService;

    @GetMapping("/name/{name}")
    @ResponseBody
    public List<CitySearchResponse> findCitiesByNamePart(@PathVariable("name") String namePart)
            throws BadRequestError, ObjectDoesNotExist {
        if (namePart == null || namePart.isEmpty()) {
            throw new BadRequestError("name part is null or empty");
        }
        List<City> foundCities = geoService.findCityByName(namePart);
        if (foundCities.isEmpty()) {
            throw new ObjectDoesNotExist("There are no cities like [" + namePart + "]");
        }
        return foundCities.stream().map(city -> {
            CitySearchResponse response = new CitySearchResponse();
            response.setCityId(city.getId());
            response.setRegionName(city.getRegion().getName());
            response.setCountryName(city.getRegion().getCountry().getName());
            return response;
        }).collect(Collectors.toList());
    }

}
