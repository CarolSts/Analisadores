// $ANTLR 2.7.6 (2005-12-22): "gramatica.g" -> "Sintatico.java"$

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class Sintatico extends antlr.LLkParser       implements SintaticoTokenTypes
 {

	//Codigo Java

protected Sintatico(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public Sintatico(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected Sintatico(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public Sintatico(TokenStream lexer) {
  this(lexer,1);
}

public Sintatico(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final void regra() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			expr();
			match(T_EOF);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
	}
	
	public final void expr() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			termo();
			{
			_loop5:
			do {
				if ((LA(1)==T_mais||LA(1)==T_menos)) {
					{
					switch ( LA(1)) {
					case T_mais:
					{
						match(T_mais);
						break;
					}
					case T_menos:
					{
						match(T_menos);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					termo();
				}
				else {
					break _loop5;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
	}
	
	public final void termo() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			fator();
			{
			_loop9:
			do {
				if ((LA(1)==T_vezes||LA(1)==T_divisao)) {
					{
					switch ( LA(1)) {
					case T_vezes:
					{
						match(T_vezes);
						break;
					}
					case T_divisao:
					{
						match(T_divisao);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					fator();
				}
				else {
					break _loop9;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
	}
	
	public final void fator() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case T_num:
			{
				match(T_num);
				break;
			}
			case T_id:
			{
				match(T_id);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"T_EOF",
		"T_mais",
		"T_menos",
		"T_vezes",
		"T_divisao",
		"T_num",
		"T_id",
		"T_divi",
		"T_space"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 16L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 112L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 496L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	
	}
