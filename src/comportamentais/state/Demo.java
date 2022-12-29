package comportamentais.state;

import comportamentais.state.ui.Player;
import comportamentais.state.ui.UI;

public class Demo {

	public static void main(String[] args) {
		Player player = new Player();
        UI ui = new UI(player);
        ui.init();
	}

}