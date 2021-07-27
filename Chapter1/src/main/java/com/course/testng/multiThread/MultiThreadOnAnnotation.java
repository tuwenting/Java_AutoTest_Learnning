package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {
//    用10个线程运行，3个线程池
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
