package escalonador.visao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import escalonador.visao.paineis.PainelCriacaoProcesso;

public class Janela extends JFrame {
	
	private static final long serialVersionUID = 6259000253167182868L;

	public Janela() {
		super("Simulador de Escalonador de Processos");
		setSize(640, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initComponents();
		addEvents();
		
		setVisible(true);
	}
	
	private void initComponents() {
		setJMenuBar(new JMenuBar());
		
		getJMenuBar().add(new JMenu("Arquivo"));
		getJMenuBar().add(new JMenu("Ajuda"));
		
		getJMenuBar().getMenu(0).add(new JMenuItem("Sair"));
		getJMenuBar().getMenu(1).add(new JMenuItem("Sobre"));
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(new PainelCriacaoProcesso(this));
		add(new PainelCriacaoProcesso(this));
	}
	
	private void addEvents() {
		getJMenuBar().getMenu(0).getItem(0).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		getJMenuBar().getMenu(1).getItem(0).addActionListener(new ActionListener() {
			static final String mensagem = "Desenvolvido por: \nJardel Rodrigues <jardel.ifce@gmail.com> \nSaulo Freitas <saulo.ifet@gmail.com>";
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, mensagem, "Sobre", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}	
}