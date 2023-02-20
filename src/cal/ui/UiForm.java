package cal.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UiForm {
    CalBack cb=new CalBack();
double v1=0,v2=0,result=0,tempresult=v1;

String u1="",u2="",u1old="";

String opt="",popt="";
    private JButton opt_sec;
    private JButton opt_cosec;
    private JButton opt_tan;
    private JButton opt_cot;
    private JButton opt_cos;
    private JButton opt_sin;
    private JButton int_1;
    private JButton int_4;
    private JButton int_7;
    private JButton int_2;
    private JButton int_5;
    private JButton int_8;
    private JButton int_3;
    private JButton int_6;
    private JButton int_9;
    private JButton int_0;
    private JButton opt_sum;
    private JButton opt_sub;
    private JButton opt_mult;
    private JButton opt_divd;
    private JButton opt_mode;
    private JButton claculate;
    private JButton int_point;
    private JTextField textField1;
    public JPanel MainPanel;
    private JButton btn_clr;
    private JTextField resfild;
    private JButton backspace;
    private JButton a00Button;

    public void setNum(String num){
        if (opt.equals("")) {
            textField1.setText(u1+num);
            u1=textField1.getText();
            v1=Double.parseDouble(u1);
            //v1=Double.parseDouble(u1.replace(opt,""));
        } else {
            if(tempresult==0)
            v1=Double.parseDouble(u1.replace(opt,""));
            else {v1=tempresult;}

            textField1.setText(textField1.getText()+num);
            u2=textField1.getText();
            u2=u2.replaceFirst(u1,"");
            u2=u2.replace(opt,"");
            v2=Double.parseDouble(u2);
        }
    }
    public void setOpt(String op){
        opt=op;
        textField1.setText(textField1.getText()+""+opt);
        //resfild.setText(cb.choose(v1,v2,opt)+"");
        u1=textField1.getText();
        if(opt=="+"&&popt=="+"||opt=="+"&&popt=="-"||opt=="-"&&popt=="+"||opt=="-"&&popt=="-"){
            tempresult=cb.choose(v1,v2,popt);
            System.out.println(tempresult);
        }

        popt=opt;
    }

    public void setOpt2(String op){
        opt=op;
        textField1.setText(opt+" of "+ u1+" is ="+cb.choose(v1,v2,opt));
    }

    public UiForm() {
        int_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("1");
            }
        });

        int_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("2");
            }
        });
        int_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("3");
            }
        });
        int_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("4");
            }
        });
        int_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("5");
            }
        });
        int_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("6");
            }
        });
        int_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("7");
            }
        });
        int_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("8");
            }
        });
        int_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("9");
            }
        });
        int_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("0");
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("00");
            }
        });
        opt_sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt("+");
            }
        });
        opt_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt("-");
            }
        });
        opt_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt("X");
            }
        });
        opt_divd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt("/");
            }
        });
        opt_mode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt("%");
            }
        });

        opt_sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setOpt2("sin");
            }
        });
        opt_cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt2("cos");
            }
        });
        opt_tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt2("tan");
            }
        });
        opt_cot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt2("cot");
            }
        });
        opt_sec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt2("sec");
            }
        });
        opt_cosec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOpt2("cosec");
            }
        });
        btn_clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1=0;v2=0;opt="";u1="";u2="";opt="";
                textField1.setText("");
//                CalBack cb=new CalBack();cb.showresult();
//                cb.frame.dispose();

            }
        });
        int_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum(".");
            }
        });
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (opt.equals("")) {
                    if(textField1.getText().length()>0)
                        textField1.setText(textField1.getText().substring(0,textField1.getText().length()-1));
                    u1=textField1.getText();
                    v1=Double.parseDouble(u1);
                } else {
                    v1=Double.parseDouble(u1.replace(opt,""));
                    if(textField1.getText().length()>0)
                        textField1.setText(textField1.getText().substring(0,textField1.getText().length()-1));
                    u2=textField1.getText();
                    u2=u2.replaceFirst(u1,"");
                    u2=u2.replace(opt,"");
                    v2=Double.parseDouble(u2);
                }
            }
        });
        claculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result=cb.choose(v1,v2,opt);
                if(u1!=null&&opt!=""&&u2!=null)
                    textField1.setText(""+result);
                else if (u1!=null&&opt!=""){textField1.setText(""+result);}
            }
        });
    }
}
