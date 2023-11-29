package com.gon.effectivejavatest.chapter01.item03.field;

import java.io.*;

// 역직렬화로 여러 인스턴스 만들기
public class ElvisSerialization {

    public static void main(String[] args) {

        //저장(출력)
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //읽어오기 (역직렬화 과정 필요)
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            Elvis elvis3 = (Elvis) in.readObject();
            System.out.println(elvis3 == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
