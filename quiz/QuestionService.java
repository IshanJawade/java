package quiz;

import java.util.Scanner;

public class QuestionService {
	
	// making array of Question class 
	// every element is a class so, we will need objects to use each
	Question[] questions = new Question[5];	
	int selection[] = new int[5];	// for answers

	// constructor of this class calling contructor of Questions class
	// and creating objects of every class in the array
	public QuestionService(){
		questions[0] = new Question(1, "que1", "opt1", "opt2", "opt3", "opt4", 2);
		questions[1] = new Question(1, "que2", "opt1", "opt2", "opt3", "opt4", 2);
		questions[2] = new Question(1, "que3", "opt1", "opt2", "opt3", "opt4", 4);
		questions[3] = new Question(1, "que4", "opt1", "opt2", "opt3", "opt4", 3);
		questions[4] = new Question(1, "que5", "opt1", "opt2", "opt3", "opt4", 3);
	}

	public void playQuiz(){
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		// for each loop to print every question from array
		for(Question q: questions){
			System.out.print(q.getId()+" ");
			System.out.println(q.getQuestion());
			System.out.print(q.getOpt1()+"\t");
			System.out.println(q.getOpt2());
			System.out.print(q.getOpt3()+"\t");
			System.out.println(q.getOpt4());
			selection[counter] = sc.nextInt();
			counter ++;
		}
		sc.close();
		// pass current instance of this class to score class
		Score finalScore = new Score(this);
		System.out.println("Your Score: " + finalScore.calculateScore(selection));
	}

}
