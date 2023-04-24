package org.example;

public class Rq {

    String key;
    int value;
    String actionCode;
    public Rq(String cmd) {

        String[] cmdbits = cmd.split("\\?",2);
        // 삭제?id=1  ? 기준으로 두개로 나눔

        this.actionCode = cmdbits[0];
        if (cmdbits.length == 1) return;
        // ?뒤에 아무것도 없으면 ( 등록 등 ) 리턴.
        String paramsbit = cmdbits[1];

        for (String paramsbits:paramsbit.split("\\?",2)){
            String[] params = paramsbits.split("=",2);
            this.key = params[0];
            this.value= Integer.parseInt(params[1]);

        }
    }
    String getKey () {
        return this.key;
    }
    public int getValue(){
        return this.value;
    }

}
