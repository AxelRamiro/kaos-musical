package MotorDeInferencia;




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


/**
 * The <code>RuleFrame</code> class implements the GUI and application logic
 * that demonstrates boolean and fuzzy rule inferencing.
 *
 * @author Joseph P. Bigus
 * @author Jennifer Bigus
 *
 * @copyright
 * Constructing Intelligent Agents using Java
 * (C) Joseph P. Bigus and Jennifer Bigus 2001
 *
 */
public class RuleFrame extends JFrame {
  BorderLayout borderLayout1 = new BorderLayout();
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu FileMenu = new JMenu();
  JMenuItem StartMenuItem = new JMenuItem();
  JMenuItem ResetMenuItem = new JMenuItem();
  JMenuItem ExitMenuItem = new JMenuItem();
  JMenu DataMenu = new JMenu();
  JMenuItem DefaultsMenuItem = new JMenuItem();
  JMenuItem SetValuesMenuItem = new JMenuItem();
  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JPanel jPanel3 = new JPanel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JTextArea traceTextArea = new JTextArea();
  JRadioButton forwardChainRadioButton = new JRadioButton();
  JRadioButton backChainRadioButton = new JRadioButton();
  ButtonGroup buttonGroup = new ButtonGroup();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JTextField resultTextField = new JTextField();
  FlowLayout flowLayout1 = new FlowLayout();
  BorderLayout borderLayout2 = new BorderLayout();
  JMenu HelpMenu = new JMenu();
  JMenuItem AboutMenuItem = new JMenuItem();
  JMenu RuleBaseMenu = new JMenu();
  JRadioButtonMenuItem HerramientaRadioButtonMenuItem = new JRadioButtonMenuItem();



  ButtonGroup ruleBaseButtonGroup = new ButtonGroup();
  JComboBox GoalComboBox = new JComboBox();

  static BooleanRuleBase Herramienta;

  static RuleBase currentRuleBase;


  /**
   * Creates a <code>RuleFrame</code> object.
   *
   */
  public RuleFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
     Herramienta = new BooleanRuleBase("Reglas del Agente Herramienta");
     Herramienta.setDisplay(traceTextArea);
      initHerramientaRuleBase(Herramienta);
      currentRuleBase =Herramienta;


      jbInit();

