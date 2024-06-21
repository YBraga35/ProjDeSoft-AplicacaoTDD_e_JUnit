package src.main.java;
public class Calculadora {
    private Memoria memoria;

    public Calculadora(Memoria memoria) {
        this.memoria = memoria;
    }

    public float soma() {
        return memoria.getValorA() + memoria.getValorB();
    }

    public float subtrai() {
        return memoria.getValorA() - memoria.getValorB();
    }

    public float multiplica() {
        return memoria.getValorA() * memoria.getValorB();
    }

    public float divide() {
        if (memoria.getValorB() == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return memoria.getValorA() / memoria.getValorB();
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }
}
