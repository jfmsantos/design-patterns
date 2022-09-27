package estruturais.bridge.remotes;

import estruturais.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
	public AdvancedRemote(Device device) {
		super.device = device;
	}
	
	public void mute() {
		System.out.println("Remoto: mudo");
		device.setVolume(0);
	}
}
