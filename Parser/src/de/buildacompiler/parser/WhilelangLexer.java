// Generated from Whilelang.g4 by ANTLR 4.13.0
package de.buildacompiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class WhilelangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, VARIABLE=19, CONSTANT=20, Comment=21, Space=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	}; 

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "VARIABLE", "CONSTANT", "Comment", "Space"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'loop'", "'do'", "'{'", "'}'", "'while'", "'('", 
			"')'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "VARIABLE", "CONSTANT", "Comment", 
			"Space"
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


	public WhilelangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Whilelang.g4"; }

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
		"\u0004\u0000\u0016\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012e\b"+
		"\u0012\n\u0012\f\u0012h\t\u0012\u0001\u0013\u0004\u0013k\b\u0013\u000b"+
		"\u0013\f\u0013l\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014s\b\u0014\n\u0014\f\u0014v\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0004\u0015{\b\u0015\u000b\u0015\f\u0015|\u0001\u0015\u0001\u0015"+
		"\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0083\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000"+
		"\u00052\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t:\u0001"+
		"\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000"+
		"\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013"+
		"H\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017N\u0001"+
		"\u0000\u0000\u0000\u0019P\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000"+
		"\u0000\u001dU\u0001\u0000\u0000\u0000\u001fX\u0001\u0000\u0000\u0000!"+
		"Z\u0001\u0000\u0000\u0000#\\\u0001\u0000\u0000\u0000%b\u0001\u0000\u0000"+
		"\u0000\'j\u0001\u0000\u0000\u0000)n\u0001\u0000\u0000\u0000+z\u0001\u0000"+
		"\u0000\u0000-.\u0005;\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005"+
		":\u0000\u000001\u0005=\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005"+
		"l\u0000\u000034\u0005o\u0000\u000045\u0005o\u0000\u000056\u0005p\u0000"+
		"\u00006\u0006\u0001\u0000\u0000\u000078\u0005d\u0000\u000089\u0005o\u0000"+
		"\u00009\b\u0001\u0000\u0000\u0000:;\u0005{\u0000\u0000;\n\u0001\u0000"+
		"\u0000\u0000<=\u0005}\u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005w"+
		"\u0000\u0000?@\u0005h\u0000\u0000@A\u0005i\u0000\u0000AB\u0005l\u0000"+
		"\u0000BC\u0005e\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005(\u0000"+
		"\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005)\u0000\u0000G\u0012\u0001"+
		"\u0000\u0000\u0000HI\u0005=\u0000\u0000IJ\u0005=\u0000\u0000J\u0014\u0001"+
		"\u0000\u0000\u0000KL\u0005!\u0000\u0000LM\u0005=\u0000\u0000M\u0016\u0001"+
		"\u0000\u0000\u0000NO\u0005<\u0000\u0000O\u0018\u0001\u0000\u0000\u0000"+
		"PQ\u0005>\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000RS\u0005<\u0000\u0000"+
		"ST\u0005=\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UV\u0005>\u0000\u0000"+
		"VW\u0005=\u0000\u0000W\u001e\u0001\u0000\u0000\u0000XY\u0005+\u0000\u0000"+
		"Y \u0001\u0000\u0000\u0000Z[\u0005-\u0000\u0000[\"\u0001\u0000\u0000\u0000"+
		"\\]\u0005p\u0000\u0000]^\u0005r\u0000\u0000^_\u0005i\u0000\u0000_`\u0005"+
		"n\u0000\u0000`a\u0005t\u0000\u0000a$\u0001\u0000\u0000\u0000bf\u0007\u0000"+
		"\u0000\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g&\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0007\u0002\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m(\u0001\u0000\u0000\u0000no\u0005"+
		"/\u0000\u0000op\u0005/\u0000\u0000pt\u0001\u0000\u0000\u0000qs\b\u0003"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0006\u0014\u0000\u0000x*\u0001\u0000\u0000"+
		"\u0000y{\u0007\u0004\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u007f\u0006\u0015\u0000\u0000\u007f,\u0001\u0000\u0000"+
		"\u0000\u0005\u0000flt|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}