package com.nowcoder;

/**
 * Created by Maxjzm on 2017/5/11.
 */
class  MyTread extends Thread{
    private int tid;

    public MyTread(int tid){
        this.tid=tid;
    }
    
    @Override
    public void run(){
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class MultiTreadTests2 {
    public static void main(String[] argv){
        testThread();
    }

    private static void testThread() {
    }

}
