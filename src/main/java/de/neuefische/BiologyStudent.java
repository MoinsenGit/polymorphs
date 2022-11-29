package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class BiologyStudent implements Citizen {

    private String address;
    private int IdentityCardNumber;

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getIdentityCardNumber() {
        return IdentityCardNumber;
    }




}
