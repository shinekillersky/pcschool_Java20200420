package com.myjava.ocp.lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyDemo {    
    public static void main(String[] args) throws Exception {
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(() ->new Random().nextInt(100));
        list.add(() ->new Random().nextInt(100));
        list.add(() ->new Random().nextInt(100));
        list.add(() ->new Random().nextInt(100));
        list.add(() ->new Random().nextInt(100));
        
        ExecutorService service = Executors.newCachedThreadPool();
        int result = service.invokeAny(list); // 只取最快完成的        
        System.out.println(result);
        service.shutdown();
    }
}
