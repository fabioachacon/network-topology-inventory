package org.acme.domain.vo;

import lombok.Data;

@Data
public class Location {
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private Float latitude;
    private Float longitude;
}
