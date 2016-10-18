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
		String response = "talking to you";
		
		while(stupidBot.lengthChecker(response))
		{
			response = chatView.collectResponse("what to talk about today?");
		}
	
	
	
	}
}
