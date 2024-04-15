import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LotofacilGUI extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Aposta de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Aposta de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou impar");

    public LotofacilGUI(){
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { apostarDe0a100();}
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { apostarDeAaZ();}
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { apostarParouImpar();}
        });
        this.add(painel);
    }

    private void apostarDe0a100(){
        String input =
                JOptionPane.showInputDialog(null, "Digite um número de 0 a 100:");
        int aposta = Integer.parseInt(input);
        if (aposta < 0 || aposta > 100){
            JOptionPane.showMessageDialog(null, "Aposta inválida.");
            return;
        }
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);
        if (aposta == numeroSorteado){
            JOptionPane.showMessageDialog(null, "Você ganhou R$ 1000,00 reais.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + numeroSorteado + ".");
        }
    }

    private void apostarDeAaZ(){
        String input =
                JOptionPane.showInputDialog(null, "Digite uma letra de A a Z:");
        char aposta = Character.toUpperCase(input.charAt(0));
        if (!Character.isLetter(aposta)) {
            JOptionPane.showMessageDialog(null, "Aposta inválida.");
            return;
        }
        char letraPremiada = 'C';
        if(aposta == letraPremiada){
            JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00 reais");
        }
        else {
            JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi " + letraPremiada + ".");
        }
    }

    private void apostarParouImpar(){
        String input = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
        int numero = Integer.parseInt(input);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00 reais.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Que pena! O número digitado é impar e a premiação foi para números pares.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LotofacilGUI janela = new LotofacilGUI();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
        });
    }
}
