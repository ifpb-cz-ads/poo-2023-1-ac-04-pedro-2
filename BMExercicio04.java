public class BMExercicio04 {
private String modelo;
private String marca;
private float tensao;
private float preco;
private boolean estado;


public String getModelo(){
    return this.modelo;
}
public void setModelo(String modeloProduto){
    this.modelo = modeloProduto;
}

public String getMarca(){
    return this.marca;
}
public void setMarca(String marcaProduto){
    this.marca = marcaProduto;
}

public float getPreco(){
    return this.preco;
}
public void setPreco(float precoProduto){
    this.preco = precoProduto;
}

public float getTensao(){
    return this.tensao;
}
public void setTensao(float tensaoProduto){
    this.tensao = tensaoProduto;
}

public boolean getEstado(){
    return this.estado;
}
public void setEstado(boolean result){
    this.estado = result;
}
public void ligado(){
    setEstado(true);
}
public void desligado(){
    setEstado(false);
}

public void mostraTeste(){
    if (estado) {
        System.out.println("A lampada esta acesa");
        
    }
    else{
        System.out.println("A Lampada está apagada.");  
    }
}

public void informaDados(){
    System.out.println("A marca da lampada é: " + this.marca);
    System.out.println("O modelo da lampada é:" + this.modelo);
    System.out.println("A tensão da Lampada é: " + this.tensao + " V");
    System.out.println("Preço: " + this.preco);
}


}


class executor {

    public static void main(String[] args) {
        BMExercicio04 up = new BMExercicio04();
        up.setMarca("AVANT");
        up.setModelo("Espiral");
        up.setTensao(112);
        up.setPreco(60);
        up.informaDados();
        up.ligado();
        up.mostraTeste();
        up.desligado();
        up.mostraTeste();

    }
    
}