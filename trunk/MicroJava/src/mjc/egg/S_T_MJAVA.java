package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_T_MJAVA {
LEX_MJAVA scanner;
  S_T_MJAVA() {
    }
  S_T_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle49() throws Exception {

    //declaration
    S_F_MJAVA x_2 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_3 = new S_TX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle49 () ;
  }
  }
