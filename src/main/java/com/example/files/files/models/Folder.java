package com.example.files.files.models;

import java.util.ArrayList;

public class Folder {

    private Long id;
    private String title;
    private ArrayList<File> files;
    private User user;

    public Folder(String title, ArrayList<File> files, User user) {
        this.title = title;
        this.files = new ArrayList<File>();
        this.user = user;
    }

    public Folder() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addFile(File file){
        this.files.add(file);
    }
}
