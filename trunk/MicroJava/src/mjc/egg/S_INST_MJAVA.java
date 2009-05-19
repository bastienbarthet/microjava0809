package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_INST_MJAVA {
LEX_MJAVA scanner;
  S_INST_MJAVA() {
    }
  S_INST_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle26() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_6 = new S_BLOC_MJAVA(scanner) ;
    S_SIX_MJAVA x_7 = new S_SIX_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_si);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
    x_6.analyser() ;
    x_7.analyser() ;
  }
  private void regle24() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_pv);
  }
  private void regle25() throws Exception {

    //declaration
    S_BLOC_MJAVA x_2 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
  }
  private void regle29() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_pv);
  }
  private void regle30() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_6 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_tantque);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
    x_6.analyser() ;
  }
  private void regle23() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_AFFX_MJAVA x_4 = new S_AFFX_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_pv);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 1672
        regle23 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1673
        regle23 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1702
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 1702
            regle23 () ;
          break ;
          case LEX_MJAVA.token_pt : // 1666
            regle24 () ;
          break ;
          case LEX_MJAVA.token_paro : // 1658
            regle24 () ;
          break ;
          case LEX_MJAVA.token_mult : // 1692
            regle24 () ;
          break ;
          case LEX_MJAVA.token_div : // 1693
            regle24 () ;
          break ;
          case LEX_MJAVA.token_mod : // 1694
            regle24 () ;
          break ;
          case LEX_MJAVA.token_et : // 1695
            regle24 () ;
          break ;
          case LEX_MJAVA.token_plus : // 1689
            regle24 () ;
          break ;
          case LEX_MJAVA.token_moins : // 1690
            regle24 () ;
          break ;
          case LEX_MJAVA.token_ou : // 1691
            regle24 () ;
          break ;
          case LEX_MJAVA.token_inf : // 1683
            regle24 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 1684
            regle24 () ;
          break ;
          case LEX_MJAVA.token_sup : // 1685
            regle24 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 1686
            regle24 () ;
          break ;
          case LEX_MJAVA.token_eg : // 1687
            regle24 () ;
          break ;
          case LEX_MJAVA.token_neg : // 1688
            regle24 () ;
          break ;
          case LEX_MJAVA.token_affect : // 1667
            regle24 () ;
          break ;
          case LEX_MJAVA.token_pv : // 1665
            regle24 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_entier : // 1701
        regle24 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1697
        regle24 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1698
        regle24 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1689
        regle24 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1690
        regle24 () ;
      break ;
      case LEX_MJAVA.token_non : // 1696
        regle24 () ;
      break ;
      case LEX_MJAVA.token_null : // 1682
        regle24 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1658
        regle24 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1677
        regle24 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1660
        regle25 () ;
      break ;
      case LEX_MJAVA.token_si : // 1668
        regle26 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1676
        regle29 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 1670
        regle30 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
