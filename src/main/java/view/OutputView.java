package view;

import user.Dealer;
import user.Player;

import java.util.List;

public class OutputView {
    private static final String ASK_PARTICIPANT_NAME = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String ASK_BETTING_MONEY = "의 배팅 금액은?";
    private static final String DEALER = "딜러";
    private static final String CARD = "카드";
    private static final String AND = "와 ";
    private static final String COMMA = ", ";
    private static final String COLON = ": ";
    private static final String DISTRIBUTE_TWO_CARDS = "에게 2장을 나누었습니다.";
    private static final String ASK_DRAW_CARD = "는 한 장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)";

    public static void askParticipantName() {
        System.out.println(ASK_PARTICIPANT_NAME);
    }

    public static void askBettingMoney(String name) {
        System.out.println(name + ASK_BETTING_MONEY);
    }

    public static void distributeTwoCards(List<String> players) {
        System.out.print(DEALER + AND);
        String allPlayerName = String.join(COMMA, players);
        System.out.print(allPlayerName);
        System.out.println(DISTRIBUTE_TWO_CARDS);
    }

    public static void printDealerCards(Dealer dealer) {
        System.out.print(DEALER + COLON);
        System.out.println(dealer.getFirstCard());
    }

    public static void printPlayerCards(Player player) {
        System.out.print(player.getName() + CARD + COLON);
        System.out.println(player.getAllCard());
    }

    public static void askDrawCard(Player player) {
        System.out.println(player.getName() + ASK_DRAW_CARD);
    }
}
