interface MyCamera {
    void takeSnap();
    void recordVideo();
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K");
    }

    private void greet() {
        System.out.println("Good morning");
    }
}

interface MyWifi {
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellphone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellphone implements MyWifi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    public String[] getNetwork() {
        System.out.println("Getting list of Networks");
        String[] networkList = {"harry", "prashanth", "Anjali5G"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class interfac2 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}