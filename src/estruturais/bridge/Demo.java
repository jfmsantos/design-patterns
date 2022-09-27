package estruturais.bridge;

import estruturais.bridge.devices.Device;
import estruturais.bridge.devices.Radio;
import estruturais.bridge.devices.Tv;
import estruturais.bridge.remotes.AdvancedRemote;
import estruturais.bridge.remotes.BasicRemote;

public class Demo {
	 public static void main(String[] args) {
	        testDevice(new Tv());
	        testDevice(new Radio());
	    }

	    public static void testDevice(Device device) {
	        System.out.println("Testes com controle remoto básico.");
	        BasicRemote basicRemote = new BasicRemote(device);
	        basicRemote.power();
	        device.printStatus();

	        System.out.println("Testes com controle remoto avançado.");
	        AdvancedRemote advancedRemote = new AdvancedRemote(device);
	        advancedRemote.power();
	        advancedRemote.mute();
	        device.printStatus();
	    }

}
