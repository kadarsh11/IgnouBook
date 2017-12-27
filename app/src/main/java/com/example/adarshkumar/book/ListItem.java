package com.example.adarshkumar.book;



public class ListItem {
    private String semester;
    private String code;
    private String name;
    private String downloadlink;




    public ListItem(String semester, String code, String name,String downloadlink) {
        this.semester = semester;
        this.code = code;
        this.name = name;
        this.downloadlink = downloadlink;
    }

    public String getSemester() {
        return semester;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public String getDownloadlink() {
        return downloadlink;
    }
}