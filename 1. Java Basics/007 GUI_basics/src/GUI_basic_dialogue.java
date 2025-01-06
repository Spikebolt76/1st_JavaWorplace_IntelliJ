import javax.swing.JOptionPane;

public class GUI_basic_dialogue {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter Your Name: ");  //creates/displays basic input dialogue-box
        JOptionPane.showMessageDialog(null, "Hello "+ name +"!"); //displays name along with a Message

        int rlNum = Integer.parseInt(JOptionPane.showInputDialog("What is your Roll No.? "));  //Using Integer wrapper class
        JOptionPane.showMessageDialog(null, "Your roll no. is "+ rlNum);

        double result = Double.parseDouble(JOptionPane.showInputDialog("what was your 10th result? "));
        JOptionPane.showMessageDialog(null, "Your result was: "+ result +"%");
    }
}
