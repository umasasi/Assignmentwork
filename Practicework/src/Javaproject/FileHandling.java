package Javaproject;
	import java.io.*;
	import java.util.Scanner;
	public class FileHandling
	{
	void Filewrite()
	{
	   String info="We are creating file create method";
	try
	      {
	      FileWriter fw=new FileWriter("F.txt");
	       fw.write(info);
	       fw.close();
	      System.out.println(" Sucessfully written to file");
	     }
	catch(Exception e)
	    {
	        System.out.println("Error");
	     }
	}
	void Fileread()
	{
		char [] info =new char[34];
	try
	    {
	         FileReader fr=new FileReader("F.txt");
	          fr.read(info);
	        System.out.println("Data is received from a file");
	        System.out.println(info);
	        fr.close();
	   }
	catch(Exception e)
	      {
	          System.out.println("Error");
	       }
	}

	void Append()
	{
	   String info="We are creating file append method";
	try
	    {
	     FileWriter fw=new FileWriter("F.txt",true);
	     fw.write(info);
	     fw.close();
	     System.out.println("Info is appended here");
	    }
	catch(Exception e)
	  {
	System.out.println("Error");
	    }

	}
	public static void main(String[] args) 
	{
	FileHandling f=new FileHandling();
	f.Filewrite();
	f.Fileread();
	f.Append();

	}

	}


