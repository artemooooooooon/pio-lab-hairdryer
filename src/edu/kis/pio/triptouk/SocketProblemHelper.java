package edu.kis.pio.triptouk;

import edu.kis.pio.devices.IEuropeanDevice;
import edu.kis.pio.sockets.IUKSocket;

public class SocketProblemHelper {

	public static void plugEuropeanDeviceIntoUKSocket(IEuropeanDevice device, IUKSocket socket) {
		
		// describe the steps our friend needs to take in order 
		// to connect an european device (device parameter) into a UK socket (socket parameter)

		// 1. Create the adapter.
		UKSocketAdapter adapter = new UKSocketAdapter();

		// 2. Plug the adapter's UK plug into the UK socket.
		adapter.getPlug().plugIntoUKSocket(socket);

		// 3. Plug the device's European plug into the adapter, which from the device's point of view is a European socket.
		device.getPlug().plugIntoEuropeanSocket(adapter);
	}
	
}
