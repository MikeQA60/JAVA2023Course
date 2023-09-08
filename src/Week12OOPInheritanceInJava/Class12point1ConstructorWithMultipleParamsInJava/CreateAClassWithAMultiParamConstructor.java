package Week12OOPInheritanceInJava.Class12point1ConstructorWithMultipleParamsInJava;

public class CreateAClassWithAMultiParamConstructor {
    class Investment {

        public String InvestmentId;
        public String InvestmentName;
        public double initialInvestment;
        public double currentValue;
        public boolean isProfitable;

        public Investment(){


        }

        public Investment(String InvestmentId, String InvestmentName, double initialInvestment, double currentValue, boolean isProfitable) {
            this.InvestmentId = InvestmentId;
            this.InvestmentName = InvestmentName;
            this.initialInvestment = initialInvestment;
            this.currentValue = currentValue;
            this.isProfitable = isProfitable;
        }

    }
}



