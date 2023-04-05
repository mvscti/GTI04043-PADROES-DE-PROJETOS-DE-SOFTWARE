package padroes.criacao.prototype;
import java.util.List;
import java.util.ArrayList;

public class PrototypeFactory {
    // 2. "registro" de objetos protótipos
    private static List<Prototype> prototypes = new ArrayList<>();

    // Adiciona um recurso para o atributo Prototype
    public static void addPrototype(Prototype p) {
        prototypes.add(p);
    }

    public static Prototype createPrototype(String name) {
        // 4. O "construtor virtual"
        for (Prototype p : prototypes) {
            if (p.getNome().equals(name)) {
                return p.clone();
            }
        }
        System.out.println(name + ": não existe");
        return null;
    }    
}
