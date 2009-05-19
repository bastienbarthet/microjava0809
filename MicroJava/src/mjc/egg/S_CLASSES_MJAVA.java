package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_CLASSES_MJAVA {
LEX_MJAVA scanner;
  S_CLASSES_MJAVA() {
    }
  S_CLASSES_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle1() throws Exception {

    //declaration
    //appel
  }
  private void regle2() throws Exception {

    //declaration
    S_DEFCLASSE_MJAVA x_2 = new S_DEFCLASSE_MJAVA(scanner) ;
    S_CLASSES_MJAVA x_3 = new S_CLASSES_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.EOF :
        regle1 () ;
      break ;
      case LEX_MJAVA.token_classe : // 1674
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
