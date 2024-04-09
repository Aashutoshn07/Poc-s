public class HdfcBank extends GenericBank implements WithdrawContract, DepositContract{
    public void welcome(){
        System.out.println("Welcome to the HDFC Bank!");
    }
    public void run(){
        System.out.println("run");
    }
}