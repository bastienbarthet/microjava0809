package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFS_MJAVA {
LEX_MJAVA scanner;
  S_DEFS_MJAVA() {
    }
  S_DEFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle6() throws Exception {

    //declaration
    //appel
  }
  private void regle7() throws Exception {

    //declaration
    S_DEF_MJAVA x_2 = new S_DEF_MJAVA(scanner) ;
    S_DEFS_MJAVA x_3 = new S_DEFS_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 1661
        regle6 () ;
      break ;
      case LEX_MJAVA.token_int : // 1672
        regle7 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1673
        regle7 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1702
        regle7 () ;
      break ;
      case LEX_MJAVA.token_void : // 1671
        regle7 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
