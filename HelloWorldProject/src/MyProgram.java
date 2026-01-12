/*
 * Max Korsa
 * 1/8/26
 * PD: 4
 * This program simulates a simple trainyard using queues as tracks and a custom class for the trains.
 */
import java.util.Scanner;
import java.io.File;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) 
	{

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;

		Queue<Train> trackA = new LinkedList<>();
		Queue<Train> trackB = new LinkedList<>();
		Queue<Train> trackC = new LinkedList<>();
		Queue<Train> trackOther = new LinkedList<>();
		Queue<Train> trackTemp = new LinkedList<>();
		Queue<Train> maintinenceTrack = new LinkedList<>();
	
		try{
;			File f = new File("HelloWorldProject/src/data.txt");
			Scanner x = new Scanner(f);
			while(x.hasNextLine())
			{
				String name = x.nextLine().trim();
				if(name.isEmpty()) continue;
				
				if(name.startsWith("ENG"))
				{
					if(x.hasNextLine()) {
						String dest = x.nextLine();
						Train temp = new Train(name, dest);
						trackTemp.add(temp);
						System.out.println("Engine added");
					}
				}
				else
				{
					if(x.hasNextLine()) {
						String product = x.nextLine();
						if(x.hasNextLine()) {
							String origin = x.nextLine();
							if(x.hasNextLine()) {
								String dest = x.nextLine();
								if(x.hasNextLine()) {
									int weight = x.nextInt();
									x.nextLine();
									if(x.hasNextLine()) {
										int miles = x.nextInt();
										x.nextLine();
										Train temp = new Train(name, product, origin, dest, weight, miles);
										trackTemp.add(temp);
										System.out.println("Car added");
									}
								}
							}
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


		for (Train t : trackTemp)
		{
			if (t.getMiles() > 700)
			{
				t.resetMiles();
				maintinenceTrack.add(t);

			}

			else if (t.getDestination().equals("Baltimore"))
			{
				if (t.isEngine())
				{
					System.out.println(t.getName() + " leaving for Baltimore with the following cars:");
					while(!trackA.isEmpty())
					{
						System.out.println(trackA.peek().getName() + " containing " + trackA.peek().getProduct());
						trackA.remove();
					}

				}

				else
				{
					if (getTotalWeight(trackA) + t.getWeight() <= limitTrackA)
					{
						trackA.add(t);
					}
					else
					{
						System.out.println(artificialEngine() + " leaving for Baltimore with the following cars:");
						while(!trackA.isEmpty())
						{
							System.out.println(trackA.peek().getName() + " containing " + trackA.peek().getProduct());
							trackA.remove();
						}
					}
					
				}
			}

			else if (t.getDestination().equals("Charlotte"))
			{
				if (t.isEngine())
				{
					System.out.println(t.getName() + " leaving for Charlotte with the following cars:");
					while(!trackB.isEmpty())
					{
						System.out.println(trackB.peek().getName() + " containing " + trackB.peek().getProduct());
						trackB.remove();
					}
				}

				else
				{
					if (getTotalWeight(trackB) + t.getWeight() <= limitTrackB)
					{
						trackB.add(t);
					}
					else
					{
						System.out.println(artificialEngine() + " leaving for Charlotte with the following cars:");
						while(!trackB.isEmpty())
						{
							System.out.println(trackB.peek().getName() + " containing " + trackB.peek().getProduct());
							trackB.remove();
						}
					}
					
				}
			}

			else if (t.getDestination().equals("Trenton"))
			{
				if (t.isEngine())
				{
					System.out.println(t.getName() + " leaving for Trenton with the following cars:");
					while(!trackC.isEmpty())
					{
						System.out.println(trackC.peek().getName() + " containing " + trackC.peek().getProduct());
						trackC.remove();
					}

				}

				else
				{
					if (getTotalWeight(trackC) + t.getWeight() <= limitTrackC)
					{
						trackC.add(t);
					}
					else
					{
						System.out.println(artificialEngine() + " leaving for Trenton with the following cars:");
						while(!trackC.isEmpty())
						{
							System.out.println(trackC.peek().getName() + " containing " + trackC.peek().getProduct());
							trackC.remove();
						}
					}
					
				}
			}

			else
			{
				if (t.isEngine())
				{
					System.out.println(t.getName() + " leaving for other destinations with the following cars:");
					while(!trackOther.isEmpty())
					{
						System.out.println(trackOther.peek().getName() + " containing " + trackOther.peek().getProduct());
						trackOther.remove();
					}

				}

				else
				{
					trackOther.add(t);
				}
			}
		}

		for (Train t : trackA)
		{
			System.out.println(artificialEngine() + " leaving for Baltimore with the following cars:");
			System.out.println(t.getName() + " containing " + t.getProduct());
		}

		for (Train t : trackB)
		{
			System.out.println(artificialEngine() + " leaving for Charlotte with the following cars:");
			System.out.println(t.getName() + " containing " + t.getProduct());
		}

		for (Train t : trackC)
		{
			System.out.println(artificialEngine() + " leaving for Trenton with the following cars:");
			System.out.println(t.getName() + " containing " + t.getProduct());
		}

		for (Train t : trackOther)
		{
			System.out.println(artificialEngine() + " leaving for other destinations with the following cars:");
			System.out.println(t.getName() + " containing " + t.getProduct());
		}

		for (Train t : maintinenceTrack)
		{
			System.out.println(t.getName() + " sent to maintenance track for repairs.");

	}
}

public static String artificialEngine()
{
	return "ENG00000";
}

public static int getTotalWeight(Queue<Train> temp)
{
	int sum = 0;
	for (Train tempTrain : temp)
	{
		sum += tempTrain.getWeight();
	}

	return sum;
}}
