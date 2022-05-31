import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.*;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // Monkey arrayList added

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input = "-1";

        initializeDogList();
        initializeMonkeyList();
        // Menu loop
        while (!input.equals("1")|| !input.equals("2")|| !input.equals("3")|| !input.equals("4") || !input.equals("5") || !input.equals("6") || !input.equals("q")){
            displayMenu();
            input = scnr.nextLine();

            if(!input.equals("1")|| !input.equals("2")|| !input.equals("3")|| !input.equals("4") || !input.equals("5") || !input.equals("6") || !input.equals("q")){

                switch(input){
                case "1":
                    System.out.println("You have chosen to input a new dog.");
                    intakeNewDog(scnr);
                    continue;
                case "2":
                    System.out.println("You have chosen to input a new monkey.");
                    intakeNewMonkey(scnr);
                    continue;
                case "3":
                    System.out.println("You want to reserve an animal.");
                    reserveAnimal(scnr);
                    continue;
                case "4":
                    System.out.println("Printing all dogs");
                    System.out.println("This option needs to be implemented.");
                    continue;
                case "5":
                    System.out.println("Printing all monkey's");
                    System.out.println("This option needs to be implemented.");
                    continue;
                case "6":
                    System.out.println("Printing all available animals");
                    printAnimals();
                    continue;
                case "q":
                    System.out.println("Quitting. Thanks for using.");
                    break;
                default:
                    System.out.println("Invalid input. Please choose from options below.");
                    continue;
            }
            }
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("q")){
                continue;}

        }


    }

    

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // This method dds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);


    }


    // This method adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Bob", "Capuchin", "5ft", "2", "4ft", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Betsy", "Chimpanzee", "4ft", "1ft", "3ft", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);

    }


    // This method allows the user to input a new dog.
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String sex = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("When was the dog admitted?");
        String acquiDate = scanner.nextLine();
        System.out.println("Where was the dog admitted?");
        String acquiLoc = scanner.nextLine();
        System.out.println("What is the current training status of the dog?");
        String trainStat = scanner.nextLine();
        System.out.println("The dog is reserved (true/false).");
        boolean reserve = scanner.nextBoolean();
        System.out.println("If the dog is reserved, where will/is the dog serving? If the dog is not reserved yet, input N/A.");
        String reserveLoc = scanner.nextLine();
        Dog dog = new Dog (name, breed, sex, age, weight, acquiDate, acquiLoc, trainStat, reserve, reserveLoc);
    }


        // This method allows the user to input a new monkey.
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            String species = "-1";
            do {
                System.out.println("What type of monkey is it?");
                species = scanner.nextLine();
                if(!species.equals("Capuchin") || !species.equals("Guenon") || !species.equals("Macaque")
                        || !species.equals("Marmoset") || !species.equals("Squirrel monkey") || !species.equals("Tamarin")){
                    System.out.println("Error: Please input a valid species.");
                }
            } while(!species.equals("Capuchin") || !species.equals("Guenon") || !species.equals("Macaque")
                    || !species.equals("Marmoset") || !species.equals("Squirrel monkey") || !species.equals("Tamarin"));
            System.out.println("What is the height of the monkey?");
            String height = scanner.nextLine();
            System.out.println("What is the monkey's tail length?");
            String tail = scanner.nextLine();
            System.out.println("What is the body length of the monkey?");
            String body = scanner.nextLine();
            System.out.println("What is its gender?");
            String gender = scanner.nextLine();
            System.out.println("What is its age?");
            String age = scanner.nextLine();
            System.out.println("What is its weight?");
            String weight = scanner.nextLine();
            System.out.println("When was the monkey accepted?");
            String date = scanner.nextLine();
            System.out.println("Where was it accepted?");
            String location = scanner.nextLine();
            System.out.println("What is its current training status?");
            String status = scanner.nextLine();
            System.out.println("True or False the monkey is reserved?");
            boolean reservStat = scanner.nextBoolean();
            System.out.println("What country is the monkey currently/going to serve?");
            String serviceLoc = scanner.nextLine();
            Monkey monkey = new Monkey(name, species, height, tail, body, gender, age, weight, date, location, status, reservStat, serviceLoc);
            monkeyList.add(monkey);
        }

        // This method allows the user to reserve an animal.

        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Is the animal a dog or a monkey?");
            String type = scanner.next();
            String country = "Null";
            System.out.println("What is the name of the animal you would like to reserve?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                for(Dog dog: dogList) {
                    if (monkey.getReserved() == true || dog.getReserved() == true) {
                       while (monkey.getReserved() == true || dog.getReserved() == true){
                           System.out.println("\n\nThis animal is already reserved.\n\n");
                           System.out.println("What is the name of the animal you would like to reserve?");
                           //F
                           name = scanner.nextLine();
                       }
                    }
                    else{
                        System.out.println("What country do you want to reserve this animal in?");
                        //F
                        country = scanner.nextLine();
                    }
                    if(type == "monkey"){
                        monkey.setReserved(true);
                    }
                    else{
                        dog.setReserved(true);
                    }
                }
            }

        }

        public static void printAnimals() {
            Iterator itr = dogList.iterator();
            while(itr.hasNext()){
                Dog dog = (Dog)itr.next();
                if(dog.getTrainingStatus().equals("in service") && dog.getReserved() == false) {
                    System.out.println("Name: " + dog.getName());
                    System.out.println("Place acquired: " + dog.getAcquisitionLocation());
                    System.out.println("Training status: " + dog.getTrainingStatus());
                    System.out.println("Is the dog reserved? " + dog.getReserved());
                }
            }
            Iterator itrtr = monkeyList.iterator();
            while(itrtr.hasNext()){
                Monkey monkey = (Monkey)itrtr.next();
                if(monkey.getTrainingStatus().equals("in service") && monkey.getReserved() == false) {
                    System.out.println("Name: " + monkey.getName());
                    System.out.println("Place acquired: " + monkey.getAcquisitionLocation());
                    System.out.println("Training status: " + monkey.getTrainingStatus());
                    System.out.println("Is the monkey reserved? " + monkey.getReserved());
                }
            }
        }
}

