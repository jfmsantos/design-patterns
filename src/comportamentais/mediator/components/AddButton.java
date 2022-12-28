package comportamentais.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import comportamentais.mediator.mediator.Mediator;
import comportamentais.mediator.mediator.Note;

public class AddButton extends JButton implements Component {
	private static final long serialVersionUID = 1L;
	private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
