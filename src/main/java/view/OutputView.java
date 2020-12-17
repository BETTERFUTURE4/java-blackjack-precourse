package view;

import user.Dealer;
import user.Player;
import user.User;

import java.math.BigDecimal;
import java.util.List;

public class OutputView {
    private static final String ASK_PARTICIPANT_NAME = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String ASK_BETTING_MONEY = "의 배팅 금액은?";
    private static final String DEALER = "딜러";
    private static final String CARD = "카드";
    private static final String AND = "와 ";
    private static final String COMMA = ", ";
    private static final String COLON = ": ";
    private static final String SCORE_RESULT = " - 결과: ";
    private static final String DISTRIBUTE_TWO_CARDS = "에게 2장을 나누었습니다.";
    private static final String ASK_DRAW_CARD = "는 한 장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)";
    private static final String DEALER_DRAW_ONE_CARD = "딜러는 16이하라 한 장의 카드를 더 받았습니다.";
    private static final String FINAL_PROFIT_TITLE = "## 최종 수익";

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
    }

    public static void printPlayerCards(Player player) {
        System.out.print(player.getName() + CARD + COLON);
    }

    public static void printOneCard(Dealer dealer) {
        System.out.print(dealer.getFirstCard());
    }

    public static void printAllCards(User user) {
        System.out.print(user.getAllCard());
    }

    public static void askDrawCard(Player player) {
        System.out.println(player.getName() + ASK_DRAW_CARD);
    }

    public static void noticeDealerDrawCard() {
        System.out.println(DEALER_DRAW_ONE_CARD);
    }

    public static void blankLine() {
        System.out.println();
    }

    public static void printScore(int finalScore) {
        System.out.println(SCORE_RESULT + finalScore);
    }

    public static void printFinalProfitTitle() {
        System.out.println(FINAL_PROFIT_TITLE);
    }

    public static void showDealerProfit(BigDecimal profit) {
        System.out.print(DEALER + COLON);
        System.out.println(profit);
    }

    public static void showPlayerProfit(String name, BigDecimal profit) {
        System.out.print(name + COLON);
        System.out.println(profit);
    }
}
