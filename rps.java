import java.util.Scanner;
import java.util.Random;

class rps{

    static void points(String name,int ups,int pcps)
	{
		System.out.println(name + ":" + ups + "  Cpu:" + pcps);
	}
	public static void main(String[] args)
	{
		Scanner h = new Scanner(System.in);
		Random pc = new Random();
		System.out.println("Hey! Wanna play rock, paper, scissors?(y/n)");
		char g = h.next().charAt(0);
		while(g!='y'&&g!='n')
		{
			System.out.println("Invalid Input! Try again:(y/n):");
			g = h.next().charAt(0);
		}
		if(g=='y')
		{do{
			int up=0,pcp=0;
			System.out.println("Alright! Enter playername:\n");
			String nomre = h.next();
			do{
				System.out.println("Choose: Rock(r)::Paper(p)::Scissors(s)  ");
				char o = h.next().charAt(0);
				int opt = pc.nextInt(2) + 1;
				switch(opt)
				{
					case 1: {System.out.println("\nCPU chose rock!");
					        if(o=='r'){System.out.println("Tie!");
							           }
					        else if(o=='p'){up++;}
							else if(o=='s'){pcp++;}}
							break;
					case 2: {System.out.println("\nCPU chose paper!");
					        if(o=='p'){System.out.println("Tie!");
							           }
					        else if(o=='s'){up++;}
							else if(o=='r'){pcp++;}}
							break;
					case 3: System.out.println("\nCPU chose scissors!");
					        if(o=='s'){System.out.println("Tie!");
							           }
					        else if(o=='r'){up++;}
							else if(o=='p'){pcp++;}
							break; 
				}
				points(nomre,up,pcp);	
			}while(up<5&&pcp<5);
		if(up==5)System.out.println("\nYou win! Well played");
		else
		System.out.println("\nYou lose! Game over");
		System.out.println("Play again?(y/n)");
		g = h.next().charAt(0);
		while(g!='y'&&g!='n')
		{System.out.print("Invalid choice! Try again (y/n):");
		g= h.next().charAt(0);}
		}while(g=='y');} 
		System.out.println("Exited");}			
}