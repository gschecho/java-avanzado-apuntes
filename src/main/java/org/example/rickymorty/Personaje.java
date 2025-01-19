package org.example.rickymorty;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Personaje {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private URL image;
    private List<URL> episode;
    private  List<HashMap<String, String>> origin;
    private  List<HashMap<String, String>> locations;
    private URL url;
    private String created;

    public Personaje() {
    }

    public Personaje(int id, String name, String status, String species, String type, String gender, URL image, List<URL> episode, List<HashMap<String, String>> origin, List<HashMap<String, String>> locations, URL url, String created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.image = image;
        this.episode = episode;
        this.origin = origin;
        this.locations = locations;
        this.url = url;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public List<URL> getEpisode() {
        return episode;
    }

    public void setEpisode(List<URL> episode) {
        this.episode = episode;
    }

    public List<HashMap<String, String>> getOrigin() {
        return origin;
    }

    public void setOrigin(List<HashMap<String, String>> origin) {
        this.origin = origin;
    }

    public List<HashMap<String, String>> getLocations() {
        return locations;
    }

    public void setLocations(List<HashMap<String, String>> locations) {
        this.locations = locations;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
