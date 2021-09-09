public class CadastroDeLembretes {
    private Lembrete[] listaDeLembretes;
    private int numeroDeLembretes;

    CadastroDeLembretes() {
        this.listaDeLembretes = new Lembrete[10];
        numeroDeLembretes = 0;
    }

    public void imprimir() {
        int i;
        for (i = 0; i < numeroDeLembretes; i++) {
            listaDeLembretes[i].imprimir();
        }
    }
    public boolean incluir(Lembrete c) {
        if (numeroDeLembretes < listaDeLembretes.length) {
            listaDeLembretes[numeroDeLembretes++] = c;
            return true;
        }
        return false;
    }
}
