package it.borgosesiaspa.model.enums;

public enum Periodicita {
    MENSILE,
    BIMESTRALE,
    TRIMESTRALE,
    QUADRIMESTRALE,
    SEMESTRALE,
    ANNUALE,
    UNA_TANTUM;

    public int getNumeroRateAnnue() {
        switch (this) {
            case MENSILE:
                return 12;
            case BIMESTRALE:
                return 6;
            case TRIMESTRALE:
                return 4;
            case QUADRIMESTRALE:
                return 3;
            case SEMESTRALE:
                return 2;
            case ANNUALE:
                return 1;
            case UNA_TANTUM:
                return 1;
            default:
                throw new IllegalStateException();
        }
    }
}