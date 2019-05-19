package com.gamecodeschool.humanoop;

import android.util.Log;

public class Human {
    private String name;
    public int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        Log.d("Human", "I am eating food");

    }

    public void sleep() {
        Log.d("Human", "zzzzzzzz");

    }

    public int sleep(int hours) {
        return Log.d("Human", "Iam sleeping for" + " " + hours + "" + "hours");
    }

    public void speak(String Speech) {
        Log.d("Human", Speech);
    }

    public int birthday(int increment) {
        age = age + 1;
        return age;
}

    public int eat(int weight){
        weight = weight+2;
       return Log.d("Human","I am eating an i weigh" + weight + "kgs");
    }

}