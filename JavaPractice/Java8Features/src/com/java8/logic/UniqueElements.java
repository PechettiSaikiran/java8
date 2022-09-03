package com.java8.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class UniqueElements  {
	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> numberList2 = Arrays.asList(3, 4, 5,6);
		List<Integer> uniqueList= new ArrayList<Integer>();
		
		  numberList.stream() .filter(numberList2::contains)
		  .collect(Collectors.toList()).
		  forEach(System.out::println);
		  
		  
		 uniqueList.addAll( numberList.stream() 
				  .filter(a->!numberList2.contains(a))
				  .collect(Collectors.toList()));
				  
			
		 uniqueList.addAll(  numberList2.stream()
			  .filter(a->!numberList.contains(a))
			  .collect(Collectors.toList()));
		  
		 uniqueList.forEach(System.out::println);
		 
		uniqueList.addAll(numberList);
		uniqueList.retainAll(numberList2);	
			
			System.out.println(uniqueList);
		
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside runnable");				
			}
		};
		
		Thread myThread = new Thread(runnable);
		myThread.start();
		
		Runnable myRunnable =()->{
			System.out.println("Inside Lamda");
			
		};
		new Thread(myRunnable).start();
		
		
		
		
	}
}
