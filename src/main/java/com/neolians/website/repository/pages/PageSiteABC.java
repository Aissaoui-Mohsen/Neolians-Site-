package com.neolians.website.repository.pages;

import com.neolians.common.utils.selenium.elements.ButtonElement;
import com.neolians.common.utils.selenium.elements.UrlElement;
import org.openqa.selenium.By;

public class PageSiteABC {


    private PageSiteABC()
    {throw new IllegalStateException("Utility class"); }

    public static final UrlElement url=new UrlElement("abc site url","https://www.ab-consulting.cohjhjhj/");
   // public static final ButtonElement LogoABCsite = new ButtonElement("logoABCsite",
          //  By.xpath("//div[@id='151044535']"));//  se  termine  par  7  xpath

    public static final ButtonElement LogoABCsite = new ButtonElement("Fatal Error",
            By.xpath("//div[@id=\"moh90P\"]"));








}
