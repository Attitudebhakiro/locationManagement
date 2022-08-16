package com.LocationManagement.Location.service;

import com.LocationManagement.Location.model.Area;
import com.LocationManagement.Location.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    @Autowired
    private AreaRepository repository;

    // inserting Area
    public Area saveArea(Area area){
        return repository.save(area);

    }
    // retrieving list of Area
    public List<Area> allarea(){
        return (List<Area>) repository.findAll();
    }
}
