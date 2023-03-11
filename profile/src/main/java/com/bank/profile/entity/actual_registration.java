package com.bank.profile.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address")
public class actual_registration {





        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Long id;

        @Column(name = "country", length = 40, nullable = false)
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

        public actual_registration() {
        }

        public actual_registration(String country, String region, String city, String district, String locality, String street,
                       String houseNumber, String houseBlock, String flatNumber, Long index) {
            this.country = country;
            this.region = region;
            this.city = city;
            this.district = district;
            this.locality = locality;
            this.street = street;
            this.houseNumber = houseNumber;
            this.houseBlock = houseBlock;
            this.flatNumber = flatNumber;
            this.index = index;
        }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        actual_registration that = (actual_registration) o;
        return Objects.equals(id, that.id) && Objects.equals(country, that.country) && Objects.equals(region, that.region) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(locality, that.locality) && Objects.equals(street, that.street) && Objects.equals(houseNumber, that.houseNumber) && Objects.equals(houseBlock, that.houseBlock) && Objects.equals(flatNumber, that.flatNumber) && Objects.equals(index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, region, city, district, locality, street, houseNumber, houseBlock, flatNumber, index);
    }

    @Override
    public String toString() {
        return "actual_registration{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", locality='" + locality + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", houseBlock='" + houseBlock + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", index=" + index +
                '}';
    }
}




