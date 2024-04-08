package main.java.behavioral.menento;

import java.util.Stack;

public class ArticleMenentoManager {

    private static final Stack<ArticleMenento> ARTICLE_MENENTOS = new Stack<>();

    public static ArticleMenento getMenento() {
        ArticleMenento pop = ARTICLE_MENENTOS.pop();
        return pop;
    }

    public static void addMenento(ArticleMenento menento) {
        ARTICLE_MENENTOS.push(menento);
    }
}
