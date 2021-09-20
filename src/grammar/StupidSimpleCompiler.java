package grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class StupidSimpleCompiler extends StupidSimpleBaseListener{

    private StringBuilder out = new StringBuilder();

    public String getCompiledCode(){
        return out.toString();
    }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterFile(StupidSimpleParser.FileContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitFile(StupidSimpleParser.FileContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterCode(StupidSimpleParser.CodeContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitCode(StupidSimpleParser.CodeContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterStatement(StupidSimpleParser.StatementContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitStatement(StupidSimpleParser.StatementContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterDeclare(StupidSimpleParser.DeclareContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitDeclare(StupidSimpleParser.DeclareContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterAssign(StupidSimpleParser.AssignContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitAssign(StupidSimpleParser.AssignContext ctx) {
            String row = "pop " +ctx.ID().getText();

            this.out.append(row+"\n");
            System.out.println(row);
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterExpression(StupidSimpleParser.ExpressionContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitExpression(StupidSimpleParser.ExpressionContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterPrint(StupidSimpleParser.PrintContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitPrint(StupidSimpleParser.PrintContext ctx) {
            this.out.append("print " +"\n");
            System.out.println("print" +ctx.ID().getText());
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterAddExpression(StupidSimpleParser.AddExpressionContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitAddExpression(StupidSimpleParser.AddExpressionContext ctx) {
            this.out.append("add \n");
            System.out.println("add");
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterUnaryExpression(StupidSimpleParser.UnaryExpressionContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitUnaryExpression(StupidSimpleParser.UnaryExpressionContext ctx) {
            String value ="";
            if(ctx.ID() == null) {
                value = ctx.INT().getText();
            }
            else{
                value = ctx.ID().getText();
            }
            out.append("push " +value +"\n");
            System.out.println("push " + value);
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterLoop(StupidSimpleParser.LoopContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitLoop(StupidSimpleParser.LoopContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterCond(StupidSimpleParser.CondContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitCond(StupidSimpleParser.CondContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterStartloop(StupidSimpleParser.StartloopContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitStartloop(StupidSimpleParser.StartloopContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterLoopbody(StupidSimpleParser.LoopbodyContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitLoopbody(StupidSimpleParser.LoopbodyContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterEndloop(StupidSimpleParser.EndloopContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitEndloop(StupidSimpleParser.EndloopContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterEveryRule(ParserRuleContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitEveryRule(ParserRuleContext ctx) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void visitTerminal(TerminalNode node) { }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void visitErrorNode(ErrorNode node) { }

}
