package com.LocationManagement.Location.service;

import com.LocationManagement.Location.model.Area;
import com.LocationManagement.Location.model.Shop;
import com.LocationManagement.Location.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {
    @Autowired
    private ShopRepository repository;

    // inserting Shop
    public Shop saveShop(Shop shop){
      return repository.save(shop);
    }

    // retrieving all shops
    public List<Shop> allshops(){
        return (List<Shop>) repository.findAll();
    }

    // retrieving all shops under specific area
    public Optional<Shop> shopsbyArea(Area area){
        return repository.findByArea(area);
    }
}
