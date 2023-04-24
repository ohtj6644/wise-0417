package org.example.wisesaying;

public class wisesaying {


    private int id;
    private String content;
    private String name;
    public wisesaying(int id, String content, String name) {
        this.id=id;
        this.content=content;
        this.name=name;
    }


    public int getId(){
        return this.id;
    }

    public String getContent(){
        return this.content;
    }

    public String getName(){
        return this.name;
    }


}


