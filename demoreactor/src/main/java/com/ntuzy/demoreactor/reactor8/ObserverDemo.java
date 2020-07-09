package com.ntuzy.demoreactor.reactor8;

import java.util.Observable;

/**
 * @Author IamZY
 * @create 2020/7/9 10:19
 */
public class ObserverDemo extends Observable {

    public static void main(String[] args){

        ObserverDemo observer = new ObserverDemo();

        // 添加观察者
        observer.addObserver((observable, arg)->{
            System.out.println("发生变化");
        });

        observer.addObserver((observable, arg)->{
            System.out.println("收到被观察者通知 准备改变");
        });

        observer.setChanged();
        observer.notifyObservers();

    }

}
