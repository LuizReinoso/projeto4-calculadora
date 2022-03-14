package br.com.bruno.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

		public void valorAlterado(String novoValor);
}
