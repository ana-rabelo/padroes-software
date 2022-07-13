package Composite.SistemaArquivo;

import java.io.File;
import java.io.IOException;

public class Arquivo implements Elemento {

    private File file;

    public Arquivo(File file) {
        this.file = file;
    }

    @Override
    public long tamanho() {
        return this.file.length();
    }
}
