package week1.Class3point7;

//excercise 2

/*
Some facts about the brain development

The human brain contains approximately 100 billion neurons and trillions of connections between neurons called synapses.

The brain can generate up to 23 watts of electrical power, enough to power a small light bulb.

The average human brain weighs about 1.5 kg, making up 2% of the body weight.

Infants are born with about 250 billion brain cells, which will increase to about 1,000 billion by age 3.

Write a program that stores all measurable information in variables with the most suitable data types and prints them out with a description.

_____ numberOfNeurons               =  ____;
____  wattsOfElectricalPower        =  ____;
____  brainWeight                   =  ____;
____  infantBrainCellsAtBirth       =  ____;


The expected output:

The human brain contains approximately 100000000000 neurons

The brain can generate up to 23 watts of electrical power

The average human brain weighs about 1.5 kg

Infants are born with about 250000000000 brain cells

 */
public class SomefactAboutBrainDevelopment {
    public static void main(String[] args) {
       long  numberOfNeurons               =  100000000000l;
        byte  wattsOfElectricalPower        =  23;
        float  brainWeight                   =  1.5f;
        long  infantBrainCellsAtBirth       =  250000000000l;

        System.out.println("The human brain contains approximately "+numberOfNeurons+" neurons");
        System.out.println("The brain can generate up to "+wattsOfElectricalPower+" watts of electrical power");
        System.out.println("The average human brain weighs about "+brainWeight+" kg");
        System.out.println("Infants are born with about "+infantBrainCellsAtBirth+" brain cells");
    }
}
