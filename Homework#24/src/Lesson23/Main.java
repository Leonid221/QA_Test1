package Lesson23;

public class Main {


    public void identifyElement(IElement element){
        element.getElementName();
    }

    public static void main(String[] args){
        River river = new River();
        Wind wind = new Wind();

        Main main = new Main();
        main.identifyElement(wind);
        main.identifyElement(river);
    }
}
