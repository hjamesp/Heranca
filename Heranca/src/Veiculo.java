
public class Veiculo {
	
	private String marca;
	private String modelo;
	private String ano;
	
	public void buzinar() {
		System.out.println("BI BI");
	}
	
	public void imprimirDados() {
		System.out.println("Marca" + marca);
		System.out.println("Modelo" + modelo);
		System.out.println("Ano" + ano);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
}
