// Generated from C:/Users/laxga/Desktop/intelliJ Projects/KPUIE/KPUIExtension/src/kss2\KSSLexer.g4 by ANTLR 4.7
package org.kss.meta;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RGB=1, RGBA=2, VEC2=3, VEC3=4, VEC4=5, TRUE=6, FALSE=7, NONE=8, UDIM2=9, 
		IMPORT=10, FUNC=11, TEMPLATE=12, DELETE=13, CREATE=14, CONNECT=15, DISCONNECT=16, 
		VAR=17, VAL=18, GLOBAL=19, TAG=20, ASSIGN=21, ASSIGNCHECK=22, PARO=23, 
		PARC=24, BRAO=25, BRAC=26, SBO=27, SBC=28, SEP=29, COM=30, COL=31, AST=32, 
		DASH=33, DOT=34, PLUS=35, NEWL=36, PX=37, PERCENT=38, DESC=39, EVENT=40, 
		POINTER=41, NUMBER=42, WORD=43, WS=44, COMMENT=45, LINE_COMMENT=46, STRING=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RGB", "RGBA", "VEC2", "VEC3", "VEC4", "TRUE", "FALSE", "NONE", "UDIM2", 
		"IMPORT", "FUNC", "TEMPLATE", "DELETE", "CREATE", "CONNECT", "DISCONNECT", 
		"VAR", "VAL", "GLOBAL", "TAG", "ASSIGN", "ASSIGNCHECK", "PARO", "PARC", 
		"BRAO", "BRAC", "SBO", "SBC", "SEP", "COM", "COL", "AST", "DASH", "DOT", 
		"PLUS", "NEWL", "PX", "PERCENT", "DESC", "EVENT", "POINTER", "DIGIT", 
		"NUMBER", "WORD", "WS", "COMMENT", "LINE_COMMENT", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'rgb'", "'rgba'", "'vec2'", "'vec3'", "'vec4'", "'true'", "'false'", 
		"'none'", "'udim2'", "'import'", "'fun'", "'template'", "'delete'", "'create'", 
		"'connect'", "'disconnect'", "'var'", "'event'", "'global'", "'@'", "'='", 
		"'!='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", null, 
		"'*'", "'-'", "'.'", "'+'", null, "'px'", "'%'", "'>'", null, "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RGB", "RGBA", "VEC2", "VEC3", "VEC4", "TRUE", "FALSE", "NONE", 
		"UDIM2", "IMPORT", "FUNC", "TEMPLATE", "DELETE", "CREATE", "CONNECT", 
		"DISCONNECT", "VAR", "VAL", "GLOBAL", "TAG", "ASSIGN", "ASSIGNCHECK", 
		"PARO", "PARC", "BRAO", "BRAC", "SBO", "SBC", "SEP", "COM", "COL", "AST", 
		"DASH", "DOT", "PLUS", "NEWL", "PX", "PERCENT", "DESC", "EVENT", "POINTER", 
		"NUMBER", "WORD", "WS", "COMMENT", "LINE_COMMENT", "STRING"
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


	public KSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KSSLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u014c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\6%\u00fa\n%\r%\16%\u00fb\3&\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3*\3+\3+\7+\u010c\n+\f+\16+\u010f\13+\3,\3,\3,\7,\u0114\n,"+
		"\f,\16,\u0117\13,\3-\6-\u011a\n-\r-\16-\u011b\3-\7-\u011f\n-\f-\16-\u0122"+
		"\13-\3.\6.\u0125\n.\r.\16.\u0126\3.\3.\3/\3/\3/\3/\7/\u012f\n/\f/\16/"+
		"\u0132\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u013d\n\60\f\60\16"+
		"\60\u0140\13\60\3\60\3\60\3\61\3\61\7\61\u0146\n\61\f\61\16\61\u0149\13"+
		"\61\3\61\3\61\4\u0130\u0147\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-[.]/"+
		"_\60a\61\3\2\b\4\2\13\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\2\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5g\3\2\2\2\7l\3\2\2\2\tq\3\2\2"+
		"\2\13v\3\2\2\2\r{\3\2\2\2\17\u0080\3\2\2\2\21\u0086\3\2\2\2\23\u008b\3"+
		"\2\2\2\25\u0091\3\2\2\2\27\u0098\3\2\2\2\31\u009c\3\2\2\2\33\u00a5\3\2"+
		"\2\2\35\u00ac\3\2\2\2\37\u00b3\3\2\2\2!\u00bb\3\2\2\2#\u00c6\3\2\2\2%"+
		"\u00ca\3\2\2\2\'\u00d0\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db\3"+
		"\2\2\2/\u00de\3\2\2\2\61\u00e0\3\2\2\2\63\u00e2\3\2\2\2\65\u00e4\3\2\2"+
		"\2\67\u00e6\3\2\2\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00ee"+
		"\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E\u00f4\3\2\2\2G\u00f6\3\2\2\2I"+
		"\u00f9\3\2\2\2K\u00fd\3\2\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0104\3\2"+
		"\2\2S\u0106\3\2\2\2U\u0109\3\2\2\2W\u0110\3\2\2\2Y\u0119\3\2\2\2[\u0124"+
		"\3\2\2\2]\u012a\3\2\2\2_\u0138\3\2\2\2a\u0143\3\2\2\2cd\7t\2\2de\7i\2"+
		"\2ef\7d\2\2f\4\3\2\2\2gh\7t\2\2hi\7i\2\2ij\7d\2\2jk\7c\2\2k\6\3\2\2\2"+
		"lm\7x\2\2mn\7g\2\2no\7e\2\2op\7\64\2\2p\b\3\2\2\2qr\7x\2\2rs\7g\2\2st"+
		"\7e\2\2tu\7\65\2\2u\n\3\2\2\2vw\7x\2\2wx\7g\2\2xy\7e\2\2yz\7\66\2\2z\f"+
		"\3\2\2\2{|\7v\2\2|}\7t\2\2}~\7w\2\2~\177\7g\2\2\177\16\3\2\2\2\u0080\u0081"+
		"\7h\2\2\u0081\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085\20\3\2\2\2\u0086\u0087\7p\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7g\2\2\u008a\22\3\2\2\2\u008b\u008c\7w\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7k\2\2\u008e\u008f\7o\2\2\u008f\u0090\7\64\2"+
		"\2\u0090\24\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7o\2\2\u0093\u0094"+
		"\7r\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\7v\2\2\u0097"+
		"\26\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7w\2\2\u009a\u009b\7p\2\2\u009b"+
		"\30\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7o\2\2\u009f"+
		"\u00a0\7r\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7"+
		"g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba \3\2\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7u\2"+
		"\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\"\3\2\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		"$\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7i\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7c\2\2"+
		"\u00d5\u00d6\7n\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7B\2\2\u00d8*\3\2\2\2\u00d9"+
		"\u00da\7?\2\2\u00da,\3\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd\7?\2\2\u00dd"+
		".\3\2\2\2\u00de\u00df\7*\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1"+
		"\62\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3\64\3\2\2\2\u00e4\u00e5\7\177\2\2"+
		"\u00e5\66\3\2\2\2\u00e6\u00e7\7]\2\2\u00e78\3\2\2\2\u00e8\u00e9\7_\2\2"+
		"\u00e9:\3\2\2\2\u00ea\u00eb\7=\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed"+
		">\3\2\2\2\u00ee\u00ef\7<\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1B"+
		"\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5"+
		"F\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7H\3\2\2\2\u00f8\u00fa\t\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7z\2\2\u00ffL\3\2\2"+
		"\2\u0100\u0101\7\'\2\2\u0101N\3\2\2\2\u0102\u0103\7@\2\2\u0103P\3\2\2"+
		"\2\u0104\u0105\7<\2\2\u0105R\3\2\2\2\u0106\u0107\7/\2\2\u0107\u0108\7"+
		"@\2\2\u0108T\3\2\2\2\u0109\u010d\t\3\2\2\u010a\u010c\t\3\2\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"V\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\5U+\2\u0111\u0112\7\60\2\2\u0112"+
		"\u0114\5U+\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2"+
		"\2\u0115\u0116\3\2\2\2\u0116X\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a"+
		"\t\4\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u0120\3\2\2\2\u011d\u011f\t\5\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"Z\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\t\6\2\2\u0124\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\b.\2\2\u0129\\\3\2\2\2\u012a\u012b\7\61\2\2\u012b"+
		"\u012c\7,\2\2\u012c\u0130\3\2\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7,\2\2\u0134\u0135\7\61"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b/\3\2\u0137^\3\2\2\2\u0138\u0139"+
		"\7\61\2\2\u0139\u013a\7\61\2\2\u013a\u013e\3\2\2\2\u013b\u013d\n\7\2\2"+
		"\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\b\60\3\2"+
		"\u0142`\3\2\2\2\u0143\u0147\7$\2\2\u0144\u0146\13\2\2\2\u0145\u0144\3"+
		"\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7$\2\2\u014bb\3\2\2\2\f"+
		"\2\u00fb\u010d\u0115\u011b\u0120\u0126\u0130\u013e\u0147\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}