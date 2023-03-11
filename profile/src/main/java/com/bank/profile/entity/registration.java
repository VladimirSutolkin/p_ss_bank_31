package com.bank.profile.entity;
import javax.persistence.*;
@Entity
@Table(name = "entity_table")
public class registration {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "country", nullable = false, length = 166)
        private String country;

        @Column(name = "region", length = 160)
        private String region;

        @Column(name = "city", length = 160)
        private String city;

        @Column(name = "district", length = 160)
        private String district;

        @Column(name = "locality", length = 230)
        private String locality;

        @Column(name = "street", length = 230)
        private String street;

        @Column(name = "house_number", length = 20)
        private String houseNumber;

        @Column(name = "house_block", length = 20)
        private String houseBlock;

        @Column(name = "flat_number", length = 40)
        private String flatNumber;

        @Column(name = "index", nullable = false)
        private Long index;

        @Column(name = "column_name")
        private Integer column;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseBlock() {
        return houseBlock;
    }

    public void setHouseBlock(String houseBlock) {
        this.houseBlock = houseBlock;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

}
