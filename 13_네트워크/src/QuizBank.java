
public class QuizBank {
	
	String[] problems = {
							"��Ʈ��ũ ó�� ��Ű����?",
							"������ ���� Ŭ���� �̸���?",
							"���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ�?"
						};	
	
	String[] answers = {
							"java.net",
							"ServerSocket",
							"IP �ּ�"
						};
	
	int wating = 0; 
	int problem = 1;
	int answer = 2;
	int state = wating;
	
	int current = 0;
	
	public String process(String input) {
		
		String output = null;
		
		if(state == wating) {
			output = "��� �����մϴ�.(y/n) :";
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
				output = "�����Դϴ�. ���(y/n):";
				state = problem;
			}
			else {
				output = "�����Դϴ�. ���(y/n):";
				state = problem;
			}
			current = (current+1)%3;
		}
		return output;
	}
	
}
