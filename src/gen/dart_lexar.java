// Generated from /Users/macbookair/Desktop/AntlerExample/src/dart_lexar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dart_lexar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, CRLY_BRKT_OP=2, CRLY_BRKT_CL=3, SEMICOLON=4, PLUS=5, EQUAL=6, 
		ASSIGN=7, NOTEQUAL=8, INT=9, STRING=10, BOOL=11, EXTENDS=12, STRING_LINE=13, 
		STATEFULL=14, STATELESS=15, TRUE=16, FALSE=17, NAME=18, NUMBER=19, COMMENT=20, 
		WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "CRLY_BRKT_OP", "CRLY_BRKT_CL", "SEMICOLON", "PLUS", "EQUAL", 
			"ASSIGN", "NOTEQUAL", "INT", "STRING", "BOOL", "EXTENDS", "STRING_LINE", 
			"STATEFULL", "STATELESS", "TRUE", "FALSE", "NAME", "NUMBER", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "';'", "'+'", "'=='", "'='", "'!='", "'int'", 
			"'String'", "'bool'", "'extends'", null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "CRLY_BRKT_OP", "CRLY_BRKT_CL", "SEMICOLON", "PLUS", "EQUAL", 
			"ASSIGN", "NOTEQUAL", "INT", "STRING", "BOOL", "EXTENDS", "STRING_LINE", 
			"STATEFULL", "STATELESS", "TRUE", "FALSE", "NAME", "NUMBER", "COMMENT", 
			"WS"
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


	public dart_lexar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dart_lexar.g4"; }

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
		"\u0004\u0000\u0015\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f^\b\f\n\f\f\fa\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\rg\b\r\n\r\f\rj\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e}\b\u000e\n\u000e\f\u000e\u0080"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u009e"+
		"\b\u0011\u000b\u0011\f\u0011\u009f\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00a4\b\u0012\n\u0012\f\u0012\u00a7\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00ad\b\u0013\n\u0013\f\u0013\u00b0\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u00b5\b\u0014\u000b\u0014"+
		"\f\u0014\u00b6\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0005\u0002\u0000\"\""+
		"\\\\\u0002\u0000AZaz\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000\t\n"+
		"\r\r  \u00c1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000"+
		"\u0000\u00053\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t"+
		"7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r<\u0001\u0000"+
		"\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000"+
		"\u0013E\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017Q"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001bd\u0001\u0000"+
		"\u0000\u0000\u001dz\u0001\u0000\u0000\u0000\u001f\u0091\u0001\u0000\u0000"+
		"\u0000!\u0096\u0001\u0000\u0000\u0000#\u009d\u0001\u0000\u0000\u0000%"+
		"\u00a1\u0001\u0000\u0000\u0000\'\u00a8\u0001\u0000\u0000\u0000)\u00b4"+
		"\u0001\u0000\u0000\u0000+,\u0005c\u0000\u0000,-\u0005l\u0000\u0000-.\u0005"+
		"a\u0000\u0000./\u0005s\u0000\u0000/0\u0005s\u0000\u00000\u0002\u0001\u0000"+
		"\u0000\u000012\u0005{\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005"+
		"}\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005;\u0000\u00006\b\u0001"+
		"\u0000\u0000\u000078\u0005+\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005"+
		"=\u0000\u0000:;\u0005=\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005"+
		"=\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005!\u0000\u0000?@\u0005"+
		"=\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005i\u0000\u0000BC\u0005"+
		"n\u0000\u0000CD\u0005t\u0000\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005"+
		"S\u0000\u0000FG\u0005t\u0000\u0000GH\u0005r\u0000\u0000HI\u0005i\u0000"+
		"\u0000IJ\u0005n\u0000\u0000JK\u0005g\u0000\u0000K\u0014\u0001\u0000\u0000"+
		"\u0000LM\u0005b\u0000\u0000MN\u0005o\u0000\u0000NO\u0005o\u0000\u0000"+
		"OP\u0005l\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005e\u0000\u0000"+
		"RS\u0005x\u0000\u0000ST\u0005t\u0000\u0000TU\u0005e\u0000\u0000UV\u0005"+
		"n\u0000\u0000VW\u0005d\u0000\u0000WX\u0005s\u0000\u0000X\u0018\u0001\u0000"+
		"\u0000\u0000Y_\u0005\"\u0000\u0000Z^\b\u0000\u0000\u0000[\\\u0005\\\u0000"+
		"\u0000\\^\t\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\"\u0000\u0000c\u001a\u0001\u0000\u0000\u0000dh\u0003\u0017\u000b"+
		"\u0000eg\u0003)\u0014\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005S\u0000\u0000lm\u0005t\u0000"+
		"\u0000mn\u0005a\u0000\u0000no\u0005t\u0000\u0000op\u0005e\u0000\u0000"+
		"pq\u0005f\u0000\u0000qr\u0005u\u0000\u0000rs\u0005l\u0000\u0000st\u0005"+
		"W\u0000\u0000tu\u0005i\u0000\u0000uv\u0005d\u0000\u0000vw\u0005g\u0000"+
		"\u0000wx\u0005e\u0000\u0000xy\u0005t\u0000\u0000y\u001c\u0001\u0000\u0000"+
		"\u0000z~\u0003\u0017\u000b\u0000{}\u0003)\u0014\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005S\u0000\u0000\u0082\u0083\u0005t\u0000"+
		"\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005t\u0000\u0000\u0085"+
		"\u0086\u0005e\u0000\u0000\u0086\u0087\u0005l\u0000\u0000\u0087\u0088\u0005"+
		"e\u0000\u0000\u0088\u0089\u0005s\u0000\u0000\u0089\u008a\u0005s\u0000"+
		"\u0000\u008a\u008b\u0005W\u0000\u0000\u008b\u008c\u0005i\u0000\u0000\u008c"+
		"\u008d\u0005d\u0000\u0000\u008d\u008e\u0005g\u0000\u0000\u008e\u008f\u0005"+
		"e\u0000\u0000\u008f\u0090\u0005t\u0000\u0000\u0090\u001e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005t\u0000\u0000\u0092\u0093\u0005r\u0000\u0000\u0093"+
		"\u0094\u0005u\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095 \u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005f\u0000\u0000\u0097\u0098\u0005a\u0000"+
		"\u0000\u0098\u0099\u0005l\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a"+
		"\u009b\u0005e\u0000\u0000\u009b\"\u0001\u0000\u0000\u0000\u009c\u009e"+
		"\u0007\u0001\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0$\u0001\u0000\u0000\u0000\u00a1\u00a5\u0007"+
		"\u0002\u0000\u0000\u00a2\u00a4\u0007\u0002\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6&\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005/\u0000"+
		"\u0000\u00a9\u00aa\u0005/\u0000\u0000\u00aa\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\b\u0003\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u0013\u0000\u0000\u00b2"+
		"(\u0001\u0000\u0000\u0000\u00b3\u00b5\u0007\u0004\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\u0014\u0000\u0000\u00b9*\u0001"+
		"\u0000\u0000\u0000\t\u0000]_h~\u009f\u00a5\u00ae\u00b6\u0001\u0006\u0000"+
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