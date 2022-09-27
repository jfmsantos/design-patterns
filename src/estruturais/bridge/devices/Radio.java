package estruturais.bridge.devices;

public class Radio implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;
	@Override
	public boolean isEnabled() {
		return on;
	}
	@Override
	public void enable() {
		on = true;
	}
	@Override
	public void disable() {
		on = false;
	}
	@Override
	public int getVolume() {
		return volume;
	}
	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
	}
	@Override
	public int getChannel() {
		return channel;
	}
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}
	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
        System.out.println("| Eu sou um rádio.");
        System.out.println("| Eu estou " + (on ? "Ligado" : "Desligado"));
        System.out.println("| O volume atual é " + volume + "%");
        System.out.println("| O canal atual é " + channel);
        System.out.println("------------------------------------\n");
	}
	

}
