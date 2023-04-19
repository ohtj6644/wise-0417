package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("==명언앱==");
        HashMap<Integer, wisesaying> list = new HashMap<Integer, wisesaying>();
        int count=0;
        while(true){
            System.out.println("명령 : ");
            String cmd = sc.nextLine().trim();

            if(cmd.equals("종료")){
                break;
            }else if (cmd.equals("등록")){
                System.out.println("명언 :");
                String content= sc.nextLine();
                System.out.println("작가 : ");
                String name = sc.nextLine();

                int id = ++count;

                wisesaying wisesaying = new wisesaying(id, content, name);
                list.put(id, wisesaying);


            }



        }


    }
}
