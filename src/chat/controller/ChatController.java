package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatViewer chatView;
	
	public ChatController()
	{
		stupidBot = new Chatbot("Boaty McBoatface");
		chatView = new ChatViewer();
	}
	
	public void start()
	{
		String response = chatView.collectResponse("What do you want to talk about today?");
		
				while(stupidBot.lengthChecker(response))
		{
					chatView.displayMessage(useChatbotCheckers(response));
				response = chatView.collectResponse("Oh, you are interested in " + response);
		}
	
	
	
	}
	
	private String useChatbotCheckers(String input)
	{
		String answer = "";
		if(stupidBot.contentChecker(input))
		{
			answer += "\nYou know my special secret\n";
		}
		if(stupidBot.memeChecker(input))
		{
			answer += "\nI can has memes?\n";
		}
		if(answer.length() == 0)
		{
			answer += "Sorry, I don't know about " + input;
		}
		if(stupidBot.politicalTopicChecker(input))
		{
			answer += "Oh, I guess I can talk about " + input;
		}
		if(stupidBot.contentChecker(input))
		{
			answer += " My fetish!! I love " + input;
		}
		
		return answer;
	}




}
