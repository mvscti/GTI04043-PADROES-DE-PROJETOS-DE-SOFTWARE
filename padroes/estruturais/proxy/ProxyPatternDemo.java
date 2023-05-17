package padroes.estruturais.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args){
        String filename="image.jpg";
        Image image = new ProxyImage(filename);  
        image.display();  
        image.display();  
    }
}
