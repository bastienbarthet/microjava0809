package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_Q_MJAVA {
LEX_MJAVA scanner;
  S_Q_MJAVA() {
    }
  S_Q_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle67() throws Exception {

    //declaration
    //appel
  }
  private void regle68() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_4 = new S_Q_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_pt);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
  }
  private void regle69() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_3 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_5 = new S_Q_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_parf);
    x_5.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 1692
        regle67 () ;
      break ;
      case LEX_MJAVA.token_div : // 1693
        regle67 () ;
      break ;
      case LEX_MJAVA.token_mod : // 1694
        regle67 () ;
      break ;
      case LEX_MJAVA.token_et : // 1695
        regle67 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1689
        regle67 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1690
        regle67 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1691
        regle67 () ;
      break ;
      case LEX_MJAVA.token_inf : // 1683
        regle67 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1684
        regle67 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1685
        regle67 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1686
        regle67 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1687
        regle67 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1688
        regle67 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1667
        regle67 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1664
        regle67 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1665
        regle67 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1659
        regle67 () ;
      break ;
      case LEX_MJAVA.token_pt : // 1666
        regle68 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1658
        regle69 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
