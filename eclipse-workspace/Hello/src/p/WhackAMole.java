package p;

import java.io.IOException;
import java.util.Scanner;

public class WhackAMole {



	// Variables
		int score;
		int molesLeft; 
		static int attemptsLeft; 
		private int dimension; 
		char[][] moleGrid=new char[dimension][dimension];
		
		
		/*
		 * Constructor for the game, specifies total number of whacks allowed, 
		 * and the grid dimension. 
		 * After reading through the assignment, 
		 * make sure to initialize the moleGrid with the appropriate character.
		 * 
		 * */
		WhackAMole(int numAttempts, int gridDimension){
			this.dimension= gridDimension; 
			moleGrid= new char[dimension][dimension];
			if (numAttempts<=50){
				this.attemptsLeft=numAttempts; 
				}else{
					System.out.println("MAX NUMBER CAN BE 50 ");
				}
				molesLeft=10; 
				for (int i = 0; i < dimension; i++) {
					for (int j = 0; j < dimension; j++) {
						moleGrid[i][j]='*'; 
						
					}
				for (int j = 0; j < 10; j++) {
				
						int a=(int) (Math.random()*(dimension-1)+1); 
						int b=(int) (Math.random()*(dimension-1)+1); 
						moleGrid[a][b]='M'; 
					
					
				}	
					
					
				}
		}
		/*Given a location, place a mole at that location
		 * Return true if you can (update number of moles left)
		 * 
		 * */
		boolean place(int x, int y){
		    boolean b=false; 
		    if (x<moleGrid.length && y <moleGrid.length){
		    	if(moleGrid[x][y]=='M'){
		    		b=true;
		    		molesLeft-=molesLeft; 
		    		moleGrid[x][y]='M'; 	
		    	}
		    }else{
		    	System.out.println("You are out of the range");
		    }
			return b;
		}
		
		/*
		 * Given a location, take a whack at that location. 
		 * If that location contains a mole, the score, number of attemptsLeft, and molesLeft is updated. 
		 * If that location does not contain a mole, only attemptsLeft is updated.
		 * */
		void whack(int x, int y){
			if(place(x,y)){
				System.out.println("Got it");
				score+=10; 
				molesLeft-=molesLeft; 
				moleGrid[x][y]='W'; 
				
			}else{
				System.out.println("Try again");
				 
			}
			attemptsLeft=-attemptsLeft;
			System.out.println("You have "+attemptsLeft+ "attempts left");
			System.out.println("SCORE "+ score);
		}
		/* Print the grid without showing where the moles are. 
		 * For every spot that has recorded a print out a W, or * otherwise.
		 * 
		 * */
		
		void printGridToUser(){
			char[][] userArr=new char[dimension+1][dimension+1]; 
			for (int i = 0; i < userArr.length; i++) {
				for (int j = 0; j < userArr.length; j++) {
					if(moleGrid[i][j]!='M'){
						userArr[i][j]='*'; 	
					}
					if(moleGrid[i][j]=='M'){
						userArr[i][j]='*'; 	
					}
					if(moleGrid[i][j]=='W'){
						userArr[i][j]='W'; 	
					}
				}
			}
		     for (int i = 0; i < dimension; i++) {
					for (int j = 0; j < dimension; j++) {
						System.out.print(userArr[i][j]);
						
					}System.out.println("\n");
					
				}
		}
		/*
		 * Print the grid completely. This is effectively dumping the 2d array on the screen. 
		 * The places where the moles are should be printed as an ‘M’. 
		 * The places where the moles have been whacked should be printed as a ‘W’. 
		 * The places that don’t have a mole should be printed as *.
		 * 
		 * */
		

		void printGrid(){
		     for (int i = 0; i < dimension; i++) {
				for (int j = 0; j < dimension; j++) {
					System.out.print(moleGrid[i][j]);
					
				}System.out.println("\n");
				
			}
			
			
		}
		
		
		/*In order to play this game you need to create a main method. 
		 *Begin by creating a 10 by 10 grid where you randomly place the moles. 
		 *Place a total of 10 moles.
		 *Now allow the user (remember how to use Scanner?) to enter the x and y coordinates of where they would like to take a whack. 
		 *Tell them they have a maximum of 50 attempts to get all the moles. 
		 *At any point in the game, they can input coordinates of -1, -1 in order to indicate that they are giving up. 
		 *If the user gives up they get to see the entire grid.  
		 *The game ends if the user is able to uncover all the moles or if the user runs out of attempts. 
		 * 
		 * */
			
		public static void main(String[] args) {
		System.out.println( " Game Starts");
		System.out.println("Please enter the grid dimension");
		Scanner scandm= new Scanner(System.in);
	    WhackAMole wm =new WhackAMole(10, scandm.nextInt()); 
		wm.printGridToUser();
		for (int i = 0; i < 10; i++) {
			Scanner scx=new Scanner (System.in); 	
			Scanner scy=new Scanner (System.in);
			System.out.println("Please enter the x coordinate");
			int a=scx.nextInt()-1; 
			
			System.out.println("Please enter the Y coordinate");
			int b=scx.nextInt()-1; 
			
			if (a<0 || b<0){
				System.out.println("Invalid input");
				continue;
			}else{
				wm.whack(a,b); 
				wm.printGridToUser();
				if(attemptsLeft==0){
					System.out.println("Game is over");
				break; 
				}
				
			}
			
		
		}
		
		
		    
		}
		
		
		
		
		
	}