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

		Queue<Train> trackA = new LinkedList<>();
		Queue<Train> trackB = new LinkedList<>();
		Queue<Train> trackC = new LinkedList<>();
		Queue<Train> trackOverweight = new LinkedList<>();
		Queue<Train> trackOther = new LinkedList<>();
		Queue<Train> trackTemp = new LinkedList<>();
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			while(x.hasNextLine())
			{
				x = new Scanner (f);
				String tag = x.nextLine().trim();
				if((tag.equals("ENG")))
				{
					String name = x.nextLine();
					String dest = x.nextLine();
					Train temp = new Train(name, dest);
					trackTemp.add(temp);
					System.out.println("Engine added");
				}
				else
				{
					String name = x.nextLine();
					String product = x.nextLine();
					String origin = x.nextLine();
					String dest = x.nextLine();
					int weight = x.nextInt();
					int miles = x.nextInt();
					Train temp = new Train(name, product, origin, dest, weight, miles);
					trackTemp.add(temp);
					System.out.println("Car added");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}



	}
}
