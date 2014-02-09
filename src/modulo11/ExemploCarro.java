package modulo11;

public class ExemploCarro implements Comparable<ExemploCarro> {

	private int chassi;
	private String marca;
	private String fabricante;
	private String dtFabricacao;

	/**
	 * @return the chassi
	 */
	public int getChassi() {
		return chassi;
	}

	/**
	 * @param chassi
	 *            the chassi to set
	 */
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 *            the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante
	 *            the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the dtFabricacao
	 */
	public String getDtFabricacao() {
		return dtFabricacao;
	}

	/**
	 * @param dtFabricacao
	 *            the dtFabricacao to set
	 */
	public void setDtFabricacao(String dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}

	@Override
	public int compareTo(ExemploCarro outroCarro) {
		int outroValor = Integer.valueOf(outroCarro.getChassi());
		if (getChassi() > outroValor) {
			return 1;
		} else {
			if (getChassi() < outroValor) {
				return -1;
			}
		}
		return 0;
	}

}
