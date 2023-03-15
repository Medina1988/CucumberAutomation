package utilities;

import java.util.Set;

public class Window {
    private static String mainHandle;
    public static void switchToSecondWindow(){
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        mainHandle =Driver.getDriver().getWindowHandle();
        if(windowHandles.size()<2){
            System.out.println("No multiple windows found");

        }else{
            for(String windowID:windowHandles){
                if(!windowID.equals(mainHandle)){
                    Driver.getDriver().switchTo().window(windowID);
                }
            }
        }
    }
}
