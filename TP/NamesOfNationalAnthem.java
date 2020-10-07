/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class NamesOfNationalAnthem extends JFrame implements ActionListener
{
	//constants declaration
  private final int FRAME_X = 0;
  private final int FRAME_Y = 420;
  private final int FRAME_WIDTH = 540; 
  private final int FRAME_HEIGHT = 280;
  private final int BLANKSIZE = 10;
  private final int FONT_S = 25; 
  private final int COLOR_BUR = 89;
  private final int COLOR_BUG = 30;
  private final int COLOR_BUB = 35;
  private final int COLOR_PR = 217;
  private final int COLOR_PG = 78;
  private final int COLOR_PB = 103;
  private final int COLOR_BER = 242;
  private final int COLOR_BEG = 216;
  private final int COLOR_BEB = 167;
  private final int COLOR_CR = 166;
  private final int COLOR_CG = 133;
  private final int COLOR_CB = 114;
  private final int COLOR_BRR = 115;
  private final int COLOR_BRG = 80;
  private final int COLOR_BRB = 60;
  private final int ZERO = 0;
  private final int ONE = 1;
  
  //integer
  private int rowCount = 0;
  
  //String
  private String content;
  private String country = new String("");
  private String song = new String("");
  
  //JFrame
  private JFrame nameFrame = new JFrame("Names of National Anthem");
  
  //JPanel
  private JPanel textPane = new JPanel();
  private JPanel topPane = new JPanel();
  private JPanel centerPane = new JPanel();
  private JPanel underPane = new JPanel();
  	
  //JLabel
  private JLabel direction = new JLabel("Type the country from the list");
  private JLabel blank1 = new JLabel("                                       ");
  private JLabel blank2 = new JLabel("                                       ");
  private JLabel blank3 = new JLabel("                                       ");
  
  //JTextField
  private JTextField blank = new JTextField(BLANKSIZE);
  
  //Table
  private String[] columnTitles = {"Country", "National Anthem"};
  private DefaultTableModel tableModel = new DefaultTableModel(columnTitles, ZERO);
  private JTable nameTable = new JTable(tableModel);
  private JTableHeader header = nameTable.getTableHeader();
  private JScrollPane scrollPane = new JScrollPane(nameTable);
  
  //JButton
	private JButton goButton = new JButton("GO");
	private JButton resetButton = new JButton("RESET");
	private java.net.URL exitPath = getClass().getResource("exit.png");		
	private	JButton exitButton = new JButton(new ImageIcon(exitPath));
	
	//Font
  private Font serif = new Font("Serif", Font.BOLD, FONT_S);
  
  //Color
  private Color burgundy = new Color(COLOR_BUR,COLOR_BUG,COLOR_BUB);
  private Color pink = new Color(COLOR_PR,COLOR_PG,COLOR_PB);
  private Color beige = new Color(COLOR_BER,COLOR_BEG,COLOR_BEB);
  private Color coffee = new Color(COLOR_CR,COLOR_CG,COLOR_CB);
  private Color brown = new Color(COLOR_BRR,COLOR_BRG,COLOR_BRB);
  
	//setNameWindow
  public void setNameWindow()
	{	
		//JFrame
		nameFrame.setBounds(FRAME_X,FRAME_Y,FRAME_WIDTH,FRAME_HEIGHT);
		nameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		nameFrame.setLayout(new BorderLayout());
		nameFrame.add(topPane, BorderLayout.NORTH);
		nameFrame.add(centerPane, BorderLayout.CENTER);
		nameFrame.add(underPane, BorderLayout.SOUTH);
		
		//JPanel
		textPane.setLayout(new FlowLayout());
		textPane.add(blank);
		textPane.add(goButton);
		textPane.setBackground(coffee);
		topPane.setLayout(new BorderLayout());
		topPane.add(direction, BorderLayout.NORTH);
		topPane.add(textPane, BorderLayout.CENTER);
		topPane.setBackground(burgundy);
		centerPane.setLayout(new BorderLayout());
		centerPane.add(scrollPane, BorderLayout.CENTER);
		centerPane.add(resetButton, BorderLayout.SOUTH);
		centerPane.setBackground(brown);
		underPane.setLayout(new FlowLayout());
		underPane.add(blank1);
		underPane.add(blank2);		
		underPane.add(blank3);
		underPane.add(exitButton);
		underPane.setBackground(coffee);
		
		//JLabel
		direction.setFont(serif);
		direction.setForeground(pink);
	  direction.setHorizontalAlignment(JLabel.CENTER);
		
		//JButton
		goButton.addActionListener(this);
		goButton.setToolTipText("search name of national anthem");
		resetButton.addActionListener(this);
		resetButton.setToolTipText("reset the data");
		exitButton.addActionListener(this);
		exitButton.setActionCommand("exit");
		exitButton.setToolTipText("exit");
		
		//JTable
		nameTable.setBackground(beige);
		header.setBackground(brown);
		
		//JTextField
		blank.setToolTipText("type the country");
		
		nameFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if(buttonCommand.equals("GO"))
		{
			content = blank.getText().toLowerCase();
	    switch(content)
	    {
	    case "afghanistan":
	    	country = "Afghanistan";
	    	song = "ملی سرود";
	    	setTable();
	    	break;
		  case "argentina":
		  	country = "Argentina";
	    	song = "Himno Nacional Argentino";
	    	setTable();
		  	break;
		  case "australia":
		  	country = "Australia";
	    	song = "Advance Australia Fair";
	    	setTable();
		  	break;
		  case "austria":
		  	country = "Austria";
	    	song = "Land der Berge, Land am Strome";
	    	setTable();
		  	break;
		  case "brazil":
		  	country = "Brazil";
	    	song = "Hino Nacional";
	    	setTable();
		  	break;
		  case "bulgaria":
		  	country = "Bulgaria";
	    	song = "Мила Родино";
	    	setTable();
		  	break;
		  case "canada":
		  	country = "Canada";
	    	song = "O Canada";
	    	setTable();
		  	break;
		  case "chile":
		  	country = "Chile";
	    	song = "Himno Nacional de Chile";
	    	setTable();
		  	break;
		  case "china":
		  	country = "China";
	    	song = "义勇军进行曲";
	    	setTable();
		  	break;
		  case "colombia":
		  	country = "Colombia";
	    	song = "Himno Nacional de la República de Colombia";
	    	setTable();
		  	break;
		  case "cuba":
		  	country = "Cuba";
	    	song = "El Himno de Bayamo";
	    	setTable();
		  	break;
		  case "denmark":
		  	country = "Denmark";
	    	song = "Der er et yndigt land";
	    	setTable();
		  	break;
		  case "england":
		  	country = "United Kingdom";
	    	song = "God Save the Queen";
	    	setTable();
		  	break;	
		  case "ethiopia":
		  	country = "Ethiopia";
	    	song = "Wodefit Gesgeshi, Widd Innat Ityopp'ya";
	    	setTable();
		  	break;
		  case "france":
		  	country = "France";
	    	song = "La Marseillaise";
	    	setTable();
		  	break;
		  case "germany":
		  	country = "Germany";
	    	song = "Das Lied der Deutschen";
	    	setTable();
		  	break;
		  case "greece":
		  	country = "Greece";
	    	song = "Ύμνος εις την ελευθερίαν";
	    	setTable();
		  	break;
		  case "india":
		  	country = "India";
	    	song = "জন গণ মন";
	    	setTable();
		  	break;
		  case "indonesia":
		  	country = "Indonesia";
	    	song = "Indonesia Raya";
	    	setTable();
		  	break;
		  case "iran":
		  	country = "Iran";
	    	song = "سرود ملی جمهوری اسلامی ایران";
	    	setTable();
		  	break;
		  case "ireland":
		  	country = "Ireland";
	    	song = "Amhrán na bhFiann";
	    	setTable();
		  	break;
		  case "japan":
		  	country = "Japan";
	    	song = "君が代";
	    	setTable();
		  	break;
		  case "korea":
		  	country = "Korea";
	    	song = "애국가";
	    	setTable();
		  	break;
		  case "kuwait":
		  	country = "Kuwait";
	    	song = "النشيد الوطنيي";
	    	setTable();
		  	break;
		  case "malaysia":
		  	country = "Malaysia";
	    	song = "Negaraku";
	    	setTable();
		  	break;
		  case "mexico":
		  	country = "Mexico";
	    	song = "Himno Nacional Mexicano";
	    	setTable();
		  	break;
		  case "morocco":
		  	country = "Morocco";
	    	song = "النشيد الوطني المغربيي";
	    	setTable();
		  	break;
		  case "netherlands":
		  	country = "Netherlands";
	    	song = "Wilhelmus";
	    	setTable();
		  	break;
		  case "new zealand":
		  	country = "New Zealand";
	    	song = "God Defend New Zealand";
	    	setTable();
		  	break;
		  case "newzealand":
		  	country = "New Zealand";
	    	song = "God Defend New Zealand";
	    	setTable();
		  	break;
		  case "norway":
		  	country = "Norway";
	    	song = "Ja, vi elsker";
	    	setTable();
		  	break;
		  case "pakistan":
		  	country = "Pakistan";
	    	song = "قومی ترانہ";
	    	setTable();
		  	break;
		  case "palau":
		  	country = "Palau";
	    	song = "Belau rekid";
	    	setTable();
		  	break;
		  case "philippines":
		  	country = "Philippines";
	    	song = "Lupang Hinirang";
	    	setTable();
		  	break;
		  case "poland":
		  	country = "Argentina";
	    	song = "Mazurek Dąbrowskiego";
	    	setTable();
		  	break;
		  case "portugal":
		  	country = "Portugal";
	    	song = "A Portuguesa";
	    	setTable();
		  	break;
		  case "russia":
		  	country = "Russia";
	    	song = "Государственный гимн ";
	    	setTable();
		  	break;
		  case "saudi arabia":
		  	country = "Saudi Arabia";
	    	song = "النشيد الوطني";
	    	setTable();
		  	break;
		  case "saudiarabia":
		  	country = "Saudi Arabia";
	    	song = "النشيد الوطني";
	    	setTable();
		  	break;
		  case "serbia":
		  	country = "Serbia";
	    	song = "Bože pravde";
	    	setTable();
		  	break;
		  case "singapore":
		  	country = "Singapore";
	    	song = "Majulah Singapura";
	    	setTable();
		  	break;
		  case "spain":
		  	country = "Spain";
	    	song = "Marcha Real";
	    	setTable();
		  	break;
		  case "sweden":
		  	country = "Sweden";
	    	song = "Du gamla, Du fria";
	    	setTable();
		  	break;
		  case "switzerland":
		  	country = "Switzerland";
	    	song = "Schweizerpsalm";
	    	setTable();
		  	break;
		  case "syria":
		  	country = "Syria";
	    	song = "حُمَاةَ الدِّيَار";
	    	setTable();
		  	break;
		  case "tanzania":
		  	country = "Tanzania";
	    	song = "Mungu ibariki Afrika";
	    	setTable();
		  	break;
		  case "thailand":
		  	country = "Thailand";
	    	song = "เพลงชาติไทย";
	    	setTable();
		  	break;
		  case "turkey":
		  	country = "Turkey";
	    	song = "İstiklâl Marşı";
	    	setTable();
		  	break;
		  case "ukraine":
		  	country = "Ukraine";
	    	song = "Ще не вмерли України ні Слава ні Воля";
	    	setTable();
		  	break;
		  case "united states":
		  	country = "United States";
	    	song = "The Star-Spangled Banner";
	    	setTable();
		  	break;
		  case "unitedstates":
		  	country = "United States";
	    	song = "The Star-Spangled Banner";
	    	setTable();
		  	break;
		  case "uzbekistan":
		  	country = "Uzbekistan";
	    	song = "Oʻzbekiston Respublikasining";
	    	setTable();
		  	break;
		  case "vietnam":
		  	country = "Vietnam";
	    	song = "Tiến Quân Ca";
	    	setTable();
		  	break;
		  default:
		  	ErrorAnthem errorReader = new ErrorAnthem();
		  	errorReader.setErrorWindow();
		  }
		}
		else if (buttonCommand.equals("RESET"))
			resetTable();
		else if (buttonCommand.equals("exit"))
			nameFrame.dispose();
	}
	
	//setTable
	public int setTable()
	{
		String[] tableData = {country,song};
		tableModel.addRow(tableData);
    nameTable.setEnabled(false);
	  rowCount++;
		return rowCount;
	}
	
	//resetTable
	public int resetTable()
	{
		for (; rowCount > ZERO ; rowCount--)
		{
			tableModel.removeRow(rowCount-ONE);
		}
		rowCount = ZERO;
		return rowCount;
	}
	
	//mainGui
	public static void main(String[] args)
	{
		NamesOfNationalAnthem mainGui = new NamesOfNationalAnthem();
		mainGui.setNameWindow();
	}
}
