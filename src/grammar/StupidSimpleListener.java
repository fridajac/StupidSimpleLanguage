// Generated from /Users/fridajacobsson/Documents/Systemutvecklare/Systemprogramvara/StupidSimpleLanguage/src/grammar/StupidSimple.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StupidSimpleParser}.
 */
public interface StupidSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(StupidSimpleParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(StupidSimpleParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(StupidSimpleParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(StupidSimpleParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StupidSimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StupidSimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(StupidSimpleParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(StupidSimpleParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StupidSimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StupidSimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(StupidSimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(StupidSimpleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StupidSimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StupidSimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(StupidSimpleParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(StupidSimpleParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(StupidSimpleParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(StupidSimpleParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(StupidSimpleParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(StupidSimpleParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(StupidSimpleParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(StupidSimpleParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#startloop}.
	 * @param ctx the parse tree
	 */
	void enterStartloop(StupidSimpleParser.StartloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#startloop}.
	 * @param ctx the parse tree
	 */
	void exitStartloop(StupidSimpleParser.StartloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#loopbody}.
	 * @param ctx the parse tree
	 */
	void enterLoopbody(StupidSimpleParser.LoopbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#loopbody}.
	 * @param ctx the parse tree
	 */
	void exitLoopbody(StupidSimpleParser.LoopbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidSimpleParser#endloop}.
	 * @param ctx the parse tree
	 */
	void enterEndloop(StupidSimpleParser.EndloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidSimpleParser#endloop}.
	 * @param ctx the parse tree
	 */
	void exitEndloop(StupidSimpleParser.EndloopContext ctx);
}