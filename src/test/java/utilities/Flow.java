package utilities;

import org.openqa.selenium.interactions.Actions;

public class Flow {
    public static void wait(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        }catch (InterruptedException e){
            System.out.println("Interruption happened");
        }
    }

    public static void scrollDown(int i){
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0,200).perform();

    }
    public static void scrollUp(){
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0,-200).perform();

    }
}
