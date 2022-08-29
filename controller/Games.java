package controller;

import modele.Deck;
import view.CommandLineView;
import view.GameSwingView;

public class Games {
    public static void main(String[] args) {
        GameSwingView gameSwingView = new GameSwingView();
        gameSwingView.createAndShowGUI();
        GameController gc = new GameController(new Deck(), gameSwingView, new HighCardGameEvaluator());
        //GameController gc = new GameController(new Deck(), new CommandLineView(), new LowCardGameEvaluator());
        gc.run();
    }

}
