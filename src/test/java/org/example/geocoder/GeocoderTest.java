package org.example.geocoder;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeocoderTest  {


    private Geocoder geocoder = new Geocoder();

    @Test
    public void encodeAddress() throws Exception {
        String encoded = geocoder.encodeAddress(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View","CA"));
        assertEquals("1600+Ampitheatre+Parkway,Mountain+View,CA", encoded);

    }

    @Test
    public void getData() throws Exception {
        String data = geocoder.getData(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View","CA"));
        System.out.println(data);;

    }



}