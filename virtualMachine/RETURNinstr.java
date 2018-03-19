package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class RETURNinstr extends OneOperandInstruction {

  void execute ()
  {
    /* COMPLETE */
      ASP = FP +1;
      FP = TJ.data[--ASP - POINTERTAG];
      PC = TJ.data[--ASP - POINTERTAG];
      ASP -= operand;
  }

  public RETURNinstr (int operand)
  {
    super(operand, "RETURN");
  }
}

