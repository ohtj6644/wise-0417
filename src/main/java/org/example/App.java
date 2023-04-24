package org.example;

import org.example.controller.Container;
import org.example.controller.wisesayingController;
import org.example.systam.systamController;

public class App {


    public void run() {
        System.out.println("==명언앱==");


        while (true) {
            System.out.println("명령 : ");
            String cmd = Container.getScanner().nextLine().trim();
            Rq rq = new Rq(cmd);

            switch (rq.actionCode) {
                case "종료":
                    systamController.exit();
                    return;
                case "등록":
                    wisesayingController.write();
                    break;
                case "목록":
                    wisesayingController.list();
                    break;
                case "삭제":
                    wisesayingController.del(rq);
                    break;
                case "수정":
                    wisesayingController.modify(rq);
                    break;

            }


        }


    }
}
