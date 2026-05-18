package edu.kis.pio.triptouk;

import edu.kis.pio.devices.IUKDevice;
import edu.kis.pio.plugs.IUKPlug;
import edu.kis.pio.plugs.PlainUKPlug;
import edu.kis.pio.sockets.IEuropeanSocket;

public class UKSocketAdapter implements IUKDevice, IEuropeanSocket {

    private final IUKPlug myPlug = new PlainUKPlug();

    @Override
    public IUKPlug getPlug() {
        return myPlug;
    }

    @Override
    public int getVoltsSupplied() {
        return myPlug.getCurrentVolts();
    }

    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public boolean isBroken() {
        return false;
    }
}