package cse.design_pattern.noticeboard;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreatePostForm extends JFrame {
    private JLabel titleLabel;
    private JTextArea contentArea;
    private JTextField titleField;
    private JButton submitButton, cancelButton;
    private Font font1 = new Font("맑은 고딕", Font.BOLD, 13);
    private Font font2 = new Font("맑은 고딕", Font.PLAIN, 13);

    public CreatePostForm() {
        setTitle("게시물 작성");
        setSize(400, 400);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.WHITE);

        titleLabel = new JLabel("제목");
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(font1);
        titleField = new JTextField();
        titleField.setFont(font2);
        contentArea = new JTextArea();
        contentArea.setFont(font2);
        contentArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JScrollPane scrollPane = new JScrollPane(contentArea);

        submitButton = new JButton("등록");
        submitButton.setFont(font1);
        submitButton.setBackground(new Color(125, 105, 167));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);

        cancelButton = new JButton("취소");
        cancelButton.setFont(font1);
        cancelButton.setBackground(new Color(125, 105, 167));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFocusPainted(false);

        JPanel titlePanel = new JPanel(new GridLayout(2, 1));
        titlePanel.setBackground(Color.WHITE);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        titlePanel.add(titleLabel);
        titlePanel.add(titleField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);

        add(titlePanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
