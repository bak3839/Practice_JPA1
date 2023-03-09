package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String city;
    private String streeet;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String streeet, String zipcode) {
        this.city = city;
        this.streeet = streeet;
        this.zipcode = zipcode;
    }
}
