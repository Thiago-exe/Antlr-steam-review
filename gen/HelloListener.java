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
	 * Enter a parse tree produced by {@link HelloParser#tipo_informacao}.
	 * @param ctx the parse tree
	 */
	void enterTipo_informacao(HelloParser.Tipo_informacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tipo_informacao}.
	 * @param ctx the parse tree
	 */
	void exitTipo_informacao(HelloParser.Tipo_informacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#separador}.
	 * @param ctx the parse tree
	 */
	void enterSeparador(HelloParser.SeparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#separador}.
	 * @param ctx the parse tree
	 */
	void exitSeparador(HelloParser.SeparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(HelloParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(HelloParser.ValorContext ctx);
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