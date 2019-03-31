package com.example.sduapp;

public class Faculty {

    private String name = "";
    private String description = "";
    private int image = 0;

    public Faculty(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String phone) {
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
