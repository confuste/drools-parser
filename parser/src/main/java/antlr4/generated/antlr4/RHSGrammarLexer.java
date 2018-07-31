// Generated from /Users/alex/Alejandro/Repositorio/IntellijIDEA/drools-parser/parser/src/main/java/antlr4/RHSGrammar.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RHSGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LCURLY_BRACKET=3, RCURLY_BRACKET=4, WS=5, LPARENT=6, RPARENT=7, 
		END_LINE=8, ANY=9, VARIABLE=10, MODIFY=11, REMOVE=12, NEWLINE=13, PRINT_BLOCK=14, 
		BLOCK_COMMENT=15, LINE_COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "LCURLY_BRACKET", "RCURLY_BRACKET", "WS", "LPARENT", "RPARENT", 
		"END_LINE", "ANY", "VARIABLE", "MODIFY", "REMOVE", "NEWLINE", "PRINT_BLOCK", 
		"BLOCK_COMMENT", "LINE_COMMENT"
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


	public RHSGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RHSGrammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			LCURLY_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			RCURLY_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			LPARENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			RPARENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LCURLY_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("LCURLY_BRACKET");
			break;
		}
	}
	private void RCURLY_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("RCURLY_BRACKET");
			break;
		}
	}
	private void LPARENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("LPARENT");
			break;
		}
	}
	private void RPARENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("RPARENT");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\6\6=\n\6\r\6\16\6>\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\6\13O\n\13\r\13\16\13P\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\5\16b\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17z\n\17\f\17\16\17}\13\17\3\17\3\17\7"+
		"\17\u0081\n\17\f\17\16\17\u0084\13\17\3\17\3\17\7\17\u0088\n\17\f\17\16"+
		"\17\u008b\13\17\3\17\3\17\7\17\u008f\n\17\f\17\16\17\u0092\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\7\20\u009a\n\20\f\20\16\20\u009d\13\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a8\n\21\f\21\16\21\u00ab"+
		"\13\21\3\21\3\21\4\u0082\u009b\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\5\2\13\f\17\17\"\""+
		"\5\2C\\aac|\4\2\f\f\17\17\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\61\3\2\2\2\7\65\3\2\2\2\t8\3\2"+
		"\2\2\13<\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3"+
		"\2\2\2\27R\3\2\2\2\31Y\3\2\2\2\33a\3\2\2\2\35e\3\2\2\2\37\u0095\3\2\2"+
		"\2!\u00a3\3\2\2\2#$\7k\2\2$%\7p\2\2%&\7u\2\2&\'\7g\2\2\'(\7t\2\2()\7v"+
		"\2\2)*\7N\2\2*+\7q\2\2+,\7i\2\2,-\7k\2\2-.\7e\2\2./\7c\2\2/\60\7n\2\2"+
		"\60\4\3\2\2\2\61\62\7p\2\2\62\63\7g\2\2\63\64\7y\2\2\64\6\3\2\2\2\65\66"+
		"\7}\2\2\66\67\b\4\2\2\67\b\3\2\2\289\7\177\2\29:\b\5\3\2:\n\3\2\2\2;="+
		"\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\6\4\2A"+
		"\f\3\2\2\2BC\7*\2\2CD\b\7\5\2D\16\3\2\2\2EF\7+\2\2FG\b\b\6\2G\20\3\2\2"+
		"\2HI\7=\2\2I\22\3\2\2\2JK\13\2\2\2K\24\3\2\2\2LN\7&\2\2MO\t\3\2\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\26\3\2\2\2RS\7o\2\2ST\7q\2\2TU\7"+
		"f\2\2UV\7k\2\2VW\7h\2\2WX\7{\2\2X\30\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\\7o\2"+
		"\2\\]\7q\2\2]^\7x\2\2^_\7g\2\2_\32\3\2\2\2`b\7\17\2\2a`\3\2\2\2ab\3\2"+
		"\2\2bc\3\2\2\2cd\7\f\2\2d\34\3\2\2\2ef\7U\2\2fg\7{\2\2gh\7u\2\2hi\7v\2"+
		"\2ij\7g\2\2jk\7o\2\2kl\7\60\2\2lm\7q\2\2mn\7w\2\2no\7v\2\2op\7\60\2\2"+
		"pq\7r\2\2qr\7t\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2uv\7n\2\2vw\7p\2\2w{\3\2"+
		"\2\2xz\5\13\6\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3"+
		"\2\2\2~\u0082\7*\2\2\177\u0081\13\2\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0089\7+\2\2\u0086\u0088\5\13\6\2\u0087\u0086\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0090\7=\2\2\u008d\u008f\5\13"+
		"\6\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\b\17"+
		"\4\2\u0094\36\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7,\2\2\u0097\u009b"+
		"\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\b\20\4\2\u00a2 \3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7\61\2"+
		"\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\n\4\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ad\b\21\4\2\u00ad\"\3\2\2\2\f\2>Pa{\u0082\u0089"+
		"\u0090\u009b\u00a9\7\3\4\2\3\5\3\2\3\2\3\7\4\3\b\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}