package com.yangbingdong.java.newfeat.introduction;

public class Java9ProcessHandle {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.pid());
        System.out.println(currentProcess.info());

    }
}
