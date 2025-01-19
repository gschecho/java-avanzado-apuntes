package org.example.geocoder;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Geocoder {
    private static final String BASE = "https://maps.googleapis.com/maps/api/geocode/json?";

    // GET DE RESTFUL WEB SERVICES
    private Function<String, String> encoder = s -> {
        try{
            //
            return URLEncoder.encode(s, "UTF-8");
        }catch(UnsupportedEncodingException ex){
            ex.printStackTrace();
        }
        return null;
    };

    public String encodeAddress(List<String> address){
        return address.stream()
                .map(encoder)
                .collect(Collectors.joining(","));
    }

    public String getData(List<String> address){
        String encoded = encodeAddress(address);
        String response = "";
        try {
            // FORMATO DE LA URL DONDE SE REALIZARA LA PETICION GET
            URL url = new URL(String.format("%saddress=%s", BASE, encoded));
            try(BufferedReader br = new BufferedReader(
                    // UTILIZAMOS STREAM EN LUGAR DE CONNECTION
                    new InputStreamReader(url.openStream()))){
                String line= "";
                while((line = br.readLine()) != null){
    response += "\n" + line;
                }
            }

        }catch ( IOException ex){
            ex.printStackTrace();
        }
        return response;
    }

    public void fillInLatLng(Location location){
        String encoded = encodeAddress(
                Arrays.asList(location.getStreet(), location.getCity(),location.getState()));
        try{
            URL url = new URL(String.format("%saddress=%s", BASE, encoded));
            try(InputStream is = url.openStream();
            JsonReader jr = Json.createReader(is)){
                JsonObject jo = jr.readObject();
                JsonObject loc = jo.getJsonArray("result")
                        .getJsonObject(0)
                        .getJsonObject("geometry")
                        .getJsonObject("location");
                location.setLatitude(loc.getJsonNumber("lat").doubleValue());
                location.setLongitude(loc.getJsonNumber("lng").doubleValue());

            }catch (IOException ex){
                ex.printStackTrace();
            }
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }

}
