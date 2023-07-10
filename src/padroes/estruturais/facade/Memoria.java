public class Memoria {
   public void load(int position, String info) {
      System.out.println("carrega dados na memória");
   }
   public void free(int position, String info) {
      System.out.println("libera dados da memória");
   }
}

public class HardDrive {
   public void read(int startPosition, int size) {
      System.out.println("lê dados do HD");
   }
   public void write(int position, String info) {
      System.out.println("escreve dados no HD");
   }
}
