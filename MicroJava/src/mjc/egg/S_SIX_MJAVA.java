package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_SIX_MJAVA {
LEX_MJAVA scanner;
  S_SIX_MJAVA() {
    }
  S_SIX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle28() throws Exception {

    //declaration
    //appel
  }
  private void regle27() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_3 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_sinon);
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_sinon : // 1669
        regle27 () ;
      break ;
      case LEX_MJAVA.token_int : // 1672
        regle28 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1673
        regle28 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1702
        regle28 () ;
      break ;
      case LEX_MJAVA.token_entier : // 1701
        regle28 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1697
        regle28 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1698
        regle28 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1689
        regle28 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1690
        regle28 () ;
      break ;
      case LEX_MJAVA.token_non : // 1696
        regle28 () ;
      break ;
      case LEX_MJAVA.token_null : // 1682
        regle28 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1658
        regle28 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1677
        regle28 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1660
        regle28 () ;
      break ;
      case LEX_MJAVA.token_si : // 1668
        regle28 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1676
        regle28 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 1670
        regle28 () ;
      break ;
      case LEX_MJAVA.token_acf : // 1661
        regle28 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
