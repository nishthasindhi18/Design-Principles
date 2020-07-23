package calculator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import sun.net.www.content.audio.x_aiff;
import sun.plugin2.main.server.LiveConnectSupport;
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    private String op="";
    private float num1=0;
    private float num2=0,result;
    private boolean start=true;
    @FXML
    private RadioButton ron;
    @FXML
    private RadioButton roff;
    @FXML
    private Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    @FXML
    private Button plus,minus,mul,div,per,neg,dott,eq,ac,dele;
    Calculations c=new Calculations();
    @FXML
    private void numbers(ActionEvent e1)
    {
        if(start)
        {
            label.setText("");
            start=false;
        } 
        String n=((Button)e1.getSource()).getText();  //to get data from buttons
        label.setText(label.getText()+n); 
        System.out.println(n);
    }
    @FXML
    private void operators(ActionEvent e2)
    {
        String m=((Button)e2.getSource()).getText();
        if(!m.equals("="))
        {
            if(!op.isEmpty())
            {
                return ;
            }
            op=m;
            num1=Float.parseFloat(label.getText());  //for conversion of string to float
            
           label.setText("");
         //  label.setText(String.valueOf(num1));
         // label.setText(m);
        }
        else
            {
                  // label.setText(String.valueOf(num1));
                    num2=Float.parseFloat(label.getText());
                    Float result=c.cal(num1,num2,op);
                    label.setText(String.valueOf(result));
                    System.out.println(result);
                    op="";
            }
    }
    @FXML
    public void clean(ActionEvent e3)
    {
        
        label.setText("");
    }
    @FXML
    public void negative(ActionEvent e4)
    {
        num1=Float.parseFloat(label.getText());
        result=-(num1);
        label.setText(String.valueOf(result));
        
    }
    @FXML
    public void percentage(ActionEvent e5)
    {
        num1=Float.parseFloat(label.getText());
        System.out.println(num1);
        result=(num1)/100; 
        System.out.println(result);
        label.setText(String.valueOf(result));
    }
    @FXML
    public void dot(ActionEvent e6)
    {
        String s=((Button)e6.getSource()).getText();
        label.setText(label.getText()+".");
    }
    @FXML
    public void del(ActionEvent e7)
    {
        String t=label.getText();
        t=t.substring(0,t.length()-1);
        label.setText(t);
    }
    @FXML
    private void on(ActionEvent e8)
    {
        if(ron.isSelected())
        {
            label.setDisable(false);
            n0.setDisable(false);
            n1.setDisable(false);
            n2.setDisable(false);
            n3.setDisable(false);
            n4.setDisable(false);
            n5.setDisable(false);
            n6.setDisable(false);
            n7.setDisable(false);
            n8.setDisable(false);
            n9.setDisable(false);
            plus.setDisable(false);
            minus.setDisable(false);
            mul.setDisable(false);
            div.setDisable(false);
            per.setDisable(false);
            neg.setDisable(false);
            dott.setDisable(false);
            eq.setDisable(false);
            ac.setDisable(false);
            dele.setDisable(false);
        }
    }
    @FXML 
    private void off(ActionEvent e9)
    {
        if(roff.isSelected())
        {
            label.setText("");
            label.setDisable(true);
            n0.setDisable(true);
            n1.setDisable(true);
            n2.setDisable(true);
            n3.setDisable(true);
            n4.setDisable(true);
            n5.setDisable(true);
            n6.setDisable(true);
            n7.setDisable(true);
            n8.setDisable(true);
            n9.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            mul.setDisable(true);
            div.setDisable(true);
            per.setDisable(true);
            neg.setDisable(true);
            dott.setDisable(true);
            eq.setDisable(true);
            ac.setDisable(true);
            dele.setDisable(true);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}
