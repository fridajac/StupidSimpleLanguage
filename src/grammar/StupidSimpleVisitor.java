// Generated from /Users/fridajacobsson/Documents/Systemutvecklare/Systemprogramvara/StupidSimpleLanguage/src/grammar/StupidSimple.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StupidSimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StupidSimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(StupidSimpleParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(StupidSimpleParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StupidSimpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(StupidSimpleParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(StupidSimpleParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(StupidSimpleParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StupidSimpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(StupidSimpleParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(StupidSimpleParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(StupidSimpleParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(StupidSimpleParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#startloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartloop(StupidSimpleParser.StartloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#loopbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopbody(StupidSimpleParser.LoopbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#endloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndloop(StupidSimpleParser.EndloopContext ctx);
}