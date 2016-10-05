import java.util.Scanner;
public class MHS
{
	public static void main(String[] args)
	{
		int SwitchWin = 0;
		int numSim = Integer.parseInt(args[0]);
		for(int i = 0; i < numSim; i++)
			SwitchWin += game();
		double perecentSwitchWin = (double) SwitchWin/numSim;
		System.out.println(perecentSwitchWin*100);
	}
	public static int game()
	{
		int car = (int)(Math.random()*3+1);
		int pick = (int)(Math.random()*3+1);
		
		if (car == pick)
			return 0;
		else
			return 1;
		
	}
}