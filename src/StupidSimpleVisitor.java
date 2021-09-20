// Generated from /Users/fridajacobsson/Documents/Systemutvecklare/Systemprogramvara/StupidSimpleLanguage/src/grammar/StupidSimple.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link StupidSimpleParser#open_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_paren(StupidSimpleParser.Open_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#close_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_paren(StupidSimpleParser.Close_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#rcurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRcurl(StupidSimpleParser.RcurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(StupidSimpleParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(StupidSimpleParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#add_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_assignment(StupidSimpleParser.Add_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#le}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(StupidSimpleParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(StupidSimpleParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidSimpleParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(StupidSimpleParser.LoopContext ctx);
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