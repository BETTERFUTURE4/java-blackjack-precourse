package view;

public class OutputView {
    private static final String ASK_PARTICIPANT_NAME = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String ASK_BETTING_MONEY = "의 배팅 금액은?";

    public static void askParticipantName() {
        System.out.println(ASK_PARTICIPANT_NAME);
    }

    public static void askBettingMoney(String name) {
        System.out.println(name + ASK_BETTING_MONEY);
    }
}
