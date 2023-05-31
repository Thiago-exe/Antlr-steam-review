package View;

import Antlr.HelloLexer;
import Antlr.HelloParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class WindowCreator {
    public static void PrintTree(HelloParser.JsonContext tree, HelloParser parser){
        JFrame frame = new JFrame("Parse Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.5);

        JScrollPane scrollPane = new JScrollPane(viewer);
        scrollPane.setPreferredSize(new Dimension(1000, 900));

        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        int maxWidth = viewer.getPreferredSize().width;
        int maxHeight = viewer.getPreferredSize().height;
        viewer.setPreferredSize(new Dimension(maxWidth, maxHeight));

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void ShowMenu() {
        JFrame frame = new JFrame("Opções");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton abrirArquivoButton = new JButton("Abrir arquivo");
        JButton sairButton = new JButton("Sair");

        panel.add(abrirArquivoButton);
        panel.add(sairButton);

        frame.getContentPane().add(panel);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela

        abrirArquivoButton.addActionListener(e -> {
            String data = FileGetter.SelectFile();
            if(data == null) return;
            frame.dispose();
            GenerateAndShowTree(data);
        });

        sairButton.addActionListener(e -> {
            System.exit(0);
        });

        frame.setVisible(true);
    }

    private static void GenerateAndShowTree(String data){
        CharStream charStream = CharStreams.fromString(data);
        var lexer = new HelloLexer(charStream);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new HelloParser(tokenStream);
        HelloParser.JsonContext tree = parser.json();
        WindowCreator.PrintTree(tree, parser);
    }

}
