package comportamentais.mediator;

import javax.swing.DefaultListModel;

import comportamentais.mediator.components.AddButton;
import comportamentais.mediator.components.DeleteButton;
import comportamentais.mediator.components.Filter;
import comportamentais.mediator.components.List;
import comportamentais.mediator.components.SaveButton;
import comportamentais.mediator.components.TextBox;
import comportamentais.mediator.components.Title;
import comportamentais.mediator.mediator.Editor;
import comportamentais.mediator.mediator.Mediator;

public class Demo {

	public static void main(String[] args) {
		
		 Mediator mediator = new Editor();

	        mediator.registerComponent(new Title());
	        mediator.registerComponent(new TextBox());
	        mediator.registerComponent(new AddButton());
	        mediator.registerComponent(new DeleteButton());
	        mediator.registerComponent(new SaveButton());
	        mediator.registerComponent(new List(new DefaultListModel()));
	        mediator.registerComponent(new Filter());

	        mediator.createGUI();

	}
}