public class ElectircityBill {
    private String consumerNo;
    private String consumerName;
    private int pmr;
    private int cmr;
    private String ebc;
    private int totalUnits;
    private int thisMonthcmr;

    public ElectircityBill(String consumerNo, String consumerName, int pmr, int cmr, String ebc) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.pmr = pmr;
        this.cmr = cmr;
        this.ebc = ebc;
        thisMonthcmr = cmr - pmr;
    }

    public int getThisMonthcmr() {
        return thisMonthcmr;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = pmr + cmr;
        this.totalUnits = totalUnits;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    @Override
    public String toString() {
        return "ElectircityBill [consumerNo=" + consumerNo + ", consumerName=" + consumerName + ", pmr=" + pmr
                + ", cmr=" + cmr + ", ebc=" + ebc + "]";
    }

    public int getPmr() {
        return pmr;
    }

    public int getCmr() {
        return cmr;
    }

    public String getEbc() {
        return ebc;
    }

    public float calculateBill() {
        if (ebc.equalsIgnoreCase("Domestic ")) {
            if (thisMonthcmr <= 100) {
                return thisMonthcmr * 1;
            } else if (thisMonthcmr >= 101 && thisMonthcmr <= 200) {
                return thisMonthcmr * 2.50f;
            } else if (thisMonthcmr >= 201 && thisMonthcmr <= 500) {
                return thisMonthcmr * 4;
            } else {
                return thisMonthcmr * 6f;
            }
        } else if (ebc.equalsIgnoreCase("Commercial ")) {
            if (thisMonthcmr <= 100) {
                return thisMonthcmr * 2;
            } else if (thisMonthcmr >= 101 && thisMonthcmr <= 200) {
                return thisMonthcmr * 4.50f;
            } else if (thisMonthcmr >= 201 && thisMonthcmr <= 500) {
                return thisMonthcmr * 6.0f;
            } else {
                return thisMonthcmr * 7f;
            }
        } else {
            System.out.println("Invalid EBC");
            return 0;
        }
    }

}

// Consumer no., consumer name, previous month reading, current month reading,
// type of EB connection(i.e domestic or commercial

// Domestic
// First 100 units - Rs. 1 per unit
// 101-200 units - Rs. 2.50 per unit
// 201 -500 units - Rs. 4 per unit
// > 501 units - Rs. 6 per unit

// commercial

// First 100 units - Rs. 2 per unit
// 101-200 units - Rs. 4.50 per unit
// 201 -500 units - Rs. 6 per unit
// > 501 units - Rs. 7 per unit
