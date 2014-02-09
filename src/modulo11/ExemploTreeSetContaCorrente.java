package modulo11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploTreeSetContaCorrente {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new ExemploTreeSetContaCorrente().processar();

	}

	private void processar() {
		// Criando objeto c que representa um conjunto ordenado.
		SortedSet<ContaCorrenteComparable> c = new TreeSet<ContaCorrenteComparable>();
		/* Criando uma referência chamada cc para classe ContaCorrenteComparable. Se o novo objeto criado tiver um valor de conta igual a um objeto 
		 * já existente no conjunto, esse objeto não ser´a inserido. Isto é garantido pelos métodos equals() e hashCode(). */
		ContaCorrenteComparable cc = null;
		cc = new ContaCorrenteComparable();
		cc.setAgencia(1996);
		cc.setConta(9765431);
		cc.setNome("Pedro Mendes");
		cc.setSaldo(1000.0);
		/* Ao adicionar o objeto o metodo compareTo() será executado e seu retorno definirá a posição que o novo objeto será inserido. */
		c.add(cc);
		cc = new ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(1367931);
		cc.setNome("Álvaro de Araújo Junior");
		cc.setSaldo(5500.0);
		c.add(cc);
		cc = new ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(7678431);
		cc.setNome("Celso Norbertho");
		cc.setSaldo(7500.0);
		c.add(cc);
		imprimir(c);
		
	}

	private void imprimir(Collection<ContaCorrenteComparable> set) {
		Iterator<ContaCorrenteComparable> it = set.iterator();
		System.out.println("Imprimindo um a um ordenados pela conta.");
		NumberFormat formatarString, formatarValor;
		formatarString = new DecimalFormat("0000");
		formatarValor = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formatarValor.setMinimumFractionDigits(2);
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("*************************************");
			System.out.println("Agência: \t" + formatarString.format(((ContaCorrenteComparable) val).getAgencia()));
			System.out.println("Conta: \t\t" + formatarString.format(((ContaCorrenteComparable) val).getConta()));
			System.out.println("Nome: \t\t" + ((ContaCorrenteComparable) val).getNome());
			System.out.println("Saldo: \t\t" + formatarValor.format(((ContaCorrenteComparable) val).getSaldo()));
		}
		
	}

}
