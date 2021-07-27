package com.course.testng;

import org.testng.annotations.Test;

import java.util.concurrent.ExecutionException;

public class ExpectedException {
//    什么时候会用到异常测试
//    在期望结果为某一个异常的时候
//    比如传入某些不合法的参数，程序抛出了异常，也就是说，期望结果就是这个异常

    //    这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

    //    这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }


}
