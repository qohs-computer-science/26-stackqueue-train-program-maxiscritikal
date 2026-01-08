/*
 * Max Korsa
 * 1/8/26
 * PD: 4
 * This program simulates a simple trainyard using queues as tracks and a custom class for the trains.
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) {

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;

		Queue<String> trackA = new LinkedList<>();
		Queue<String> trackB = new LinkedList<>();
		Queue<String> trackC = new LinkedList<>();
		Queue<String> trackOverweight = new LinkedList<>();
		Queue<String> trackOther = new LinkedList<>();
		Queue<String> trackTemp = new LinkedList<>();
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
			String name = x.nextLine();
			System.out.println(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}



	}
}
