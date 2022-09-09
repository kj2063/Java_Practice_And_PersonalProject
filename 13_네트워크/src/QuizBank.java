
public class QuizBank {
	
	String[] problems = {
							"네트워크 처리 패키지는?",
							"서버쪽 소켓 클래스 이름은?",
							"인터넷에서 컴퓨터를 식별하는 주소는?"
						};	
	
	String[] answers = {
							"java.net",
							"ServerSocket",
							"IP 주소"
						};
	
	int wating = 0; 
	int problem = 1;
	int answer = 2;
	int state = wating;
	
	int current = 0;
	
	public String process(String input) {
		
		String output = null;
		
		if(state == wating) {
			output = "퀴즈를 시작합니다.(y/n) :";
			state = problem;
		}
		else if(state == problem) {
			if(input.equalsIgnoreCase("y")) {
				output = problems[current];
				state = answer;
			}
			else {
				state = wating;
				output = "quit";
			}
		}
		else if(state == answer) {
			if(input.equalsIgnoreCase(answers[current])) {
				output = "정답입니다. 계속(y/n):";
				state = problem;
			}
			else {
				output = "오답입니다. 계속(y/n):";
				state = problem;
			}
			current = (current+1)%3;
		}
		return output;
	}
	
}
