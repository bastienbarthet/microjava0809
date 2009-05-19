package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_INSTS_MJAVA {
LEX_MJAVA scanner;
  S_INSTS_MJAVA() {
    }
  S_INSTS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle22() throws Exception {

    //declaration
    S_INST_MJAVA x_2 = new S_INST_MJAVA(scanner) ;
    S_INSTS_MJAVA x_3 = new S_INSTS_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle21() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 1661
        regle21 () ;
      break ;
      case LEX_MJAVA.token_int : // 1672
        regle22 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1673
        regle22 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1702
        regle22 () ;
      break ;
      case LEX_MJAVA.token_entier : // 1701
        regle22 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1697
        regle22 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1698
        regle22 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1689
        regle22 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1690
        regle22 () ;
      break ;
      case LEX_MJAVA.token_non : // 1696
        regle22 () ;
      break ;
      case LEX_MJAVA.token_null : // 1682
        regle22 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1658
        regle22 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1677
        regle22 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1660
        regle22 () ;
      break ;
      case LEX_MJAVA.token_si : // 1668
        regle22 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1676
        regle22 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 1670
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
