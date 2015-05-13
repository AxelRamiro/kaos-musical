package MotorDeInferencia;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;


/**
 * The <code>BooleanRuleBaseVariablesDialog</code> class implements the
 * dialog for the boolean rule base variables.
 *
 * @author Joseph P. Bigus
 * @author Jennifer Bigus
 *
 * @copyright
 * Constructing Intelligent Agents using Java
 * (C) Joseph P. Bigus and Jennifer Bigus 1997, 2001
 *
 */
public class BooleanRuleBaseVariablesDialog extends JDialog implements ListSelectionListener, MouseListener {
  JPanel panel1 = new JPanel();
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  JButton closeButton = new JButton();
  JPanel jPanel2 = new JPanel();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JList variableList = new JList();
  BooleanRuleBase ruleBase = null;
  JScrollPane jScrollPane1 = new JScrollPane();

  JTextField valores = new JTextField();
  JLabel jLabel3 = new JLabel();

    JButton botfijar = new JButton( "Fijar" );
  /**
   * Creates a <code>BooleanRuleBaseVariablesDialog</code> instance
   * with the given frame, title, and modal setting.
   *
   * @param frame the Frame object for this dialog
   * @param title the String that is the title of this dialog
   * @param modal the boolean modal flag
   */
  public BooleanRuleBaseVariablesDialog(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }


  /**
   * Creates a <code>BooleanRuleBaseVariablesDialog</code> object.
   *
   */
  public BooleanRuleBaseVariablesDialog() {
    this(null, "", false);
  }


  /**
   * Initializes the dialog.
   *
   * @throws Exception if any errors occur
   *
   */
  void jbInit() throws Exception {
    panel1.setLayout(borderLayout1);
    closeButton.setText("Cerrar");
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        closeButton_actionPerformed(e);
      }
    });
    jPanel2.setLayout(null);
    jLabel1.setText("Variable");
    jLabel1.setBounds(new Rectangle(24, 21, 126, 17));
    jLabel2.setText("Valor");
    jLabel2.setBounds(new Rectangle(216, 22, 41, 17));

    variableList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    variableList.addListSelectionListener(this);

    panel1.setMinimumSize(new Dimension(405, 320));
    panel1.setPreferredSize(new Dimension(405, 320));
    jScrollPane1.setBounds(new Rectangle(20, 48, 186, 183));
    botfijar.setBounds(new Rectangle(216, 70, 70, 17));
    valores.setBounds(new Rectangle(216, 48, 70, 17));
    valores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        valores_actionPerformed(e);
      }
    });

    jLabel3.setText("Selecciona una variable para cambiar su valor");
    jLabel3.setBounds(new Rectangle(25, 241, 364, 16));
    getContentPane().add(panel1);
    panel1.add(jPanel1, BorderLayout.SOUTH);
    jPanel1.add(closeButton, null);
    panel1.add(jPanel2, BorderLayout.CENTER);
    jPanel2.add(jScrollPane1, null);
    jScrollPane1.getViewport().add(variableList, null);
    jPanel2.add(jLabel1, null);
    jPanel2.add(jLabel2, null);
    jPanel2.add(valores, null);
    jPanel2.add(jLabel3, null);
    jPanel2.add(botfijar,null );

    // Ahora registramos el boton para que reciba los eventos del
    // raton a traves del interfaz MouseListener
    botfijar.addMouseListener( this );

  }


  /**
   * Initializes the list of variables for this dialog.
   *
   */
  protected void initialize() {
    Vector vars = new Vector();
    Enumeration enume = ruleBase.variableList.elements();

    while (enume.hasMoreElements()) {
      vars.addElement(enume.nextElement());
    }
    variableList.setListData(vars);
  }


  /**
   * Performs the action for the close button
   *
   * @param e the ActionEvent object that was generated for the close
   *
   */
  void closeButton_actionPerformed(ActionEvent e) {
    dispose();
  }


  /**
   * Sets the rule base for this dialog.
   *
   * @param ruleBase the BooleanRuleBase object for this dialog
   *
   */
  public void setRuleBase(BooleanRuleBase ruleBase) {
    this.ruleBase = ruleBase;
    initialize();  // file variable list
  }


  /**
   * Fills the value combo box and set initial value to match
   * the variable's current value, depending on the user selection.
   *
   * @param e the ListSelectionEvent object for the value combo box
   *          selection
   */
  public void valueChanged(ListSelectionEvent e) {
    RuleVariable ruleVar = (RuleVariable) variableList.getSelectedValue();

    // select the current value
    String value = ruleVar.getValue();
    valores.setText (value);
  }


  /**
   * Peforms the action for the value combo box.
   *
   * @param e the ActionEvent object for the value combo box
   *
   */
  void valores_actionPerformed(ActionEvent e) {

    RuleVariable ruleVar = (RuleVariable) variableList.getSelectedValue();
    String varValue =  valores.getText();

    if ((varValue == null) || varValue.equals("<null>")) {
      ruleVar.setValue("");  // set value to null, undefined
    } else {
      ruleVar.setValue(varValue);
    }
  }



  public void mouseClicked( MouseEvent evt ) {
    // Cuando se pulsa el boton Consulta, se recoge el contenido del
    // campo de texto txfConsulta y se le pasa al metodo Select, que
    // es el que va a realizar la consulta y devolver el resultado
    // que se va a presentar en la zona de salida
    if( evt.getComponent() == botfijar ) {
       RuleVariable ruleVar = (RuleVariable) variableList.getSelectedValue();
       String varValue =  valores.getText();

   	 if ((varValue == null) || varValue.equals("<null>")) {
      		ruleVar.setValue("");  // set value to null, undefined
    	} else
    	{
     	 	ruleVar.setValue(varValue);
   	}

      }


    }


  // Se implementan vacios el resto de los metodos del interfaz de
  // eventos del raton, MouseListener. Si se quiere evitar, tambien es
  // posible utilizar MouseAdapter, que tiene implementados, pero sin
  // acciones asignadas, todos estos metodos
  public void mouseEntered( MouseEvent evt ) {}
  public void mouseExited( MouseEvent evt ) {}
  public void mousePressed( MouseEvent evt ) {}
  public void mouseReleased( MouseEvent evt ) {}




}


