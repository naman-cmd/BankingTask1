package com.polymorphism;

public class Animal 
{
	public void animalSound()
	{
		System.out.println("Animals makes sound");
	}
	public void doThe()
	{
		System.out.println("Nothing");
	}
}

class Pig extends Animal
{
	public void animalSound()
	{
		System.out.println("Its pig sound");
	}
}

class Dog extends Animal
{
	public void animalSound()
	{
		System.out.println("Its dog sound");
	}
}

class MainClass
{
	public static void main(String[] args) 
	{
		Animal obj = new Animal();
		Pig obj1 = new Pig();
		Dog obj2 = new Dog();
		
		obj.animalSound();
		obj1.animalSound();
		obj2.animalSound();
	}
}






