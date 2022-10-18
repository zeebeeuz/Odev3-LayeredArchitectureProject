package odev3KatmanMimarileri.core.loging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Mail ile loglandı : " + data);
		
	}

}
