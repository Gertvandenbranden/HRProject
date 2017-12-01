package be.vdab.training.enums;

public enum DriversLicence {

    NONE("The worker has no driverslicence."),
    A("The worker has a driverslicence of the type A"),
    B("The worker has a driverslicence of the type B"),
    C("The worker has a driverslicence of the type C"),
    D("The worker has a driverslicence of the type D"),
    E("The worker has a driverslicence of the type E");

    private String driverslicence;

    DriversLicence(String driverslicence) {
        this.driverslicence=driverslicence;
    }



}
