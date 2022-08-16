package com.LocationManagement.Location.controller;

import com.LocationManagement.Location.model.Area;
import com.LocationManagement.Location.model.Shop;
import com.LocationManagement.Location.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShopController {
    @Autowired
    private ShopService service;

    //save shops
    @PostMapping("/saveShop")
    public Shop saveS(@RequestBody Shop shop){
        return service.saveShop(shop);
    }

    // retrieving all shops under specific area
    @GetMapping("/shopbyArea")
    public Optional<Shop> findshopsbyid(@RequestBody Area area){
       return service.shopsbyArea(area);
    }

   // all shops
    @GetMapping("/shops")
    public List<Shop> allshops(){
        return service.allshops();
    }
    // token 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
}
