import java.util.regex.*;

public class TrainConsistManagementApp {

    public boolean validateTrainId(String trainId) {
        return trainId.matches("TR\\d{3}");
    }

    public boolean validateCargoCode(String code) {
        return code.matches("CG-[A-Z]{2}\\d{2}");
    }

    public static void main(String[] args) {

        TrainConsistManagementApp app = new TrainConsistManagementApp();

        System.out.println("Train ID valid: " + app.validateTrainId("TR123"));
        System.out.println("Cargo valid: " + app.validateCargoCode("CG-AB12"));
    }
}