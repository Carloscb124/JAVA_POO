package ex2;

public class Carro {
    // Atributos do Carro
    private boolean ligado;
    private int marcha; // 0 a 6
    private int velocidade; // 0 a 120 km/h
    private String direcao; // "esquerda" ou "direita"

    // Construtor do Carro
    public Carro() {
        this.ligado = false;
        this.marcha = 0; // pnto morto
        this.velocidade = 0; // velociadade inicial
        this.direcao = "nenhuma"; // direção inicial
    }

    // Métodos do Carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado. Pronto para uso.");
        }  else {
            System.out.println("Carro já está ligado.");
        }  
    }

    public void desligar () {
        if(ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado. ");
        } else if(!ligado) {
            System.out.println("Carro já está desligado. ");
        } else {
            System.out.println("Carro não pode ser desligado. Verifique se está em ponto morto e com velocidade 0.");
        }
    }

   // Acelera +10 km/h e troca marcha automaticamente
    public void acelerar() {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Coloque uma marcha para acelerar.");
            return;
        }

        if (velocidade + 10 > 120) {
            System.out.println("Velocidade máxima atingida (120 km/h).");
            return;
        }

        velocidade += 10;

    // Verifica se a velocidade está no limite da marcha atual
    boolean podeAcelerar = false;
    switch (marcha) {
        case 1: podeAcelerar = (velocidade < 20); break;
        case 2: podeAcelerar = (velocidade < 40); break;
        case 3: podeAcelerar = (velocidade < 60); break;
        case 4: podeAcelerar = (velocidade < 80); break;
        case 5: podeAcelerar = (velocidade < 100); break;
        case 6: podeAcelerar = (velocidade < 120); break;
    }

    if (podeAcelerar) {
        velocidade++;
        System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
    } else {
        System.out.println("Velocidade máxima atingida para a marcha " + marcha + ".");
    }
}

    // Freia -10 km/h e troca marcha automaticamente
    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro.");
            return;
        }

        if (velocidade - 10 < 0) {
            System.out.println("O carro já está parado (0 km/h).");
            return;
        }

        velocidade -= 10;
    }

    public void virar(String direcao) {
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            this.direcao = direcao;
            System.out.println("Virando para " + direcao + ".");
        } else if (!ligado) {
            System.out.println("Carro desligado. Não é possível virar.");
        } else {
            System.out.println("Velocidade insuficiente para virar. Deve estar entre 1 km/h e 40 km/h.");
        }
    }
   
    public void trocarMarcha(int novaMarcha) {
    if (!ligado) {
        System.out.println("Carro desligado. Não é possível trocar a marcha.");
        return;
    }

    if (novaMarcha < 0 || novaMarcha > 6) {
        System.out.println("Marcha inválida. Deve ser entre 0 e 6.");
        return;
    }

    // Verifica se a velocidade está dentro do limite da nova marcha
    boolean trocaValida = false;
    switch (novaMarcha) {
        case 0: trocaValida = (velocidade == 0); break;
        case 1: trocaValida = (velocidade >= 0 && velocidade <= 20); break;
        case 2: trocaValida = (velocidade >= 21 && velocidade <= 40); break;
        case 3: trocaValida = (velocidade >= 41 && velocidade <= 60); break;
        case 4: trocaValida = (velocidade >= 61 && velocidade <= 80); break;
        case 5: trocaValida = (velocidade >= 81 && velocidade <= 100); break;
        case 6: trocaValida = (velocidade >= 101 && velocidade <= 120); break;
    }

    if (!trocaValida) {
        System.out.println("Velocidade fora do limite para a marcha " + novaMarcha + ".");
        return;
    }

    // Verifica se está trocando apenas uma marcha por vez
    if (Math.abs(novaMarcha - marcha) > 1) {
        System.out.println("Não é possível pular marchas. Marcha atual: " + marcha);
        return;
    }

    marcha = novaMarcha;
    System.out.println("Marcha trocada para: " + marcha);
}

    

    public int verificarVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getMarcha() {
        return marcha;
    }   

    public String getDirecao() {
        return direcao;
    }

}
