package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ERX_MJAVA {
LEX_MJAVA scanner;
  S_ERX_MJAVA() {
    }
  S_ERX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle37() throws Exception {

    //declaration
    //appel
  }
  private void regle36() throws Exception {

    //declaration
    S_OPREL_MJAVA x_2 = new S_OPREL_MJAVA(scanner) ;
    S_ES_MJAVA x_3 = new S_ES_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_inf : // 1683
        regle36 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1684
        regle36 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1685
        regle36 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1686
        regle36 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1687
        regle36 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1688
        regle36 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1667
        regle37 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1664
        regle37 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1665
        regle37 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1659
        regle37 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
