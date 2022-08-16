package com.LocationManagement.Location.repository;

import com.LocationManagement.Location.model.Area;
import com.LocationManagement.Location.model.Shop;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ShopRepository extends CrudRepository <Shop, Long> {

    Optional<Shop> findByArea(Area area);
}
