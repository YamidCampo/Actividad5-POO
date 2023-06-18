import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide;
    public ventanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);
        piramide = new JButton();
        piramide.setText("Pirámide");
        piramide.setBounds(225, 50, 100, 23);
        piramide.addActionListener(this);
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            ventanaEsfera esfera = new ventanaEsfera();
            esfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            ventanaCilindro cilindro = new ventanaCilindro();
            cilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) {
            ventanaPiramide piramide = new ventanaPiramide();
            piramide.setVisible(true);
        }
    }
}
