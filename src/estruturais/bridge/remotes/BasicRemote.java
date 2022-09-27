package estruturais.bridge.remotes;

import estruturais.bridge.devices.Device;

public class BasicRemote implements Remote {
	protected Device device;
	
	public BasicRemote() {}
	
	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void power() {
		System.out.println("Remoto: alternância de energia");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
	}

	@Override
	public void volumeDown() {
		 System.out.println("Remoto: diminuir o volume");
	        device.setVolume(device.getVolume() - 10);
	}

	@Override
	public void volumeUp() {
		System.out.println("Remoto: aumentar o volume");
        device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void channelDown() {
		System.out.println("Remoto: canal para baixo");
        device.setChannel(device.getChannel() - 1);
	}

	@Override
	public void channelUp() {
		System.out.println("Remoto: canal para cima");
        device.setChannel(device.getChannel() + 1);
	}
}
