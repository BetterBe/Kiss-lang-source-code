// Generated from C:/Users/laxga/Desktop/intelliJ Projects/KPUIE/KPUIExtension/src/kss2\KSSParser.g4 by ANTLR 4.7
package org.kss.meta;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KSSParser extends Parser {
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
	public static final int
		RULE_file = 0, RULE_imp = 1, RULE_function = 2, RULE_template = 3, RULE_global = 4, 
		RULE_variable = 5, RULE_styleDeclaration = 6, RULE_eventDeclaration = 7, 
		RULE_styleField = 8, RULE_style = 9, RULE_connection = 10, RULE_disconnection = 11, 
		RULE_tag_modifier = 12, RULE_style_modifier = 13, RULE_ref_mofifier = 14, 
		RULE_delete = 15, RULE_create = 16, RULE_ref_call = 17, RULE_function_call = 18, 
		RULE_value = 19, RULE_templateValue = 20, RULE_ref = 21, RULE_tag = 22, 
		RULE_name = 23, RULE_multiName = 24, RULE_multiValue = 25, RULE_header = 26, 
		RULE_stylingHeader = 27, RULE_eventHeader = 28, RULE_eventAssign = 29, 
		RULE_stylingDescendantList = 30, RULE_eventAddon = 31, RULE_pointerAddon = 32, 
		RULE_descendantSelector = 33, RULE_eventSelector = 34, RULE_stylePointer = 35, 
		RULE_elementHeader = 36, RULE_classHeader = 37, RULE_dataDecorator = 38, 
		RULE_tagData = 39, RULE_variableData = 40, RULE_multipleValues = 41, RULE_rgb = 42, 
		RULE_rgba = 43, RULE_percent = 44, RULE_pixel = 45, RULE_vec2 = 46, RULE_vec3 = 47, 
		RULE_vec4 = 48, RULE_udim2 = 49, RULE_true_ = 50, RULE_false_ = 51, RULE_number = 52, 
		RULE_num = 53;
	public static final String[] ruleNames = {
		"file", "imp", "function", "template", "global", "variable", "styleDeclaration", 
		"eventDeclaration", "styleField", "style", "connection", "disconnection", 
		"tag_modifier", "style_modifier", "ref_mofifier", "delete", "create", 
		"ref_call", "function_call", "value", "templateValue", "ref", "tag", "name", 
		"multiName", "multiValue", "header", "stylingHeader", "eventHeader", "eventAssign", 
		"stylingDescendantList", "eventAddon", "pointerAddon", "descendantSelector", 
		"eventSelector", "stylePointer", "elementHeader", "classHeader", "dataDecorator", 
		"tagData", "variableData", "multipleValues", "rgb", "rgba", "percent", 
		"pixel", "vec2", "vec3", "vec4", "udim2", "true_", "false_", "number", 
		"num"
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

	@Override
	public String getGrammarFileName() { return "KSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<ImpContext> imp() {
			return getRuleContexts(ImpContext.class);
		}
		public ImpContext imp(int i) {
			return getRuleContext(ImpContext.class,i);
		}
		public List<TerminalNode> NEWL() { return getTokens(KSSParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(KSSParser.NEWL, i);
		}
		public TerminalNode EOF() { return getToken(KSSParser.EOF, 0); }
		public List<EventDeclarationContext> eventDeclaration() {
			return getRuleContexts(EventDeclarationContext.class);
		}
		public EventDeclarationContext eventDeclaration(int i) {
			return getRuleContext(EventDeclarationContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StyleDeclarationContext> styleDeclaration() {
			return getRuleContexts(StyleDeclarationContext.class);
		}
		public StyleDeclarationContext styleDeclaration(int i) {
			return getRuleContext(StyleDeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public List<DisconnectionContext> disconnection() {
			return getRuleContexts(DisconnectionContext.class);
		}
		public DisconnectionContext disconnection(int i) {
			return getRuleContext(DisconnectionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Ref_callContext> ref_call() {
			return getRuleContexts(Ref_callContext.class);
		}
		public Ref_callContext ref_call(int i) {
			return getRuleContext(Ref_callContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(108);
				imp();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWL) {
						{
						setState(114);
						match(NEWL);
						}
					}

					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(117);
						eventDeclaration();
						}
						break;
					case 2:
						{
						setState(118);
						variable();
						}
						break;
					case 3:
						{
						setState(119);
						styleDeclaration();
						}
						break;
					case 4:
						{
						setState(120);
						function();
						}
						break;
					case 5:
						{
						setState(121);
						template();
						}
						break;
					case 6:
						{
						setState(122);
						connection();
						}
						break;
					case 7:
						{
						setState(123);
						disconnection();
						}
						break;
					case 8:
						{
						setState(124);
						function_call();
						}
						break;
					case 9:
						{
						setState(125);
						ref_call();
						}
						break;
					}
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWL) {
				{
				setState(133);
				match(NEWL);
				}
			}

			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(136);
				match(EOF);
				}
				break;
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

	public static class ImpContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KSSParser.IMPORT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IMPORT);
			setState(140);
			value();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(KSSParser.FUNC, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRAO() { return getToken(KSSParser.BRAO, 0); }
		public TerminalNode BRAC() { return getToken(KSSParser.BRAC, 0); }
		public List<TerminalNode> NEWL() { return getTokens(KSSParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(KSSParser.NEWL, i);
		}
		public List<EventDeclarationContext> eventDeclaration() {
			return getRuleContexts(EventDeclarationContext.class);
		}
		public EventDeclarationContext eventDeclaration(int i) {
			return getRuleContext(EventDeclarationContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StyleDeclarationContext> styleDeclaration() {
			return getRuleContexts(StyleDeclarationContext.class);
		}
		public StyleDeclarationContext styleDeclaration(int i) {
			return getRuleContext(StyleDeclarationContext.class,i);
		}
		public List<DeleteContext> delete() {
			return getRuleContexts(DeleteContext.class);
		}
		public DeleteContext delete(int i) {
			return getRuleContext(DeleteContext.class,i);
		}
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public List<DisconnectionContext> disconnection() {
			return getRuleContexts(DisconnectionContext.class);
		}
		public DisconnectionContext disconnection(int i) {
			return getRuleContext(DisconnectionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Ref_callContext> ref_call() {
			return getRuleContexts(Ref_callContext.class);
		}
		public Ref_callContext ref_call(int i) {
			return getRuleContext(Ref_callContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FUNC);
			setState(143);
			name();
			setState(144);
			match(BRAO);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(NEWL);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEMPLATE) | (1L << DELETE) | (1L << CREATE) | (1L << CONNECT) | (1L << DISCONNECT) | (1L << VAR) | (1L << AST) | (1L << DOT) | (1L << WORD))) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(151);
					eventDeclaration();
					}
					break;
				case 2:
					{
					setState(152);
					variable();
					}
					break;
				case 3:
					{
					setState(153);
					styleDeclaration();
					}
					break;
				case 4:
					{
					setState(154);
					delete();
					}
					break;
				case 5:
					{
					setState(155);
					create();
					}
					break;
				case 6:
					{
					setState(156);
					template();
					}
					break;
				case 7:
					{
					setState(157);
					connection();
					}
					break;
				case 8:
					{
					setState(158);
					disconnection();
					}
					break;
				case 9:
					{
					setState(159);
					function_call();
					}
					break;
				case 10:
					{
					setState(160);
					ref_call();
					}
					break;
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWL) {
				{
				{
				setState(166);
				match(NEWL);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(BRAC);
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

	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(KSSParser.TEMPLATE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRAO() { return getToken(KSSParser.BRAO, 0); }
		public TerminalNode BRAC() { return getToken(KSSParser.BRAC, 0); }
		public List<StyleContext> style() {
			return getRuleContexts(StyleContext.class);
		}
		public StyleContext style(int i) {
			return getRuleContext(StyleContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public List<TerminalNode> NEWL() { return getTokens(KSSParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(KSSParser.NEWL, i);
		}
		public List<TerminalNode> SEP() { return getTokens(KSSParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KSSParser.SEP, i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_template);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(TEMPLATE);
			setState(175);
			name();
			setState(176);
			match(BRAO);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DELETE) | (1L << CREATE) | (1L << CONNECT) | (1L << DISCONNECT) | (1L << VAR) | (1L << TAG) | (1L << AST) | (1L << WORD))) != 0)) {
				{
				setState(177);
				style();
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						style();
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(185);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DELETE) | (1L << CREATE) | (1L << CONNECT) | (1L << DISCONNECT) | (1L << VAR) | (1L << TAG) | (1L << AST) | (1L << WORD))) != 0)) {
					{
					setState(186);
					style();
					}
				}

				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) {
					{
					setState(189);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(194);
			match(BRAC);
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(KSSParser.GLOBAL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COL() { return getToken(KSSParser.COL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(GLOBAL);
			setState(197);
			name();
			setState(198);
			match(COL);
			setState(199);
			value();
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
		public TerminalNode VAR() { return getToken(KSSParser.VAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COL() { return getToken(KSSParser.COL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VAR);
			setState(202);
			name();
			setState(203);
			match(COL);
			setState(204);
			value();
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

	public static class StyleDeclarationContext extends ParserRuleContext {
		public StylingHeaderContext stylingHeader() {
			return getRuleContext(StylingHeaderContext.class,0);
		}
		public StyleFieldContext styleField() {
			return getRuleContext(StyleFieldContext.class,0);
		}
		public StyleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStyleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStyleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStyleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleDeclarationContext styleDeclaration() throws RecognitionException {
		StyleDeclarationContext _localctx = new StyleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_styleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			stylingHeader();
			setState(207);
			styleField();
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

	public static class EventDeclarationContext extends ParserRuleContext {
		public EventHeaderContext eventHeader() {
			return getRuleContext(EventHeaderContext.class,0);
		}
		public StyleFieldContext styleField() {
			return getRuleContext(StyleFieldContext.class,0);
		}
		public EventDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterEventDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitEventDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitEventDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDeclarationContext eventDeclaration() throws RecognitionException {
		EventDeclarationContext _localctx = new EventDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eventDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			eventHeader();
			setState(210);
			styleField();
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

	public static class StyleFieldContext extends ParserRuleContext {
		public TerminalNode BRAO() { return getToken(KSSParser.BRAO, 0); }
		public TerminalNode BRAC() { return getToken(KSSParser.BRAC, 0); }
		public List<StyleContext> style() {
			return getRuleContexts(StyleContext.class);
		}
		public StyleContext style(int i) {
			return getRuleContext(StyleContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public List<TerminalNode> NEWL() { return getTokens(KSSParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(KSSParser.NEWL, i);
		}
		public List<TerminalNode> SEP() { return getTokens(KSSParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KSSParser.SEP, i);
		}
		public StyleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStyleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStyleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStyleField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleFieldContext styleField() throws RecognitionException {
		StyleFieldContext _localctx = new StyleFieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_styleField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(BRAO);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DELETE) | (1L << CREATE) | (1L << CONNECT) | (1L << DISCONNECT) | (1L << VAR) | (1L << TAG) | (1L << AST) | (1L << WORD))) != 0)) {
				{
				setState(213);
				style();
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						style();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(221);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DELETE) | (1L << CREATE) | (1L << CONNECT) | (1L << DISCONNECT) | (1L << VAR) | (1L << TAG) | (1L << AST) | (1L << WORD))) != 0)) {
					{
					setState(222);
					style();
					}
				}

				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) {
					{
					setState(225);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEP) | (1L << COM) | (1L << NEWL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(230);
			match(BRAC);
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

	public static class StyleContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public Tag_modifierContext tag_modifier() {
			return getRuleContext(Tag_modifierContext.class,0);
		}
		public Style_modifierContext style_modifier() {
			return getRuleContext(Style_modifierContext.class,0);
		}
		public Ref_callContext ref_call() {
			return getRuleContext(Ref_callContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Ref_mofifierContext ref_mofifier() {
			return getRuleContext(Ref_mofifierContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConnectionContext connection() {
			return getRuleContext(ConnectionContext.class,0);
		}
		public DisconnectionContext disconnection() {
			return getRuleContext(DisconnectionContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_style);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				tag_modifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				style_modifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				ref_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				ref_mofifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				delete();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				variable();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				connection();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				disconnection();
				}
				break;
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

	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(KSSParser.CONNECT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_connection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CONNECT);
			setState(245);
			name();
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

	public static class DisconnectionContext extends ParserRuleContext {
		public TerminalNode DISCONNECT() { return getToken(KSSParser.DISCONNECT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DisconnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterDisconnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitDisconnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitDisconnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisconnectionContext disconnection() throws RecognitionException {
		DisconnectionContext _localctx = new DisconnectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_disconnection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(DISCONNECT);
			setState(248);
			name();
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

	public static class Tag_modifierContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(KSSParser.TAG, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COL() { return getToken(KSSParser.COL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Tag_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterTag_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitTag_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitTag_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_modifierContext tag_modifier() throws RecognitionException {
		Tag_modifierContext _localctx = new Tag_modifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tag_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TAG);
			setState(251);
			name();
			setState(252);
			match(COL);
			setState(253);
			value();
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

	public static class Style_modifierContext extends ParserRuleContext {
		public MultiNameContext multiName() {
			return getRuleContext(MultiNameContext.class,0);
		}
		public TerminalNode COL() { return getToken(KSSParser.COL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MultiValueContext multiValue() {
			return getRuleContext(MultiValueContext.class,0);
		}
		public Style_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStyle_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStyle_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStyle_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_modifierContext style_modifier() throws RecognitionException {
		Style_modifierContext _localctx = new Style_modifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_style_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			multiName();
			setState(256);
			match(COL);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(257);
				value();
				}
				break;
			case 2:
				{
				setState(258);
				multiValue();
				}
				break;
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

	public static class Ref_mofifierContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode COL() { return getToken(KSSParser.COL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Ref_mofifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_mofifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterRef_mofifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitRef_mofifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitRef_mofifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_mofifierContext ref_mofifier() throws RecognitionException {
		Ref_mofifierContext _localctx = new Ref_mofifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ref_mofifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			ref();
			setState(262);
			match(COL);
			setState(263);
			value();
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(KSSParser.DELETE, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(DELETE);
			setState(266);
			header();
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(KSSParser.CREATE, 0); }
		public StyleDeclarationContext styleDeclaration() {
			return getRuleContext(StyleDeclarationContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CREATE);
			setState(269);
			styleDeclaration();
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

	public static class Ref_callContext extends ParserRuleContext {
		public TerminalNode AST() { return getToken(KSSParser.AST, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Ref_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterRef_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitRef_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitRef_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_callContext ref_call() throws RecognitionException {
		Ref_callContext _localctx = new Ref_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ref_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(AST);
			setState(272);
			function_call();
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

	public static class Function_callContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			name();
			setState(275);
			match(PARO);
			setState(276);
			match(PARC);
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

	public static class ValueContext extends ParserRuleContext {
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public RgbaContext rgba() {
			return getRuleContext(RgbaContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KSSParser.STRING, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public Vec2Context vec2() {
			return getRuleContext(Vec2Context.class,0);
		}
		public Vec3Context vec3() {
			return getRuleContext(Vec3Context.class,0);
		}
		public Vec4Context vec4() {
			return getRuleContext(Vec4Context.class,0);
		}
		public Udim2Context udim2() {
			return getRuleContext(Udim2Context.class,0);
		}
		public True_Context true_() {
			return getRuleContext(True_Context.class,0);
		}
		public False_Context false_() {
			return getRuleContext(False_Context.class,0);
		}
		public TerminalNode NONE() { return getToken(KSSParser.NONE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RGB:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				rgb();
				}
				break;
			case RGBA:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				rgba();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(STRING);
				}
				break;
			case TAG:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				tag();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				name();
				}
				break;
			case AST:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				ref();
				}
				break;
			case VEC2:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				vec2();
				}
				break;
			case VEC3:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				vec3();
				}
				break;
			case VEC4:
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				vec4();
				}
				break;
			case UDIM2:
				enterOuterAlt(_localctx, 10);
				{
				setState(287);
				udim2();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
				true_();
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 12);
				{
				setState(289);
				false_();
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 13);
				{
				setState(290);
				match(NONE);
				}
				break;
			case DASH:
			case NUMBER:
				enterOuterAlt(_localctx, 14);
				{
				setState(291);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TemplateValueContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public TemplateValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterTemplateValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitTemplateValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitTemplateValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateValueContext templateValue() throws RecognitionException {
		TemplateValueContext _localctx = new TemplateValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_templateValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			name();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(295);
				match(COM);
				setState(296);
				name();
				}
				}
				setState(301);
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode AST() { return getToken(KSSParser.AST, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(AST);
			setState(303);
			name();
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(KSSParser.TAG, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(TAG);
			setState(306);
			name();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(KSSParser.WORD, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(WORD);
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

	public static class MultiNameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DASH() { return getTokens(KSSParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(KSSParser.DASH, i);
		}
		public MultiNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterMultiName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitMultiName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitMultiName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiNameContext multiName() throws RecognitionException {
		MultiNameContext _localctx = new MultiNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			name();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
				{
				setState(311);
				match(DASH);
				setState(312);
				name();
				}
				}
				setState(317);
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

	public static class MultiValueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(KSSParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(KSSParser.PLUS, i);
		}
		public MultiValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterMultiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitMultiValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitMultiValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiValueContext multiValue() throws RecognitionException {
		MultiValueContext _localctx = new MultiValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			value();
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(319);
				match(PLUS);
				setState(320);
				value();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class HeaderContext extends ParserRuleContext {
		public ElementHeaderContext elementHeader() {
			return getRuleContext(ElementHeaderContext.class,0);
		}
		public ClassHeaderContext classHeader() {
			return getRuleContext(ClassHeaderContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(326);
				elementHeader();
				}
				break;
			case DOT:
				{
				setState(327);
				classHeader();
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

	public static class StylingHeaderContext extends ParserRuleContext {
		public StylingDescendantListContext stylingDescendantList() {
			return getRuleContext(StylingDescendantListContext.class,0);
		}
		public StylingHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylingHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStylingHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStylingHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStylingHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylingHeaderContext stylingHeader() throws RecognitionException {
		StylingHeaderContext _localctx = new StylingHeaderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stylingHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			stylingDescendantList();
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

	public static class EventHeaderContext extends ParserRuleContext {
		public StylingDescendantListContext stylingDescendantList() {
			return getRuleContext(StylingDescendantListContext.class,0);
		}
		public EventAddonContext eventAddon() {
			return getRuleContext(EventAddonContext.class,0);
		}
		public EventAssignContext eventAssign() {
			return getRuleContext(EventAssignContext.class,0);
		}
		public EventHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterEventHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitEventHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitEventHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventHeaderContext eventHeader() throws RecognitionException {
		EventHeaderContext _localctx = new EventHeaderContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(332);
				eventAssign();
				}
			}

			setState(335);
			stylingDescendantList();
			setState(336);
			eventAddon();
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

	public static class EventAssignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KSSParser.VAR, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(KSSParser.ASSIGN, 0); }
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public EventAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterEventAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitEventAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitEventAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAssignContext eventAssign() throws RecognitionException {
		EventAssignContext _localctx = new EventAssignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eventAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(VAR);
			setState(339);
			name();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(340);
				match(COM);
				setState(341);
				name();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(ASSIGN);
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

	public static class StylingDescendantListContext extends ParserRuleContext {
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public List<DescendantSelectorContext> descendantSelector() {
			return getRuleContexts(DescendantSelectorContext.class);
		}
		public DescendantSelectorContext descendantSelector(int i) {
			return getRuleContext(DescendantSelectorContext.class,i);
		}
		public StylingDescendantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylingDescendantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStylingDescendantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStylingDescendantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStylingDescendantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylingDescendantListContext stylingDescendantList() throws RecognitionException {
		StylingDescendantListContext _localctx = new StylingDescendantListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stylingDescendantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			header();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DESC) {
				{
				{
				setState(350);
				descendantSelector();
				setState(351);
				header();
				}
				}
				setState(357);
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

	public static class EventAddonContext extends ParserRuleContext {
		public TerminalNode COL() { return getToken(KSSParser.COL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PointerAddonContext pointerAddon() {
			return getRuleContext(PointerAddonContext.class,0);
		}
		public EventAddonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAddon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterEventAddon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitEventAddon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitEventAddon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAddonContext eventAddon() throws RecognitionException {
		EventAddonContext _localctx = new EventAddonContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eventAddon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(COL);
			setState(359);
			name();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINTER) {
				{
				setState(360);
				pointerAddon();
				}
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

	public static class PointerAddonContext extends ParserRuleContext {
		public StylePointerContext stylePointer() {
			return getRuleContext(StylePointerContext.class,0);
		}
		public StylingDescendantListContext stylingDescendantList() {
			return getRuleContext(StylingDescendantListContext.class,0);
		}
		public PointerAddonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerAddon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterPointerAddon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitPointerAddon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitPointerAddon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerAddonContext pointerAddon() throws RecognitionException {
		PointerAddonContext _localctx = new PointerAddonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pointerAddon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			stylePointer();
			setState(364);
			stylingDescendantList();
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

	public static class DescendantSelectorContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(KSSParser.DESC, 0); }
		public DescendantSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descendantSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterDescendantSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitDescendantSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitDescendantSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescendantSelectorContext descendantSelector() throws RecognitionException {
		DescendantSelectorContext _localctx = new DescendantSelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_descendantSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(DESC);
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

	public static class EventSelectorContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(KSSParser.EVENT, 0); }
		public EventSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterEventSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitEventSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitEventSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventSelectorContext eventSelector() throws RecognitionException {
		EventSelectorContext _localctx = new EventSelectorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eventSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(EVENT);
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

	public static class StylePointerContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(KSSParser.POINTER, 0); }
		public StylePointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylePointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterStylePointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitStylePointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitStylePointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylePointerContext stylePointer() throws RecognitionException {
		StylePointerContext _localctx = new StylePointerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stylePointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(POINTER);
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

	public static class ElementHeaderContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DataDecoratorContext dataDecorator() {
			return getRuleContext(DataDecoratorContext.class,0);
		}
		public ElementHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterElementHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitElementHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitElementHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementHeaderContext elementHeader() throws RecognitionException {
		ElementHeaderContext _localctx = new ElementHeaderContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elementHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			name();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SBO) {
				{
				setState(373);
				dataDecorator();
				}
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

	public static class ClassHeaderContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(KSSParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DataDecoratorContext dataDecorator() {
			return getRuleContext(DataDecoratorContext.class,0);
		}
		public ClassHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterClassHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitClassHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitClassHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeaderContext classHeader() throws RecognitionException {
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(DOT);
			setState(377);
			name();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SBO) {
				{
				setState(378);
				dataDecorator();
				}
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

	public static class DataDecoratorContext extends ParserRuleContext {
		public TerminalNode SBO() { return getToken(KSSParser.SBO, 0); }
		public TerminalNode SBC() { return getToken(KSSParser.SBC, 0); }
		public List<VariableDataContext> variableData() {
			return getRuleContexts(VariableDataContext.class);
		}
		public VariableDataContext variableData(int i) {
			return getRuleContext(VariableDataContext.class,i);
		}
		public List<TagDataContext> tagData() {
			return getRuleContexts(TagDataContext.class);
		}
		public TagDataContext tagData(int i) {
			return getRuleContext(TagDataContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public DataDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterDataDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitDataDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitDataDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDecoratorContext dataDecorator() throws RecognitionException {
		DataDecoratorContext _localctx = new DataDecoratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dataDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(SBO);
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(382);
				variableData();
				}
				break;
			case TAG:
				{
				setState(383);
				tagData();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(386);
				match(COM);
				setState(389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(387);
					variableData();
					}
					break;
				case TAG:
					{
					setState(388);
					tagData();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(SBC);
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

	public static class TagDataContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ASSIGNCHECK() { return getToken(KSSParser.ASSIGNCHECK, 0); }
		public TerminalNode ASSIGN() { return getToken(KSSParser.ASSIGN, 0); }
		public TagDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterTagData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitTagData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitTagData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagDataContext tagData() throws RecognitionException {
		TagDataContext _localctx = new TagDataContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tagData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			tag();
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==ASSIGNCHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(400);
			value();
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

	public static class VariableDataContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KSSParser.VAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ASSIGNCHECK() { return getToken(KSSParser.ASSIGNCHECK, 0); }
		public TerminalNode ASSIGN() { return getToken(KSSParser.ASSIGN, 0); }
		public VariableDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterVariableData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitVariableData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitVariableData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDataContext variableData() throws RecognitionException {
		VariableDataContext _localctx = new VariableDataContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(VAR);
			setState(403);
			name();
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==ASSIGNCHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(405);
			value();
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

	public static class MultipleValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public MultipleValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterMultipleValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitMultipleValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitMultipleValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleValuesContext multipleValues() throws RecognitionException {
		MultipleValuesContext _localctx = new MultipleValuesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multipleValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			value();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(408);
				match(COM);
				setState(409);
				value();
				}
				}
				setState(414);
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

	public static class RgbContext extends ParserRuleContext {
		public TerminalNode RGB() { return getToken(KSSParser.RGB, 0); }
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public RgbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterRgb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitRgb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitRgb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbContext rgb() throws RecognitionException {
		RgbContext _localctx = new RgbContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(RGB);
			setState(416);
			match(PARO);
			setState(417);
			number();
			setState(418);
			match(COM);
			setState(419);
			number();
			setState(420);
			match(COM);
			setState(421);
			number();
			setState(422);
			match(PARC);
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

	public static class RgbaContext extends ParserRuleContext {
		public TerminalNode RGBA() { return getToken(KSSParser.RGBA, 0); }
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public RgbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterRgba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitRgba(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitRgba(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbaContext rgba() throws RecognitionException {
		RgbaContext _localctx = new RgbaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_rgba);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(RGBA);
			setState(425);
			match(PARO);
			setState(426);
			number();
			setState(427);
			match(COM);
			setState(428);
			number();
			setState(429);
			match(COM);
			setState(430);
			number();
			setState(431);
			match(COM);
			setState(432);
			number();
			setState(433);
			match(PARC);
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

	public static class PercentContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(KSSParser.PERCENT, 0); }
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_percent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			num();
			setState(436);
			match(PERCENT);
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

	public static class PixelContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode PX() { return getToken(KSSParser.PX, 0); }
		public PixelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterPixel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitPixel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitPixel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PixelContext pixel() throws RecognitionException {
		PixelContext _localctx = new PixelContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pixel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			num();
			setState(439);
			match(PX);
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

	public static class Vec2Context extends ParserRuleContext {
		public TerminalNode VEC2() { return getToken(KSSParser.VEC2, 0); }
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode COM() { return getToken(KSSParser.COM, 0); }
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public Vec2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vec2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterVec2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitVec2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitVec2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vec2Context vec2() throws RecognitionException {
		Vec2Context _localctx = new Vec2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_vec2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(VEC2);
			setState(442);
			match(PARO);
			setState(443);
			number();
			setState(444);
			match(COM);
			setState(445);
			number();
			setState(446);
			match(PARC);
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

	public static class Vec3Context extends ParserRuleContext {
		public TerminalNode VEC3() { return getToken(KSSParser.VEC3, 0); }
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public Vec3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vec3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterVec3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitVec3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitVec3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vec3Context vec3() throws RecognitionException {
		Vec3Context _localctx = new Vec3Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_vec3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(VEC3);
			setState(449);
			match(PARO);
			setState(450);
			number();
			setState(451);
			match(COM);
			setState(452);
			number();
			setState(453);
			match(COM);
			setState(454);
			number();
			setState(455);
			match(PARC);
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

	public static class Vec4Context extends ParserRuleContext {
		public TerminalNode VEC4() { return getToken(KSSParser.VEC4, 0); }
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public Vec4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vec4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterVec4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitVec4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitVec4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vec4Context vec4() throws RecognitionException {
		Vec4Context _localctx = new Vec4Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_vec4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(VEC4);
			setState(458);
			match(PARO);
			setState(459);
			number();
			setState(460);
			match(COM);
			setState(461);
			number();
			setState(462);
			match(COM);
			setState(463);
			number();
			setState(464);
			match(COM);
			setState(465);
			number();
			setState(466);
			match(PARC);
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

	public static class Udim2Context extends ParserRuleContext {
		public TerminalNode UDIM2() { return getToken(KSSParser.UDIM2, 0); }
		public TerminalNode PARO() { return getToken(KSSParser.PARO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(KSSParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(KSSParser.COM, i);
		}
		public TerminalNode PARC() { return getToken(KSSParser.PARC, 0); }
		public Udim2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udim2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterUdim2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitUdim2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitUdim2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Udim2Context udim2() throws RecognitionException {
		Udim2Context _localctx = new Udim2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_udim2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(UDIM2);
			setState(469);
			match(PARO);
			setState(470);
			number();
			setState(471);
			match(COM);
			setState(472);
			number();
			setState(473);
			match(COM);
			setState(474);
			number();
			setState(475);
			match(COM);
			setState(476);
			number();
			setState(477);
			match(PARC);
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

	public static class True_Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KSSParser.TRUE, 0); }
		public True_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterTrue_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitTrue_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitTrue_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_Context true_() throws RecognitionException {
		True_Context _localctx = new True_Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_true_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(TRUE);
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

	public static class False_Context extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(KSSParser.FALSE, 0); }
		public False_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterFalse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitFalse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitFalse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final False_Context false_() throws RecognitionException {
		False_Context _localctx = new False_Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_false_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(FALSE);
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

	public static class NumberContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public PercentContext percent() {
			return getRuleContext(PercentContext.class,0);
		}
		public PixelContext pixel() {
			return getRuleContext(PixelContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_number);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				percent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				pixel();
				}
				break;
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(KSSParser.NUMBER, 0); }
		public TerminalNode DASH() { return getToken(KSSParser.DASH, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSSParserListener ) ((KSSParserListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KSSParserVisitor ) return ((KSSParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(488);
				match(DASH);
				}
			}

			setState(491);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01f0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\5\2"+
		"v\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0081\n\2\7\2\u0083\n\2"+
		"\f\2\16\2\u0086\13\2\3\2\5\2\u0089\n\2\3\2\5\2\u008c\n\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\4\u0095\n\4\f\4\16\4\u0098\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\u00a4\n\4\f\4\16\4\u00a7\13\4\3\4\7\4\u00aa\n\4"+
		"\f\4\16\4\u00ad\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b7\n\5\f\5"+
		"\16\5\u00ba\13\5\3\5\3\5\5\5\u00be\n\5\3\5\5\5\u00c1\n\5\5\5\u00c3\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\7\n\u00db\n\n\f\n\16\n\u00de\13\n\3\n\3\n\5\n\u00e2"+
		"\n\n\3\n\5\n\u00e5\n\n\5\n\u00e7\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00f5\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0106\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0127\n\25\3\26\3\26\3\26\7\26\u012c\n\26\f\26\16\26\u012f\13\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u013c\n\32"+
		"\f\32\16\32\u013f\13\32\3\33\3\33\3\33\7\33\u0144\n\33\f\33\16\33\u0147"+
		"\13\33\3\34\3\34\5\34\u014b\n\34\3\35\3\35\3\36\5\36\u0150\n\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\7\37\u0159\n\37\f\37\16\37\u015c\13\37\3"+
		"\37\3\37\3 \3 \3 \3 \7 \u0164\n \f \16 \u0167\13 \3!\3!\3!\5!\u016c\n"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\5&\u0179\n&\3\'\3\'\3\'\5\'\u017e"+
		"\n\'\3(\3(\3(\5(\u0183\n(\3(\3(\3(\5(\u0188\n(\7(\u018a\n(\f(\16(\u018d"+
		"\13(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\7+\u019d\n+\f+\16+\u01a0"+
		"\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\66\5\66\u01e9\n\66\3\67\5\67\u01ec\n\67\3\67"+
		"\3\67\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\4\4\2\37 &&\3\2\27\30\2\u0202\2q"+
		"\3\2\2\2\4\u008d\3\2\2\2\6\u0090\3\2\2\2\b\u00b0\3\2\2\2\n\u00c6\3\2\2"+
		"\2\f\u00cb\3\2\2\2\16\u00d0\3\2\2\2\20\u00d3\3\2\2\2\22\u00d6\3\2\2\2"+
		"\24\u00f4\3\2\2\2\26\u00f6\3\2\2\2\30\u00f9\3\2\2\2\32\u00fc\3\2\2\2\34"+
		"\u0101\3\2\2\2\36\u0107\3\2\2\2 \u010b\3\2\2\2\"\u010e\3\2\2\2$\u0111"+
		"\3\2\2\2&\u0114\3\2\2\2(\u0126\3\2\2\2*\u0128\3\2\2\2,\u0130\3\2\2\2."+
		"\u0133\3\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64\u0140\3\2\2\2\66\u014a"+
		"\3\2\2\28\u014c\3\2\2\2:\u014f\3\2\2\2<\u0154\3\2\2\2>\u015f\3\2\2\2@"+
		"\u0168\3\2\2\2B\u016d\3\2\2\2D\u0170\3\2\2\2F\u0172\3\2\2\2H\u0174\3\2"+
		"\2\2J\u0176\3\2\2\2L\u017a\3\2\2\2N\u017f\3\2\2\2P\u0190\3\2\2\2R\u0194"+
		"\3\2\2\2T\u0199\3\2\2\2V\u01a1\3\2\2\2X\u01aa\3\2\2\2Z\u01b5\3\2\2\2\\"+
		"\u01b8\3\2\2\2^\u01bb\3\2\2\2`\u01c2\3\2\2\2b\u01cb\3\2\2\2d\u01d6\3\2"+
		"\2\2f\u01e1\3\2\2\2h\u01e3\3\2\2\2j\u01e8\3\2\2\2l\u01eb\3\2\2\2np\5\4"+
		"\3\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0084\3\2\2\2sq\3\2\2\2"+
		"tv\7&\2\2ut\3\2\2\2uv\3\2\2\2v\u0080\3\2\2\2w\u0081\5\20\t\2x\u0081\5"+
		"\f\7\2y\u0081\5\16\b\2z\u0081\5\6\4\2{\u0081\5\b\5\2|\u0081\5\26\f\2}"+
		"\u0081\5\30\r\2~\u0081\5&\24\2\177\u0081\5$\23\2\u0080w\3\2\2\2\u0080"+
		"x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2"+
		"\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"u\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7&\2\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c\7\2\2\3\u008b"+
		"\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\3\3\2\2\2\u008d\u008e\7\f\2\2"+
		"\u008e\u008f\5(\25\2\u008f\5\3\2\2\2\u0090\u0091\7\r\2\2\u0091\u0092\5"+
		"\60\31\2\u0092\u0096\7\33\2\2\u0093\u0095\7&\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a5\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u00a4\5\20\t\2\u009a\u00a4\5\f\7\2\u009b"+
		"\u00a4\5\16\b\2\u009c\u00a4\5 \21\2\u009d\u00a4\5\"\22\2\u009e\u00a4\5"+
		"\b\5\2\u009f\u00a4\5\26\f\2\u00a0\u00a4\5\30\r\2\u00a1\u00a4\5&\24\2\u00a2"+
		"\u00a4\5$\23\2\u00a3\u0099\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009b\3\2"+
		"\2\2\u00a3\u009c\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00ab\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7&\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\34\2\2\u00af\7\3\2\2"+
		"\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5\60\31\2\u00b2\u00c2\7\33\2\2\u00b3"+
		"\u00b8\5\24\13\2\u00b4\u00b5\t\2\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00be\5\24"+
		"\13\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\7\34\2\2\u00c5\t\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\5\60"+
		"\31\2\u00c8\u00c9\7!\2\2\u00c9\u00ca\5(\25\2\u00ca\13\3\2\2\2\u00cb\u00cc"+
		"\7\23\2\2\u00cc\u00cd\5\60\31\2\u00cd\u00ce\7!\2\2\u00ce\u00cf\5(\25\2"+
		"\u00cf\r\3\2\2\2\u00d0\u00d1\58\35\2\u00d1\u00d2\5\22\n\2\u00d2\17\3\2"+
		"\2\2\u00d3\u00d4\5:\36\2\u00d4\u00d5\5\22\n\2\u00d5\21\3\2\2\2\u00d6\u00e6"+
		"\7\33\2\2\u00d7\u00dc\5\24\13\2\u00d8\u00d9\t\2\2\2\u00d9\u00db\5\24\13"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\t\2\2\2\u00e0"+
		"\u00e2\5\24\13\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3"+
		"\2\2\2\u00e3\u00e5\t\2\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\7\34\2\2\u00e9\23\3\2\2\2\u00ea\u00f5\5\"\22\2\u00eb"+
		"\u00f5\5\32\16\2\u00ec\u00f5\5\34\17\2\u00ed\u00f5\5$\23\2\u00ee\u00f5"+
		"\5&\24\2\u00ef\u00f5\5\36\20\2\u00f0\u00f5\5 \21\2\u00f1\u00f5\5\f\7\2"+
		"\u00f2\u00f5\5\26\f\2\u00f3\u00f5\5\30\r\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb"+
		"\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5\25\3\2\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00f8"+
		"\5\60\31\2\u00f8\27\3\2\2\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\5\60\31\2"+
		"\u00fb\31\3\2\2\2\u00fc\u00fd\7\26\2\2\u00fd\u00fe\5\60\31\2\u00fe\u00ff"+
		"\7!\2\2\u00ff\u0100\5(\25\2\u0100\33\3\2\2\2\u0101\u0102\5\62\32\2\u0102"+
		"\u0105\7!\2\2\u0103\u0106\5(\25\2\u0104\u0106\5\64\33\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\35\3\2\2\2\u0107\u0108\5,\27\2\u0108"+
		"\u0109\7!\2\2\u0109\u010a\5(\25\2\u010a\37\3\2\2\2\u010b\u010c\7\17\2"+
		"\2\u010c\u010d\5\66\34\2\u010d!\3\2\2\2\u010e\u010f\7\20\2\2\u010f\u0110"+
		"\5\16\b\2\u0110#\3\2\2\2\u0111\u0112\7\"\2\2\u0112\u0113\5&\24\2\u0113"+
		"%\3\2\2\2\u0114\u0115\5\60\31\2\u0115\u0116\7\31\2\2\u0116\u0117\7\32"+
		"\2\2\u0117\'\3\2\2\2\u0118\u0127\5V,\2\u0119\u0127\5X-\2\u011a\u0127\7"+
		"\61\2\2\u011b\u0127\5.\30\2\u011c\u0127\5\60\31\2\u011d\u0127\5,\27\2"+
		"\u011e\u0127\5^\60\2\u011f\u0127\5`\61\2\u0120\u0127\5b\62\2\u0121\u0127"+
		"\5d\63\2\u0122\u0127\5f\64\2\u0123\u0127\5h\65\2\u0124\u0127\7\n\2\2\u0125"+
		"\u0127\5j\66\2\u0126\u0118\3\2\2\2\u0126\u0119\3\2\2\2\u0126\u011a\3\2"+
		"\2\2\u0126\u011b\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0126"+
		"\u011e\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2"+
		"\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127)\3\2\2\2\u0128\u012d\5\60\31\2\u0129\u012a\7 \2\2"+
		"\u012a\u012c\5\60\31\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e+\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0131\7\"\2\2\u0131\u0132\5\60\31\2\u0132-\3\2\2\2\u0133\u0134\7\26\2"+
		"\2\u0134\u0135\5\60\31\2\u0135/\3\2\2\2\u0136\u0137\7-\2\2\u0137\61\3"+
		"\2\2\2\u0138\u013d\5\60\31\2\u0139\u013a\7#\2\2\u013a\u013c\5\60\31\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\63\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0145\5(\25\2\u0141"+
		"\u0142\7%\2\2\u0142\u0144\5(\25\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\65\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u014b\5J&\2\u0149\u014b\5L\'\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\67\3\2\2\2\u014c\u014d\5> \2\u014d9\3\2\2\2\u014e"+
		"\u0150\5<\37\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\5> \2\u0152\u0153\5@!\2\u0153;\3\2\2\2\u0154\u0155\7"+
		"\23\2\2\u0155\u015a\5\60\31\2\u0156\u0157\7 \2\2\u0157\u0159\5\60\31\2"+
		"\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\27\2\2"+
		"\u015e=\3\2\2\2\u015f\u0165\5\66\34\2\u0160\u0161\5D#\2\u0161\u0162\5"+
		"\66\34\2\u0162\u0164\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166?\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0168\u0169\7!\2\2\u0169\u016b\5\60\31\2\u016a\u016c\5B\"\2\u016b\u016a"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016cA\3\2\2\2\u016d\u016e\5H%\2\u016e\u016f"+
		"\5> \2\u016fC\3\2\2\2\u0170\u0171\7)\2\2\u0171E\3\2\2\2\u0172\u0173\7"+
		"*\2\2\u0173G\3\2\2\2\u0174\u0175\7+\2\2\u0175I\3\2\2\2\u0176\u0178\5\60"+
		"\31\2\u0177\u0179\5N(\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"K\3\2\2\2\u017a\u017b\7$\2\2\u017b\u017d\5\60\31\2\u017c\u017e\5N(\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017eM\3\2\2\2\u017f\u0182\7\35\2\2"+
		"\u0180\u0183\5R*\2\u0181\u0183\5P)\2\u0182\u0180\3\2\2\2\u0182\u0181\3"+
		"\2\2\2\u0183\u018b\3\2\2\2\u0184\u0187\7 \2\2\u0185\u0188\5R*\2\u0186"+
		"\u0188\5P)\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u018a\3\2\2"+
		"\2\u0189\u0184\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\36\2\2"+
		"\u018fO\3\2\2\2\u0190\u0191\5.\30\2\u0191\u0192\t\3\2\2\u0192\u0193\5"+
		"(\25\2\u0193Q\3\2\2\2\u0194\u0195\7\23\2\2\u0195\u0196\5\60\31\2\u0196"+
		"\u0197\t\3\2\2\u0197\u0198\5(\25\2\u0198S\3\2\2\2\u0199\u019e\5(\25\2"+
		"\u019a\u019b\7 \2\2\u019b\u019d\5(\25\2\u019c\u019a\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fU\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a2\7\3\2\2\u01a2\u01a3\7\31\2\2\u01a3\u01a4\5"+
		"j\66\2\u01a4\u01a5\7 \2\2\u01a5\u01a6\5j\66\2\u01a6\u01a7\7 \2\2\u01a7"+
		"\u01a8\5j\66\2\u01a8\u01a9\7\32\2\2\u01a9W\3\2\2\2\u01aa\u01ab\7\4\2\2"+
		"\u01ab\u01ac\7\31\2\2\u01ac\u01ad\5j\66\2\u01ad\u01ae\7 \2\2\u01ae\u01af"+
		"\5j\66\2\u01af\u01b0\7 \2\2\u01b0\u01b1\5j\66\2\u01b1\u01b2\7 \2\2\u01b2"+
		"\u01b3\5j\66\2\u01b3\u01b4\7\32\2\2\u01b4Y\3\2\2\2\u01b5\u01b6\5l\67\2"+
		"\u01b6\u01b7\7(\2\2\u01b7[\3\2\2\2\u01b8\u01b9\5l\67\2\u01b9\u01ba\7\'"+
		"\2\2\u01ba]\3\2\2\2\u01bb\u01bc\7\5\2\2\u01bc\u01bd\7\31\2\2\u01bd\u01be"+
		"\5j\66\2\u01be\u01bf\7 \2\2\u01bf\u01c0\5j\66\2\u01c0\u01c1\7\32\2\2\u01c1"+
		"_\3\2\2\2\u01c2\u01c3\7\6\2\2\u01c3\u01c4\7\31\2\2\u01c4\u01c5\5j\66\2"+
		"\u01c5\u01c6\7 \2\2\u01c6\u01c7\5j\66\2\u01c7\u01c8\7 \2\2\u01c8\u01c9"+
		"\5j\66\2\u01c9\u01ca\7\32\2\2\u01caa\3\2\2\2\u01cb\u01cc\7\7\2\2\u01cc"+
		"\u01cd\7\31\2\2\u01cd\u01ce\5j\66\2\u01ce\u01cf\7 \2\2\u01cf\u01d0\5j"+
		"\66\2\u01d0\u01d1\7 \2\2\u01d1\u01d2\5j\66\2\u01d2\u01d3\7 \2\2\u01d3"+
		"\u01d4\5j\66\2\u01d4\u01d5\7\32\2\2\u01d5c\3\2\2\2\u01d6\u01d7\7\13\2"+
		"\2\u01d7\u01d8\7\31\2\2\u01d8\u01d9\5j\66\2\u01d9\u01da\7 \2\2\u01da\u01db"+
		"\5j\66\2\u01db\u01dc\7 \2\2\u01dc\u01dd\5j\66\2\u01dd\u01de\7 \2\2\u01de"+
		"\u01df\5j\66\2\u01df\u01e0\7\32\2\2\u01e0e\3\2\2\2\u01e1\u01e2\7\b\2\2"+
		"\u01e2g\3\2\2\2\u01e3\u01e4\7\t\2\2\u01e4i\3\2\2\2\u01e5\u01e9\5l\67\2"+
		"\u01e6\u01e9\5Z.\2\u01e7\u01e9\5\\/\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9k\3\2\2\2\u01ea\u01ec\7#\2\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7,\2\2\u01ee"+
		"m\3\2\2\2\'qu\u0080\u0084\u0088\u008b\u0096\u00a3\u00a5\u00ab\u00b8\u00bd"+
		"\u00c0\u00c2\u00dc\u00e1\u00e4\u00e6\u00f4\u0105\u0126\u012d\u013d\u0145"+
		"\u014a\u014f\u015a\u0165\u016b\u0178\u017d\u0182\u0187\u018b\u019e\u01e8"+
		"\u01eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}