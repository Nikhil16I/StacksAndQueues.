package com.StackANDQueues;

import java.util.LinkedList;

   public class MyStack {	
    LinkedList<Integer>newlist =new LinkedList<Integer>();
   
   public void Push(Integer Data) {
	newlist.add(Data);
   }
   
   public void Peek() {
	   System.out.println(newlist.peek());
   }
   
   public void Pop() {
	   while(newlist.size()!=0) {
	newlist.pop();	   
	   }
   }
   public void PrintStack() {
	System.out.println(newlist);
	
   } 
}
