package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class Panel extends JPanel implements ActionListener {
    private JButton numbers[] = new JButton[10];
    private Font font = new Font("Sherif", Font.BOLD, 20);
    private Font font2 = new Font("Sherif", Font.BOLD, 8);
    private JTextField out = new JTextField();
    private JButton backspace = new JButton("Cls"), equ = new JButton("="), change = new JButton("+/-"),
            plus = new JButton("+"), minus = new JButton("-"), multi = new JButton("*"), div = new JButton("/"),
            C = new JButton("C"), D = new JButton("D"), E = new JButton("E"), F = new JButton("F"),
            B = new JButton("B"), shr = new JButton("shr"), shl = new JButton("shl"), not = new JButton("not"),
            xor = new JButton("xor"), and = new JButton("and"), or = new JButton("or"), hex = new JButton("hex"),
            dec = new JButton("dec"), oct = new JButton("oct"), bin = new JButton("bin"), A = new JButton("A");
    private int n;
    private char c;
    private String b1 = "";
    private String a1 = "";
    private String text = "";
    private String result = "";

    public Panel() {
        setLayout(null);
        setFocusable(true);
        grabFocus();

        backspace.setBounds(10, 250, 50, 50);
        backspace.setFont(font2);
        add(backspace);
        backspace.addActionListener(this);

        equ.setBounds(10, 310, 470, 50);
        equ.setFont(font);
        add(equ);
        equ.addActionListener(this);

        plus.setBounds(190, 70, 50, 50);
        plus.setFont(font);
        add(plus);
        plus.addActionListener(this);

        minus.setBounds(190, 130, 50, 50);
        minus.setFont(font);
        add(minus);
        minus.addActionListener(this);

        multi.setBounds(190, 190, 50, 50);
        multi.setFont(font);
        add(multi);
        multi.addActionListener(this);

        div.setBounds(190, 250, 50, 50);
        div.setFont(font);
        add(div);
        div.addActionListener(this);

        change.setBounds(130, 250, 50, 50);
        change.setFont(font2);
        add(change);
        change.addActionListener(this);

        A.setBounds(250, 70, 50, 50);
        A.setFont(font);
        add(A);
        A.addActionListener(this);
        A.setEnabled(false);

        B.setBounds(250, 130, 50, 50);
        B.setFont(font);
        add(B);
        B.addActionListener(this);
        B.setEnabled(false);

        C.setBounds(250, 190, 50, 50);
        C.setFont(font);
        add(C);
        C.addActionListener(this);
        C.setEnabled(false);

        D.setBounds(250, 250, 50, 50);
        D.setFont(font);
        add(D);
        D.addActionListener(this);
        D.setEnabled(false);

        E.setBounds(310, 70, 50, 50);
        E.setFont(font);
        add(E);
        E.addActionListener(this);
        E.setEnabled(false);

        F.setBounds(310, 130, 50, 50);
        F.setFont(font);
        add(F);
        F.addActionListener(this);
        F.setEnabled(false);

        shr.setBounds(310, 190, 50, 50);
        shr.setFont(font2);
        add(shr);
        shr.addActionListener(this);

        shl.setBounds(310, 250, 50, 50);
        shl.setFont(font2);
        add(shl);
        shl.addActionListener(this);

        not.setBounds(370, 70, 50, 50);
        not.setFont(font2);
        add(not);
        not.addActionListener(this);

        xor.setBounds(370, 130, 50, 50);
        xor.setFont(font2);
        add(xor);
        xor.addActionListener(this);

        and.setBounds(370, 190, 50, 50);
        and.setFont(font2);
        add(and);
        and.addActionListener(this);

        or.setBounds(370, 250, 50, 50);
        or.setFont(font2);
        add(or);
        or.addActionListener(this);

        hex.setBounds(430, 70, 50, 50);
        hex.setFont(font2);
        add(hex);
        hex.addActionListener(this);

        dec.setBounds(430, 130, 50, 50);
        dec.setFont(font2);
        add(dec);
        dec.addActionListener(this);

        oct.setBounds(430, 190, 50, 50);
        oct.setFont(font2);
        add(oct);
        oct.addActionListener(this);

        bin.setBounds(430, 250, 50, 50);
        bin.setFont(font2);
        add(bin);
        bin.addActionListener(this);

        numbers[0] = new JButton("0");
        numbers[0].setBounds(70, 250, 50, 50);
        numbers[0].setFont(font);
        numbers[0].addActionListener(this);
        add(numbers[0]);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                numbers[x * 3 + y + 1] = new JButton((x * 3 + y + 1) + "");
                numbers[x * 3 + y + 1].setBounds(y * (50 + 10) + 10, x * (50 + 10) + 70, 50, 50);
                add(numbers[x * 3 + y + 1]).setFont(font);
                numbers[x * 3 + y + 1].addActionListener(this);
            }
        }
        out.setBounds(10, 10, 470, 50);
        out.setEditable(false);
        out.setFont(font);
        add(out);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (JButton number : numbers) {
            if (e.getSource() == number) {
                JButton b = (JButton) e.getSource();
                text += b.getText();
                out.setText(text);
            }
        }

        if (e.getSource() == backspace) {
            text = "";
            out.setText(text);
            c=0;
        }

        if (e.getSource() == A) {
            text += A.getText();
            out.setText(text);
        }

        if (e.getSource() == B) {
            text += B.getText();
            out.setText(text);
        }

        if (e.getSource() == C) {
            text += C.getText();
            out.setText(text);
        }

        if (e.getSource() == E) {
            text += E.getText();
            out.setText(text);
        }

        if (e.getSource() == F) {
            text += F.getText();
            out.setText(text);
        }

        if (e.getSource() == dec) {
            A.setEnabled(false);
            B.setEnabled(false);
            C.setEnabled(false);
            D.setEnabled(false);
            E.setEnabled(false);
            F.setEnabled(false);
            for (int x = 2; x < numbers.length; x++) {
                numbers[x].setEnabled(true);
            }
            if (!Objects.equals(out.getText(), "")) {
                text = NumberSystems.toDecimal(text, n);
                out.setText(text);
            }
            n = 0;
        }

        if (e.getSource() == hex) {
            if (n != 3) {
                A.setEnabled(true);
                B.setEnabled(true);
                C.setEnabled(true);
                D.setEnabled(true);
                E.setEnabled(true);
                F.setEnabled(true);
                for (int x = 2; x < numbers.length; x++) {
                    numbers[x].setEnabled(true);
                }
                if (!Objects.equals(out.getText(), "")) {
                    text = NumberSystems.toHex(NumberSystems.toDecimal(out.getText(), n));
                    out.setText(text);
                }
                n = 3;
            }
        }

        if (e.getSource() == oct) {
            if (n != 2) {
                A.setEnabled(false);
                B.setEnabled(false);
                C.setEnabled(false);
                D.setEnabled(false);
                E.setEnabled(false);
                F.setEnabled(false);
                numbers[8].setEnabled(false);
                numbers[9].setEnabled(false);
                for (int x = 2; x < 8; x++) {
                    numbers[x].setEnabled(true);
                }
                if (!Objects.equals(out.getText(), "")) {
                    a1 = NumberSystems.toOctal(NumberSystems.toDecimal(out.getText(), n));
                    text = a1;
                    out.setText(text);
                }
                n = 2;
            }
        }

        if (e.getSource() == bin) {
            if (n != 1) {
                A.setEnabled(false);
                B.setEnabled(false);
                C.setEnabled(false);
                D.setEnabled(false);
                E.setEnabled(false);
                F.setEnabled(false);
                for (int x = 2; x < numbers.length; x++) {
                    numbers[x].setEnabled(false);
                }
                if (!Objects.equals(out.getText(), "")) {
                    a1 = NumberSystems.toBinary(NumberSystems.toDecimal(out.getText(), n));
                    text = a1;
                    out.setText(text);
                }
                n = 1;
            }
        }
        if (!Objects.equals(out.getText(), "")) {

            if (e.getSource() == plus) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = '+';
            }

            if (e.getSource() == minus) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = '-';
            }

            if (e.getSource() == multi) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = '*';
            }

            if (e.getSource() == div) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = '/';
            }

            if (e.getSource() == change) {
                result = String.valueOf(-1*(Integer.parseInt(NumberSystems.toDecimal(out.getText(),n))));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }

            if (e.getSource() == shl) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = 'l';
            }

            if (e.getSource() == shr) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = 'r';
            }

            if (e.getSource() == not) {
                result = String.valueOf(~(Integer.parseInt(NumberSystems.toDecimal(out.getText(),n))));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):"0"));
            }

            if (e.getSource() == xor) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = 'x';
            }

            if (e.getSource() == and) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = 'a';
            }

            if (e.getSource() == or) {
                a1 = NumberSystems.toDecimal(out.getText(),n);
                out.setText("");
                text = ("");
                c = 'o';
            }

        }


        if (e.getSource() == equ) {
            b1 = NumberSystems.toDecimal(text,n);
            if (c == '+') {
                result = String.valueOf(Integer.parseInt(a1) + Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }
            if (c == '-') {
                result = String.valueOf(Integer.parseInt(a1) - Integer.parseInt(b1));                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }
            if (c == '*') {
                result = String.valueOf(Integer.parseInt(a1) * Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }

            if (c == '/') {
                try {
                    result = String.valueOf(Integer.parseInt(a1) / Integer.parseInt(b1));
                    out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
                } catch (ArithmeticException r) {
                    out.setText("0000");
                }
            }

            if (c == 'l') {
                result = String.valueOf(Integer.parseInt(a1) << Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }

            if (c == 'r') {
                result = String.valueOf(Integer.parseInt(a1) >> Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }

            if (c == 'x') {
                result = String.valueOf(Integer.parseInt(a1) ^ Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }

            if (c == 'a') {
                result = String.valueOf(Integer.parseInt(a1) & Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }

            if (c == 'o') {
                result = String.valueOf(Integer.parseInt(a1) | Integer.parseInt(b1));
                out.setText(text=String.valueOf(n==0?(result):n==1?NumberSystems.toBinary(result):n==2?NumberSystems.toOctal(result):n==3?NumberSystems.toHex(result):""));
            }
        }
    }
}

