package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Expression;
import tech.antoniosgarbi.OrExpression;
import tech.antoniosgarbi.TerminalExpression;

public class Main {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }
}
