package com.y; 

public class MOloading 
{
	
void acting(double marks)
{
	marks=13d;  //if we don't give value here, it'll take the value we've put while calling method.
	
	System.out.println("marks for this acting "+marks );
}

void acting(char grade)
{
	System.out.println("grade: "+grade);
}

	public static void main(String[] args) 
	{
      MOloading obj=new MOloading();
      obj.acting(12.9999d);
      obj.acting('A');
      System.out.println(" The end");
	}

}
