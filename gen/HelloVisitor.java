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
	 * Visit a parse tree produced by {@link HelloParser#tipo_informacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_informacao(HelloParser.Tipo_informacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#separador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparador(HelloParser.SeparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(HelloParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HelloParser.ArrayContext ctx);
}