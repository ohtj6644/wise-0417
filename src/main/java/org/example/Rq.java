package org.example;

public class Rq {
    public Rq(String cmd) {

        String[] cmdbits = cmd.split("\\?",2);
        // 삭제?id=1  ? 기준으로 두개로 나눔

        String actionCode = cmdbits[0];

        if (cmdbits.length == 1) return;
        // ?뒤에 아무것도 없으면 ( 등록 등 ) 리턴.




    }
}
