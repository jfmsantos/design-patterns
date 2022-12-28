package comportamentais.mediator.components;

import comportamentais.mediator.mediator.Mediator;

public interface Component {

	void setMediator(Mediator mediator);
    String getName();
}
