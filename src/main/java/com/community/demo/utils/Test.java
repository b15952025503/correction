package com.community.demo.utils;

import java.net.InetAddress;

public class Test {

    public static void main(String[] args) {
        try {

            // IP地址
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
