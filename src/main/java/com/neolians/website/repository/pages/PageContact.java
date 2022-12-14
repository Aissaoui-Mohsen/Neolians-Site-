package com.neolians.website.repository.pages;

import com.neolians.common.utils.selenium.elements.BlockElement;
import com.neolians.common.utils.selenium.elements.ButtonElement;
import com.neolians.common.utils.selenium.elements.UrlElement;
import org.openqa.selenium.By;

public class PageContact {private PageContact()

{throw new IllegalStateException("Utility class");}

    public static final UrlElement url = new UrlElement("Contact url", "/contact-2/");

    public static final BlockElement paragraphe1=new BlockElement("paragraphe 1", By.xpath("//div[@data-id='1da4de28']"));
    public static final BlockElement paragraphe2=new BlockElement("paragraphe 2", By.xpath("//div[@data-id='2fe64c9f']"));
    public static final BlockElement textNom=new BlockElement("Nom Complet", By.xpath("//input[@id='wpforms-22-field_0']"));
    public static final BlockElement textEmail=new BlockElement("Email", By.xpath("//input[@id='wpforms-22-field_1']"));
    public static final BlockElement textSujet=new BlockElement("Sujet", By.xpath("//input[@id='wpforms-22-field_3']"));
    public static final BlockElement textMessage=new BlockElement("Comment or Message", By.xpath("//textarea[@id='wpforms-22-field_2']"));
    public static final ButtonElement img3=new ButtonElement("Button Send Message", By.xpath("//button[@id='wpforms-submit-22']"));



}
