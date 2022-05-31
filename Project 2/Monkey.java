public class Monkey extends RescueAnimal {
    
    // Instance Variable
    private String species;
    private String height;
    private String bodyLength;

    //Constructor
    public Monkey(String name, String species, String height, String tailLength, String bodyLength, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry){

        setName(name);
        setSpecies(species);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    //Accessor Method
    public String getSpecies(){return species;}
    public String getHeight(){return height;}
    public String getBodyLength(){return bodyLength;}

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    public void setHeight(String heightIn){
         height = heightIn;
    }

    public void setBodyLength(String length){
        bodyLength = length;
    }

}
