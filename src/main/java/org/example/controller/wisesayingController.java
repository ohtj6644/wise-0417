package org.example.controller;

import org.example.Rq;
import org.example.wisesaying.wisesaying;

import java.util.HashMap;

public class wisesayingController {
    static HashMap<Integer, wisesaying> list = new HashMap<Integer, wisesaying>();
    static int count = 0;

    public static void write() {
        System.out.println("명언 :");
        String content = Container.getScanner().nextLine();
        System.out.println("작가 : ");
        String name = Container.getScanner().nextLine();

        int id = ++count;

        wisesaying wisesaying = new wisesaying(id, content, name);
        list.put(id, wisesaying);
        System.out.println(id + "번 명언이 등록되었습니다");
    }

    public static void list() {
        System.out.println("==명언목록==");
        for (int i = 1; i <= count; i++) {
            if (list.get(i) != null) {
                System.out.println(list.get(i).getId() + "번/" + list.get(i).getContent() + "/" + list.get(i).getName());
            } else if (list.get(i) == null) {
                System.out.println("이미 삭제된 명언입니다.");
            }
        }
    }

    public static void del(Rq rq) {
        if(list.get(rq.getValue())!= null){
            list.remove(rq.getValue());
            System.out.println(rq.getValue()+"번 명언이 삭제되었습니다");
        }else if (list.get(rq.getValue())== null){
            System.out.println(rq.getValue()+" 번 명언이 존재하지 않습니다.");
        }
    }

    public static void modify(Rq rq) {
        int renum= rq.getValue();

        if(list.get(renum)!=null) {
            System.out.println("기존명언 :" + list.get(renum).getContent());
            System.out.println("새 명언: ");
            String reContent = Container.getScanner().nextLine();
            System.out.println("기존 작가:" + list.get(renum).getName());
            System.out.println("새 작가:");
            String reName = Container.getScanner().nextLine();

            wisesaying rewisesaying = new wisesaying(renum, reContent, reName);
            list.put(renum, rewisesaying);

            System.out.println(renum + "번이 수정되었습니다.");
        }else if (list.get(renum)==null){
            System.out.println(renum+"번 명언이 존재하지 않습니다.");
        }
    }
}
