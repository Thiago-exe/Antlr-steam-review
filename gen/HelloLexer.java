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
		"\u0004\u0000\u000f\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tV\b\t\n\t\f"+
		"\tY\t\t\u0001\t\u0001\t\u0001\n\u0003\n^\b\n\u0001\n\u0001\n\u0001\n\u0004"+
		"\nc\b\n\u000b\n\f\nd\u0003\ng\b\n\u0001\n\u0003\nj\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\fq\b\f\n\f\f\ft\t\f\u0003\fv\b\f"+
		"\u0001\r\u0001\r\u0003\rz\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0086\b\u000f\n\u000f\f\u000f\u0089\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0091"+
		"\b\u0010\n\u0010\f\u0010\u0094\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0092\u0000\u0011\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000\u001d\r\u001f\u000e!\u000f"+
		"\u0001\u0000\b\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0003\u000009AFa"+
		"f\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  "+
		"\u0002\u0000\n\n\r\r\u00aa\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000"+
		"\u0003(\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00073"+
		"\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015]"+
		"\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000\u0000\u0019u\u0001\u0000"+
		"\u0000\u0000\u001bw\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000"+
		"\u001f\u0081\u0001\u0000\u0000\u0000!\u008c\u0001\u0000\u0000\u0000#$"+
		"\u0005t\u0000\u0000$%\u0005r\u0000\u0000%&\u0005u\u0000\u0000&\'\u0005"+
		"e\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005f\u0000\u0000)*\u0005"+
		"a\u0000\u0000*+\u0005l\u0000\u0000+,\u0005s\u0000\u0000,-\u0005e\u0000"+
		"\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005n\u0000\u0000/0\u0005u\u0000"+
		"\u000001\u0005l\u0000\u000012\u0005l\u0000\u00002\u0006\u0001\u0000\u0000"+
		"\u000034\u0005[\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005]\u0000"+
		"\u00006\n\u0001\u0000\u0000\u000078\u0005{\u0000\u00008\f\u0001\u0000"+
		"\u0000\u00009:\u0005}\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005"+
		":\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005,\u0000\u0000>\u0012"+
		"\u0001\u0000\u0000\u0000?W\u0005\"\u0000\u0000@V\b\u0000\u0000\u0000A"+
		"B\u0005\\\u0000\u0000BV\u0005\"\u0000\u0000CD\u0005\\\u0000\u0000DV\u0005"+
		"\\\u0000\u0000EF\u0005\\\u0000\u0000FV\u0005/\u0000\u0000GH\u0005\\\u0000"+
		"\u0000HV\u0005b\u0000\u0000IJ\u0005\\\u0000\u0000JV\u0005f\u0000\u0000"+
		"KL\u0005\\\u0000\u0000LV\u0005n\u0000\u0000MN\u0005\\\u0000\u0000NV\u0005"+
		"r\u0000\u0000OP\u0005\\\u0000\u0000PV\u0005t\u0000\u0000QR\u0005\\\u0000"+
		"\u0000RS\u0005u\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0003\u0017\u000b"+
		"\u0000U@\u0001\u0000\u0000\u0000UA\u0001\u0000\u0000\u0000UC\u0001\u0000"+
		"\u0000\u0000UE\u0001\u0000\u0000\u0000UG\u0001\u0000\u0000\u0000UI\u0001"+
		"\u0000\u0000\u0000UK\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000"+
		"UO\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000[\u0014\u0001"+
		"\u0000\u0000\u0000\\^\u0005-\u0000\u0000]\\\u0001\u0000\u0000\u0000]^"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_f\u0003\u0019\f\u0000"+
		"`b\u0005.\u0000\u0000ac\u0007\u0001\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hj\u0003\u001b\r\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0016\u0001\u0000\u0000\u0000"+
		"kl\u0007\u0002\u0000\u0000l\u0018\u0001\u0000\u0000\u0000mv\u00050\u0000"+
		"\u0000nr\u0007\u0003\u0000\u0000oq\u0007\u0001\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"um\u0001\u0000\u0000\u0000un\u0001\u0000\u0000\u0000v\u001a\u0001\u0000"+
		"\u0000\u0000wy\u0007\u0004\u0000\u0000xz\u0007\u0005\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0003\u0019\f\u0000|\u001c\u0001\u0000\u0000\u0000}~\u0007\u0006\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u000e\u0000\u0000"+
		"\u0080\u001e\u0001\u0000\u0000\u0000\u0081\u0082\u0005/\u0000\u0000\u0082"+
		"\u0083\u0005/\u0000\u0000\u0083\u0087\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\b\u0007\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0006\u000f\u0000\u0000\u008b \u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u008e\u0005*\u0000\u0000"+
		"\u008e\u0092\u0001\u0000\u0000\u0000\u008f\u0091\t\u0000\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005*\u0000\u0000\u0096\u0097\u0005/\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0006\u0010\u0000\u0000\u0099\"\u0001\u0000"+
		"\u0000\u0000\f\u0000UW]dfiruy\u0087\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}