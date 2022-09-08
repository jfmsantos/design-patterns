package creational.factoryMethod;

import creational.factoryMethod.factory.Dialog;
import creational.factoryMethod.factory.HtmlDialog;
import creational.factoryMethod.factory.WindowsDialog;

public class Demo {
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		rurnBusinessLogic();
	}

	private static void configure() {
		if(System.getProperty("os.name").equals("Windows 10" )) {
			System.out.println(System.getProperty("os.name"));
			dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
		
	}
	
	private static void rurnBusinessLogic() {
		dialog.renderWindow();
	}
}
