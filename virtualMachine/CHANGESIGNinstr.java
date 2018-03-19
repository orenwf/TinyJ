package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class CHANGESIGNinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
      /* COMPLETE */
      EXPRSTACK[ESP-1] = -EXPRSTACK[ESP-1];
  }

  public CHANGESIGNinstr ()
  {
    super("CHANGESIGN");
  }
}

