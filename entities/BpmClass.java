package entities;

import java.util.ArrayList;
import java.util.List;

public class BpmClass {

	private double vFinal;
	private double tempo;
	private double aceleracao;
	private String velocidadeKm;
	private Double num;
	private List<Integer> list = new ArrayList<>();
	private Integer[] tabuada = new Integer[10];

	public BpmClass() {

	}

	public Integer[] getTabuada() {
		return tabuada;
	}

	public void setTabuada(Integer[] tabuada) {
		this.tabuada = tabuada;
	}

	public double getvFinal() {
		return vFinal;
	}

	public void setvFinal(double vFinal) {
		this.vFinal = vFinal;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
	}

	public String getVelocidadeKm() {
		return velocidadeKm;
	}

	public void setVelocidadeKm(String velocidadeKm) {
		this.velocidadeKm = velocidadeKm;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public String finalVelocity(double vInicial, double tempo, double aceleracao) {

		vFinal = (vInicial + tempo * aceleracao) * 3.6;

		if (vFinal <= 40) {
			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Veículo Muito Lento\n";
		} else if (vFinal > 40 && vFinal <= 60) {
			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Velocidade Permitida\n";

		} else if (vFinal > 60 && vFinal <= 80) {
			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Velocidade de Cruzeiro\n";

		} else if (vFinal > 8040 && vFinal <= 120) {
			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Veículo Rápido\n";
		} else if (vFinal > 120) {
			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Veículo Muito Rápido\n";
		}

		return velocidadeKm;
	}

	public void list(int num) {

		for (int i = 1; i <= 10; i++) {

			list.add(num * i);
		}

	}
	
	public void tabuada() {
		
		for (int i = 0; i < tabuada.length; i++) {
			
			tabuada[i] = list.get(i);
		}
		 
	}

}