      // initialize textAreas and list controls
      HerramientaRadioButtonMenuItem_actionPerformed(null);
      currentRuleBase.displayRules(traceTextArea);
      currentRuleBase.displayVariables(traceTextArea);
      forwardChainRadioButton.setSelected(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  /**
   * Initializes the GUI controls.
   *
   * @throws Exception if an error occurred during initialization
   *
   */
  private void jbInit() throws Exception {
    this.getContentPane().setLayout(borderLayout1);
    this.setSize(new Dimension(507, 522));
    this.setTitle("Sistema experto del agente herramienta");
    FileMenu.setText("Inferencia");
    StartMenuItem.setText("Comenzar");
    StartMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        StartMenuItem_actionPerformed(e);
      }
    });
    ResetMenuItem.setText("Reset");
    ResetMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ResetMenuItem_actionPerformed(e);
      }
    });
    ExitMenuItem.setText("Salir");
    ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ExitMenuItem_actionPerformed(e);
      }
    });
    DataMenu.setText("Datos");
    DefaultsMenuItem.setText("Usar valores por defecto");
    DefaultsMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        DefaultsMenuItem_actionPerformed(e);
      }
    });
    SetValuesMenuItem.setText("Fijar valores...");
    SetValuesMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        SetValuesMenuItem_actionPerformed(e);
      }
    });
    jPanel1.setPreferredSize(new Dimension(400, 100));
    jPanel1.setLayout(null);
    forwardChainRadioButton.setText("Enc. hacia adelante");
    forwardChainRadioButton.setBounds(new Rectangle(19, 19, 103, 25));
    backChainRadioButton.setText("Enc. hacia atras");
    backChainRadioButton.setBounds(new Rectangle(17, 48, 154, 25));
    jPanel2.setLayout(borderLayout2);
    HelpMenu.setText("Ayuda");
    AboutMenuItem.setText("Acerca de");
    AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AboutMenuItem_actionPerformed(e);
      }
    });
    RuleBaseMenu.setText("Base de reglas");
    HerramientaRadioButtonMenuItem.setText("Agente Herramienta");
    HerramientaRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        HerramientaRadioButtonMenuItem_actionPerformed(e);
      }
    });
    HerramientaRadioButtonMenuItem.setSelected(true);
    ruleBaseButtonGroup.add(HerramientaRadioButtonMenuItem);

    GoalComboBox.setBounds(new Rectangle(170, 51, 126, 23));
    buttonGroup.add(forwardChainRadioButton);
    buttonGroup.add(backChainRadioButton);
    jLabel1.setText("Meta");
    jLabel1.setBounds(new Rectangle(171, 28, 106, 17));
    jLabel2.setText("Resultado");
    jLabel2.setBounds(new Rectangle(313, 29, 103, 17));
    resultTextField.setBounds(new Rectangle(312, 51, 176, 21));
    jPanel3.setLayout(flowLayout1);
    flowLayout1.setHgap(20);
    jMenuBar1.add(FileMenu);
    jMenuBar1.add(RuleBaseMenu);
    jMenuBar1.add(DataMenu);
    jMenuBar1.add(HelpMenu);
    FileMenu.add(StartMenuItem);
    FileMenu.addSeparator();
    FileMenu.add(ResetMenuItem);
    FileMenu.addSeparator();
    FileMenu.add(ExitMenuItem);
    DataMenu.add(DefaultsMenuItem);
    DataMenu.add(SetValuesMenuItem);
    this.getContentPane().add(jPanel1, BorderLayout.NORTH);
    jPanel1.add(forwardChainRadioButton, null);
    jPanel1.add(backChainRadioButton, null);
    jPanel1.add(resultTextField, null);
    jPanel1.add(GoalComboBox, null);
    jPanel1.add(jLabel1, null);
    jPanel1.add(jLabel2, null);
    this.getContentPane().add(jPanel2, BorderLayout.CENTER);
    jPanel2.add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(traceTextArea, null);
    this.getContentPane().add(jPanel3, BorderLayout.SOUTH);
    HelpMenu.add(AboutMenuItem);
    RuleBaseMenu.add(HerramientaRadioButtonMenuItem);
    setJMenuBar(jMenuBar1);
  }


  /**
   * Closes or repaints the window.
   *
   * @param e the WindowEvent object generated when window is closed or
   *           activated
   *
   */
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    } if (e.getID() == WindowEvent.WINDOW_ACTIVATED) {
      e.getWindow().repaint();
    }
  }





  /**
   * Initializes theHerramienta rule base.
   *
   * @param rb the BooleanRuleBase object to be initialized
   *
   */
  public void initHerramientaRuleBase(BooleanRuleBase rb) {

   RuleVariable material;
   RuleVariable Familia;
   RuleVariable Numeroherramientas;
   RuleVariable Suaje1;
   RuleVariable Suaje2;
   RuleVariable Suaje3;
   RuleVariable TIPOCOMPRA;
   RuleVariable Refile;
   RuleVariable Autoadherible;

        material = new RuleVariable(rb, "material");
        material.setPromptText("Cuales son las primeras letras del material?");

        Familia = new RuleVariable(rb, "Familia");
        Familia.setPromptText("Cual es la familia de los materiales?");

        TIPOCOMPRA = new  RuleVariable(rb, "Tipo Compra");
        TIPOCOMPRA.setPromptText("Cual es el tipo de compra?");

        Suaje1 = new  RuleVariable(rb, "Suaje1");
        Suaje1.setPromptText("Cual es el suaje 1?");

        Suaje2=new  RuleVariable(rb, "Suaje2");
        Suaje2.setPromptText("Cual es el suaje 2?");

 	Suaje3=new  RuleVariable(rb, "Suaje3");
 	Suaje3.setPromptText("Cual es el suaje 3?");

  	Numeroherramientas = new RuleVariable(rb,"NUMERO DE HERRAMIENTAS");
  	Numeroherramientas.setPromptText("Cual es el numero de herramientas?");

        Refile = new RuleVariable(rb,"Refile");
        Refile.setPromptText("Cual es el refile?");
        Autoadherible = new RuleVariable(rb,"Autoadherible");
        Autoadherible.setPromptText("Autoadherible?");
        Condition igual = new Condition("=");
        Condition menor_que = new Condition("<");
        Condition mayor_que = new Condition(">");
        Condition diferente = new Condition("!=");


  Rule Reglamaterial1 = new Rule (rb,"regla_material_1", new Clause(material, igual, "CARTS"),new Clause(Familia, igual, "Carton"));
  Rule Reglamaterial2 = new Rule (rb,"regla_material_2", new Clause[]
        			{
        			 new Clause(material, igual, "CARSU"),

        			} ,new Clause(Familia, igual, "CARTON"));
  Rule Reglamaterial3 = new Rule (rb,"regla_material_3", new Clause[]
        			{
        			 new Clause(material, igual, "CARTD"),

        			} ,new Clause(Familia, igual, "CARTON"));
  Rule Reglamaterial4 = new Rule (rb,"NYL", new Clause[]
        			{
        			 new Clause(material, igual, "NYL"),

        			} ,new Clause(Familia, igual, "TELAS"));

        Rule Reglamaterial5 = new Rule (rb,"regla_material_5", new Clause[]
        			{
        			 new Clause(material, igual, "TESLI"),

        			} ,new Clause(Familia, igual, "TELAS"));

        Rule Reglamaterial6 = new Rule (rb,"regla_material_6", new Clause[]
        			{
        			 new Clause(material, igual, "POLIE"),

        			} ,new Clause(Familia, igual, "TELAS"));

        Rule Reglamaterial7 = new Rule (rb,"regla_material_7", new Clause[]
        			{
        			 new Clause(material, igual, "VALERON"),

        			} ,new Clause(Familia, igual, "TELAS"));


        Rule Reglamaterial8 = new Rule (rb,"regla_material_8", new Clause[]
        			{
        			 new Clause(material, igual, "BOPBC"),

        			} ,new Clause(Familia, igual, "BOPP"));

        Rule Reglamaterial9 = new Rule (rb,"regla_material_9", new Clause[]
        			{
        			 new Clause(material, igual, "BOPPM"),

        			} ,new Clause(Familia, igual, "BOPP"));

        Rule Reglamaterial10 = new Rule (rb,"regla_material_10", new Clause[]
        			{
        			 new Clause(material, igual, "BOPTR"),

        			} ,new Clause(Familia, igual, "BOPP"));


        Rule Reglamaterial11 = new Rule (rb,"regla_material_11", new Clause[]
        			{
        			 new Clause(material, igual, "KIMNO"),

        			} ,new Clause(Familia, igual, "KIMDURA"));

        Rule Reglamaterial12 = new Rule (rb,"regla_material_12", new Clause[]
        			{
        			 new Clause(material, igual, "KIMSI"),

        			} ,new Clause(Familia, igual, "KINDURA"));

        Rule Reglamaterial13 = new Rule (rb,"regla_material_13", new Clause[]
        			{
        			 new Clause(material, igual, "KIMTE"),

        			} ,new Clause(Familia, igual, "KIMDURA"));
       Rule Reglamaterial14 = new Rule (rb,"regla_material_14", new Clause[]
        			{
        			 new Clause(material, igual, "VALER"),

        			} ,new Clause(Familia, igual, "TELAS"));



        Rule Reglamaterial15 = new Rule (rb,"regla_material_15", new Clause[]
        			{
        			// new Clause(material, igual, "Papel autoadherible"),
                                new Clause(material, igual, "AUTTR"),
        			} ,new Clause(Familia, igual, "PAPEL"));

        Rule Reglamaterial16 = new Rule (rb,"regla_material_16", new Clause[]
        			{
        			 new Clause(material, igual, "VARIO"),

        			} ,new Clause(Familia, igual, "VARIOS"));


        Rule Reglamaterial17 = new Rule (rb,"regla_material_17", new Clause[]
        			{
        			 new Clause(material, igual, "ORONO"),

        			} ,new Clause(Familia, igual, "PAPEL"));

        Rule Reglamateria18 = new Rule (rb,"regla_material_18", new Clause[]
        			{
        			 new Clause(material, igual, "OROAG"),

        			} ,new Clause(Familia, igual, "PAPEL"));

        Rule Reglamaterial19 = new Rule (rb,"regla_material_19", new Clause[]
        			{
        			 new Clause(material, igual, "PLANO"),


        			} ,new Clause(Familia, igual, "PAPEL"));


       Rule Reglamaterial20 = new Rule (rb,"regla_material_20", new Clause[]
        			{
        			 new Clause(material, igual, "PLAAG"),


        			} ,new Clause(Familia, igual, "PAPEL"));

       Rule Reglamaterial21 = new Rule (rb,"regla_material_21", new Clause[]
        			{
        			 new Clause(material, igual, "TERMI"),


        			} ,new Clause(Familia, igual, "PAPEL"));

       Rule Reglamaterial22 = new Rule (rb,"regla_material_22", new Clause[]
        			{
        			 new Clause(material, igual, "CRYST"),


        			} ,new Clause(Familia, igual, "PAPEL"));

        Rule Reglamaterial23 = new Rule (rb,"regla_material_23", new Clause[]
        			{
        			 new Clause(material, igual, "CDATA"),


        			} ,new Clause(Familia, igual, "PAPEL"));

       Rule Reglamaterial24 = new Rule (rb,"regla_material_24", new Clause[]
        			{
        			 new Clause(material, igual, "CALTA"),


        			} ,new Clause(Familia, igual, "PAPEL"));

      Rule Reglamaterial25 = new Rule (rb,"regla_material_25", new Clause[]
        			{
        			 new Clause(material, igual, "COUSE"),


        			} ,new Clause(Familia, igual, "PAPEL"));

      Rule Reglamaterial26 = new Rule (rb,"regla_material_26", new Clause[]
        			{
        			 new Clause(material, igual, "COUCH"),


        			} ,new Clause(Familia, igual, "PAPEL"));

      Rule Reglamaterial27 = new Rule (rb,"regla_material_27", new Clause[]
        			{
        			 new Clause(material, igual, "DUAL"),


        			} ,new Clause(Familia, igual, "PAPEL"));

      Rule Reglamaterial28 = new Rule (rb,"regla_material_28", new Clause[]
        			{
        			 new Clause(material, igual, "ELITE"),

        			} ,new Clause(Familia, igual, "TELAS"));
      //REGLAS DE COMPRA

        Rule Reglacompra1 = new Rule (rb,"regla_compra_1", new Clause(material, igual, "CARTS"), new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra2 = new Rule (rb,"regla_compra_2", new Clause(material, igual, "CARSU"), new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra3 = new Rule (rb,"regla_compra_3", new Clause[]
        			{
        			 new Clause(material, igual, "CARTD"),

        			} ,new Clause(TIPOCOMPRA, igual, "ROLLO"));




        Rule Reglacompra4 = new Rule (rb,"NYL", new Clause[]
        			{
        			 new Clause(material, igual, "NYL"),

        			} ,new Clause(TIPOCOMPRA, igual, "ROLLO"));

        Rule Reglacompra5 = new Rule (rb,"regla_compra_5", new Clause[]
        			{
        			 new Clause(material, igual, "TESLI"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra6 = new Rule (rb,"regla_compra_6", new Clause[]
        			{
        			 new Clause(material, igual, "POLIE"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra7 = new Rule (rb,"regla_compra_7", new Clause[]
        			{
        			 new Clause(material, igual, "VALERON"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));


        Rule Reglacompra8 = new Rule (rb,"regla_compra_8", new Clause[]
        			{
        			 new Clause(material, igual, "BOPBC"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra9 = new Rule (rb,"regla_compra_9", new Clause[]
        			{
        			 new Clause(material, igual, "BOPPM"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra10 = new Rule (rb,"regla_compra_10", new Clause[]
        			{
        			 new Clause(material, igual, "BOPTR"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));


        Rule Reglacompra11 = new Rule (rb,"regla_compra_11", new Clause[]
        			{
        			 new Clause(material, igual, "KIMNO"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra12 = new Rule (rb,"regla_compra_12", new Clause[]
        			{
        			 new Clause(material, igual, "KIMSI"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra13 = new Rule (rb,"regla_compra_13", new Clause[]
        			{
        			 new Clause(material, igual, "KIMTE"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));
       Rule Reglacompra14 = new Rule (rb,"regla_compra_14", new Clause[]
        			{
        			 new Clause(material, igual, "VALER"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));



        Rule Reglacompra15 = new Rule (rb,"regla_compra_15", new Clause[]
        			{
        			// new Clause(material, igual, "Papel autoadherible"),
                                new Clause(material, igual, "AUTTR"),
        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra16 = new Rule (rb,"regla_compra_16", new Clause[]
        			{
        			 new Clause(material, igual, "VARIO"),

        			} ,new Clause(TIPOCOMPRA, igual, "ROLLO"));


        Rule Reglacompra17 = new Rule (rb,"regla_compra_17", new Clause[]
        			{
        			 new Clause(material, igual, "ORONO"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra18 = new Rule (rb,"regla_compra_18", new Clause[]
        			{
        			 new Clause(material, igual, "OROAG"),

        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra19 = new Rule (rb,"regla_compra_19", new Clause[]
        			{
        			 new Clause(material, igual, "PLANO"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));


       Rule Reglacompra20 = new Rule (rb,"regla_compra_20", new Clause[]
        			{
        			 new Clause(material, igual, "PLAAG"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

       Rule Reglacompra21 = new Rule (rb,"regla_compra_21", new Clause[]
        			{
        			 new Clause(material, igual, "TERMI"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

       Rule Reglacompra22 = new Rule (rb,"regla_compra_22", new Clause[]
        			{
        			 new Clause(material, igual, "CRYST"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

        Rule Reglacompra23 = new Rule (rb,"regla_compra_23", new Clause[]
        			{
        			 new Clause(material, igual, "CDATA"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

       Rule Reglacompra24 = new Rule (rb,"regla_compra_24", new Clause[]
        			{
        			 new Clause(material, igual, "CALTA"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

      Rule Reglacompra25 = new Rule (rb,"regla_compra_25", new Clause[]
        			{
        			 new Clause(material, igual, "COUSE"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

      Rule Reglacompra26 = new Rule (rb,"regla_compra_26", new Clause[]
        			{
        			 new Clause(material, igual, "COUCH"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

      Rule Reglacompra27 = new Rule (rb,"regla_compra_27", new Clause[]
        			{
        			 new Clause(material, igual, "DUAL"),


        			} ,new Clause(TIPOCOMPRA, igual, "ROLLO"));

      Rule Reglacompra28 = new Rule (rb,"regla_compra_28", new Clause[]
        			{
        			 new Clause(material, igual, "ELITE"),


        			} ,new Clause(TIPOCOMPRA, igual, "MASTER"));

       Rule herramienta1 = new Rule (rb,"herramienta1", new Clause[]
        			{
        			 new Clause(Suaje1, igual, ""),
                                 new Clause(Suaje2, igual, ""),
                                 new Clause(Suaje3, igual, ""),

        			} ,new Clause(Numeroherramientas, igual, "3"));

      Rule herramienta2 = new Rule (rb,"herramienta2", new Clause[]
        			{
        			 new Clause(Suaje1, diferente, ""),
                                 new Clause(Suaje2, igual, ""),
                                 new Clause(Suaje3, igual, ""),

        			} ,new Clause(Numeroherramientas, igual, "1"));

      Rule herramienta3 = new Rule (rb,"herramienta3", new Clause[]
        			{
        			 new Clause(Suaje1, igual, ""),
                                 new Clause(Suaje2, diferente, ""),
                                 new Clause(Suaje3, igual, ""),

        			} ,new Clause(Numeroherramientas, igual, "1"));

     Rule herramienta4 = new Rule (rb,"herramienta4", new Clause[]
        			{
        			 new Clause(Suaje1, igual, ""),
                                 new Clause(Suaje2, igual, ""),
                                 new Clause(Suaje3, diferente, ""),

        			} ,new Clause(Numeroherramientas, igual, "1"));

     Rule herramienta5 = new Rule (rb,"herramienta5", new Clause[]
        			{
        			 new Clause(Suaje1, igual, ""),
                                 new Clause(Suaje2, diferente, ""),
                                 new Clause(Suaje3, diferente, ""),

        			} ,new Clause(Numeroherramientas, igual, "2"));

     Rule herramienta6 = new Rule (rb,"herramienta6", new Clause[]
        			{
        			 new Clause(Suaje1, diferente, ""),
                                 new Clause(Suaje2, igual, ""),
                                 new Clause(Suaje3, diferente, ""),

        			} ,new Clause(Numeroherramientas, igual, "2"));

     Rule herramienta7 = new Rule (rb,"herramienta7", new Clause[]
        			{
        			 new Clause(Suaje1, diferente, ""),
                                 new Clause(Suaje2, diferente, ""),
                                 new Clause(Suaje3, igual, ""),

        			} ,new Clause(Numeroherramientas, igual, "2"));

    Rule herramienta8 = new Rule (rb,"herramienta8", new Clause[]
        			{
        			 new Clause(Suaje1, igual, ""),
                                 new Clause(Suaje2, igual, ""),
                                 new Clause(Suaje3, igual, ""),

        			} ,new Clause(Numeroherramientas, igual, "1"));
      // reglas de refile



        Rule Autoadherible1 = new Rule (rb,"regla_autoadherible1", new Clause(material, igual, "CARTS"),new Clause(Autoadherible, igual, "NA"));

        Rule Autoadherible2 = new Rule (rb,"regla_autoadherible2", new Clause[]
        			{
        			 new Clause(material, igual, "CARSU"),

        			} ,new Clause(Autoadherible, igual, "NA"));
        Rule Autoadherible3 = new Rule (rb,"regla_autoadherible3", new Clause[]
        			{
        			 new Clause(material, igual, "CARTD"),

        			} ,new Clause(Autoadherible, igual, "NA"));




        Rule Autoadherible4 = new Rule (rb,"regla_autoadherible4", new Clause[]
        			{
        			 new Clause(material, igual, "NYL"),

        			} ,new Clause(Autoadherible, igual, "NA"));

        Rule Autoadherible5 = new Rule (rb,"regla_autoadherible5", new Clause[]
        			{
        			 new Clause(material, igual, "TESLI"),

        			} ,new Clause(Autoadherible, igual, "NA"));

        Rule Autoadherible6 = new Rule (rb,"regla_autoadherible6", new Clause[]
        			{
        			 new Clause(material, igual, "POLIE"),

        			} ,new Clause(Autoadherible, igual, "NA"));

        Rule Autoadherible7 = new Rule (rb,"regla_autoadherible7", new Clause[]
        			{
        			 new Clause(material, igual, "VALERON"),

        			} ,new Clause(Autoadherible, igual, "NA"));


        Rule Autoadherible8 = new Rule (rb,"regla_autoadherible8", new Clause[]
        			{
        			 new Clause(material, igual, "BOPBC"),

        			} ,new Clause(Autoadherible, igual, "AU"));

        Rule Autoadherible9 = new Rule (rb,"regla_autoadherible9", new Clause[]
        			{
        			 new Clause(material, igual, "BOPPM"),

        			} ,new Clause(Autoadherible, igual, "AU"));

        Rule Autoadherible10 = new Rule (rb,"regla_autoadherible10", new Clause[]
        			{
        			 new Clause(material, igual, "BOPTR"),

        			} ,new Clause(Autoadherible, igual, "AU"));


        Rule Autoadherible11 = new Rule (rb,"regla_autoadherible11", new Clause[]
        			{
        			 new Clause(material, igual, "KIMNO"),

        			} ,new Clause(Autoadherible, igual, "AU"));

        Rule Autoadherible12 = new Rule (rb,"regla_autoadherible12", new Clause[]
        			{
        			 new Clause(material, igual, "KIMSI"),

        			} ,new Clause(Autoadherible, igual, "AU"));

        Rule Autoadherible13 = new Rule (rb,"regla_autoadherible13", new Clause[]
        			{
        			 new Clause(material, igual, "KIMTE"),

        			} ,new Clause(Autoadherible, igual, "AU"));
       Rule Autoadherible14 = new Rule (rb,"regla_autoadherible14", new Clause[]
        			{
        			 new Clause(material, igual, "VALER"),

        			} ,new Clause(Autoadherible, igual, "NA"));



        Rule Autoadherible15 = new Rule (rb,"regla_autoadherible15", new Clause[]
        			{
        			// new Clause(material, igual, "Papel autoadherible"),
                                new Clause(material, igual, "AUTTR"),
        			} ,new Clause(Autoadherible, igual, "NA"));

        Rule Autoadherible16 = new Rule (rb,"regla_autoadherible16", new Clause[]
        			{
        			 new Clause(material, igual, "VARIO"),

        			} ,new Clause(Autoadherible, igual, "NA"));


        Rule Autoadherible17 = new Rule (rb,"regla_autoadherible17", new Clause[]
        			{
        			 new Clause(material, igual, "ORONO"),

        			} ,new Clause(Autoadherible, igual, "NA"));

        Rule Autoadherible18 = new Rule (rb,"regla_autoadherible18", new Clause[]
        			{
        			 new Clause(material, igual, "OROAG"),

        			} ,new Clause(Autoadherible, igual, "AU"));

        Rule Autoadherible19 = new Rule (rb,"regla_autoadherible19", new Clause[]
        			{
        			 new Clause(material, igual, "PLANO"),


        			} ,new Clause(Autoadherible, igual, "AU"));


       Rule Autoadherible20 = new Rule (rb,"regla_autoadherible20", new Clause[]
        			{
        			 new Clause(material, igual, "PLAAG"),


        			} ,new Clause(Autoadherible, igual, "AU"));

       Rule Autoadherible21 = new Rule (rb,"regla_autoadherible21", new Clause[]
        			{
        			 new Clause(material, igual, "TERMI"),


        			} ,new Clause(Autoadherible, igual, "AU"));

       Rule Autoadherible22 = new Rule (rb,"regla_autoadherible22", new Clause[]
        			{
        			 new Clause(material, igual, "CRYST"),


        			} ,new Clause(Autoadherible, igual, "AU"));

        Rule Autoadherible23 = new Rule (rb,"regla_autoadherible23", new Clause[]
        			{
        			 new Clause(material, igual, "CDATA"),


        			} ,new Clause(Autoadherible, igual, "AU"));

       Rule Autoadherible24 = new Rule (rb,"regla_autoadherible24", new Clause[]
        			{
        			 new Clause(material, igual, "CALTA"),


        			} ,new Clause(Autoadherible, igual, "NA"));

      Rule Autoadherible25 = new Rule (rb,"regla_autoadherible25", new Clause[]
        			{
        			 new Clause(material, igual, "COUSE"),


        			} ,new Clause(Autoadherible, igual, "NA"));

      Rule Autoadherible26 = new Rule (rb,"regla_autoadherible26", new Clause[]
        			{
        			 new Clause(material, igual, "COUCH"),


        			} ,new Clause(Autoadherible, igual, "AU"));

      Rule Autoadherible27 = new Rule (rb,"regla_autoadherible27", new Clause[]
        			{
        			 new Clause(material, igual, "DUAL"),


        			} ,new Clause(Autoadherible, igual, "NA"));

      Rule Autoadherible28 = new Rule (rb,"regla_autoadherible28", new Clause[]
        			{
        			 new Clause(material, igual, "ELITE"),

        			} ,new Clause(Autoadherible, igual, "NA"));


       Rule Refile1 = new Rule (rb,"Refile1", new Clause[]
        			{
        			 new Clause(Autoadherible, igual, "AU"),

        			} ,new Clause(Refile, igual, "1 mm AMBOS LADOS"));

  }


  /**
   * Initializes the motor rule base.
   *
   * @param rb the FuzzyRuleBase object to be initialized
   *
   */
  /**
   * Sets values for theHerramienta forward chaining demonstration.
   *
   * @param rb the BooleanRuleBase object set for forward chaining
   *
   */
  public void demoHerramientaFC(BooleanRuleBase rb) {
    traceTextArea.append("\n --- Fijando los valores para la Demo ForwardChain Demo ---\n ");

    // should be a Mini-Van
    rb.setVariableValue("Refile", "");
    rb.setVariableValue("material", "VALERON");
    rb.setVariableValue("Suaje1", "R047");
    rb.setVariableValue("Suaje2", "Y001");
    rb.setVariableValue("Suaje3", "");

    rb.displayVariables(traceTextArea);
  }


  /**
   * Sets values for theHerramienta backward chaining demonstration.
   *
   * @param rb the BooleanRuleBase object set for backward chaining
   *
   */
  public void demoHerramientaBC(BooleanRuleBase rb) {
    traceTextArea.append("\n --- fijando los valores para la Demo BackwardChain Demo ---\n ");

    // should be a minivan
    rb.setVariableValue("vehicle", null);
    rb.setVariableValue("vehicleType", null);
    rb.setVariableValue("size", "medium");
    rb.setVariableValue("num_wheels", "4");
    rb.setVariableValue("num_doors", "3");
    rb.setVariableValue("motor", "yes");
    rb.displayVariables(traceTextArea);
  }


  /**
   * Sets values for the bugs backward chaining demonstration.
   *
   * @param rb the BooleanRuleBase object set for backward chaining
   *
   */

  /**
   * Starts the inferencing cycle.
   *
   * @param e the ActionEvent object generated when start was selected
   *
   */
  void StartMenuItem_actionPerformed(ActionEvent e) {
    String goal = null;
    RuleVariable goalVar = (RuleVariable) GoalComboBox.getSelectedItem();

    traceTextArea.append("\n --- Comenzando ciclo de inferencia --- \n");
    currentRuleBase.displayVariables(traceTextArea);
    if (forwardChainRadioButton.isSelected() == true) {
      currentRuleBase.forwardChain();
    }
    if (backChainRadioButton.isSelected() == true) {
      if (currentRuleBase instanceof BooleanRuleBase) {
        if (goalVar == null) {
          traceTextArea.append("La variable meta no esta definida!");  // give warning
        } else {
          goal = goalVar.getName();
        }
      }
      currentRuleBase.backwardChain(goal);
    }
    currentRuleBase.displayVariables(traceTextArea);
    traceTextArea.append("\n --- finalizando ciclo de inferencia --- \n");

    // report back chain results if any
    if (goalVar != null) {
      Object result = goalVar.getValue();

      if (result == null) {
        result = "null";
      }
      resultTextField.setText((String) result);
    }
  }


  /**
   * Resets the current rule base.
   *
   * @param e the ActionEvent object generated when reset was selected
   *
   */
  void ResetMenuItem_actionPerformed(ActionEvent e) {

    // Clear the text for TextArea
    traceTextArea.setText("");
    currentRuleBase.reset();
  }


  /**
   * Exits the application.
   *
   * @param e the ActionEvent object generated when exit was selected
   *
   */
  void ExitMenuItem_actionPerformed(ActionEvent e) {
    System.exit(0);
  }


  /**
   *  Displays a dialog and allow the user to set variable values.
   *
   * @param e the ActionEvent object generated when the set values was selected
   */
  void SetValuesMenuItem_actionPerformed(ActionEvent e) {

    // open the dialog to set values in the rulebase
    if (currentRuleBase instanceof BooleanRuleBase) {
      BooleanRuleBaseVariablesDialog dlg = new BooleanRuleBaseVariablesDialog(this, "Set Boolean Rule Base Variables", true);

      dlg.setRuleBase((BooleanRuleBase) currentRuleBase);
      Point loc = this.getLocation();

      dlg.setLocation(loc.x + 20, loc.y + 20);
      dlg.show();
    }
  }


  /**
   * Sets the defaults.
   *
   * @param e the ActionEvent object generated when default was selected
   *
   */
  void DefaultsMenuItem_actionPerformed(ActionEvent e) {

    // set all rulebase values to their default (demo?) values
    if (forwardChainRadioButton.isSelected()) {
      if (currentRuleBase ==Herramienta) {
        demoHerramientaFC((BooleanRuleBase) currentRuleBase);
      }


    } else {
      if (currentRuleBase ==Herramienta) {
        demoHerramientaBC((BooleanRuleBase) currentRuleBase);
      }

    }
  }


  /**
   *   Changes the context from one rule base to another and
   *   clears the text areas.
   */
  void switchRuleBase() {
    traceTextArea.setText("");  // clear the text area
    resultTextField.setText("");
    currentRuleBase.reset();    // reset the rule base
    currentRuleBase.displayRules(traceTextArea);
    currentRuleBase.displayVariables(traceTextArea);
    if (GoalComboBox.getItemCount() > 0) {
      GoalComboBox.removeAllItems();
    }
    Vector goalVars = currentRuleBase.getGoalVariables();

    for (int i = 0; i < goalVars.size(); i++) {
      GoalComboBox.addItem(goalVars.elementAt(i));
    }
  }


  /**
   * Displays the About dialog.
   *
   * @param e the ActionEvent object generated when About was selected
   *
   */
  void AboutMenuItem_actionPerformed(ActionEvent e) {
    AboutDialog dlg = new AboutDialog(this, "Acerca de la Applicacion", true);
    Point loc = this.getLocation();

    dlg.setLocation(loc.x + 50, loc.y + 50);
    dlg.show();
  }


  /**
   * Switches to theHerramienta rule base.
   *
   * @param e the ActionEvent object generated when theHerramienta button was clicked
   *
   */
  void HerramientaRadioButtonMenuItem_actionPerformed(ActionEvent e) {
    currentRuleBase =Herramienta;
    setTitle("Base de reglas - Agente Herramienta");
    switchRuleBase();
    GoalComboBox.setSelectedItem(((BooleanRuleBase) currentRuleBase).getVariable("vehicle"));
  }




}
