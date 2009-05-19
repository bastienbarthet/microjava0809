package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_TX_MJAVA {
LEX_MJAVA scanner;
  S_TX_MJAVA() {
    }
  S_TX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle50() throws Exception {

    //declaration
    S_OPMUL_MJAVA x_2 = new S_OPMUL_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_4 = new S_TX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle51() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 1692
        regle50 () ;
      break ;
      case LEX_MJAVA.token_div : // 1693
        regle50 () ;
      break ;
      case LEX_MJAVA.token_mod : // 1694
        regle50 () ;
      break ;
      case LEX_MJAVA.token_et : // 1695
        regle50 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1689
        regle51 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1690
        regle51 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1691
        regle51 () ;
      break ;
      case LEX_MJAVA.token_inf : // 1683
        regle51 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1684
        regle51 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1685
        regle51 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1686
        regle51 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1687
        regle51 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1688
        regle51 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1667
        regle51 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1664
        regle51 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1665
        regle51 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1659
        regle51 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
