package ru.tinkoff.cardgame.game.model;

import lombok.Data;
import ru.tinkoff.cardgame.game.model.card.Card;
import ru.tinkoff.cardgame.game.model.gamelogic.Player;

import java.util.List;

@Data
public class WSRoundMessage {
    private final Player player;
    private final Player opponent;
    private final List<Card> playerCard;
    private final List<Card> opponentCard;
    private final int playerCardIndex;
    private final int opponentCardIndex;
    private final boolean isPlayerAttack;

    public WSRoundMessage(Player player, Player opponent, List<Card> playerCard, List<Card> opponentCard,
                          int playerCardIndex, int opponentCardIndex, boolean isPlayerAttack) {

        this.player = player;
        this.opponent = opponent;
        this.playerCard = playerCard;
        this.opponentCard = opponentCard;
        this.playerCardIndex = playerCardIndex;
        this.opponentCardIndex = opponentCardIndex;
        this.isPlayerAttack = isPlayerAttack;
    }

    public WSRoundMessage(Player player, Player opponent, List<Card> playerCard, List<Card> opponentCard) {
        this.player = player;
        this.opponent = opponent;
        this.playerCard = playerCard;
        this.opponentCard = opponentCard;
        this.playerCardIndex = -1;
        this.opponentCardIndex = -1;
        this.isPlayerAttack = false;
    }

}
