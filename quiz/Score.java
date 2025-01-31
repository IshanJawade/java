package quiz;

public class Score {
	private int score = 0;
	
	// make a variable to receive objects from QuestionSerive class of its type
	private QuestionService	objectService;

	// contructor to assign received object to variable we have created
	public Score(QuestionService questionService){
		this.objectService = questionService;
	}
	
	// all the infromation of current user session is in objectService
	public int calculateScore(int[] answers){

		// comapring user answers with correct answers from questions array 
		for(int i=0; i<objectService.questions.length; i++){
			if(answers[i] == objectService.questions[i].getAnswer()){
				score ++;
			}
		}
		return score;
	}

}
