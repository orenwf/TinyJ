package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class INITSTKFRMinstr extends OneOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
     /* COMPLETE */
      TJ.data[ASP++ - POINTERTAG] = FP;
      FP = ASP-1;
      ASP += operand;
  }

  public INITSTKFRMinstr (int locationsNeededForLocalVars)
  {
    super(locationsNeededForLocalVars, "INITSTKFRM");
  }
}

