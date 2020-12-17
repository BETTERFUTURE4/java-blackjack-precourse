import user.PlayerController;
import view.InputView;


public class GameManager {
    public static void run(InputView inputView) {
        PlayerController playerController = new PlayerController();
        playerController.settingParticipant(inputView);
    }
}
