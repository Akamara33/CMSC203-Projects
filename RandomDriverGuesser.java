import java.util.Scanner;



public class RandomDriverGuesser 
		{
			public static void main(String[] args)
		
			{
			
		
				//scanner object
				Scanner theInput=new Scanner(System.in);
				//declared given variables 
				int randNumber;
				int newGuess;
				int hGuess; 
				int lGuess;
				int lastguess;
				String answer;
		        char quotationmarks;
		        String name; 
		        String date;
		        
		        //assign Abass Kamara to name
		        name = " Programer: Abass Kamara";
		        date = " 09/26/2022" ;
		        
		        // assign "" to quotationmarks 
		        quotationmarks = '"';
				//assign 100 to highGuess
				hGuess =100;
				// assign 0 to lowGuess
				lGuess = 0;
				
					
				// RNG Class Object
				RNG randoms=new RNG();
				
				// calling to rand() method for random numbers
				randNumber=randoms.rand();
				lastguess=((int)randoms.getCount()/2) ;
				//the header of the app
				System.out.println("This application generates a random integer between 1 and 100 and asks the user to guess") ;
				
				//asking user to enter a number from 0 to 100
				System.out.println("Please enter a number between 0 and 100 :");
				
				//gets input and assigns it to new Guess
				newGuess=theInput.nextInt();
				
				//while loop. made to run as long as randNumber is not equal to newGuess
				while(newGuess !=randNumber )
					{
						if((int)randoms.getCount()/2 !=0)
						System.out.println("Number of guesses is: " +(int)randoms.getCount()/2);
						lastguess++; //a counter
						
						while(!randoms.inputValidation(newGuess, lGuess, hGuess))
						{
							newGuess=theInput.nextInt();
						}
					
						
						 if(newGuess<randNumber)
						 {
								lGuess=newGuess;
								System.out.println("Your guess is too low  "); 
						 }		
						
						  if(newGuess>randNumber)
						  {
							hGuess=newGuess;
						 System.out.println("Your guess is too high  ");
						 
						}
						  if(lastguess==7) 
						  
						  {   
							  System.out.println("\nSorry. You have exceeded the 7 guess limit"+"\nThe correct random number was "+quotationmarks+randNumber+quotationmarks);
							  System.out.println( "Do you want to play again? \n If yes please enter the last correct random number: " +quotationmarks+ randNumber +quotationmarks+ "\n if no please enter 1 :" );
						  	  
							    if (theInput.nextInt() == randNumber){
									randoms.resetCount();
									main(args);
									}
									else
										System.exit(1);
									
						  }
						  
						  
					     
					}

					
						
				
				
					if(newGuess == randNumber ) 
					{
						System.out.println("You got the correct answer. Congrats!!");
						System.out.println( " Do you want to play again? \n If yes please enter the last correct random number: "+ quotationmarks+randNumber + quotationmarks+"\n if no please enter 1 :" );
						System.out.println("\n" +name+ "\n"+date);
						if (theInput.nextInt() == randNumber){
						randoms.resetCount();
						main(args);
						}
						else
							System.exit(1);
						
						
					}
					
					
					
					
						}
			
	
	
	}









	


			