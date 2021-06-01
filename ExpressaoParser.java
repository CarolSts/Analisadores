// Generated from Expressao.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_eof=1, T_mais=2, T_menos=3, T_vezes=4, T_divisao=5, T_num=6, T_ID=7, 
		Espaco=8;
	public static final int
		RULE_regra = 0, RULE_expr = 1, RULE_termo = 2, RULE_fator = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"regra", "expr", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_eof", "T_mais", "T_menos", "T_vezes", "T_divisao", "T_num", 
			"T_ID", "Espaco"
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

	@Override
	public String getGrammarFileName() { return "Expressao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RegraContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_eof() { return getToken(ExpressaoParser.T_eof, 0); }
		public RegraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterRegra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitRegra(this);
		}
	}

	public final RegraContext regra() throws RecognitionException {
		RegraContext _localctx = new RegraContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expr();
			setState(9);
			match(T_eof);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> T_mais() { return getTokens(ExpressaoParser.T_mais); }
		public TerminalNode T_mais(int i) {
			return getToken(ExpressaoParser.T_mais, i);
		}
		public List<TerminalNode> T_menos() { return getTokens(ExpressaoParser.T_menos); }
		public TerminalNode T_menos(int i) {
			return getToken(ExpressaoParser.T_menos, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			termo();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_mais || _la==T_menos) {
				{
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_mais:
					{
					setState(12);
					match(T_mais);
					 System.out.println("->Soma");
					}
					break;
				case T_menos:
					{
					setState(14);
					match(T_menos);
					 System.out.println("->Subtracao");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(18);
				termo();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> T_vezes() { return getTokens(ExpressaoParser.T_vezes); }
		public TerminalNode T_vezes(int i) {
			return getToken(ExpressaoParser.T_vezes, i);
		}
		public List<TerminalNode> T_divisao() { return getTokens(ExpressaoParser.T_divisao); }
		public TerminalNode T_divisao(int i) {
			return getToken(ExpressaoParser.T_divisao, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			fator();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_vezes || _la==T_divisao) {
				{
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_vezes:
					{
					setState(25);
					match(T_vezes);
					 System.out.println("->Multiplicacao");
					}
					break;
				case T_divisao:
					{
					setState(27);
					match(T_divisao);
					 System.out.println("->Divisao");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31);
				fator();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode T_num() { return getToken(ExpressaoParser.T_num, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			match(T_num);
			 System.out.println("Numero->"+LT(0).getText());
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\23\n\3\3\3\7\3"+
		"\26\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\7\4#\n\4\f\4"+
		"\16\4&\13\4\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2*\2\n\3\2\2\2\4\r\3\2\2"+
		"\2\6\32\3\2\2\2\b\'\3\2\2\2\n\13\5\4\3\2\13\f\7\3\2\2\f\3\3\2\2\2\r\27"+
		"\5\6\4\2\16\17\7\4\2\2\17\23\b\3\1\2\20\21\7\5\2\2\21\23\b\3\1\2\22\16"+
		"\3\2\2\2\22\20\3\2\2\2\23\24\3\2\2\2\24\26\5\6\4\2\25\22\3\2\2\2\26\31"+
		"\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32$\5"+
		"\b\5\2\33\34\7\6\2\2\34 \b\4\1\2\35\36\7\7\2\2\36 \b\4\1\2\37\33\3\2\2"+
		"\2\37\35\3\2\2\2 !\3\2\2\2!#\5\b\5\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2"+
		"$%\3\2\2\2%\7\3\2\2\2&$\3\2\2\2\'(\7\b\2\2()\b\5\1\2)\t\3\2\2\2\6\22\27"+
		"\37$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}