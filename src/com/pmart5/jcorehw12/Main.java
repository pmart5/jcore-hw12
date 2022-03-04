package com.pmart5.jcorehw12;

import com.pmart5.jcorehw12.myclass.Worker;

public class Main {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerError = System.out::println;
        Worker worker = new Worker(listener, listenerError);
        worker.start();
    }
}