package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class JUMPinstr extends OneOperandInstruction {

  void execute ()
  {
    /* COMPLETE */
      PC = operand;
  }

  public JUMPinstr (int address)
  {
    super(address, "JUMP");
  }
}

