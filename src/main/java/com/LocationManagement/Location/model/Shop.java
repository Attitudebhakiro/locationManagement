package com.LocationManagement.Location.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Getter
@AllArgsConstructor
@Table(name= "shop", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "shopName"
        })

})
public class Shop {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String shopName;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "area_details", nullable = false)
    private Area area;

    public Shop(String shopName, Area area) {
        this.shopName = shopName;
        this.area = area;
    }
    public Shop(){

    }
}
