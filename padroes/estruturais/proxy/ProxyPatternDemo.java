package padroes.estruturais.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args){
        String filename="";
        Image image = new ProxyImage(filename);  
        image.display();  
        System.out.println("");  
        image.display();  
    }
}
