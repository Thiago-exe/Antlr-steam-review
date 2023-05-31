// Generated from D:/Vou trabalhar na Nuuvem/Java/Antlr/src\Hello.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, JSON_INICIO=6, JSON_FIM=7, DOISPONTOS=8, 
		VIRGULA=9, TEXTO=10, NUMERO=11, CARACTERES=12, WHITESPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "JSON_INICIO", "JSON_FIM", "DOISPONTOS", 
			"VIRGULA", "TEXTO", "NUMERO", "CARACTERES", "INT", "EXP", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "'['", "']'", "'{'", "'}'", "':'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "JSON_INICIO", "JSON_FIM", "DOISPONTOS", 
			"VIRGULA", "TEXTO", "NUMERO", "CARACTERES", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\r}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tR\b\t\n\t\f\tU\t\t\u0001\t\u0001\t\u0001\n\u0003\nZ\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n_\b\n\u000b\n\f\n`\u0003\nc\b\n\u0001\n\u0003\nf\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\fm\b\f\n\f\f\f"+
		"p\t\f\u0003\fr\b\f\u0001\r\u0001\r\u0003\rv\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000\u001d\r"+
		"\u0001\u0000\u0007\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0004\u00000"+
		"9AZaz\u00c0\u017f\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0003"+
		"\u0000\t\n\r\r  \u008b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000"+
		"\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000"+
		"\u0000\u00119\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015"+
		"Y\u0001\u0000\u0000\u0000\u0017g\u0001\u0000\u0000\u0000\u0019q\u0001"+
		"\u0000\u0000\u0000\u001bs\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000"+
		"\u0000\u001f \u0005t\u0000\u0000 !\u0005r\u0000\u0000!\"\u0005u\u0000"+
		"\u0000\"#\u0005e\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005f\u0000"+
		"\u0000%&\u0005a\u0000\u0000&\'\u0005l\u0000\u0000\'(\u0005s\u0000\u0000"+
		"()\u0005e\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005n\u0000\u0000"+
		"+,\u0005u\u0000\u0000,-\u0005l\u0000\u0000-.\u0005l\u0000\u0000.\u0006"+
		"\u0001\u0000\u0000\u0000/0\u0005[\u0000\u00000\b\u0001\u0000\u0000\u0000"+
		"12\u0005]\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005{\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000056\u0005}\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u000078\u0005:\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005,\u0000"+
		"\u0000:\u0012\u0001\u0000\u0000\u0000;S\u0005\"\u0000\u0000<R\b\u0000"+
		"\u0000\u0000=>\u0005\\\u0000\u0000>R\u0005\"\u0000\u0000?@\u0005\\\u0000"+
		"\u0000@R\u0005\\\u0000\u0000AB\u0005\\\u0000\u0000BR\u0005/\u0000\u0000"+
		"CD\u0005\\\u0000\u0000DR\u0005b\u0000\u0000EF\u0005\\\u0000\u0000FR\u0005"+
		"f\u0000\u0000GH\u0005\\\u0000\u0000HR\u0005n\u0000\u0000IJ\u0005\\\u0000"+
		"\u0000JR\u0005r\u0000\u0000KL\u0005\\\u0000\u0000LR\u0005t\u0000\u0000"+
		"MN\u0005\\\u0000\u0000NO\u0005u\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PR\u0003\u0017\u000b\u0000Q<\u0001\u0000\u0000\u0000Q=\u0001\u0000\u0000"+
		"\u0000Q?\u0001\u0000\u0000\u0000QA\u0001\u0000\u0000\u0000QC\u0001\u0000"+
		"\u0000\u0000QE\u0001\u0000\u0000\u0000QG\u0001\u0000\u0000\u0000QI\u0001"+
		"\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\"\u0000"+
		"\u0000W\u0014\u0001\u0000\u0000\u0000XZ\u0005-\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[b\u0003"+
		"\u0019\f\u0000\\^\u0005.\u0000\u0000]_\u0007\u0001\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000df\u0003\u001b"+
		"\r\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0016\u0001"+
		"\u0000\u0000\u0000gh\u0007\u0002\u0000\u0000h\u0018\u0001\u0000\u0000"+
		"\u0000ir\u00050\u0000\u0000jn\u0007\u0003\u0000\u0000km\u0007\u0001\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qi\u0001\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000"+
		"r\u001a\u0001\u0000\u0000\u0000su\u0007\u0004\u0000\u0000tv\u0007\u0005"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0003\u0019\f\u0000x\u001c\u0001\u0000\u0000\u0000"+
		"yz\u0007\u0006\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0006\u000e\u0000"+
		"\u0000|\u001e\u0001\u0000\u0000\u0000\n\u0000QSY`benqu\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}