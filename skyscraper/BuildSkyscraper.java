package com.gl.skyscraper;
import java.util.Scanner;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;



public class BuildSkyscraper {
	

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> tempStack = new Stack<Integer>();
		Iterator it=stack.iterator();
		
		boolean floor;
		
		System.out.println("Enter the Number of floors in the SkyScraper");
		boolean flConstruct;
		int size=sc.nextInt();
		int[] buildingSize = new int[size];
		ArrayList<Integer> notConstructedFloors = new ArrayList<Integer>();
		int noFloors=size;
		
		for(int i=0;i<size;i++)
			{
			System.out.println("Enter Size of floor for day : "+ (i+1));
			buildingSize[i]=sc.nextInt();
	
			}
		for (int i =0;i<size;i++)
				{
		
			for (int j =1;j<noFloors;j++)	
			{	
				if(buildingSize[j]<noFloors)
				{
			System.out.println("Construction on DAY : "+ j);
			
			stack.push(buildingSize[i]);
		
		}
		else
		{
		System.out.println("Construction on DAY : "+ j);
		System.out.print(buildingSize[i]);
		floor =true;
		while(it.hasNext() && floor== true)
		{
		System.out.print(stack.pop());
		}
		
			}	noFloors--;
			
			}
		
			
				}		
	}
	}
		/*
		for(int i=0;i<size;i++)
		{
			int temp = buildingSize[i];
			System.out.println("Value of temp" + temp);
			if(temp>=noFloors)
			{
				stack.push(temp);
				
				flConstruct=true;
			}
			else
			{
				tempStack.push(temp);
			
				flConstruct=false;
			}
			noFloors--;
		}
		while(!stack.isEmpty())
		{
			System.out.println("DAY WISE construct   ");
			System.out.println(stack.pop() +" ");
			
		}
		while(!tempStack.isEmpty())
		{
			System.out.println("not  constructed   ");
			System.out.println(tempStack.pop() + "  ");
			
		}
		}		
		
	}

*/