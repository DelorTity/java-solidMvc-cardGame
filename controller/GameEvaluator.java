package controller;

import modele.Player;
import modele.PlayingCard;

import java.util.List;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);

}
