package iuh.fit.se.adapter;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		TranslatorAdapter translatorAdapter = new TranslatorAdapter(new JapaneseAdaptee());
		
		translatorAdapter.sendMess("anhanhanh");
	}
}
