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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, JSON_START=6, JSON_END=7, COLON=8, 
		COMMA=9, STRING=10, NUMBER=11, HEX=12, WHITESPACE=13, COMMENT=14, COMMENT_BLOCK=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "JSON_START", "JSON_END", "COLON", 
			"COMMA", "STRING", "NUMBER", "HEX", "INT", "EXP", "WHITESPACE", "COMMENT", 
			"COMMENT_BLOCK"
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
			null, null, null, null, null, null, "JSON_START", "JSON_END", "COLON", 
			"COMMA", "STRING", "NUMBER", "HEX", "WHITESPACE", "COMMENT", "COMMENT_BLOCK"
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
		"\u0004\u0000\u000f\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\t\u0001\t\u0001\n\u0003\nb"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0004\ng\b\n\u000b\n\f\nh\u0003\nk\b\n\u0001"+
		"\n\u0003\nn\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\fu\b\f\n\f\f\fx\t\f\u0003\fz\b\f\u0001\r\u0001\r\u0003\r~\b\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008a\b\u000f\n\u000f\f\u000f"+
		"\u008d\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0095\b\u0010\n\u0010\f\u0010\u0098\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0096\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b"+
		"\u0000\u001d\r\u001f\u000e!\u000f\u0001\u0000\b\u0003\u0000\n\n\r\r\""+
		"\"\u0001\u000009\u0003\u000009AFaf\u0001\u000019\u0002\u0000EEee\u0002"+
		"\u0000++--\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00ae\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0001#\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u0005"+
		".\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000"+
		"\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?"+
		"\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017o\u0001\u0000"+
		"\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000"+
		"\u001d\u0081\u0001\u0000\u0000\u0000\u001f\u0085\u0001\u0000\u0000\u0000"+
		"!\u0090\u0001\u0000\u0000\u0000#$\u0005t\u0000\u0000$%\u0005r\u0000\u0000"+
		"%&\u0005u\u0000\u0000&\'\u0005e\u0000\u0000\'\u0002\u0001\u0000\u0000"+
		"\u0000()\u0005f\u0000\u0000)*\u0005a\u0000\u0000*+\u0005l\u0000\u0000"+
		"+,\u0005s\u0000\u0000,-\u0005e\u0000\u0000-\u0004\u0001\u0000\u0000\u0000"+
		"./\u0005n\u0000\u0000/0\u0005u\u0000\u000001\u0005l\u0000\u000012\u0005"+
		"l\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005[\u0000\u00004\b\u0001"+
		"\u0000\u0000\u000056\u0005]\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005"+
		"{\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005}\u0000\u0000:\u000e\u0001"+
		"\u0000\u0000\u0000;<\u0005:\u0000\u0000<\u0010\u0001\u0000\u0000\u0000"+
		"=>\u0005,\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?[\u0005\"\u0000\u0000"+
		"@Z\b\u0000\u0000\u0000AB\u0005\\\u0000\u0000BZ\u0005\"\u0000\u0000CD\u0005"+
		"\\\u0000\u0000DZ\u0005\\\u0000\u0000EF\u0005\\\u0000\u0000FZ\u0005/\u0000"+
		"\u0000GH\u0005\\\u0000\u0000HZ\u0005b\u0000\u0000IJ\u0005\\\u0000\u0000"+
		"JZ\u0005f\u0000\u0000KL\u0005\\\u0000\u0000LZ\u0005n\u0000\u0000MN\u0005"+
		"\\\u0000\u0000NZ\u0005r\u0000\u0000OP\u0005\\\u0000\u0000PZ\u0005t\u0000"+
		"\u0000QR\u0005\\\u0000\u0000RS\u0005u\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0003\u0017\u000b\u0000UV\u0003\u0017\u000b\u0000VW\u0003\u0017"+
		"\u000b\u0000WX\u0003\u0017\u000b\u0000XZ\u0001\u0000\u0000\u0000Y@\u0001"+
		"\u0000\u0000\u0000YA\u0001\u0000\u0000\u0000YC\u0001\u0000\u0000\u0000"+
		"YE\u0001\u0000\u0000\u0000YG\u0001\u0000\u0000\u0000YI\u0001\u0000\u0000"+
		"\u0000YK\u0001\u0000\u0000\u0000YM\u0001\u0000\u0000\u0000YO\u0001\u0000"+
		"\u0000\u0000YQ\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^_\u0005\"\u0000\u0000_\u0014\u0001\u0000\u0000"+
		"\u0000`b\u0005-\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cj\u0003\u0019\f\u0000df\u0005.\u0000"+
		"\u0000eg\u0007\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000ln\u0003\u001b\r\u0000ml\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000n\u0016\u0001\u0000\u0000\u0000op\u0007\u0002"+
		"\u0000\u0000p\u0018\u0001\u0000\u0000\u0000qz\u00050\u0000\u0000rv\u0007"+
		"\u0003\u0000\u0000su\u0007\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yq\u0001\u0000"+
		"\u0000\u0000yr\u0001\u0000\u0000\u0000z\u001a\u0001\u0000\u0000\u0000"+
		"{}\u0007\u0004\u0000\u0000|~\u0007\u0005\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0003\u0019\f\u0000\u0080\u001c\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0007\u0006\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0006\u000e\u0000\u0000\u0084\u001e\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005/\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087\u008b\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\b\u0007\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u000f\u0000"+
		"\u0000\u008f \u0001\u0000\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091"+
		"\u0092\u0005*\u0000\u0000\u0092\u0096\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\t\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005*\u0000\u0000\u009a\u009b\u0005/\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0010\u0000"+
		"\u0000\u009d\"\u0001\u0000\u0000\u0000\f\u0000Y[ahjmvy}\u008b\u0096\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}