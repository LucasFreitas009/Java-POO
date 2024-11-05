package Fabrica;

public class Motor {
    private Boolean ignicao = false;

    public void ligarMotor() {
        setIgnicao(true);
    } 

    public void desligarMotor() {
        setIgnicao(false);
    }

    public void setIgnicao(Boolean status) {
        this.ignicao = status;
    }

    public Boolean getIgnicao () {
        return this.ignicao;
    }

    
}