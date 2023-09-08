package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point4PolymorphismAtMethodParameter;

public class PolyMorphismAtMethodParamVideo {
    public static void main(String[] args) {

       // Chrome chrome = new Chrome();
       // Browser chrome = new Safari();

        Browser obj = new Safari();
        openWebsiteFromAnyBrowser(obj, "google.com");

    }

    //I want to be able to openWebsite from any browser
    public static void openWebsiteFromAnyBrowser(Browser browser, String url) {
        browser.openWebsite(url);
    }
}

//create a program that will dynamically create browsers
//i have chrome and safari browser
//All browser should have common methods like
//openWebsite(String url) --> opening website in chrome/ safari


//Chrome should have clearCache()

//Safari should have privateBrowsing()

class Browser {
    public void openWebsite(String url){
        System.out.println("Opening Website in a generic Browser");
    }
}

class Chrome extends Browser {
    @Override
    public void openWebsite(String url) {
        System.out.println("Opening Website in a Chrome Browser");
    }

    public void clearCache() {
        System.out.println("Clearing cache in Chrome Browser");
    }
}
class Safari extends Browser {
    @Override
    public void openWebsite(String url) {
        System.out.println("Opening Website in a Safari Browser");

    }

    public void privateBrowsing(){
        System.out.println("PrivatelyBrowsing in Safari");
    }
}