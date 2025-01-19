package org.example.rickymorty;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import org.example.geocoder.Location;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RickyMorty {

    private static final String BASE = "https://rickandmortyapi.com/api/character/";

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

    public String encodePersonaje(List<String> personajes){
        return personajes.stream()
                .map(encoder)
                .collect(Collectors.joining(","));
    }

    public String getData(List<String> personajes){
        List<String> encoded= new ArrayList<>();
        encoded.add("1");

        String response = "";
        try {
            // FORMATO DE LA URL DONDE SE REALIZARA LA PETICION GET
            URL url = new URL(String.format( BASE, encoded));
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




// GOOGLE JSON ES MEJOR OPCION PARA PARSEAR CLASES A OBJETOS JSON
    public void fillInLatLng(int id){


        try{
            URL url = new URL(String.format( BASE + URLEncoder.encode(String.valueOf(id)) ));
            try(InputStream is = url.openStream();
                JsonReader jr = Json.createReader(is)){
                JsonObject jo = jr.readObject();
                JsonObject personajeName = jo.asJsonObject();


                System.out.println(jo);
                System.out.println(personajeName.getJsonNumber("id"));


            }catch (IOException ex){
                ex.printStackTrace();
            }
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }
}
