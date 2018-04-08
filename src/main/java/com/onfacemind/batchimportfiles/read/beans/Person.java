package com.onfacemind.batchimportfiles.read.beans;

import java.io.File;
import java.util.Arrays;

public class Person {

    private String name;

    private String idcard;

    private File photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idcard='" + idcard + '\'' +
                ", photo=" + photo.getAbsolutePath() +
                '}';
    }
}
