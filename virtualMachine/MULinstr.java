package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
import TJasn.TJ;

public class MULinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
      /* COMPLETE */
      EXPRSTACK[--ESP-1] *= EXPRSTACK[ESP];
  }

  public MULinstr ()
  {
    super("MUL");
  }
}

