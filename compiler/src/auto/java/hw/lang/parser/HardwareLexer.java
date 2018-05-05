// Generated from Hardware.g4 by ANTLR 4.7.1

    package hw.lang.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HardwareLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, INT=19, ID=20, WS=21, COMMENT=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "INT", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'.'", "';'", "'module'", "'<'", "','", "'>'", "'('", 
		"')'", "'input'", "'output'", "'inout'", "'logic'", "'['", "':'", "']'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "INT", "ID", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
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


	public HardwareLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hardware.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\6\24s\n\24\r\24\16\24t\3\25\3\25\7\25y\n\25\f\25\16\25|\13\25\3\26\6"+
		"\26\177\n\26\r\26\16\26\u0080\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0089"+
		"\n\27\f\27\16\27\u008c\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\7\30\u0097\n\30\f\30\16\30\u009a\13\30\3\30\3\30\3\u008a\2\31\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\59\3\2\2"+
		"\2\7;\3\2\2\2\t=\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2"+
		"\2\23L\3\2\2\2\25N\3\2\2\2\27T\3\2\2\2\31[\3\2\2\2\33a\3\2\2\2\35g\3\2"+
		"\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'r\3\2\2\2)v\3\2\2\2+~"+
		"\3\2\2\2-\u0084\3\2\2\2/\u0092\3\2\2\2\61\62\7r\2\2\62\63\7c\2\2\63\64"+
		"\7e\2\2\64\65\7m\2\2\65\66\7c\2\2\66\67\7i\2\2\678\7g\2\28\4\3\2\2\29"+
		":\7\60\2\2:\6\3\2\2\2;<\7=\2\2<\b\3\2\2\2=>\7o\2\2>?\7q\2\2?@\7f\2\2@"+
		"A\7w\2\2AB\7n\2\2BC\7g\2\2C\n\3\2\2\2DE\7>\2\2E\f\3\2\2\2FG\7.\2\2G\16"+
		"\3\2\2\2HI\7@\2\2I\20\3\2\2\2JK\7*\2\2K\22\3\2\2\2LM\7+\2\2M\24\3\2\2"+
		"\2NO\7k\2\2OP\7p\2\2PQ\7r\2\2QR\7w\2\2RS\7v\2\2S\26\3\2\2\2TU\7q\2\2U"+
		"V\7w\2\2VW\7v\2\2WX\7r\2\2XY\7w\2\2YZ\7v\2\2Z\30\3\2\2\2[\\\7k\2\2\\]"+
		"\7p\2\2]^\7q\2\2^_\7w\2\2_`\7v\2\2`\32\3\2\2\2ab\7n\2\2bc\7q\2\2cd\7i"+
		"\2\2de\7k\2\2ef\7e\2\2f\34\3\2\2\2gh\7]\2\2h\36\3\2\2\2ij\7<\2\2j \3\2"+
		"\2\2kl\7_\2\2l\"\3\2\2\2mn\7}\2\2n$\3\2\2\2op\7\177\2\2p&\3\2\2\2qs\t"+
		"\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vz\t\3\2\2wy\t"+
		"\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{*\3\2\2\2|z\3\2\2\2}\177"+
		"\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\b\26\2\2\u0083,\3\2\2\2\u0084\u0085"+
		"\7\61\2\2\u0085\u0086\7,\2\2\u0086\u008a\3\2\2\2\u0087\u0089\13\2\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7,\2\2\u008e"+
		"\u008f\7\61\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\27\2\2\u0091.\3\2\2"+
		"\2\u0092\u0093\7\61\2\2\u0093\u0094\7\61\2\2\u0094\u0098\3\2\2\2\u0095"+
		"\u0097\n\6\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\b\30\2\2\u009c\60\3\2\2\2\b\2tz\u0080\u008a\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}