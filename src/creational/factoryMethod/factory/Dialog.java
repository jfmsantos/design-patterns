package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;

public abstract class Dialog {

	public void renderWindow() {
		Button okButton = createButton();
		System.out.println("Creat a Button");
		okButton.render();
		System.out.println("Render a Button");
	}

	protected abstract Button createButton();
}
