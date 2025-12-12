package org.example;

public class MyThreadWithRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread implementation using Runnable interface..");
    }
}
