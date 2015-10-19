package test1.controller;

import test1.view.Test1Display;

public class Test1Controller 
{
	private Test1Display myTest;
	public Test1Controller()
	{
		myTest = new Test1Display();
	}
	
	public void start()
	{
		int myNumber;
		myNumber = 99;
		if(myNumber == 99)
		{
		myTest.showResponce(myNumber + " is the same as 99");
		}
		else
		{
			myTest.showResponce("Universe destruction imenent. get good");
		}
		
		double myDecimal;
		myDecimal = 3.14;
		if(myDecimal - 3.14 < 1)
		{
			myTest.showResponce(myDecimal+ " is the number of the day");
		}
		else
		{
			myTest.showResponce("please dont break the universe");
		}
	}

}
