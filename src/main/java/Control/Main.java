/*
 *  Author: Saw Khoo Zi Chong
 *  ID: 2307609
 * */


package Control;

import Boundary.MainUI;
import Utilities.GeneralFunction;

import static Utilities.Message.*;

public class Main {
    public static void main(String[] args) {
        GeneralFunction.clearScreen();

        MainUI.printLogo();

        EventHandler.updateEventStatus();

        while (true){
            MainUI.printMainMenu();

            int action = 0;

            while (true){
                try{
                    action = Integer.parseInt(MainUI.getInput("Enter action: "));
                } catch (NumberFormatException e) {
                    displayGeneralErrorMsg("Invalid input. Please try again.");
                    continue;
                }

                if (action < 1 || action > 6){
                    displayGeneralErrorMsg("Invalid input. Please try again.");
                }else{
                    break;
                }
            }

            switch (action) {
                case 1:
                    DonorFunctions.runDonorSystem();
                    break;
                case 2:
                    DoneeFunctions.doneeHandler();
                    break;
                case 3:
                    new Donation().donationHome();
                    break;
                case 4:
                        VolunteerFunctions.runVolunteerSystem();
                    break;
                case 5:
                    EventHandler.subsystemMenu();
                    break;
                case 6:
                    GeneralFunction.clearScreen();

                    MainUI.randomPicture();

                    return;
            }

            GeneralFunction.clearScreen();
        }
    }
}