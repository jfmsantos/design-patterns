package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;
import creational.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	protected Button createButton() {
		System.out.println("Creat a Html Button");
		return new HtmlButton();
	}
}
