package search.job.gui;
import javax.swing.JFrame;
import first.option.forsendcv.FirstSearchOpation;
import three.option.forsendcv.ThreeSearchOpation;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ManualJobSearchSecoundScreenGUI {	
public static void main(String[] args)
{
	showScreen();
}
	    public static void showScreen() {
		// TODO Auto-generated method stub		
		final JFrame frame = new JFrame();
		frame.setBounds(150, 150, 727, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Manual Job Search");
		frame.getContentPane().setLayout(null);
		/// search option button 1
		JButton jobSearchButtonOption1 = new JButton("Search option1, Send emails");
		jobSearchButtonOption1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {	
		FirstSearchOpation searchOpation=new FirstSearchOpation();	
		     searchOpation.search();
		     frame.setVisible(false);
			}   
			
		});
		jobSearchButtonOption1.setBounds(326, 75, 163, 52);
		frame.getContentPane().add(jobSearchButtonOption1);
		/// search option button 2
		JButton jobSearchButtonOption2 = new JButton("Search option2, LinkedIn Engine");
		jobSearchButtonOption2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			//search type2
			}
		});
		jobSearchButtonOption2.setBounds(326, 186, 163, 46);
		frame.getContentPane().add(jobSearchButtonOption2);
		/// search option button 3	
		JButton jobSearchButtonOption3 = new JButton("Search option3, Secrets");
		jobSearchButtonOption3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {		
				ThreeSearchOpation threeSearch=new ThreeSearchOpation();
				threeSearch.search();		
			}
		});
		jobSearchButtonOption3.setBounds(326, 294, 163, 46);
		frame.getContentPane().add(jobSearchButtonOption3);
		frame.setVisible(true);
		
	}

}
