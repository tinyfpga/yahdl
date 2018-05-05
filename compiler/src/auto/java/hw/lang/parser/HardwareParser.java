// Generated from Hardware.g4 by ANTLR 4.7.1

    package hw.lang.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HardwareParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INT=17, 
		ID=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDecl = 1, RULE_moduleDef = 2, RULE_portDeclList = 3, 
		RULE_portDecl = 4, RULE_portDir = 5, RULE_dataType = 6, RULE_packedSize = 7, 
		RULE_moduleBody = 8;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDecl", "moduleDef", "portDeclList", "portDecl", 
		"portDir", "dataType", "packedSize", "moduleBody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'.'", "';'", "'module'", "'('", "','", "')'", "'input'", 
		"'output'", "'inout'", "'logic'", "'['", "':'", "']'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "INT", "ID", "WS", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Hardware.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HardwareParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclContext packageDecl() {
			return getRuleContext(PackageDeclContext.class,0);
		}
		public ModuleDefContext moduleDef() {
			return getRuleContext(ModuleDefContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			packageDecl();
			setState(19);
			moduleDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclContext extends ParserRuleContext {
		public Token ID;
		public List<Token> name = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(HardwareParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HardwareParser.ID, i);
		}
		public PackageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterPackageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitPackageDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitPackageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclContext packageDecl() throws RecognitionException {
		PackageDeclContext _localctx = new PackageDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__0);
			setState(22);
			((PackageDeclContext)_localctx).ID = match(ID);
			((PackageDeclContext)_localctx).name.add(((PackageDeclContext)_localctx).ID);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(23);
				match(T__1);
				setState(24);
				((PackageDeclContext)_localctx).ID = match(ID);
				((PackageDeclContext)_localctx).name.add(((PackageDeclContext)_localctx).ID);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDefContext extends ParserRuleContext {
		public Token name;
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(HardwareParser.ID, 0); }
		public PortDeclListContext portDeclList() {
			return getRuleContext(PortDeclListContext.class,0);
		}
		public ModuleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterModuleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitModuleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitModuleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDefContext moduleDef() throws RecognitionException {
		ModuleDefContext _localctx = new ModuleDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__3);
			setState(33);
			((ModuleDefContext)_localctx).name = match(ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(34);
				portDeclList();
				}
			}

			setState(37);
			moduleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortDeclListContext extends ParserRuleContext {
		public PortDeclContext portDecl;
		public List<PortDeclContext> ports = new ArrayList<PortDeclContext>();
		public List<PortDeclContext> portDecl() {
			return getRuleContexts(PortDeclContext.class);
		}
		public PortDeclContext portDecl(int i) {
			return getRuleContext(PortDeclContext.class,i);
		}
		public PortDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterPortDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitPortDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitPortDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortDeclListContext portDeclList() throws RecognitionException {
		PortDeclListContext _localctx = new PortDeclListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_portDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__4);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(40);
				((PortDeclListContext)_localctx).portDecl = portDecl();
				((PortDeclListContext)_localctx).ports.add(((PortDeclListContext)_localctx).portDecl);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(41);
					match(T__5);
					setState(42);
					((PortDeclListContext)_localctx).portDecl = portDecl();
					((PortDeclListContext)_localctx).ports.add(((PortDeclListContext)_localctx).portDecl);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(50);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortDeclContext extends ParserRuleContext {
		public PortDirContext portDir() {
			return getRuleContext(PortDirContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HardwareParser.ID, 0); }
		public PackedSizeContext packedSize() {
			return getRuleContext(PackedSizeContext.class,0);
		}
		public PortDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterPortDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitPortDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitPortDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortDeclContext portDecl() throws RecognitionException {
		PortDeclContext _localctx = new PortDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_portDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			portDir();
			setState(53);
			dataType();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(54);
				packedSize();
				}
			}

			setState(57);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortDirContext extends ParserRuleContext {
		public PortDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterPortDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitPortDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitPortDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortDirContext portDir() throws RecognitionException {
		PortDirContext _localctx = new PortDirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_portDir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackedSizeContext extends ParserRuleContext {
		public Token msb;
		public Token lsb;
		public List<TerminalNode> INT() { return getTokens(HardwareParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(HardwareParser.INT, i);
		}
		public PackedSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packedSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterPackedSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitPackedSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitPackedSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackedSizeContext packedSize() throws RecognitionException {
		PackedSizeContext _localctx = new PackedSizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_packedSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__11);
			setState(64);
			((PackedSizeContext)_localctx).msb = match(INT);
			setState(65);
			match(T__12);
			setState(66);
			((PackedSizeContext)_localctx).lsb = match(INT);
			setState(67);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HardwareListener ) ((HardwareListener)listener).exitModuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HardwareVisitor ) return ((HardwareVisitor<? extends T>)visitor).visitModuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__14);
			setState(70);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\4\3\4\3\4\5\4&"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\5\5\63\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\n\f\2F\2\24\3"+
		"\2\2\2\4\27\3\2\2\2\6\"\3\2\2\2\b)\3\2\2\2\n\66\3\2\2\2\f=\3\2\2\2\16"+
		"?\3\2\2\2\20A\3\2\2\2\22G\3\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2\26\3\3\2"+
		"\2\2\27\30\7\3\2\2\30\35\7\24\2\2\31\32\7\4\2\2\32\34\7\24\2\2\33\31\3"+
		"\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2"+
		"\2\2 !\7\5\2\2!\5\3\2\2\2\"#\7\6\2\2#%\7\24\2\2$&\5\b\5\2%$\3\2\2\2%&"+
		"\3\2\2\2&\'\3\2\2\2\'(\5\22\n\2(\7\3\2\2\2)\62\7\7\2\2*/\5\n\6\2+,\7\b"+
		"\2\2,.\5\n\6\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2"+
		"\2\61/\3\2\2\2\62*\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\t\2\2\65"+
		"\t\3\2\2\2\66\67\5\f\7\2\679\5\16\b\28:\5\20\t\298\3\2\2\29:\3\2\2\2:"+
		";\3\2\2\2;<\7\24\2\2<\13\3\2\2\2=>\t\2\2\2>\r\3\2\2\2?@\7\r\2\2@\17\3"+
		"\2\2\2AB\7\16\2\2BC\7\23\2\2CD\7\17\2\2DE\7\23\2\2EF\7\20\2\2F\21\3\2"+
		"\2\2GH\7\21\2\2HI\7\22\2\2I\23\3\2\2\2\7\35%/\629";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}