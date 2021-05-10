import java.util.Random;

import javax.swing.JOptionPane;

public class SampleClass {
	Candidates[] listOfNames = new Candidates[3];
	String[] ballotNames = new String[20];
	Random random = new Random(2);
	int candidateNumber = random.nextInt();
	int largestVoteTotal = 0;
	void receiveVotes() {
		for(int i = 0; i < ballotNames.length; i++) {
		if(candidateNumber == 0 ) {
		ballotNames[i] = "Carson";
		}
		if(candidateNumber == 1 ) {
			ballotNames[i] = "Dave";
			}
		if(candidateNumber == 2 ) {
			ballotNames[i] = "Jeff";
			}
		candidateNumber = random.nextInt(2);
		}
	}
	void countVotes() {
		for(int j = 0; j < listOfNames.length; j++) {
		for(int i = 0; i < ballotNames.length; i++) {
		if(!ballotNames[i].equals(listOfNames[i].name)) {
			listOfNames[j] = new Candidates(ballotNames[j], 0);
		}
		else {
			listOfNames[i].numberOfVotes++;
			
		}
		}
		}
	}
	void DisplayVotes() {
		for(int i = 0; i < listOfNames.length; i++) {
		JOptionPane.showMessageDialog(null, "Candidate " + listOfNames[i].name + " got " + listOfNames[i].numberOfVotes + " votes.");
	}
	}
	void DetermineTheWinner() {
		for(int i = 0; i < listOfNames.length; i++) {
			if(listOfNames[largestVoteTotal].numberOfVotes < listOfNames[i].numberOfVotes) {
				largestVoteTotal = i;
			}
		}
		JOptionPane.showMessageDialog(null, "And Candidate " + listOfNames[largestVoteTotal].name + " won this year's election!");
	}
	public static void main(String[] args) {
		SampleClass Sc = new SampleClass();
		Sc.receiveVotes();
		Sc.countVotes();
		Sc.DisplayVotes();
		Sc.DetermineTheWinner();
	}
}
