package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {

		RedesController redeControl = new RedesController();

		String os = System.getProperty("os.name");
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Sistema Operacional: " + os
					+ " \n 1 - Adaptadores de Ethernet e IPv4 \n 2 - Tempo de Ping médio  \n 9 - Encerrar"));
			switch (opc) {
			case 1:
				redeControl.ip(os);
				break;
			case 2:
				redeControl.ping(os);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}

	}

}
