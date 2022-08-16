package com.LocationManagement.Location.controller;

import com.LocationManagement.Location.model.Area;
import com.LocationManagement.Location.model.Shop;
import com.LocationManagement.Location.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AreaController {
    @Autowired
    private AreaService service;

    // inserting Area
    @PostMapping("/saveArea")
    public Area saveA(@RequestBody Area area){
        return service.saveArea(area);
    }

    //all area
     @GetMapping("/listArea")
    public List<Area> allAreas(){
        return service.allarea();
    }
}
