package com.StackANDQueues;

public class MyStackMain {

	public static void main(String[] args) {
		
		MyStack mystack = new MyStack();
		mystack.Push(70);               
		mystack.Push(30);				  
		mystack.Push(56);				  
		
		mystack.PrintStack();

		mystack.Peek();
		mystack.Pop();
		
		mystack.PrintStack();
	}
}
