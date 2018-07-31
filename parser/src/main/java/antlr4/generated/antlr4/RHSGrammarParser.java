// Generated from /Users/alex/Alejandro/Repositorio/IntellijIDEA/drools-parser/parser/src/main/java/antlr4/RHSGrammar.g4 by ANTLR 4.7
package antlr4;

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RHSGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LCURLY_BRACKET=3, RCURLY_BRACKET=4, WS=5, LPARENT=6, RPARENT=7, 
		END_LINE=8, ANY=9, VARIABLE=10, MODIFY=11, REMOVE=12, NEWLINE=13, PRINT_BLOCK=14, 
		BLOCK_COMMENT=15, LINE_COMMENT=16;
	public static final int
		RULE_init = 0, RULE_main = 1, RULE_operation = 2, RULE_operation_update = 3, 
		RULE_operation_insert = 4, RULE_update_object = 5, RULE_insert_object = 6, 
		RULE_variable = 7, RULE_text = 8;
	public static final String[] ruleNames = {
		"init", "main", "operation", "operation_update", "operation_insert", "update_object", 
		"insert_object", "variable", "text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'insertLogical'", "'new'", "'{'", "'}'", null, "'('", "')'", "';'", 
		null, null, "'modify'", "'remove'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "LCURLY_BRACKET", "RCURLY_BRACKET", "WS", "LPARENT", 
		"RPARENT", "END_LINE", "ANY", "VARIABLE", "MODIFY", "REMOVE", "NEWLINE", 
		"PRINT_BLOCK", "BLOCK_COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "RHSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ArrayList<String> variableNames = new ArrayList<String>();

	    private boolean variableDefined(String name){
	        return variableNames.contains(name);
	    }

	    private void defineVariable(String name){
	        variableNames.add(name);
	    }

	    public List<String> getAllVariables(){
	        return variableNames;
	    }

	    public int getSize(){
	        return variableNames.size();
	    }

	public RHSGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << MODIFY) | (1L << REMOVE))) != 0)) {
				{
				{
				setState(18);
				main();
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

	public static class MainContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			operation();
			System.out.println("main");
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

	public static class OperationContext extends ParserRuleContext {
		public Operation_updateContext operation_update() {
			return getRuleContext(Operation_updateContext.class,0);
		}
		public Operation_insertContext operation_insert() {
			return getRuleContext(Operation_insertContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFY:
			case REMOVE:
				{
				setState(27);
				operation_update();
				}
				break;
			case T__0:
				{
				setState(28);
				operation_insert();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Operation_updateContext extends ParserRuleContext {
		public Update_objectContext update_object;
		public VariableContext variable;
		public Update_objectContext update_object() {
			return getRuleContext(Update_objectContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(RHSGrammarParser.LPARENT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(RHSGrammarParser.RPARENT, 0); }
		public TerminalNode LCURLY_BRACKET() { return getToken(RHSGrammarParser.LCURLY_BRACKET, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode RCURLY_BRACKET() { return getToken(RHSGrammarParser.RCURLY_BRACKET, 0); }
		public TerminalNode END_LINE() { return getToken(RHSGrammarParser.END_LINE, 0); }
		public Operation_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterOperation_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitOperation_update(this);
		}
	}

	public final Operation_updateContext operation_update() throws RecognitionException {
		Operation_updateContext _localctx = new Operation_updateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((Operation_updateContext)_localctx).update_object = update_object();
			setState(32);
			match(LPARENT);
			setState(33);
			((Operation_updateContext)_localctx).variable = variable();
			setState(34);
			match(RPARENT);
			setState(35);
			match(LCURLY_BRACKET);
			setState(36);
			text();
			setState(37);
			match(RCURLY_BRACKET);
			setState(38);
			match(END_LINE);
			System.out.println((((Operation_updateContext)_localctx).update_object!=null?_input.getText(((Operation_updateContext)_localctx).update_object.start,((Operation_updateContext)_localctx).update_object.stop):null)+"="+(((Operation_updateContext)_localctx).variable!=null?_input.getText(((Operation_updateContext)_localctx).variable.start,((Operation_updateContext)_localctx).variable.stop):null));
			                                                                                                        defineVariable((((Operation_updateContext)_localctx).update_object!=null?_input.getText(((Operation_updateContext)_localctx).update_object.start,((Operation_updateContext)_localctx).update_object.stop):null)+"="+(((Operation_updateContext)_localctx).variable!=null?_input.getText(((Operation_updateContext)_localctx).variable.start,((Operation_updateContext)_localctx).variable.stop):null));
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

	public static class Operation_insertContext extends ParserRuleContext {
		public List<TerminalNode> LPARENT() { return getTokens(RHSGrammarParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(RHSGrammarParser.LPARENT, i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(RHSGrammarParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(RHSGrammarParser.RPARENT, i);
		}
		public TerminalNode END_LINE() { return getToken(RHSGrammarParser.END_LINE, 0); }
		public List<Insert_objectContext> insert_object() {
			return getRuleContexts(Insert_objectContext.class);
		}
		public Insert_objectContext insert_object(int i) {
			return getRuleContext(Insert_objectContext.class,i);
		}
		public Operation_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterOperation_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitOperation_insert(this);
		}
	}

	public final Operation_insertContext operation_insert() throws RecognitionException {
		Operation_insertContext _localctx = new Operation_insertContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(LPARENT);
			setState(43);
			match(T__1);
			setState(44);
			text();
			setState(45);
			match(LPARENT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANY) {
				{
				setState(46);
				text();
				}
			}

			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				insert_object();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(50);
					text();
					}
				}

				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(57);
			match(RPARENT);
			setState(58);
			match(RPARENT);
			setState(59);
			match(END_LINE);
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

	public static class Update_objectContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(RHSGrammarParser.MODIFY, 0); }
		public TerminalNode REMOVE() { return getToken(RHSGrammarParser.REMOVE, 0); }
		public Update_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterUpdate_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitUpdate_object(this);
		}
	}

	public final Update_objectContext update_object() throws RecognitionException {
		Update_objectContext _localctx = new Update_objectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==MODIFY || _la==REMOVE) ) {
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

	public static class Insert_objectContext extends ParserRuleContext {
		public VariableContext variable;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Insert_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterInsert_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitInsert_object(this);
		}
	}

	public final Insert_objectContext insert_object() throws RecognitionException {
		Insert_objectContext _localctx = new Insert_objectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((Insert_objectContext)_localctx).variable = variable();
			System.out.println("insert="+(((Insert_objectContext)_localctx).variable!=null?_input.getText(((Insert_objectContext)_localctx).variable.start,((Insert_objectContext)_localctx).variable.stop):null));
			                defineVariable("insert="+(((Insert_objectContext)_localctx).variable!=null?_input.getText(((Insert_objectContext)_localctx).variable.start,((Insert_objectContext)_localctx).variable.stop):null));
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(RHSGrammarParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(VARIABLE);
			System.out.println("variable");
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> ANY() { return getTokens(RHSGrammarParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(RHSGrammarParser.ANY, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RHSGrammarListener ) ((RHSGrammarListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				match(ANY);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANY );
			System.out.println("text");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3\6\5\6\66"+
		"\n\6\6\68\n\6\r\6\16\69\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\6\nI\n\n\r\n\16\nJ\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3"+
		"\3\2\r\16\2K\2\27\3\2\2\2\4\32\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n+\3\2"+
		"\2\2\f?\3\2\2\2\16A\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24\26\5\4\3\2\25\24"+
		"\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27"+
		"\3\2\2\2\32\33\5\6\4\2\33\34\b\3\1\2\34\5\3\2\2\2\35 \5\b\5\2\36 \5\n"+
		"\6\2\37\35\3\2\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\5\f\7\2\"#\7\b\2\2#$\5"+
		"\20\t\2$%\7\t\2\2%&\7\5\2\2&\'\5\22\n\2\'(\7\6\2\2()\7\n\2\2)*\b\5\1\2"+
		"*\t\3\2\2\2+,\7\3\2\2,-\7\b\2\2-.\7\4\2\2./\5\22\n\2/\61\7\b\2\2\60\62"+
		"\5\22\n\2\61\60\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\65\5\16\b\2\64"+
		"\66\5\22\n\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\63\3\2\2\289\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\t\2\2<=\7\t\2\2=>\7\n\2\2>"+
		"\13\3\2\2\2?@\t\2\2\2@\r\3\2\2\2AB\5\20\t\2BC\b\b\1\2C\17\3\2\2\2DE\7"+
		"\f\2\2EF\b\t\1\2F\21\3\2\2\2GI\7\13\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2"+
		"JK\3\2\2\2KL\3\2\2\2LM\b\n\1\2M\23\3\2\2\2\b\27\37\61\659J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}