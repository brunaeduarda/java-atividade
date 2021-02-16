package exercicio4mod;

public class Aplicacao {

	public static void retirarCaroco(Fruta fruta){
		int quantCaroco=fruta.getCaroco();
		if (quantCaroco>0){
			while (quantCaroco>0)
				fruta.setCaroco(quantCaroco--);
		}
	}
	
	public static void retirarCasca(Fruta fruta){
		if (fruta.getCasca()){
			fruta.setCasca(false);
		}
	} 

	public static void comerFruta(Fruta fruta){
		retirarCasca(fruta);
		retirarCaroco(fruta);
		System.out.println("Fruta " + fruta.getNome() + " comida com sucesso!");
	}
	public static void main(String[] args) {
		Fruta f1 = new Fruta("banana", true, 0);
		Fruta f2 = new Fruta("melancia", true, 1000);
		
		comerFruta(f2);
	}
}
