package com.neolians.website.functions.pages;

import com.neolians.website.functions.general.Errors;
import com.neolians.website.repository.general.PageErrors;
import com.neolians.website.repository.pages.PageAcademy;
import com.neolians.website.repository.pages.PageEditeur;
import com.neolians.website.repository.pages.PageHome;
import com.neolians.website.repository.pages.PageSiteABC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import java.awt.*;

import static com.neolians.common.utils.selenium.Driver.getCurrentUrl;

public class SiteABC {

    private SiteABC() {
        throw new IllegalStateException("Utility class");
    }
    // verif url de site abc  est  juste

    public static void VerifySiteABC() {
        //PageSiteABC.LogoABCsite.assertPresent();
       String url2=getCurrentUrl();
        String url1=PageSiteABC.url.toString();
        System.out.println("Mohsen  this site is : "+url1);
        System.out.println("Mohsen  this site is : "+url2);
        if(url2==url1){

            PageSiteABC.LogoABCsite.assertNotPresent();
            Errors.checkNoErrors();
        }
        else {
            PageSiteABC.LogoABCsite.assertPresent();
        }

       // String myURL= WebDriver.Navigation.class.getName();
        //System.out.println(myURL);
        // GetcurrentUrl
        //String currenturl=driver.getCurrentUrl();
       // System.out.println("CurrentUrl() donne :  "+currenturl);



    }
}
