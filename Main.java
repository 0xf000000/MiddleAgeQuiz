



import java.io.*;

public class Main {
	
	static int totalPoints = 0; 
	
	public static void main(String[] args) throws IOException, InterruptedException{
		GameStart g = new GameStart();
		
		totalPoints += g.question("lion.txt","question1.txt",20, 0,0);
		totalPoints += g.question("king.txt","question2.txt", 0, 0, 20);
		totalPoints += g.question("knight.txt","question3.txt", 20, 0, 0);
		
		
		
		
		g.GameFinished(totalPoints);
		

	}
}
