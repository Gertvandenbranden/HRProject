package be.vdab.training.domains;

public class Mobile extends Remuneration {

    protected int mobile;
    protected String msisdn;

    public Mobile(int mobile, String msisdn, Long cost) {
        this.mobile = mobile;
        this.msisdn = msisdn;
        this.cost = cost;}


    public String validateMsisdn (){
        String myMsidsn=msisdn.toString();

       if(myMsidsn.length()!=10|| myMsidsn.charAt(0)!=0)
        System.out.println("This msisdn-number is not valid");
        else;
        return msisdn;
    }


}
