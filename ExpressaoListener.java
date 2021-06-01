// Generated from Expressao.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressaoParser}.
 */
public interface ExpressaoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#regra}.
	 * @param ctx the parse tree
	 */
	void enterRegra(ExpressaoParser.RegraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#regra}.
	 * @param ctx the parse tree
	 */
	void exitRegra(ExpressaoParser.RegraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressaoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressaoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ExpressaoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ExpressaoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(ExpressaoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(ExpressaoParser.FatorContext ctx);
}