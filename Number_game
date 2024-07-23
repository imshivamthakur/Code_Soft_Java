import java.util.Scanner;

public class Number_Game {
	static boolean xt = true;
	static int result ,lyf; 
	static int score=0 ;

		public static void main(String[] args) {		
			
			System.out.println("     //Hey Player Good to See you\\\\ \n         Welcome to Number Game \n ");
			Re_Try();	
	
			}
			
		//This Recall()  Method Is Used TO Generate the Random Number And Suggest User To Decide The Right Answer 	
		
		static void Recall()
		{
		Scanner obj=new Scanner(System.in);
		
			/*While Loop For Generating The Random Number Using Math.random Method For Getting Output 
			 *Value Till We Get Value Greater Then 1 And Less Than 100.*/
		
		while(xt)
			{
				 result=(int)(Math.random()*100);
				if(result>0 && result<=100) {
					//System.out.println("Random number is "+ result);
					xt=false;
				}
			}
			System.out.println(" Guess Any Random Number Between 1  to 100\n ----That System Has Generated For You----\n\n Enter Your Number-->"
					+ "");
			
			//For loop used for User to Enter The Guessed Number Again And With Having Some Limitation To The Player .
			
			for(int Lyf=1;Lyf<5;Lyf++) {
				
							int rm =obj.nextInt();
							//score =0;
					//Conditional Statement for Checking The Guessed Number is  Bigger or Smaller or Equal And Suggesting Player To Guess Some Nearby Number.  .
							if (rm == result){
								System.out.println(" Hurreh,U Win the Game  You Guessed The Right Number "+rm+"\n");
								System.out.println("--->You Guessed The Number:  "+ rm+"\n");
								 score=100/Lyf;
								 lyf=Lyf;
								break;
							}else if(rm>result) {
					
								System.out.println("    !@!You loose!@!\nYou Guessed The Wrong Number\n\n-------->   Your Number Is "+rm+"   <--------\n");
								System.out.println("||"+rm+" Is Bigger Than The System Generated Random Number:||\n");
								
									if(Lyf<4) { 
										System.out.println(" Try To Guess Smaller number To Win  \n   ");
										System.out.println("<--Choose The Number Again-->\n--------------------------------------------------------------------------\n-:>");
									}
									else {
										System.out.println("\t\tLIMIT EXCEED\n ");
										break;}
							
							}	
							else {										
								System.out.println("    !@!You loose!@!\nYou Guessed The Wrong Number\n\n-------->   Your Number Is "+rm+"   <--------");
								System.out.println("||"+rm+" Is Smaller Than The System Generated Random Number:||\n");
								
								if(Lyf<4) {
                                    lyf=Lyf+1;
									System.out.println("Try To Guess Bigger number To Win \n  ");
									System.out.println("<--Choose The Number Again-->\n--------------------------------------------------------------------------\n-:>");
								}
								else {
									lyf=Lyf;
									System.out.println("             LIMIT EXCEED\n");
									break;}
							}		
					
			}
			System.out.println("--------------------------------------------------------------------------\n");
			System.out.println("Your Score Is ||||--"+score+"--|||| In Your "+lyf +" Attempt \n");
			System.out.println("\t***********************\n\t*******Game Over*******\n\t***********************\n");
			Re_Try();
		
		}
		
		//This Re_Try Method Is Used For Take Instruction From The User. Are They Want To Play The Game Again Or Not.
		static void Re_Try() {
			Scanner obj=new Scanner(System.in);
			System.out.println("         Want To Play The Game  \n     \\\\--Type YES Otherwise NO--// ");
			String var = obj.nextLine();
			switch(var){
				case "YES" :
				case "Yes":
				case "yes":
					Recall();
					break;
				case"NO":
				case"no":
				case"No":
					System.out.println("\nHave A ***GOOD DAY*** See You Again");		
		}

	}

}
