package padroes.criacao.prototype;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] opcoes={"AlphaVersion","BetaVersion"};
        if (opcoes.length > 0) {
            initializePrototypes();
            List<Prototype> prototypes = new ArrayList<>();
            // 6. Client does not use "new"
            for (String protoName : args) {
                Prototype prototype = PrototypeFactory.createPrototype(protoName);
                if (prototype != null) {
                    prototypes.add(prototype);
                }
            }
            for (Prototype p : prototypes) {
                p.executa();
            }
        } else {
            System.out.println("Informe os nomes dos protótipos");
        }
    }

    // 3. Populate the "registry"
    public static void initializePrototypes() {
        PrototypeFactory.addPrototype(new PrototypeAlpha());
        PrototypeFactory.addPrototype(new PrototypeBeta());
        PrototypeFactory.addPrototype(new ReleasePrototype());
    }
    
}
