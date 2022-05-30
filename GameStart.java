

import java.io.*;

public class GameStart extends Thread {
	
	private void clearConsole() {
		System.out.print("\033[H\033[2J");
        System.out.flush();
	}
	
	
	
	
	public GameStart()
	{
		init();
	}
	
	public void init() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			printascii("data/Banner.txt", 70);
			
			System.out.print("Wilkommen zum Quiz zu Heinrich dem Löwen drücke Enter um das Quiz zu starten: ");
			String s = br.readLine();
			if(s.equals("")) {
				
				
				
				
			}else {
				
				System.err.println("Das war nicht Enter :(");
				Thread.sleep(1000);
				clearConsole();
				
				init();
			}
			
		} catch(Exception e) {
			System.err.print("etwas bei der eingabe ging schief :(");
		}
		
	}
	
	public void printascii( String file , int Timetosleep)  throws InterruptedException{
		
			 try {
				 BufferedReader br = new BufferedReader(new FileReader(file));
				 
			 
			while ( br.read() != -1 ) {
				
					Thread.sleep(Timetosleep);
					System.out.println(br.readLine());
					
				}
				
			
		br.close();
	 }catch(IOException e){
		 System.out.println(e);
	
	 }
		
		
	}
	
	
	public int question(String print,String question, int a, int b , int c) throws InterruptedException {
		String input = ""; 
		clearConsole();
		printascii("data/" + print,50);
		
		printascii("data/"+question,50); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("deine Antwort : ");
			input = br.readLine().trim(); 	
		}catch (IOException e ) {
			System.out.print(e); 
		}
			
		switch(input) {
		case "a": 
			return a; 
			
			
		case"b": 
			return b; 
		
		case "c": 
			return c; 
		}
		
		
		
		return 0 ; 
	}
	
	
	public void GameFinished(int points) throws InterruptedException{
		clearConsole(); 
		printascii("data/finishedBanner.txt", 50); 
		Thread.sleep(500); 
		
		
		System.out.println("Okayokay ihr seid fertig und habt: " + points + " von 60 Punkten erreicht !! "); 
		
		
	}
	
	
	
	
	
	
}
