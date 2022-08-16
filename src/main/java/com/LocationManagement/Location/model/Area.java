package com.LocationManagement.Location.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Getter
@AllArgsConstructor
@Table(name= "area", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "areaName"
        })

})
public class Area {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String areaName;
    private String areaCode;

    @JsonIgnore
    @OneToMany(mappedBy = "area", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Shop> shop;

    public Area(String areaName, String areaCode, Set<Shop> shop) {
        this.areaName = areaName;
        this.areaCode = areaCode;
        this.shop = shop;
    }
    public Area(){

    }
}
