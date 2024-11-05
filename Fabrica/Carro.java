package Fabrica;

public class Carro {
    private int velocimetro = 0;
    private Motor motor = new Motor();
    private final String marca;
    private final String modelo;
    private final int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        if(motor.getIgnicao() == true) {
            System.out.println("O motor já está ligado!");
        } else {
            System.out.println("Carro ligado");
            motor.setIgnicao(true);
        }
    }

    public void desligar() {
        if(motor.getIgnicao() == false) {
            System.out.println("O motor já está desligado!");
        } else{
            System.out.println("Carro desligado");
            motor.setIgnicao(false);
        }
    }

    public void acelerar() {
        if(motor.getIgnicao() == false) {
            System.out.println("Ligue o carro para acelerar");

        } else if (getVelocimetro() >= 100) {
            System.out.println("Não é possível acelerar mais!");

        } else {
            setVelocimetro(20);
            System.out.println("Acelerando! " + getVelocimetro() + "Km/h");
        }
    }

    public void setVelocimetro(int velocidade) {
        this.velocimetro += velocidade;
    }

    public int getVelocimetro() {
        return this.velocimetro;
    }

    public Object getMotor() {
        return this.motor;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

}