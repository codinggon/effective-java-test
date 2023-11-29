package com.gon.effectivejavatest.chapter01.item03.field;

public class Concert {

    private boolean lightsOn;

    private boolean mainStateOpen;

    private IElvis elvis;

    //IElvis의 클라이언트 코드
    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }
}
