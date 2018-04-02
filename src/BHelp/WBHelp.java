
package BHelp;

/**
 *
 * @author inesm
 */


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class WBHelp extends javax.swing.JInternalFrame {

	/**
	 * Creates new form Whelp
	 */
	
	public WBHelp() {
		initComponents();
		setTitle("Sistema Brasilia HELP ");
		
        //propiedades de splipanel
        jSplitPane1.setOneTouchExpandable(true);
        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(10);        
        //propiedades de editorpanel
        jEditorPane1.setEditable(false);        
        jEditorPane1.setContentType( "text/html" );
        jEditorPane1.getDocument().putProperty("IgnoreCharsetDirective", Boolean.TRUE);
        jEditorPane1.setText( readFile("sistema") );//lee el primer archivo
        jEditorPane1.setCaretPosition(0);

        //jtree 
        jTree1.setModel(createTreeModel());       
        //listener
        jTree1.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {

            @Override
            public void valueChanged(TreeSelectionEvent e) {             
                //cuando se realice un clic sobre algun item, se carga el archivo HTML correspondiente
                TreePath path = jTree1.getSelectionPath();
                if( path!=null )
                {
                    DefaultMutableTreeNode NodoSeleccionado = (DefaultMutableTreeNode)path.getLastPathComponent();              
                    //Obtiene el nombre del archivo HTML correspondiente al item seleccionado
                    String archivo = ((HelpArchivo) NodoSeleccionado.getUserObject()).getArchivo();
                    jEditorPane1.setText( readFile(archivo) );
                    jEditorPane1.setCaretPosition(0);
                }
            }            
        }); 
        //iconos del jtree
        DefaultTreeCellRenderer render= (DefaultTreeCellRenderer)jTree1.getCellRenderer();
        render.setLeafIcon(new ImageIcon(getClass().getResource("sheet.jpg")));        
        render.setOpenIcon(new ImageIcon(getClass().getResource("open.jpg")));
        render.setClosedIcon(new ImageIcon(getClass().getResource("close.jpg")));
		
	}
	private String  help_path =System.getProperty("user.dir")+ "/help/";





    /**
 * Metodo para leer un archivo HTML
 * @param String fileName
 * @return String 
 */
    private String readFile(String fileName)
    {        
      StringBuilder result = new StringBuilder("");     
      File  file = new File( help_path + fileName + ".html"); 
 try {
            if( file.exists() )
            {
                Scanner scanner = new Scanner(file);
                //lee archivo linea por linea
                while (scanner.hasNextLine()) {
                   String line = replaceSRC(scanner.nextLine().trim());
                   result.append(line);                        
                } 
                scanner.close(); 
            }    
            else
            {
                JOptionPane.showMessageDialog(new JFrame(), "El archivo ["+fileName+".html] no existe.", "Error",JOptionPane.ERROR_MESSAGE);
            }
 } catch (IOException e) {
            System.err.println(e.getMessage());
 } 
 return result.toString();
    }

    /**
 * Metodo que lee el archivo HELP para crear el arbol de ayuda
 * @return DefaultTreeModel
 */
    private DefaultTreeModel createTreeModel()
    {
       DefaultMutableTreeNode root  = new DefaultMutableTreeNode();   
       DefaultMutableTreeNode hoja = new DefaultMutableTreeNode();           
       //carga archivo help 
 try {
            InputStream input = getClass().getResourceAsStream("/BHelp/indice.txt");            
            Scanner scanner = new Scanner(input);
            //lee archivo linea por linea
     while (scanner.hasNextLine()) {
     String line = scanner.nextLine().trim();                        
                if( line.substring(0, 1).equals(">") )//es la raiz del arbol
                {
                    root = new DefaultMutableTreeNode( createHelpArchivo(line.substring(1, line.length())) );         
                }
                else if( line.substring(0, 1).equals("|") )//es una rama u hoja
                {
                    hoja = new DefaultMutableTreeNode( createHelpArchivo(line.substring(1, line.length())) );    
                    root.add(hoja);
                }
                else if( line.substring(0, 1).equals("-") )//es una hoja
                {
                    hoja.add(new DefaultMutableTreeNode( createHelpArchivo(line.substring(1, line.length())) ));
                }
            } 
            scanner.close(); 
            //se añade arbol al modelo
            DefaultTreeModel modelo = new DefaultTreeModel(root);
            return modelo; 
 } catch (NullPointerException e) {            
             JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
 } 
 return null;
    }    

    /**
 * Dado un valor string "value" crea una clase HelpArchivo
 * @param String value de la forma
 * Ej. [texto][archivo html]
 * @return HelpArchivo
 */
    private HelpArchivo createHelpArchivo( String value )
    {
       HelpArchivo helpArchivo = new HelpArchivo();
       //System.out.println( value );
       Pattern patron = Pattern.compile("\\[(.*)\\]\\[(\\w+)\\]");
       Matcher matcher = patron.matcher(value);       
       matcher.find();//busca cadenas
       helpArchivo.setTexto(matcher.group(1));
       helpArchivo.setArchivo(matcher.group(2));        
       return helpArchivo;
    }

    /**
 * Metodo que reemplaza la ruta de imagen 
 * Antes src="imagen.jpg"
 * despues src="file:\\\c:\carpeta\carpeta\appHelp\help\imagen.jpg"
 * @param String value
 * @return String
 */
    private String replaceSRC(String value)
    {        
        //si existe imagen
        if( value.indexOf("src=") != -1 )
        {            
            //System.out.println("Antes: " + value); 
            Pattern patron = Pattern.compile("src=\"(\\w+).(jpg|png|gif)\"");
            Matcher matcher = patron.matcher(value);
            matcher.find();            
            value = value.replaceAll( matcher.group(1), Matcher.quoteReplacement("file:\\\\\\"+help_path) + matcher.group(1) );
            //System.out.println("Despues: " + value ) ; 
        }
        return value;
    }


	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jSplitPane1 = new javax.swing.JSplitPane();
                jScrollPane3 = new javax.swing.JScrollPane();
                jTree1 = new javax.swing.JTree();
                jScrollPane2 = new javax.swing.JScrollPane();
                jEditorPane1 = new javax.swing.JEditorPane();

                setClosable(true);
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setIconifiable(true);
                setMaximizable(true);
                setResizable(true);
                setTitle("BRASILIA-GLOSARIO DE AYUDA");
                setMaximumSize(new java.awt.Dimension(115, 22));

                jScrollPane3.setViewportView(jTree1);

                jSplitPane1.setLeftComponent(jScrollPane3);

                jEditorPane1.setMaximumSize(new java.awt.Dimension(106, 22));
                jScrollPane2.setViewportView(jEditorPane1);

                jSplitPane1.setRightComponent(jScrollPane2);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(WBHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(WBHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(WBHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(WBHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new WBHelp().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JEditorPane jEditorPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JSplitPane jSplitPane1;
        private javax.swing.JTree jTree1;
        // End of variables declaration//GEN-END:variables
}
