package com.pmart5.jcorehw12.myclass;

import com.pmart5.jcorehw12.Main;

public class Worker {
    private final Main.OnTaskDoneListener callback;
    private final Main.OnTaskErrorListener callbackError;

    public Worker(Main.OnTaskDoneListener callback, Main.OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                callbackError.onError("Error: task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}