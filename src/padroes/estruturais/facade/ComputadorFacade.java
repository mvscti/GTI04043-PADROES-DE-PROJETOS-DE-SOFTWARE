package padroes.estruturais.facade;

public class ComputadorFacade {
    private Cpu cpu = null;
    private Memoria memoria = null;
    private HardDrive hardDrive = null;
 
    public ComputadorFacade(Cpu cpu, Memoria memoria, HardDrive hardDrive) {
       this.cpu = cpu;
       this.memoria = memoria;
       this.hardDrive = hardDrive;
    }
 
    public void ligarComputador() {
       cpu.start();
       String data=hardDrive.read(0, 512);
       memoria.load(0, data);
       cpu.execute();
       memoria.free(0,data);
    }
}
