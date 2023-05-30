// Generated from D:/Vou trabalhar na Nuuvem/Java/Antlr/src\Hello.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(HelloParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(HelloParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(HelloParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(HelloParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HelloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HelloParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(HelloParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(HelloParser.ArrayContext ctx);
}