import util.StringDivider;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameManager {
    public static void run(InputView inputView) {
        settingParticipant(inputView);
    }

    private static void settingParticipant(InputView inputView) {
        List<String> names = getParticipantNames(inputView);
    }

    private static List<String> getParticipantNames(InputView inputView) {
        OutputView.askParticipantName();
        String names = inputView.participantName();
        return StringDivider.divideStringComma(names);
    }
}
