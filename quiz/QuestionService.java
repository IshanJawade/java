package quiz;

public class QuestionService {
	
	// making array of Question class 
	// every element is a class so, we will need objects to use each
	Question[] questions = new Question[5];
	
	// constructor of this class calling contructor of Questions class
	// and creating objects of every class in the array
	public QuestionService(){
		questions[0] = new Question(1, "que1", "opt1", "opt2", "opt3", "opt4", "opt4");
		questions[1] = new Question(1, "que2", "opt1", "opt2", "opt3", "opt4", "opt4");
		questions[2] = new Question(1, "que3", "opt1", "opt2", "opt3", "opt4", "opt4");
		questions[3] = new Question(1, "que4", "opt1", "opt2", "opt3", "opt4", "opt4");
		questions[4] = new Question(1, "que5", "opt1", "opt2", "opt3", "opt4", "opt4");
	}

	public void displayQuestions(){

		// for each loop to print every question from array
		for(Question q: questions){
			// toString() method gets called automatically
			System.out.println(q);
		}
	}

}
