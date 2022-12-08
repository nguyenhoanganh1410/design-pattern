package iuh.fit.se.adapter;

public class TranslatorAdapter implements VietnameseTarget{
	private JapaneseAdaptee japaneseAdaptee;
	
	
	
	
	public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
		super();
		this.japaneseAdaptee = japaneseAdaptee;
	}




	public String sendMess(String message) {
		// TODO Auto-generated method stub
		System.out.println("get message from vietnamese: " + message);
		
		System.out.println("Sending to japanese....");
		
		String mess = translateMessage(message);
		japaneseAdaptee.receive(mess);
		return "sending secessfully!!";
	}
	
	
	private String translateMessage(String message) {
		return "The message : " + message;
	}
}
