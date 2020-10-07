/* NAME: Kihyun Jo          GRADE: 10          DATE: 04.18.17
This projects are National Anthem which gives information about
each national anthem of 50 countries. The project is made for Term Project.*/

package TP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NationalAnthem extends JFrame implements ActionListener
{
	//constants declaration
	private final int frameX = 180;
  private final int frameY = 10;
  private final int frameWidth = 1020; 
  private final int frameHeight = 680;
  private final int fontTR = 70;
  private final int fontS = 30;
  private final int colorBr = 66;
  private final int colorBg = 152;
  private final int colorBb = 181;
  private final int colorGrar = 173;
  private final int colorGrag = 196;
  private final int colorGrab = 204;
  private final int colorGrer = 146;
  private final int colorGreg = 176;
  private final int colorGreb = 106;
  private final int colorOr = 225;
  private final int colorOg = 157;
  private final int colorOb = 41;
  private final int blankSize = 10;
  
  //JFrame
	private JFrame mainFrame = new JFrame("National Anthem");
	
	//JLabel
	private JLabel titleLabel = new JLabel("National Anthem");
	private JLabel directionLabel = new JLabel("Type the country from the list below");
  private	java.net.URL listPath = getClass().getResource("list.png");			
	private JLabel listLabel = new JLabel(new ImageIcon(listPath));
	private JLabel blank1 = new JLabel("                                                                        ");
	private JLabel blank2 = new JLabel("                                                                        ");
	private JLabel blank3 = new JLabel("                                                                        ");
	
	//JPanel
	private JPanel topPane = new JPanel();
	private JPanel midPane = new JPanel();
	private JPanel textPane = new JPanel();
	private JPanel underPane = new JPanel();
	
	//JButton
	private	java.net.URL goPath = getClass().getResource("go.jpeg");		
  private JButton goButton = new JButton(new ImageIcon(goPath));
  private java.net.URL backPath = getClass().getResource("back.png");
  private JButton backButton = new JButton(new ImageIcon(backPath));
	
	//JMenuBar
	private JMenuBar mainBar = new JMenuBar();
	
	//JMenu
	private JMenu helpMenu = new JMenu("Help");
  private JMenu toolMenu = new JMenu("Tool");
  
  //JMenuItem
  private JMenuItem info = new JMenuItem("About National Anthem");
  private JMenuItem name = new JMenuItem("Names of National Anthem");
  private JMenuItem map = new JMenuItem("World Map");
  
  //JTextField
  private JTextField blank = new JTextField(blankSize);
	
  //String
  private String content;

  //Font
  private Font timesRoman = new Font("TimesRoman", Font.BOLD, fontTR);
  private Font serif = new Font("Serif", Font.BOLD, fontS);
  
  //Color
  private Color blue = new Color(colorBr,colorBg,colorBb);
  private Color gray = new Color(colorGrar,colorGrag,colorGrab);
  private Color green = new Color(colorGrer,colorGreg,colorGreb);
  private Color orange = new Color(colorOr,colorOg,colorOb);
  
	public void setMainWindow()
	{	
		//JFrame
		mainFrame.setBounds(frameX,frameY,frameWidth,frameHeight);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(topPane, BorderLayout.NORTH);
		mainFrame.add(midPane, BorderLayout.CENTER);
		mainFrame.add(underPane, BorderLayout.SOUTH);
		
		//JPanel
		topPane.setLayout(new BorderLayout());
		topPane.setBackground(gray);
		topPane.add(mainBar, BorderLayout.NORTH);
		topPane.add(titleLabel, BorderLayout.CENTER);
		topPane.add(directionLabel, BorderLayout.SOUTH);
		textPane.setLayout(new FlowLayout());
		textPane.setBackground(orange);
		textPane.add(blank);
		textPane.add(goButton);
		midPane.setLayout(new BorderLayout());
		midPane.add(textPane, BorderLayout.NORTH);
		midPane.add(listLabel, BorderLayout.CENTER);
		underPane.setLayout(new FlowLayout());
		underPane.setBackground(green);
		underPane.add(blank1);
		underPane.add(blank2);
		underPane.add(blank3);
		underPane.add(backButton);
		
		//JLabel
		titleLabel.setFont(timesRoman);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setForeground(blue);
		directionLabel.setFont(serif);
		directionLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//JMenuBar
		mainBar.add(helpMenu);
		mainBar.add(toolMenu);
		
		//JMenu
		helpMenu.add(info);
		helpMenu.setToolTipText("click here if you need help");
		toolMenu.add(name);
		toolMenu.add(map);
		toolMenu.setToolTipText("click here if you need tool");
		
		//JMenuItem
		info.addActionListener(this);
		info.setToolTipText("see definition of national anthem");
		name.addActionListener(this);
		name.setToolTipText("see name of each country's national anthem");
		map.addActionListener(this);
		map.setToolTipText("see world map");
		
		//JTextField
		blank.setToolTipText("type the country");
		
		//JButton
		goButton.addActionListener(this);
		goButton.setActionCommand("go");
		goButton.setToolTipText("search the national anthem");
		backButton.addActionListener(this);
		backButton.setActionCommand("back");
		backButton.setToolTipText("return to welcome frame");
		
		mainFrame.setVisible(true);
	}
	
	//actionPerformed
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
		if(buttonCommand.equals("About National Anthem"))
		{
			AboutNationalAnthem infoReader = new AboutNationalAnthem();
			infoReader.setInfoWindow();
		}
		else if(buttonCommand.equals("Names of National Anthem"))
		{
			NamesOfNationalAnthem nameReader = new NamesOfNationalAnthem();
			nameReader.setNameWindow();
		}
		else if(buttonCommand.equals("World Map"))
		{
			WorldMap mapReader = new WorldMap();
			mapReader.setMapWindow();
		}
		else if(buttonCommand.equals("go"))
		{
			content = blank.getText().toLowerCase();
	    switch(content)
	    {
	    case "afghanistan":
	    	mainFrame.dispose();
	    	Afghanistan afghReader = new Afghanistan();
	    	afghReader.setNationWindow();
	    	break;
		  case "argentina":
		  	mainFrame.dispose();
		  	Argentina argeReader = new Argentina();
		  	argeReader.setNationWindow();
		  	break;
		  case "australia":
		  	mainFrame.dispose();
		  	Australia atlReader = new Australia();
		  	atlReader.setNationWindow();
		  	break;
		  case "austria":
		  	mainFrame.dispose();
		  	Austria atrReader = new Austria();
		  	atrReader.setNationWindow();
		  	break;
		  case "brazil":
		  	mainFrame.dispose();
		  	Brazil brazReader = new Brazil();
		  	brazReader.setNationWindow();
		  	break;
		  case "bulgaria":
		  	mainFrame.dispose();
		  	Bulgaria bulgReader = new Bulgaria();
		  	bulgReader.setNationWindow();
		  	break;
		  case "canada":
		  	mainFrame.dispose();
		  	Canada canaReader = new Canada();
		  	canaReader.setNationWindow();
		  	break;
		  case "chile":
		  	mainFrame.dispose();
		  	Chile chilReader = new Chile();
		  	chilReader.setNationWindow();
		  	break;
		  case "china":
		  	mainFrame.dispose();
		  	China chinReader = new China();
		  	chinReader.setNationWindow();
		  	break;
		  case "colombia":
		  	mainFrame.dispose();
		  	Colombia coloReader = new Colombia();
		  	coloReader.setNationWindow();
		  	break;
		  case "cuba":
		  	mainFrame.dispose();
		  	Cuba cubaReader = new Cuba();
		  	cubaReader.setNationWindow();
		  	break;
		  case "denmark":
		  	mainFrame.dispose();
		  	Denmark denmReader = new Denmark();
		  	denmReader.setNationWindow();
		  	break;
		  case "england":
		  	mainFrame.dispose();
		  	England englReader = new England();
		  	englReader.setNationWindow();
		  	break;	
		  case "ethiopia":
		  	mainFrame.dispose();
		  	Ethiopia ethiReader = new Ethiopia();
		  	ethiReader.setNationWindow();
		  	break;
		  case "france":
		  	mainFrame.dispose();
		  	France franReader = new France();
		  	franReader.setNationWindow();
		  	break;
		  case "germany":
		  	mainFrame.dispose();
		  	Germany germReader = new Germany();
		  	germReader.setNationWindow();
		  	break;
		  case "greece":
		  	mainFrame.dispose();
		  	Greece greeReader = new Greece();
		  	greeReader.setNationWindow();
		  	break;
		  case "india":
		  	mainFrame.dispose();
		  	India indiReader = new India();
		  	indiReader.setNationWindow();
		  	break;
		  case "indonesia":
		  	mainFrame.dispose();
		  	Indonesia indoReader = new Indonesia();
		  	indoReader.setNationWindow();
		  	break;
		  case "iran":
		  	mainFrame.dispose();
		  	Iran iranReader = new Iran();
		  	iranReader.setNationWindow();
		  	break;
		  case "ireland":
		  	mainFrame.dispose();
		  	Ireland irelReader = new Ireland();
		  	irelReader.setNationWindow();
		  	break;
		  case "japan":
		  	mainFrame.dispose();
		  	Japan japaReader = new Japan();
		  	japaReader.setNationWindow();
		  	break;
		  case "korea":
		  	mainFrame.dispose();
		  	Korea koreReader = new Korea();
		  	koreReader.setNationWindow();
		  	break;
		  case "kuwait":
		  	mainFrame.dispose();
		  	Kuwait kuwaReader = new Kuwait();
		  	kuwaReader.setNationWindow();
		  	break;
		  case "malaysia":
		  	mainFrame.dispose();
		  	Malaysia malaReader = new Malaysia();
		  	malaReader.setNationWindow();
		  	break;
		  case "mexico":
		  	mainFrame.dispose();
		  	Mexico mexiReader = new Mexico();
		  	mexiReader.setNationWindow();
		  	break;
		  case "morocco":
		  	mainFrame.dispose();
		  	Morocco moroReader = new Morocco();
		  	moroReader.setNationWindow();
		  	break;
		  case "netherlands":
		  	mainFrame.dispose();
		  	Netherlands nethReader = new Netherlands();
		  	nethReader.setNationWindow();
		  	break;
		  case "new zealand":
		  	mainFrame.dispose();
		  	NewZealand newz1Reader = new NewZealand();
		  	newz1Reader.setNationWindow();
		  	break;
		  case "newzealand":
		  	mainFrame.dispose();
		  	NewZealand newz2Reader = new NewZealand();
		  	newz2Reader.setNationWindow();
		  	break;
		  case "norway":
		  	mainFrame.dispose();
		  	Norway norwReader = new Norway();
		  	norwReader.setNationWindow();
		  	break;
		  case "pakistan":
		  	mainFrame.dispose();
		  	Pakistan pakiReader = new Pakistan();
		  	pakiReader.setNationWindow();
		  	break;
		  case "palau":
		  	mainFrame.dispose();
		  	Palau palaReader = new Palau();
		  	palaReader.setNationWindow();
		  	break;
		  case "philippines":
		  	mainFrame.dispose();
		  	Philippines philReader = new Philippines();
		  	philReader.setNationWindow();
		  	break;
		  case "poland":
		  	mainFrame.dispose();
		  	Poland polaReader = new Poland();
		  	polaReader.setNationWindow();
		  	break;
		  case "portugal":
		  	mainFrame.dispose();
		  	Portugal portReader = new Portugal();
		  	portReader.setNationWindow();
		  	break;
		  case "russia":
		  	mainFrame.dispose();
		  	Russia russReader = new Russia();
		  	russReader.setNationWindow();
		  	break;
		  case "saudi arabia":
		  	mainFrame.dispose();
		  	SaudiArabia saud1Reader = new SaudiArabia();
		  	saud1Reader.setNationWindow();
		  	break;
		  case "saudiarabia":
		  	mainFrame.dispose();
		  	SaudiArabia saud2Reader = new SaudiArabia();
		  	saud2Reader.setNationWindow();
		  	break;
		  case "serbia":
		  	mainFrame.dispose();
		  	Serbia serbReader = new Serbia();
		  	serbReader.setNationWindow();
		  	break;
		  case "singapore":
		  	mainFrame.dispose();
		  	Singapore singReader = new Singapore();
		  	singReader.setNationWindow();
		  	break;
		  case "spain":
		  	mainFrame.dispose();
		  	Spain spaiReader = new Spain();
		  	spaiReader.setNationWindow();
		  	break;
		  case "sweden":
		  	mainFrame.dispose();
		  	Sweden swedReader = new Sweden();
		  	swedReader.setNationWindow();
		  	break;
		  case "switzerland":
		  	mainFrame.dispose();
		  	Switzerland switReader = new Switzerland();
		  	switReader.setNationWindow();
		  	break;
		  case "syria":
		  	mainFrame.dispose();
		  	Syria syriReader = new Syria();
		  	syriReader.setNationWindow();
		  	break;
		  case "tanzania":
		  	mainFrame.dispose();
		  	Tanzania tanzReader = new Tanzania();
		  	tanzReader.setNationWindow();
		  	break;
		  case "thailand":
		  	mainFrame.dispose();
		  	Thailand thaiReader = new Thailand();
		  	thaiReader.setNationWindow();
		  	break;
		  case "turkey":
		  	mainFrame.dispose();
		  	Turkey turkReader = new Turkey();
		  	turkReader.setNationWindow();
		  	break;
		  case "ukraine":
		  	mainFrame.dispose();
		  	Ukraine ukraReader = new Ukraine();
		  	ukraReader.setNationWindow();
		  	break;
		  case "united states":
		  	mainFrame.dispose();
		  	UnitedStates stat1Reader = new UnitedStates();
		  	stat1Reader.setNationWindow();
		  	break;
		  case "unitedstates":
		  	mainFrame.dispose();
		  	UnitedStates stat2Reader = new UnitedStates();
		  	stat2Reader.setNationWindow();
		  	break;
		  case "uzbekistan":
		  	mainFrame.dispose();
		  	Uzbekistan uzbeReader = new Uzbekistan();
		  	uzbeReader.setNationWindow();
		  	break;
		  case "vietnam":
		  	mainFrame.dispose();
		  	Vietnam vietReader = new Vietnam();
		  	vietReader.setNationWindow();
		  	break;
		  default:
		  	ErrorAnthem errorReader = new ErrorAnthem();
		  	errorReader.setErrorWindow();
		  }
		}
		else if(buttonCommand.equals("back"))
		{
			mainFrame.dispose();
			WelcomeAnthem welcomeReader = new WelcomeAnthem();
			welcomeReader.setWelcomeWindow();
		}
		else
			System.out.println("Unexpected error");
	}
	
	//mainGui
	public static void main(String[] args)
	{
		NationalAnthem mainGui = new NationalAnthem();
		mainGui.setMainWindow();
	}
}