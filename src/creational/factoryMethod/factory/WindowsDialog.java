package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;
import creational.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	protected Button createButton() {
		System.out.println("Creat a Windows Button");
		return new WindowsButton();
	}

}
