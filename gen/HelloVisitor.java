// Generated from D:/Vou trabalhar na Nuuvem/Java/Antlr/src\Hello.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(HelloParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(HelloParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HelloParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HelloParser.ArrayContext ctx);
}