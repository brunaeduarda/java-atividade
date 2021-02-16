package exercicio4mod;

public class Fruta {
	private int caroco;
	private boolean casca;
	private String nome;

	public Fruta(String nome, boolean casca, int caroco){
		this.nome=nome;
		this.casca=casca;
		this.caroco=caroco;
	}
	
	public boolean getCasca() {	return casca;}
	public void setCasca(boolean casca) {this.casca = casca;}
	public int getCaroco() {return caroco;}
	public void setCaroco(int caroco) {	this.caroco = caroco;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;	}
	
	
}

