package com.piotrek.model.trans;

// $ANTLR 3.4 Pascal.g 2013-05-22 18:21:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PascalLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int COMMA=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int REAL=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PascalLexer() {} 
    public PascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Pascal.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:2:6: ( '(' )
            // Pascal.g:2:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:3:7: ( ')' )
            // Pascal.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:4:7: ( '*' )
            // Pascal.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:5:7: ( '+' )
            // Pascal.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:6:7: ( '-' )
            // Pascal.g:6:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:7:7: ( '.' )
            // Pascal.g:7:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:8:7: ( '/' )
            // Pascal.g:8:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:9:7: ( ':' )
            // Pascal.g:9:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:10:7: ( ':=' )
            // Pascal.g:10:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:11:7: ( ';' )
            // Pascal.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:12:7: ( '<' )
            // Pascal.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:13:7: ( '<=' )
            // Pascal.g:13:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:14:7: ( '<>' )
            // Pascal.g:14:9: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:15:7: ( '=' )
            // Pascal.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:16:7: ( '>' )
            // Pascal.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:17:7: ( '>=' )
            // Pascal.g:17:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:18:7: ( 'begin' )
            // Pascal.g:18:9: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:19:7: ( 'char' )
            // Pascal.g:19:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:20:7: ( 'const' )
            // Pascal.g:20:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:21:7: ( 'do' )
            // Pascal.g:21:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:22:7: ( 'double' )
            // Pascal.g:22:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:23:7: ( 'else' )
            // Pascal.g:23:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:24:7: ( 'end' )
            // Pascal.g:24:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:25:7: ( 'if' )
            // Pascal.g:25:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:26:7: ( 'integer' )
            // Pascal.g:26:9: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:27:7: ( 'longint' )
            // Pascal.g:27:9: 'longint'
            {
            match("longint"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:28:7: ( 'mod' )
            // Pascal.g:28:9: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:29:7: ( 'program' )
            // Pascal.g:29:9: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:30:7: ( 'real' )
            // Pascal.g:30:9: 'real'
            {
            match("real"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:31:7: ( 'repeat' )
            // Pascal.g:31:9: 'repeat'
            {
            match("repeat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:32:7: ( 'string' )
            // Pascal.g:32:9: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:33:7: ( 'then' )
            // Pascal.g:33:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:34:7: ( 'until' )
            // Pascal.g:34:9: 'until'
            {
            match("until"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:35:7: ( 'var' )
            // Pascal.g:35:9: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:36:7: ( 'while' )
            // Pascal.g:36:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:37:7: ( 'write' )
            // Pascal.g:37:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:38:7: ( 'writeln' )
            // Pascal.g:38:9: 'writeln'
            {
            match("writeln"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:247:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Pascal.g:247:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Pascal.g:247:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Pascal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:251:3: ( INT '.' INT )
            // Pascal.g:251:7: INT '.' INT
            {
            mINT(); 


            match('.'); 

            mINT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:255:3: ( ',' )
            // Pascal.g:255:7: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:259:3: ( ( '0' .. '9' )+ )
            // Pascal.g:259:7: ( '0' .. '9' )+
            {
            // Pascal.g:259:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Pascal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pascal.g:263:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Pascal.g:263:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Pascal.g:263:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Pascal.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Pascal.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | ID | REAL | COMMA | INT | WS )
        int alt4=42;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // Pascal.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // Pascal.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // Pascal.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // Pascal.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // Pascal.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // Pascal.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // Pascal.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // Pascal.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // Pascal.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // Pascal.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // Pascal.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // Pascal.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // Pascal.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // Pascal.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // Pascal.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // Pascal.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // Pascal.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // Pascal.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // Pascal.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // Pascal.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // Pascal.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // Pascal.g:1:135: T__30
                {
                mT__30(); 


                }
                break;
            case 23 :
                // Pascal.g:1:141: T__31
                {
                mT__31(); 


                }
                break;
            case 24 :
                // Pascal.g:1:147: T__32
                {
                mT__32(); 


                }
                break;
            case 25 :
                // Pascal.g:1:153: T__33
                {
                mT__33(); 


                }
                break;
            case 26 :
                // Pascal.g:1:159: T__34
                {
                mT__34(); 


                }
                break;
            case 27 :
                // Pascal.g:1:165: T__35
                {
                mT__35(); 


                }
                break;
            case 28 :
                // Pascal.g:1:171: T__36
                {
                mT__36(); 


                }
                break;
            case 29 :
                // Pascal.g:1:177: T__37
                {
                mT__37(); 


                }
                break;
            case 30 :
                // Pascal.g:1:183: T__38
                {
                mT__38(); 


                }
                break;
            case 31 :
                // Pascal.g:1:189: T__39
                {
                mT__39(); 


                }
                break;
            case 32 :
                // Pascal.g:1:195: T__40
                {
                mT__40(); 


                }
                break;
            case 33 :
                // Pascal.g:1:201: T__41
                {
                mT__41(); 


                }
                break;
            case 34 :
                // Pascal.g:1:207: T__42
                {
                mT__42(); 


                }
                break;
            case 35 :
                // Pascal.g:1:213: T__43
                {
                mT__43(); 


                }
                break;
            case 36 :
                // Pascal.g:1:219: T__44
                {
                mT__44(); 


                }
                break;
            case 37 :
                // Pascal.g:1:225: T__45
                {
                mT__45(); 


                }
                break;
            case 38 :
                // Pascal.g:1:231: ID
                {
                mID(); 


                }
                break;
            case 39 :
                // Pascal.g:1:234: REAL
                {
                mREAL(); 


                }
                break;
            case 40 :
                // Pascal.g:1:239: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 41 :
                // Pascal.g:1:245: INT
                {
                mINT(); 


                }
                break;
            case 42 :
                // Pascal.g:1:249: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\10\uffff\1\40\1\uffff\1\43\1\uffff\1\45\16\33\1\uffff\1\70\11\uffff"+
        "\3\33\1\76\2\33\1\101\13\33\2\uffff\4\33\1\uffff\1\33\1\123\1\uffff"+
        "\2\33\1\126\6\33\1\135\3\33\1\141\2\33\1\144\1\uffff\2\33\1\uffff"+
        "\1\33\1\150\2\33\1\153\1\33\1\uffff\2\33\1\157\1\uffff\1\160\1\33"+
        "\1\uffff\3\33\1\uffff\2\33\1\uffff\1\167\1\170\1\172\2\uffff\1\173"+
        "\3\33\1\177\1\u0080\2\uffff\1\33\2\uffff\1\u0082\1\u0083\1\u0084"+
        "\2\uffff\1\u0085\4\uffff";
    static final String DFA4_eofS =
        "\u0086\uffff";
    static final String DFA4_minS =
        "\1\11\7\uffff\1\75\1\uffff\1\75\1\uffff\1\75\1\145\1\150\1\157\1"+
        "\154\1\146\2\157\1\162\1\145\1\164\1\150\1\156\1\141\1\150\1\uffff"+
        "\1\56\11\uffff\1\147\1\141\1\156\1\60\1\163\1\144\1\60\1\164\1\156"+
        "\1\144\1\157\1\141\1\162\1\145\1\164\1\162\2\151\2\uffff\1\151\1"+
        "\162\1\163\1\142\1\uffff\1\145\1\60\1\uffff\1\145\1\147\1\60\1\147"+
        "\1\154\1\145\1\151\1\156\1\151\1\60\1\154\1\164\1\156\1\60\1\164"+
        "\1\154\1\60\1\uffff\1\147\1\151\1\uffff\1\162\1\60\1\141\1\156\1"+
        "\60\1\154\1\uffff\2\145\1\60\1\uffff\1\60\1\145\1\uffff\1\145\1"+
        "\156\1\141\1\uffff\1\164\1\147\1\uffff\3\60\2\uffff\1\60\1\162\1"+
        "\164\1\155\2\60\2\uffff\1\156\2\uffff\3\60\2\uffff\1\60\4\uffff";
    static final String DFA4_maxS =
        "\1\172\7\uffff\1\75\1\uffff\1\76\1\uffff\1\75\1\145\2\157\2\156"+
        "\2\157\1\162\1\145\1\164\1\150\1\156\1\141\1\162\1\uffff\1\71\11"+
        "\uffff\1\147\1\141\1\156\1\172\1\163\1\144\1\172\1\164\1\156\1\144"+
        "\1\157\1\160\1\162\1\145\1\164\1\162\2\151\2\uffff\1\151\1\162\1"+
        "\163\1\142\1\uffff\1\145\1\172\1\uffff\1\145\1\147\1\172\1\147\1"+
        "\154\1\145\1\151\1\156\1\151\1\172\1\154\1\164\1\156\1\172\1\164"+
        "\1\154\1\172\1\uffff\1\147\1\151\1\uffff\1\162\1\172\1\141\1\156"+
        "\1\172\1\154\1\uffff\2\145\1\172\1\uffff\1\172\1\145\1\uffff\1\145"+
        "\1\156\1\141\1\uffff\1\164\1\147\1\uffff\3\172\2\uffff\1\172\1\162"+
        "\1\164\1\155\2\172\2\uffff\1\156\2\uffff\3\172\2\uffff\1\172\4\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\16\17"+
        "\uffff\1\46\1\uffff\1\50\1\52\1\11\1\10\1\14\1\15\1\13\1\20\1\17"+
        "\22\uffff\1\51\1\47\4\uffff\1\24\2\uffff\1\30\21\uffff\1\27\2\uffff"+
        "\1\33\6\uffff\1\42\3\uffff\1\22\2\uffff\1\26\3\uffff\1\35\2\uffff"+
        "\1\40\3\uffff\1\21\1\23\6\uffff\1\41\1\43\1\uffff\1\44\1\25\3\uffff"+
        "\1\36\1\37\1\uffff\1\31\1\32\1\34\1\45";
    static final String DFA4_specialS =
        "\u0086\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\7\uffff\1\1\1\2\1\3\1\4\1\35"+
            "\1\5\1\6\1\7\12\34\1\10\1\11\1\12\1\13\1\14\2\uffff\32\33\4"+
            "\uffff\1\33\1\uffff\1\33\1\15\1\16\1\17\1\20\3\33\1\21\2\33"+
            "\1\22\1\23\2\33\1\24\1\33\1\25\1\26\1\27\1\30\1\31\1\32\3\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "\1\41\1\42",
            "",
            "\1\44",
            "\1\46",
            "\1\47\6\uffff\1\50",
            "\1\51",
            "\1\52\1\uffff\1\53",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\11\uffff\1\67",
            "",
            "\1\71\1\uffff\12\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\24\33\1\75\5\33",
            "\1\77",
            "\1\100",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\16\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\124",
            "\1\125",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\142",
            "\1\143",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\151",
            "\1\152",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\171\16\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\u0081",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | ID | REAL | COMMA | INT | WS );";
        }
    }
 

}