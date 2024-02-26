package lambda;

import java.util.Random;

public class BridgeEx1 {
    public static void main(String[] args) {
        BridgeNumberGenerator bridgeNumberGenerator = () -> new Random().nextInt();
        int randomNumber = bridgeNumberGenerator.generate();
    }
}
