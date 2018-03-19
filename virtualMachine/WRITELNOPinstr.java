package TJasn.virtualMachine;

public class WRITELNOPinstr extends ZeroOperandInstruction {

  void execute ()
  {
      /* COMPLETE */
      System.out.println();
  }

  public WRITELNOPinstr ()
  {
    super("WRITELNOP");
  }
}
