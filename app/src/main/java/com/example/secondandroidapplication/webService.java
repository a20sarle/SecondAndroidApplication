package com.example.secondandroidapplication;

public class webService {
    private String name;
    private String location;
    private Auxdata auxdata;
    private String category;

    public String getName(String name) {
        return this.name;
    }

    public String getLocation(String location) {
        return this.location;
    }

    public Auxdata getAuxdata(String auxdata) {
        return this.auxdata;
    }

    public String getCategory(String category) { return this.category;}

    @Override
    public String toString(){return name;}

    public Auxdata getAuxdata() {
        return auxdata;
    }
}
