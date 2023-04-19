package org.example;

public class wisesaying {


    private int id;
    private String content;
    private String name;
    public wisesaying(int id, String content, String name) {
        this.id=id;
        this.content=content;
        this.name=name;
    }


    int getId(){
        return this.id;
    }

    String getContent(){
        return this.content;
    }

    String getName(){
        return this.name;
    }


}


