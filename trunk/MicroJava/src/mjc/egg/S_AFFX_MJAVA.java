package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_AFFX_MJAVA {
LEX_MJAVA scanner;
  S_AFFX_MJAVA() {
    }
  S_AFFX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle32() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ER_MJAVA x_3 = new S_ER_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_affect);
    x_3.analyser() ;
  }
  private void regle33() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_affect : // 1667
        regle32 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1665
        regle33 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1664
        regle33 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1659
        regle33 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
