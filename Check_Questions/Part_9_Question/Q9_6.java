package Part_9_Question;

class Chat {
	void start() {
		
	}
	void sendMessage(String message) {
		
	}
}

class Chatting{
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
//					String message = "["+nickName +"]"+inputData;
//					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}

public class Q9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
