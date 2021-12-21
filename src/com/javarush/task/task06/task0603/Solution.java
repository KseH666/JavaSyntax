package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int z = 0; z<50000; z++)
        {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }

    }
}

class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}