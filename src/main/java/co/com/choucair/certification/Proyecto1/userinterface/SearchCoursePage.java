package co.com.choucair.certification.Proyecto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    /*Cambie el id del ejercicio puesto que con el que se da en la guia no puedo visualizar los nombres de los cursos (Mensaje del portal "Usted no tiene permiso para ver esta lista de cursos.") (id original id="universidad") */
    public static final Target ACCES_LIST = Target.the("CLICK to search the course").located(By.xpath("//div[@id = 'certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Search the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search").located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    /*El title del curso en busqueda no se visualiza en la pantalla y no es posible terminar el test (Err:Expected enabled element was not enabled)*/
    public static final Target SELECT_COURSE = Target.the("another click to search").located(By.xpath("//h4[contains(text(),'Prueba Técnica - Analista Bancolombia)]"));
    public static final Target NAME_COURSE = Target.the("Name Course").located(By.xpath("//h4[contains(text(),'Prueba Técnica - Analista Bancolombia)]"));

}
