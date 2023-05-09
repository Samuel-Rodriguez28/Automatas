/* The following code was generated by JFlex 1.4.3 on 08/05/23 19:17 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 08/05/23 19:17 from the specification file
 * <tt>C:/Users/Samuel/Desktop/TareasTEC/Flex/AnalizadorLexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\2\0\1\3\22\0\1\3\1\35\1\53\1\0"+
    "\1\47\1\50\1\40\1\0\1\30\1\27\1\44\1\42\1\32\1\43"+
    "\1\55\1\45\12\2\1\31\1\33\1\37\1\34\1\36\1\52\1\51"+
    "\4\46\2\4\5\46\1\4\1\46\2\4\13\46\1\0\1\54\2\0"+
    "\1\1\1\0\1\11\1\22\1\15\1\25\1\20\1\16\1\10\1\24"+
    "\1\13\2\46\1\17\1\12\1\14\1\7\1\5\1\46\1\6\1\21"+
    "\1\23\1\46\1\26\4\46\1\0\1\41\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\2\3\14\0\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\1\1\23\1\24\1\25"+
    "\1\26\1\27\14\0\1\30\3\0\1\31\1\32\1\33"+
    "\1\34\3\0\1\35\1\0\1\36\7\0\1\37\12\0"+
    "\1\35\2\0\1\40\5\0\1\41\3\0\1\42\12\0"+
    "\1\43\4\0\1\44\1\45\2\0\1\3\3\0\1\46"+
    "\1\47\1\50\1\0\1\51\4\0\1\52\5\0\1\53"+
    "\1\54\1\55\1\56\2\0\1\57\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\134\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\56\0\56\0\56\0\270\0\56\0\u030e"+
    "\0\u033c\0\u036a\0\u0398\0\56\0\56\0\56\0\u03c6\0\56"+
    "\0\u03f4\0\u0422\0\56\0\56\0\56\0\56\0\56\0\u0450"+
    "\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536\0\u0564\0\u0592\0\u05c0"+
    "\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702\0\56"+
    "\0\56\0\56\0\56\0\u0730\0\u075e\0\u0422\0\56\0\u078c"+
    "\0\u0450\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce"+
    "\0\134\0\u08fc\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10"+
    "\0\u0a3e\0\u0a6c\0\u0a9a\0\u0422\0\u0ac8\0\u0af6\0\134\0\u0b24"+
    "\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\134\0\u0c0a\0\u0c38\0\u0c66"+
    "\0\134\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8"+
    "\0\u0dd6\0\u0e04\0\u0e32\0\134\0\u0e60\0\u0e8e\0\u0ebc\0\u0eea"+
    "\0\134\0\134\0\u0f18\0\u0f46\0\56\0\u0f74\0\u0fa2\0\u0fd0"+
    "\0\134\0\134\0\134\0\u0ffe\0\134\0\u102c\0\u105a\0\u1088"+
    "\0\u10b6\0\134\0\u10e4\0\u1112\0\u1140\0\u116e\0\u119c\0\134"+
    "\0\134\0\134\0\134\0\u11ca\0\u11f8\0\134\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\11"+
    "\1\12\1\13\1\11\1\14\1\15\1\16\1\17\1\20"+
    "\2\11\1\21\1\11\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\11\4\2\1\42\1\0\1\5"+
    "\57\0\2\11\1\0\23\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\5\0\1\4\52\0\1\50"+
    "\3\0\2\5\25\0\1\5\22\0\1\5\1\0\2\11"+
    "\1\5\1\6\22\11\3\0\1\5\5\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\2\0\1\5\1\0"+
    "\2\11\1\0\2\11\1\51\20\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\14\11\1\52\6\11\11\0\1\43\5\0\1\11\1\44"+
    "\1\45\1\46\1\47\4\0\2\11\1\0\7\11\1\53"+
    "\13\11\11\0\1\43\5\0\1\11\1\44\1\45\1\46"+
    "\1\47\4\0\2\11\1\0\10\11\1\54\12\11\11\0"+
    "\1\43\5\0\1\11\1\44\1\45\1\46\1\47\4\0"+
    "\2\11\1\0\5\11\1\55\15\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\5\11\1\56\1\11\1\57\13\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\3\11\1\60\10\11\1\61\6\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\10\11\1\62\4\11\1\63\5\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\7\11\1\64\13\11\11\0\1\43\5\0\1\11\1\44"+
    "\1\45\1\46\1\47\4\0\2\11\1\0\5\11\1\65"+
    "\15\11\11\0\1\43\5\0\1\11\1\44\1\45\1\46"+
    "\1\47\4\0\2\11\1\0\5\11\1\66\6\11\1\67"+
    "\6\11\11\0\1\43\5\0\1\11\1\44\1\45\1\46"+
    "\1\47\37\0\1\70\55\0\1\71\55\0\1\72\55\0"+
    "\1\73\23\0\1\74\120\0\1\75\10\0\53\76\1\77"+
    "\1\100\1\76\2\0\1\101\54\0\2\11\1\0\3\11"+
    "\1\102\17\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\1\11\1\103\3\11"+
    "\1\104\15\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\14\11\1\105\6\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\7\11\1\106\13\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\21\11\1\107\1\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\13\11"+
    "\1\110\7\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\10\11\1\111\12\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\4\11\1\112\16\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\14\11\1\113\6\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\17\11"+
    "\1\114\3\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\11\11\1\115\11\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\10\11\1\116\12\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\11\11\1\117\3\11\1\120\5\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\2\11\1\121\20\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\2\11"+
    "\1\122\20\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\5\0\1\74\52\0\1\50\2\0\1\123"+
    "\1\0\23\123\17\0\1\123\7\0\53\76\1\124\1\100"+
    "\1\76\1\0\2\11\1\0\4\11\1\125\16\11\11\0"+
    "\1\43\5\0\1\11\1\44\1\45\1\46\1\47\4\0"+
    "\2\11\1\0\14\11\1\126\6\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\13\11\1\127\7\11\11\0\1\43\5\0\1\11\1\44"+
    "\1\45\1\46\1\47\4\0\2\11\1\0\10\11\1\130"+
    "\12\11\11\0\1\43\5\0\1\11\1\44\1\45\1\46"+
    "\1\47\4\0\2\11\1\0\11\11\1\131\11\11\11\0"+
    "\1\43\5\0\1\11\1\44\1\45\1\46\1\47\4\0"+
    "\2\11\1\0\14\11\1\132\6\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\15\11\1\133\5\11\11\0\1\43\5\0\1\11\1\44"+
    "\1\45\1\46\1\47\4\0\2\11\1\0\7\11\1\134"+
    "\13\11\11\0\1\43\5\0\1\11\1\44\1\45\1\46"+
    "\1\47\4\0\2\11\1\0\2\11\1\135\20\11\11\0"+
    "\1\43\5\0\1\11\1\44\1\45\1\46\1\47\4\0"+
    "\2\11\1\0\3\11\1\136\10\11\1\137\6\11\11\0"+
    "\1\43\5\0\1\11\1\44\1\45\1\46\1\47\4\0"+
    "\2\11\1\0\2\11\1\140\20\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\3\11\1\141\17\11\11\0\1\43\5\0\1\11\1\44"+
    "\1\45\1\46\1\47\4\0\2\11\1\0\14\11\1\142"+
    "\6\11\11\0\1\43\5\0\1\11\1\44\1\45\1\46"+
    "\1\47\4\0\2\11\1\0\17\11\1\143\3\11\11\0"+
    "\1\43\5\0\1\11\1\44\1\45\1\46\1\47\4\0"+
    "\2\11\1\0\7\11\1\144\13\11\11\0\1\43\5\0"+
    "\1\11\1\44\1\45\1\46\1\47\4\0\2\11\1\0"+
    "\21\11\1\145\1\11\11\0\1\43\5\0\1\11\1\44"+
    "\1\45\1\46\1\47\5\0\1\123\1\0\23\123\16\0"+
    "\1\146\1\123\10\0\2\11\1\0\2\11\1\147\20\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\17\11\1\150\3\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\17\11\1\151\3\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\7\11"+
    "\1\152\13\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\10\11\1\153\12\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\3\11\1\154\17\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\11\11\1\155\11\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\10\11"+
    "\1\156\12\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\2\11\1\157\20\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\7\11\1\160\13\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\2\11\1\161\20\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\5\11"+
    "\1\162\15\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\5\11\1\163\15\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\5\11\1\164\15\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\50\0\1\165"+
    "\11\0\2\11\1\0\5\11\1\166\15\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\7\11\1\167\13\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\2\11"+
    "\1\170\20\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\3\11\1\171\17\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\5\11\1\172\15\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\3\11\1\173\17\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\11\11"+
    "\1\174\11\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\3\11\1\175\17\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\16\11\1\176\4\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\16\11\1\177\4\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\21\11"+
    "\1\200\1\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\6\11\1\201\14\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\2\11\1\202\20\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\5\11\1\203\15\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\14\11"+
    "\1\204\6\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\7\11\1\205\13\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\13\11\1\206\7\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\14\11\1\207\6\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\5\11"+
    "\1\210\15\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\15\11\1\211\5\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\15\11\1\212\5\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\2\11\1\213\20\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\4\0\2\11\1\0\14\11"+
    "\1\214\6\11\11\0\1\43\5\0\1\11\1\44\1\45"+
    "\1\46\1\47\4\0\2\11\1\0\2\11\1\215\20\11"+
    "\11\0\1\43\5\0\1\11\1\44\1\45\1\46\1\47"+
    "\4\0\2\11\1\0\15\11\1\216\5\11\11\0\1\43"+
    "\5\0\1\11\1\44\1\45\1\46\1\47\4\0\2\11"+
    "\1\0\3\11\1\217\17\11\11\0\1\43\5\0\1\11"+
    "\1\44\1\45\1\46\1\47\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4646];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\14\0\3\11\1\1\1\11\4\1"+
    "\3\11\1\1\1\11\2\1\5\11\14\0\1\1\3\0"+
    "\4\11\3\0\1\11\1\0\1\1\7\0\1\1\12\0"+
    "\1\1\2\0\1\1\5\0\1\1\3\0\1\1\12\0"+
    "\1\1\4\0\2\1\2\0\1\11\3\0\3\1\1\0"+
    "\1\1\4\0\1\1\5\0\4\1\2\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public static final int PROGRAMA = -1;
    public static final int INICIO = -2;
    public static final int FIN = -3;
    public static final int LEER = -4;
    public static final int ESCRIBIR = -5;
    public static final int SI = -6;
    public static final int SINO = -7;
    public static final int MIENTRAS = -8;
    public static final int REPETIR = -9;
    public static final int HASTA = -10;
    public static final int ENTERO = -11;
    public static final int REAL = -12;
    public static final int CADENA = -13;
    public static final int LOGICO = -14;
    public static final int VARIABLES = -15;
    public static final int ENTONCES= -16;
    public static final int HACER= -17;
    public static final int MULTIPLICACION = -21;
    public static final int DIVISION = -22;
    public static final int SUMA = -24;
    public static final int RESTA = -25;
    public static final int IGUAL = -26;
    public static final int MENOR = -31;
    public static final int MENOR_IGUAL = -32;
    public static final int MAYOR = -33;
    public static final int MAYOR_IGUAL = -34;
    public static final int IGUAL_IGUAL = -35;
    public static final int DIFERENTE = -36;
    public static final int AND = -41;
    public static final int OR = -42;
    public static final int NOT = -43;
    public static final int ID_ENTERO = -51;
    public static final int ID_REALES = -52;
    public static final int ID_STRING = -53;
    public static final int ID_LOGICO = -54;
    public static final int ID_PROGRAMA = -55;
    public static final int NUMERO = -61;
    public static final int NUM_REAL = -62;
    public static final int STRING = -63;
    public static final int VERDADERO = -64;
    public static final int FALSO = -65;
    public static final int PARENTESIS_ABRE = -73;
    public static final int PARENTESIS_CIERRA = -74;
    public static final int PUNTO_COMA = -75;
    public static final int COMA = -76;
    public static final int DOS_PUNTOS = -77;
    public static final int ERROR = -150;

    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 36: 
          { return HACER;
          }
        case 49: break;
        case 19: 
          { lexeme=yytext(); return ID_ENTERO;
          }
        case 50: break;
        case 8: 
          { return PUNTO_COMA;
          }
        case 51: break;
        case 35: 
          { return FALSO;
          }
        case 52: break;
        case 32: 
          { return REAL;
          }
        case 53: break;
        case 39: 
          { return CADENA;
          }
        case 54: break;
        case 27: 
          { return MAYOR_IGUAL;
          }
        case 55: break;
        case 4: 
          { return PARENTESIS_ABRE;
          }
        case 56: break;
        case 17: 
          { return MULTIPLICACION;
          }
        case 57: break;
        case 33: 
          { return LEER;
          }
        case 58: break;
        case 6: 
          { return DOS_PUNTOS;
          }
        case 59: break;
        case 25: 
          { return IGUAL_IGUAL;
          }
        case 60: break;
        case 14: 
          { return OR;
          }
        case 61: break;
        case 37: 
          { return HASTA;
          }
        case 62: break;
        case 30: 
          { lexeme=yytext(); return NUM_REAL;
          }
        case 63: break;
        case 44: 
          { return MIENTRAS;
          }
        case 64: break;
        case 41: 
          { return ENTERO;
          }
        case 65: break;
        case 20: 
          { lexeme=yytext(); return ID_STRING;
          }
        case 66: break;
        case 29: 
          { lexeme=yytext(); return STRING;
          }
        case 67: break;
        case 16: 
          { return RESTA;
          }
        case 68: break;
        case 13: 
          { return AND;
          }
        case 69: break;
        case 10: 
          { return NOT;
          }
        case 70: break;
        case 11: 
          { return MAYOR;
          }
        case 71: break;
        case 47: 
          { return VARIABLES;
          }
        case 72: break;
        case 7: 
          { return COMA;
          }
        case 73: break;
        case 22: 
          { lexeme=yytext(); return ID_LOGICO;
          }
        case 74: break;
        case 48: 
          { return VERDADERO;
          }
        case 75: break;
        case 15: 
          { return SUMA;
          }
        case 76: break;
        case 28: 
          { return MENOR_IGUAL;
          }
        case 77: break;
        case 18: 
          { return DIVISION;
          }
        case 78: break;
        case 2: 
          { lexeme=yytext(); return NUMERO;
          }
        case 79: break;
        case 42: 
          { return REPETIR;
          }
        case 80: break;
        case 5: 
          { return PARENTESIS_CIERRA;
          }
        case 81: break;
        case 38: 
          { return INICIO;
          }
        case 82: break;
        case 46: 
          { return ESCRIBIR;
          }
        case 83: break;
        case 23: 
          { lexeme=yytext(); return ID_PROGRAMA;
          }
        case 84: break;
        case 9: 
          { return IGUAL;
          }
        case 85: break;
        case 21: 
          { lexeme=yytext(); return ID_REALES;
          }
        case 86: break;
        case 26: 
          { return DIFERENTE;
          }
        case 87: break;
        case 1: 
          { return ERROR;
          }
        case 88: break;
        case 31: 
          { return FIN;
          }
        case 89: break;
        case 43: 
          { return PROGRAMA;
          }
        case 90: break;
        case 24: 
          { return SI;
          }
        case 91: break;
        case 12: 
          { return MENOR;
          }
        case 92: break;
        case 40: 
          { return LOGICO;
          }
        case 93: break;
        case 3: 
          { /*Ignore*/
          }
        case 94: break;
        case 34: 
          { return SINO;
          }
        case 95: break;
        case 45: 
          { return ENTONCES;
          }
        case 96: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return 0;
          } 
          else {
            return ERROR;
          }
      }
    }
  }


}
