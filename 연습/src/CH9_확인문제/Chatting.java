package CH9_Ȯ�ι���;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		//String nickName = null;
		//nickName = chatId;
		Chat chat = new Chat() {
		
			//@overriding
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
		
	}
	
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
}
