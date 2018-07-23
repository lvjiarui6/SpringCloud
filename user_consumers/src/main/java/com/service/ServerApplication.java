package com.service;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@SpringBootApplication

@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServerApplication {

    public String s(Integer s){
        return s+"";
    }

    @FunctionalInterface
    interface lamada{
        String defaults(int x);
        default void test(){
            System.out.println("test");
        }
        default void sss(){
            System.out.println("sss");
        }

    }

    public static void main(String[] args) {

        SpringApplication.run(ServerApplication.class,args);
    /*    lamada lamada=(i)->i*5+"";
        String s=lamada.defaults(5);
        System.out.println(s);

        lamada.sss();
        lamada.test();

      int ss =IntStream.of(1,3,4).max().getAsInt();

        System.out.println(ss);
        ServerApplication application= new ServerApplication();

        Function<Integer,String> function= application::s;

        Function<Integer,Integer> function2= e->e*4;

        String ee=function.compose(function2).apply(5);
        System.out.println(ee);
             new Random().ints(10,20+1).limit(2).forEach(System.out::println);
*/

/*       final String temp="lv jia r";
        ArrayList list= new ArrayList();
        String s =Stream.of(temp.split(" ")).min((i1,i2)->{
            System.out.println("---"+i1);
            System.out.println("--"+i2);
           return i1.length()-i2.length();
        }).get();
        System.out.println(s);*/
        /*final String temp="lv jia r";
        ArrayList<String> t= new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            t.add(i+"");
        }

        int sum= Stream.of(t.toArray()).map(e->Integer.parseInt(e.toString())).reduce(0,(s1,s2)->{
          //  System.out.println("s1---"+s1);
          //  System.out.println(s2);
            return s2;
        });//.map(u->Stream.of(14234321))
      //  .collect(Collectors.toList());
      //  System.out.println(sum);


        for (String s:
             t) {
            System.out.println(s.hashCode());
            Integer i=Integer.parseInt(s);


            //System.out.println(i.hashCode()%3+1);

        }*/


        //java.util.concurrent.ForkJoinPool.commonPool()



/*
       final Object lock = new Object();

      Thread runnable=  new Thread() {
            @Override
            public  void run() {

                try {
                    synchronized (lock)  {
                        System.out.println("start");
                        lock.wait();

                        System.out.println("end");
                       // sleep(1112);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
      runnable.start();*/

    /*    try {*/
    /*        runnable.join();*/
    /*    } catch (InterruptedException e) {*/
    /*        e.printStackTrace();*/
    /*    }


        Object object2= new Object();

        Thread Thread2=  new Thread() {
            @Override
            public  void run() {
                synchronized (lock) {
                    System.out.println("start2");

                    lock.notify();
                    System.out.println("end2");
                }

            }
        };
        Thread2.start();
*/


    }

}
