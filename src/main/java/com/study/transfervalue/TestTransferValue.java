package com.study.transfervalue;

import com.study.equals.Person;

public class TestTransferValue {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("abc");
        person.setAge(20);

        TestTransferValue tf = new TestTransferValue();
        int age = 20;
        tf.changeValue(age);
        System.out.println("age = " + age);

        tf.changeValue2(person);
        System.out.println("person.getName() = " + person.getName());

        String str = "abc";
        tf.changeValue3(str);
        System.out.println("str = " + str);

    }

    public void changeValue(int age){
        age = 30;
    }

    public void changeValue2(Person person){
        person.setName("xxx");
    }

    public void changeValue3(String str){
        str = "xxx";
    }
}
