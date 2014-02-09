package modulo11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ExemploArrayListContaCorrente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<ContaCorrenteComparable> c = new ArrayList<ContaCorrenteComparable>();
		ContaCorrenteComparable cc = null;
		cc = new ContaCorrenteComparable();
		cc.setAgencia(1996);
		cc.setConta(9765431);
		cc.setNome("Douglas Rocha Mendes");
		cc.setSaldo(1000.0);
		c.add(cc);
		cc = new ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(1367931);
		cc.setNome("Carlos Iran Alves");
		cc.setSaldo(5500.0);
		c.add(cc);
		cc = new ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(7678431);
		cc.setNome("Lian Iwersen Antues");
		cc.setSaldo(7500.0);
		c.add(cc);
		cc = new ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(1367931);
		cc.setNome("Carlos Iran Alves");
		cc.setSaldo(5500.0);
		c.add(cc);
		// Realizando a ordenação dos objetos
		Collections.sort(c);
		imprimir(c);

	}

	private static void imprimir(Collection<ContaCorrenteComparable> list) {
		Iterator<ContaCorrenteComparable> it = list.iterator();
		System.out.println("Imprimindo os objetos um a um ordenados pelo número da conta.");
		NumberFormat formatarString, formatarValor;
		formatarString = new DecimalFormat("0000");
		formatarValor = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formatarValor.setMinimumFractionDigits(2);
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("************************************************");
			System.out.println("Agência: " + formatarString.format(((ContaCorrenteComparable) val).getAgencia()));
			System.out.println("Conta: " + formatarString.format(((ContaCorrenteComparable) val).getConta()));
			System.out.println("Nome: " + ((ContaCorrenteComparable) val).getNome());
			System.out.println("Saldo: " + formatarValor.format(((ContaCorrenteComparable) val).getSaldo()));
		}
				
	}

}
