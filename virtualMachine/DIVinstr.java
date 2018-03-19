package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class DIVinstr extends ZeroOperandInstruction {

  void execute ()
  {
      /* COMPLETE */
      EXPRSTACK[--ESP-1] /= EXPRSTACK[ESP];
  }

  public DIVinstr ()
  {
    super("DIV");
  }
}
