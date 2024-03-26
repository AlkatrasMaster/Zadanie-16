import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(
                new SoundCard(new USB("2.0.4334"))
        );

        assert computer != null : "computer is null";

        String version = Optional.ofNullable(computer.getSoundCard())
                .map(SoundCard :: getUsb)
                .map(USB :: getVersion)
                .filter(ver -> ver.equals("1.003"))
                .orElse("N/A");

//        Optional<Computer> optionalComputer = Optional.ofNullable(computer);
//        optionalComputer.ifPresent(comp ->
//                System.out.println("Computer exists"));

//        String version = "U/N";
//        if (computer != null) {
//            SoundCard soundCard = computer.getSoundCard();
//            if (soundCard != null) {
//                USB usb = soundCard.getUsb();
//                if (usb != null) {
//                    version = usb.getVersion();
//                }
//            }
//        }
    }

    private static String getAnotherString() {
        return "Default";
    }
}
