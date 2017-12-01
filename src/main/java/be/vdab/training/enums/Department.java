package be.vdab.training.enums;

public enum Department {
    SALES("Those who sell our goods."),
    PURCHASE("Those who buy our goods."),
    ACCOUNTING("Those who account."),
    PRODUCTION("Those who make our goods."),
    ADMINISTRATION("Those who do the administration."),
    GENERAL("All the others.");

    String description="";

    private Department(String description){
        this.description=description;
    }

}
