
package cse.design_pattern.noticeboard;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewPostForm extends JFrame {
    private JLabel titleLabel, viewCountLabel, authorLabel, dateLabel, userIdLabel;
    private JTextArea contentArea;
    private JButton closeButton;
    private Font font1 = new Font("맑은 고딕", Font.BOLD, 12);
    private Font font2 = new Font("맑은 고딕", Font.PLAIN, 12);

    public ViewPostForm() {
        setTitle("게시물 조회");
        setSize(350, 350);
        setLayout(new BorderLayout(0, 10));
        getContentPane().setBackground(Color.WHITE);

        titleLabel = new JLabel("게시물 제목");
        titleLabel.setFont(font1);
        contentArea = new JTextArea("게시물 내용");
        contentArea.setFont(font2);
        contentArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(contentArea);
        viewCountLabel = new JLabel("조회수: 10");
        viewCountLabel.setFont(font1);
        authorLabel = new JLabel("작성자: 홍길동");
        authorLabel.setFont(font1);
        userIdLabel = new JLabel("유저아이디: userId");
        userIdLabel.setFont(font1);
        dateLabel = new JLabel("작성일: 2022-10-01");
        dateLabel.setFont(font1);
        closeButton = new JButton("닫기");
        closeButton.setFont(font1);
        closeButton.setBackground(Color.BLACK);
        closeButton.setForeground(Color.WHITE);
        closeButton.setFocusPainted(false);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        infoPanel.setBackground(Color.WHITE);
        infoPanel.add(titleLabel);
        infoPanel.add(Box.createVerticalStrut(10));
        infoPanel.add(scrollPane);
        infoPanel.add(Box.createVerticalStrut(10));
        infoPanel.add(viewCountLabel);
        infoPanel.add(Box.createVerticalStrut(10));
        infoPanel.add(authorLabel);
        infoPanel.add(Box.createVerticalStrut(10));
        infoPanel.add(userIdLabel);
        infoPanel.add(Box.createVerticalStrut(10));
        infoPanel.add(dateLabel);

        JPanel closeButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        closeButtonPanel.setBackground(Color.WHITE);
        closeButtonPanel.add(closeButton);

        add(infoPanel, BorderLayout.CENTER);
        add(closeButtonPanel, BorderLayout.SOUTH);
        
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
