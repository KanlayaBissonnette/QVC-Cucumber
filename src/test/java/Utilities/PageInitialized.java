package Utilities;


import Pages.DressesPage;
import Pages.HeaderPage;

public class PageInitialized extends Driver{

    protected static HeaderPage header;
    protected static DressesPage dresses;

    public static void init() {
        header = new HeaderPage();
        dresses = new DressesPage();
    }



}



