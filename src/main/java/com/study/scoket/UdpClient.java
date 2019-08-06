package com.study.scoket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

// udp server
class UdpServer {
    public static void main(String[] args) throws Exception{
        System.out.println("udp服务端已经启动。。。。。。。");
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8974);
        // 创建服务端
        DatagramSocket ds = new DatagramSocket(inetSocketAddress);
        // 服务端接受客户端1024个字节
        byte[] bytes = new byte[1024];
        // 定义数据包
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        // 接受客户端请求，将数据封装给数据包,如果客户端不往服务端发送请求，就一直阻塞在这里
        while(1==1){
            ds.receive(dp);
            System.out.println("来源="+dp.getAddress()+":"+dp.getPort());
            System.out.println(new String(dp.getData(),"UTF-8"));
        }
    }
}


public class UdpClient{
    public static void main(String[] args) throws Exception {
        System.out.println("udp客户端已经启动。。。。。。。");
        DatagramSocket ds = new DatagramSocket();
        String msg = "传送消息";
        byte[] bytes = msg.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,InetAddress.getByName("127.0.0.1"),8974);
        ds.send(datagramPacket);
        ds.close();
    }
}

