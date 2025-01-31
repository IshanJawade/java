package quiz;

public class Score {
	private int score = 0;
	
	public int calculateScore(int[] answers){
		QuestionService obj = new QuestionService();

		// comapring user answers with correct answers from questions array 
		for(int i=0; i<obj.questions.length; i++){
			if(answers[i] == obj.questions[i].getAnswer()){
				score ++;
			}
		}
		return score;
	}

}
