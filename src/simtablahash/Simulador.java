/**
 * ---------------------------------------------------------------------
 * $Id: Simulador.java,v 1.0 2013/08/23 
 * Universidad Francisco de Paula Santander 
 * Programa Ingenieria de Sistemas
 *
 * Proyecto: SEED_UFPS
 * ----------------------------------------------------------------------
 */

package simtablahash;

import Mundo_TablaHash.SimuladorTablaHash;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * Clase controlador del Vista.FXML donde se crean y manipulan los componente javafx de la Aplicacion.
 * @author Uriel Garcia - Yulieth Pabon
 * @version 1.0
 */

public class Simulador implements Initializable {
    
    
    @FXML   private Line    linea0, linea1,linea2,linea3,linea4,linea5,linea6,linea7,linea8,linea9,linea10,
                            linea11,linea12,linea13,linea14,linea15,linea16,linea17,linea18,linea19,
                            linea20, linea21,linea22,linea23,linea24,linea25,linea26,linea27,linea28,linea29,
                            linea30, linea31,linea32,linea33,linea34,linea35,linea36,linea37,linea38,linea39,
                             linea40, linea41,linea42,linea43,linea44,linea45,linea46,linea47,linea48,linea49,linea50,
                            linea51,linea52,linea53,linea54,linea55,linea56,linea57,linea58,linea59,
                            linea60, linea61,linea62,linea63,linea64,linea65,linea66,linea67,linea68,linea69,
                            linea70, linea71,linea72,linea73,linea74,linea75,linea76,linea77,linea78,linea79,
                            linea80, linea81,linea82,linea83,linea84,linea85,linea86,linea87,linea88,linea89,
                            linea90, linea91,linea92,linea93,linea94,linea95,linea96,linea97,linea98,linea99;
    @FXML   private Rectangle  raiz, nodo1,nodo2,nodo3,nodo4,nodo5,nodo6,nodo7,nodo8,nodo9,nodo10,nodo11,nodo12, nodo13,nodo14,nodo15, nodo16, nodo17, nodo18, nodo19,
                            nodo20, nodo21, nodo22, nodo23, nodo24, nodo25, nodo26, nodo27, nodo28, nodo29, nodo30, nodo31, nodo32, nodo33, nodo34, nodo35, nodo36, nodo37, nodo38, nodo39,
                            nodo40, nodo41, nodo42, nodo43, nodo44, nodo45, nodo46, nodo47, nodo48, nodo49, nodo50, nodo51, nodo52, nodo53, nodo54, nodo55, nodo56, nodo57, nodo58, nodo59,
                            nodo60, nodo61, nodo62, nodo63, nodo64, nodo65, nodo66, nodo67, nodo68, nodo69, nodo70, nodo71, nodo72, nodo73, nodo74, nodo75, nodo76, nodo77, nodo78, nodo79,
                            nodo80, nodo81, nodo82, nodo83, nodo84, nodo85, nodo86, nodo87, nodo88, nodo89, nodo90, nodo91, nodo92, nodo93, nodo94, nodo95, nodo96, nodo97, nodo98, nodo99, piv,
                            nodo100, nodo101, nodo102,nodo103,nodo104,nodo105,nodo106,nodo107,nodo108,nodo109,nodo110,nodo111,nodo112, nodo113,nodo114,nodo115, nodo116, nodo117, nodo118, nodo119,
                            nodo120, nodo121, nodo122, nodo123, nodo124, nodo125, nodo126, nodo127, nodo128, nodo129, nodo130, nodo131, nodo132, nodo133, nodo134, nodo135, nodo136, nodo137, nodo138, nodo139,
                            nodo140, nodo141, nodo142, nodo143, nodo144, nodo145, nodo146, nodo147, nodo148, nodo149;
    @FXML   private Label   label0, label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12, label13,label14,label15, label16, label17, label18, label19,
                            label20, label21, label22, label23, label24, label25, label26, label27, label28, label29, label30, label31, label32, label33, label34, label35, label36, label37, label38, label39,
                            label40, label41, label42, label43, label44, label45, label46, label47, label48, label49, label50, label51, label52, label53, label54, label55, label56, label57, label58, label59,
                            label60, label61, label62, label63, label64, label65, label66, label67, label68, label69, label70, label71, label72, label73, label74, label75, label76, label77, label78, label79,
                            label80, label81, label82, label83, label84, label85, label86, label87, label88, label89, label90, label91, label92, label93, label94, label95, label96, label97, label98, label99, 
                             label100, label101,label102,label103,label104,label105,label106,label107,label108,label109,label110,label111,label112, label113,label114,label115, label116, label117, label118, label119,
                            label120, label121, label122, label123, label124, label125, label126, label127, label128, label129, label130, label131, label132, label133, label134, label135, label136, label137, label138, label139,
                            label140, label141, label142, label143, label144, label145, label146, label147, label148, label149,
                            labelPiv;

    @FXML   private     TextField   txtCap, txtIns, txtNombre, txtEli, txtGet, txtEdit1, txtEdit2;    
    @FXML   private     Label      nota, msg;  
    @FXML   private     ImageView   f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21,f22,f23,f24,f25,f26,f27,f28,f29,f30,f31,f32,f33,f34,f35,f36;
    @FXML   private     ImageView   borde2, borde3, borde;
    @FXML   private     Rectangle nodos[];
    @FXML   private     Line    lineas[];
    @FXML   private     Label   labels[];  
    @FXML   private     ImageView   flechas[];
    @FXML   private     SimuladorTablaHash simulador;

    
    
    @FXML
    private void btCrear(ActionEvent event) {
        try{
            //Validacion de la entrada
            String val = txtCap.getText(); 
            txtCap.setText("");
            if(val.isEmpty()){
                impNota("Debe ingresar el Numero de Slots de la Tabla!",1);
                return;
            }       
            if(!esNumero(val)){
                impNota("Debe ingresar un valor numerico!",1);
                return;
            }             
            int cap = Integer.parseInt(val);
            if(cap<11 || cap>37){
                impNota("Cantidad de Slots incorrecta. Rango permitido: 11 a 37 !",1);
                return;
            }
            if(nodos==null || labels==null  || this.simulador==null){
                impNota("No se puede crear la Tabla Hash!",1);
                return;
            }        
            
            //crear la Tablaaa
            this.simulador.crearTabla(cap);
            this.pintarTDA();           
            impNota("Se ha creado una Tabla Hash con "+cap+" Slots!",0);  
            
        }catch(Exception e){
            impNota("No se puede crear la Tabla Hash!",1);
        }        
    }
    
    @FXML
    private void btIns(ActionEvent event){        
        try{   
            //Realizacion de la validacion
            String val = txtIns.getText();        
            txtIns.setText("");
            String nom = txtNombre.getText();
            txtNombre.setText("");
            if(val.isEmpty() || nom.isEmpty()){
                impNota("Diligencie todos los campos (Código con 4 cifras y Nombre)!",1);
                return;
            }        
            if(val.length()!=4){
                impNota("Debe  ingresar las 4 ultimas cifras del código: 115XXXX!",1);
                return;
            }
            if(!esNumero(val)){
                impNota("Debe ingresar un valor numerico!",1);
                return;
            } 
            if(nodos==null || this.labels==null || this.simulador==null || this.simulador.getMiTabla()==null){
                impNota("No se puede insertar los datos del Estudiante!",1);
                return;
            }
            int dato = Integer.parseInt(val);

            //Realizacion de la Insercion
            boolean rta = this.simulador.insertar(dato,nom);
            this.pintarTDA();
            if(!rta)
                impNota("El Estudiante ya se encuentra registrado en la Tabla",1);  
            else{
                impNota("Estudiante ha sido insertado en la Tabla correctamente.",0); 
                this.animacion(0, dato); 
           }
        }catch(Exception e){
            impNota("No se puede insertar el nuevo Elemento!",1);
        }
    }    
    
    @FXML
    private void btEli(ActionEvent event){        
        try{
//            //Realizaciond de la validacion
            String val = txtEli.getText();  
            txtEli.setText("");
            if(val.isEmpty()){
                impNota("Debe ingresar las ultimas 4 cifras del codigo del Estudiante!",1);
                return;
            }        
            if(!esNumero(val)){
                impNota("Debe ingresar un valor numerico para el codigo!",1);
                return;
            } 
            if(nodos==null || labels==null || simulador==null || this.simulador.getMiTabla()==null){
                impNota("No se puede eliminar el Estudiante de la Tabla!",1);
                return;
            }
            if(this.simulador.esVacia()){
                impNota("La Tabla Hash aun no posee Elementos!",1);
                return;
            }        
            
            //Eliminar el dato
            int dato = Integer.parseInt(val); 
            boolean rta = simulador.eliminar(dato); 
            this.pintarTDA();
            if(!rta)
                impNota("El codigo del Estudiante a Eliminar no existe!",1); 
            else{
                impNota("El Estudiante con codigo '115-"+dato+"' ha sido eliminado de la Tabla!",0); 
            }            
        }
    catch(Exception e){
            impNota("No se puede eliminar el Estudiante de la Tabla!",1);
        }           
    }
    
    @FXML
    private void btGet(ActionEvent event){
        try{      
            //Realizacion de las validaciones
            String val = txtGet.getText();        
            txtGet.setText("");
            if(val.isEmpty()){
                impNota("Debe ingresar el codigo del Estudiante que desea buscar!",1);
                return;
            }        
            if(!esNumero(val)){
                impNota("Debe ingresar un valor numerico!",1);
                return;
            } 
            if(nodos==null || labels==null || simulador==null || this.simulador.getMiTabla()==null){
                impNota("No se puede obtener el Estudiante con este codigo!",1);
                return;
            }
            if(this.simulador.esVacia()){
                impNota("La Tabla Hash aun no posee Elementos!",1);
                txtGet.setText("");
                return;
            }        
            int dato = Integer.parseInt(val);      
            
            //Ubicar el elemento            
           boolean esta = this.simulador.estaElemento(dato);
            if(!esta){
                impNota("El Estudiante buscado no ha sido encontrado!",1);
            }
            else{
                this.animacion(2, dato);
                impNota("El Estudiante ha sido encontrado: 115- '"+dato+"'!",0);
            }             
        }catch(Exception e){
            impNota("No se puede ubicar el Estudiante en la Tabla Hash!",1);
        }
        
    }
    
    @FXML
    private void btTam(ActionEvent event){
        try{ 
            if(nodos==null || labels==null ||  simulador==null || this.simulador.getMiTabla()==null){
                impNota("No se puede determinar el tamaño de la Tabla!",1);
                return;
            }
            msg.setVisible(true);            
            msg.setText("Numero de Datos de la Tabla: "+this.simulador.conocerTamanio()+" Estudiantes!");
            impNota("Tamaño de la Tabla Hash calculado!",0);
        }catch(Exception e){
            impNota("No se puede determinar el Tamaño de la Tabla Hash!",1);
            msg.setVisible(false);
        }
    }
    
    @FXML
    private void btCap(ActionEvent event){
        try{
            if(nodos==null || labels==null || simulador==null || this.simulador.getMiTabla()==null){
                impNota("No se puede determinar la capacidad de la Tabla Hash!",1);
                return;
            }
            msg.setVisible(true);
            msg.setText("Numero de Slots de la Tabla:  "+this.simulador.conocerCapacidad()+" Slots!");
            impNota("Numero de Slots de la Tabla determinados!",0);
        }catch(Exception e){
            impNota("No se puede determinar el numero de Slots de la Tabla!",1);
            msg.setVisible(false);
        }        
    }
    
    @FXML
    private void salir(ActionEvent event){
        System.exit(0);
    }    

   @FXML
    private void inicializar() {
        //Creando la pila de lineas
        this.cargarLineas();
        this.cargarNodos();
        this.cargarFlechas();
    }
   
   private void cargarLineas() {
        
        this.lineas = new Line[100];
        
        this.lineas[0]= linea0;this.lineas[1]= linea1;this.lineas[2]= linea2;this.lineas[3]= linea3;this.lineas[4]= linea4;
        this.lineas[5]= linea5;this.lineas[6]= linea6;this.lineas[7]= linea7;this.lineas[8]= linea8;this.lineas[9]= linea9;
        this.lineas[10]= linea10;this.lineas[11]= linea11;this.lineas[12]= linea12;this.lineas[13]= linea13;this.lineas[14]= linea14;
        this.lineas[15]= linea15;this.lineas[16]= linea16;this.lineas[17]= linea17;this.lineas[18]= linea18;this.lineas[19]= linea19;
        this.lineas[20]= linea20;this.lineas[21]= linea21;this.lineas[22]= linea22;this.lineas[23]= linea23;this.lineas[24]= linea24;
        this.lineas[25]= linea25;this.lineas[26]= linea26;this.lineas[27]= linea27;this.lineas[28]= linea28;this.lineas[29]= linea29;
        this.lineas[30]= linea30;this.lineas[31]= linea31;this.lineas[32]= linea32;this.lineas[33]= linea33;this.lineas[34]= linea34;
        this.lineas[35]= linea35;this.lineas[36]= linea36;this.lineas[37]= linea37;this.lineas[38]= linea38;this.lineas[39]= linea39;
        this.lineas[40]= linea40;this.lineas[41]= linea41;this.lineas[42]= linea42;this.lineas[43]= linea43;this.lineas[44]= linea44;
        this.lineas[45]= linea45;this.lineas[46]= linea46;this.lineas[47]= linea47;this.lineas[48]= linea48;this.lineas[49]= linea49;
        this.lineas[50]= linea50;this.lineas[51]= linea51;this.lineas[52]= linea52;this.lineas[53]= linea53;this.lineas[54]= linea54;
        this.lineas[55]= linea55;this.lineas[56]= linea56;this.lineas[57]= linea57;this.lineas[58]= linea58;this.lineas[59]= linea59;
        this.lineas[60]= linea60;this.lineas[61]= linea61;this.lineas[62]= linea62;this.lineas[63]= linea63;this.lineas[64]= linea64;
        this.lineas[65]= linea65;this.lineas[66]= linea66;this.lineas[67]= linea67;this.lineas[68]= linea68;this.lineas[69]= linea69;
        this.lineas[70]= linea70;this.lineas[71]= linea71;this.lineas[72]= linea72;this.lineas[73]= linea73;this.lineas[74]= linea74;
        this.lineas[75]= linea75;this.lineas[76]= linea76;this.lineas[77]= linea77;this.lineas[78]= linea78;this.lineas[79]= linea79;
        this.lineas[80]= linea80;this.lineas[81]= linea81;this.lineas[82]= linea82;this.lineas[83]= linea83;this.lineas[84]= linea84;
        this.lineas[85]= linea85;this.lineas[86]= linea86;this.lineas[87]= linea87;this.lineas[88]= linea88;this.lineas[89]= linea89;
        this.lineas[90]= linea90;this.lineas[91]= linea91;this.lineas[92]= linea92;this.lineas[93]= linea93;this.lineas[94]= linea94;
        this.lineas[95]= linea95;this.lineas[96]= linea96;this.lineas[97]= linea97;this.lineas[98]= linea98;this.lineas[99]= linea99;
        
        for(int i=0; i<this.lineas.length; i++){
            this.lineas[i].setStroke(Color.GREEN);
            this.lineas[i].setVisible(false);
        }
            
        
    }
   
    private void cargarFlechas() {
        
        this.flechas = new ImageView[37];
        
        this.flechas[0]=f0;this.flechas[1]=f1;this.flechas[2]=f2;this.flechas[3]=f3;this.flechas[4]=f4;
        this.flechas[5]=f5;this.flechas[6]=f6;this.flechas[7]=f7;this.flechas[8]=f8;this.flechas[9]=f9;        
        this.flechas[10]=f10;this.flechas[11]=f11;this.flechas[12]=f12;this.flechas[13]=f13;this.flechas[14]=f14;
        this.flechas[15]=f15;this.flechas[16]=f16;this.flechas[17]=f17;this.flechas[18]=f18;this.flechas[19]=f19;        
        this.flechas[20]=f20;this.flechas[21]=f21;this.flechas[22]=f22;this.flechas[23]=f23;this.flechas[24]=f24;
        this.flechas[25]=f25;this.flechas[26]=f26;this.flechas[27]=f27;this.flechas[28]=f28;this.flechas[29]=f29;        
        this.flechas[30]=f30;this.flechas[31]=f31;this.flechas[32]=f32;this.flechas[33]=f33;this.flechas[34]=f34;
        this.flechas[35]=f35;this.flechas[36]=f36;
        
        for(int i=0; i<this.flechas.length; i++)
            this.flechas[i].setVisible(false);
        
    }
    
    
    private void cargarNodos() {
        //Creando la pila de circulos        
        
        this.nodos[0]= raiz;this.nodos[1]= nodo1;this.nodos[2]= nodo2;this.nodos[3]= nodo3;this.nodos[4]= nodo4;
        this.nodos[5]= nodo5;this.nodos[6]= nodo6;this.nodos[7]= nodo7;this.nodos[8]= nodo8;this.nodos[9]= nodo9;
        this.nodos[10]= nodo10;this.nodos[11]= nodo11;this.nodos[12]= nodo12;this.nodos[13]= nodo13;this.nodos[14]= nodo14;
        this.nodos[15]= nodo15;this.nodos[16]= nodo16;this.nodos[17]= nodo17;this.nodos[18]= nodo18;this.nodos[19]= nodo19;
        this.nodos[20]= nodo20;this.nodos[21]= nodo21;this.nodos[22]= nodo22;this.nodos[23]= nodo23;this.nodos[24]= nodo24;
        this.nodos[25]= nodo25;this.nodos[26]= nodo26;this.nodos[27]= nodo27;this.nodos[28]= nodo28;this.nodos[29]= nodo29;
        this.nodos[30]= nodo30;this.nodos[31]= nodo31;this.nodos[32]= nodo32;this.nodos[33]= nodo33;this.nodos[34]= nodo34;
        this.nodos[35]= nodo35;this.nodos[36]= nodo36;this.nodos[37]= nodo37;this.nodos[38]= nodo38;this.nodos[39]= nodo39;
        this.nodos[40]= nodo40;this.nodos[41]= nodo41;this.nodos[42]= nodo42;this.nodos[43]= nodo43;this.nodos[44]= nodo44;
        this.nodos[45]= nodo45;this.nodos[46]= nodo46;this.nodos[47]= nodo47;this.nodos[48]= nodo48;this.nodos[49]= nodo49;
        this.nodos[50]= nodo50;this.nodos[51]= nodo51;this.nodos[52]= nodo52;this.nodos[53]= nodo53;this.nodos[54]= nodo54;
        this.nodos[55]= nodo55;this.nodos[56]= nodo56;this.nodos[57]= nodo57;this.nodos[58]= nodo58;this.nodos[59]= nodo59;
        this.nodos[60]= nodo60;this.nodos[61]= nodo61;this.nodos[62]= nodo62;this.nodos[63]= nodo63;this.nodos[64]= nodo64;
        this.nodos[65]= nodo65;this.nodos[66]= nodo66;this.nodos[67]= nodo67;this.nodos[68]= nodo68;this.nodos[69]= nodo69;
        this.nodos[70]= nodo70;this.nodos[71]= nodo71;this.nodos[72]= nodo72;this.nodos[73]= nodo73;this.nodos[74]= nodo74;
        this.nodos[75]= nodo75;this.nodos[76]= nodo76;this.nodos[77]= nodo77;this.nodos[78]= nodo78;this.nodos[79]= nodo79;
        this.nodos[80]= nodo80;this.nodos[81]= nodo81;this.nodos[82]= nodo82;this.nodos[83]= nodo83;this.nodos[84]= nodo84;
        this.nodos[85]= nodo85;this.nodos[86]= nodo86;this.nodos[87]= nodo87;this.nodos[88]= nodo88;this.nodos[89]= nodo89;
        this.nodos[90]= nodo90;this.nodos[91]= nodo91;this.nodos[92]= nodo92;this.nodos[93]= nodo93;this.nodos[94]= nodo94;
        this.nodos[95]= nodo95;this.nodos[96]= nodo96;this.nodos[97]= nodo97;this.nodos[98]= nodo98;this.nodos[99]= nodo99;        
        this.nodos[100]= nodo100;this.nodos[101]= nodo101;this.nodos[102]= nodo102;this.nodos[103]= nodo103;this.nodos[104]= nodo104;
        this.nodos[105]= nodo105;this.nodos[106]= nodo106;this.nodos[107]= nodo107;this.nodos[108]= nodo108;this.nodos[109]= nodo109;
        this.nodos[110]= nodo110;this.nodos[111]= nodo111;this.nodos[112]= nodo112;this.nodos[113]= nodo113;this.nodos[114]= nodo114;
        this.nodos[115]= nodo115;this.nodos[116]= nodo116;this.nodos[117]= nodo117;this.nodos[118]= nodo118;this.nodos[119]= nodo119;
        this.nodos[120]= nodo120;this.nodos[121]= nodo121;this.nodos[122]= nodo122;this.nodos[123]= nodo123;this.nodos[124]= nodo124;
        this.nodos[125]= nodo125;this.nodos[126]= nodo126;this.nodos[127]= nodo127;this.nodos[128]= nodo128;this.nodos[129]= nodo129;
        this.nodos[130]= nodo130;this.nodos[131]= nodo131;this.nodos[132]= nodo132;this.nodos[133]= nodo133;this.nodos[134]= nodo134;
        this.nodos[135]= nodo135;this.nodos[136]= nodo136;this.nodos[137]= nodo137;this.nodos[138]= nodo138;this.nodos[139]= nodo139;
        this.nodos[140]= nodo140;this.nodos[141]= nodo141;this.nodos[142]= nodo142;this.nodos[143]= nodo143;this.nodos[144]= nodo144;
        this.nodos[145]= nodo145;this.nodos[146]= nodo146;this.nodos[147]= nodo147;this.nodos[148]= nodo148;this.nodos[149]= nodo149;
                
        //Creando la pila de Labels
        
        
        this.labels[0]= label0;this.labels[1]= label1;this.labels[2]= label2;this.labels[3]= label3;this.labels[4]= label4;
        this.labels[5]= label5;this.labels[6]= label6;this.labels[7]= label7;this.labels[8]= label8;this.labels[9]= label9;
        this.labels[10]= label10;this.labels[11]= label11;this.labels[12]= label12;this.labels[13]= label13;this.labels[14]= label14;
        this.labels[15]= label15;this.labels[16]= label16;this.labels[17]= label17;this.labels[18]= label18;this.labels[19]= label19;
        this.labels[20]= label20;this.labels[21]= label21;this.labels[22]= label22;this.labels[23]= label23;this.labels[24]= label24;
        this.labels[25]= label25;this.labels[26]= label26;this.labels[27]= label27;this.labels[28]= label28;this.labels[29]= label29;
        this.labels[30]= label30;this.labels[31]= label31;this.labels[32]= label32;this.labels[33]= label33;this.labels[34]= label34;
        this.labels[35]= label35;this.labels[36]= label36;this.labels[37]= label37;this.labels[38]= label38;this.labels[39]= label39;
        this.labels[40]= label40;this.labels[41]= label41;this.labels[42]= label42;this.labels[43]= label43;this.labels[44]= label44;
        this.labels[45]= label45;this.labels[46]= label46;this.labels[47]= label47;this.labels[48]= label48;this.labels[49]= label49;
        this.labels[50]= label50;this.labels[51]= label51;this.labels[52]= label52;this.labels[53]= label53;this.labels[54]= label54;
        this.labels[55]= label55;this.labels[56]= label56;this.labels[57]= label57;this.labels[58]= label58;this.labels[59]= label59;
        this.labels[60]= label60;this.labels[61]= label61;this.labels[62]= label62;this.labels[63]= label63;this.labels[64]= label64;
        this.labels[65]= label65;this.labels[66]= label66;this.labels[67]= label67;this.labels[68]= label68;this.labels[69]= label69;
        this.labels[70]= label70;this.labels[71]= label71;this.labels[72]= label72;this.labels[73]= label73;this.labels[74]= label74;
        this.labels[75]= label75;this.labels[76]= label76;this.labels[77]= label77;this.labels[78]= label78;this.labels[79]= label79;
        this.labels[80]= label80;this.labels[81]= label81;this.labels[82]= label82;this.labels[83]= label83;this.labels[84]= label84;
        this.labels[85]= label85;this.labels[86]= label86;this.labels[87]= label87;this.labels[88]= label88;this.labels[89]= label89;
        this.labels[90]= label90;this.labels[91]= label91;this.labels[92]= label92;this.labels[93]= label93;this.labels[94]= label94;
        this.labels[95]= label95;this.labels[96]= label96;this.labels[97]= label97;this.labels[98]= label98;this.labels[99]= label99;        
        
        this.labels[100]= label100;this.labels[101]= label101;this.labels[102]= label102;this.labels[103]= label103;this.labels[104]= label104;
        this.labels[105]= label105;this.labels[106]= label106;this.labels[107]= label107;this.labels[108]= label108;this.labels[109]= label109;
        this.labels[110]= label110;this.labels[111]= label111;this.labels[112]= label112;this.labels[113]= label113;this.labels[114]= label114;
        this.labels[115]= label115;this.labels[116]= label116;this.labels[117]= label117;this.labels[118]= label118;this.labels[119]= label119;
        this.labels[120]= label120;this.labels[121]= label121;this.labels[122]= label122;this.labels[123]= label123;this.labels[124]= label124;
        this.labels[125]= label125;this.labels[126]= label126;this.labels[127]= label127;this.labels[128]= label128;this.labels[129]= label129;
        this.labels[130]= label130;this.labels[131]= label131;this.labels[132]= label132;this.labels[133]= label133;this.labels[134]= label134;
        this.labels[135]= label135;this.labels[136]= label136;this.labels[137]= label137;this.labels[138]= label138;this.labels[139]= label139;
        this.labels[140]= label140;this.labels[141]= label141;this.labels[142]= label142;this.labels[143]= label143;this.labels[144]= label144;
        this.labels[145]= label145;this.labels[146]= label146;this.labels[147]= label147;this.labels[148]= label148;this.labels[149]= label149;
               
        for(int i=0; i<150; i++){            
            nodos[i].setFill(Color.GREENYELLOW);
            nodos[i].setStroke(Color.GREEN);
            nodos[i].setVisible(false);
            nodos[i].setWidth(25.0);
            nodos[i].setHeight(25.0);
            
        }
        for(int i=0; i<150; i++){
            labels[i].setVisible(false);
            labels[i].setPrefWidth(25.0);
            labels[i].setPrefHeight(25.0);
            labels[i].setTextFill(Color.BLACK);
        }
        this.msg.setLayoutY(450.0);
        this.msg.setVisible(false);  
        piv.setWidth(25.0);
        piv.setHeight(20.0);    
        labelPiv.setPrefWidth(25.0);
        labelPiv.setPrefHeight(25.0);     
    }
    
   
        
    @FXML
    private void impNota(String nota, int tipo){
        String cab = "";
        if(tipo==0){
            cab="Exito, ";
            this.nota.setTextFill(Color.BLACK);
            this.borde.setImage(borde2.getImage());
        }            
        if(tipo==1){
            cab="Error, ";
            this.nota.setTextFill(Color.BLACK);
            this.borde.setImage(borde3.getImage());
        }
        this.nota.setVisible(true);
        this.nota.setText(cab+nota);
    }
    
    @FXML
    private boolean esNumero(String val){
    try{
        Integer.parseInt(val);
        }catch(Exception e){
            return (false);
        }
        return (true);
    }

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Inicializar los diferentes tipos de datos utilizados.
        this.nodos = new Rectangle[150];
        this.labels = new Label[150];
        this.simulador = new SimuladorTablaHash();
        //Inicializar los objetos graficos
        this.inicializar();
        this.impNota("El Simulador para TablaHash<Clave,T> ha iniciado!",0);
    }
    
    @FXML
    private void pintarTDA() {
        try{
                this.inicializar();  
                this.reajustarColores();
                //Pintar Slots //lx=230 - ly=180
                double ly = 50.0;
                int i=0;
                for(; i<this.simulador.conocerCapacidad(); i++){
                    this.nodos[i].setHeight(25.0);
                    this.nodos[i].setWidth(25.0);
                    this.nodos[i].setLayoutX(100.0);
                    this.nodos[i].setLayoutY(ly);
                    this.nodos[i].setVisible(true);
                    this.labels[i].setLayoutX(100.0);
                    this.labels[i].setLayoutY(ly);
                    this.labels[i].setText(i+"");
                    this.labels[i].setVisible(true);
                    this.flechas[i].setLayoutX(125.0);
                    this.flechas[i].setLayoutY(ly);
                    this.flechas[i].setVisible(true);
                    ly = ly + 26.0;            
                }

                //Pintar la Lista
                String datos[] = this.simulador.impTabla().split("_");
                ly = 50.0;
                int l = 0;
                for(int k=0; k<datos.length; k++){            
                    double lx=175.0;
                    String dato = datos[k];
                    if(!dato.equalsIgnoreCase("null")){                
                        String v[] = dato.split(",");
                        for(int j=0; j<v.length; j++){
                            if(v[j]!=null){
                                double laux  = v[j].length()*8.0;
                                this.nodos[i].setFill(Color.GREENYELLOW);
                                this.nodos[i].setWidth(laux);
                                this.nodos[i].setLayoutX(lx);
                                this.nodos[i].setLayoutY(ly);
                                this.nodos[i].setVisible(true);
                                this.labels[i].setPrefWidth(laux);
                                this.labels[i].setLayoutX(lx);
                                this.labels[i].setLayoutY(ly);                        
                                this.labels[i].setText(v[j]);          
                                if(j+1<v.length &&  v[j+1]!=null){
                                    Line line = this.lineas[l++];
                                    line.setLayoutX(nodos[i].getLayoutX());
                                    line.setLayoutY(nodos[i].getLayoutY());                            
                                    line.setStartX(laux);                            
                                    line.setEndX(laux+20.0);
                                    line.setStartY(12.5);
                                    line.setEndY(12.5);
                                    line.setVisible(true);
                                }
                                this.labels[i++].setVisible(true);
                                lx = lx+laux+20.0;
                            }                    
                        }
                    }
                    ly = ly+26.0;
                }
        }catch(Exception e){
             this.impNota("No es posible pintar la Tabla Hash creada!",0);
        }
       
    }
    
    @FXML
    private void animacion(int tipo, int val){
        msg.setVisible(false); 
        this.reajustarColores();
        double durac = 0;
        switch(tipo){
            //Añadir al inicio
            case 0 :
                 Timeline tl = new Timeline();
                Rectangle r= nodos[0];
                for(int i=0; i<this.labels.length;i++){
                    if(this.labels[i].getText().length()>=4 && this.labels[i].getText().substring(0,4).equalsIgnoreCase(val+"")){
                        r = this.nodos[i];
                        i = labels.length;
                    }                        
                }
                //Mover en X               
                tl.setCycleCount(1); 
                tl.stop();
                tl.getKeyFrames().removeAll();
                tl.getKeyFrames().setAll(
                    new KeyFrame(new Duration(durac), new KeyValue(r.fillProperty(),Color.GREENYELLOW)),
                    new KeyFrame(new Duration(durac+1000), new KeyValue(r.fillProperty(),Color.BEIGE)),
                    new KeyFrame(new Duration(durac), new KeyValue(r.strokeProperty(),Color.BLACK)),
                    new KeyFrame(new Duration(durac+1000), new KeyValue(r.strokeProperty(),Color.RED))   
                );
                tl.play();
                break;
                
                //Eliminar
            case 1 :      
                break;
                
                //GEt
            case 2 :
                Timeline tl2 = new Timeline();
                int pos = this.simulador.getIndice(val);
                Rectangle r2= nodos[0];
                for(int i=0; i<this.nodos.length; i++){
                    if(labels[i].getText().equalsIgnoreCase(String.valueOf(pos)))
                        r2 = nodos[i];
                }
                double ly = r2.getLayoutY();
                durac = 0;
                for(int i=0; i<this.nodos.length; i++){
                    if(nodos[i].getLayoutX()!=100 && nodos[i].getLayoutY()==ly){
                       if(this.labels[i].getText().length()>=4 && this.labels[i].getText().substring(0,4).equalsIgnoreCase(val+"")){
                           tl2.stop();
                           tl2.getKeyFrames().removeAll();     
                           tl2.setCycleCount(1); 
                                tl2.getKeyFrames().addAll(                                 
                                    new KeyFrame(new Duration(durac), new KeyValue(nodos[i].fillProperty(),Color.GREENYELLOW)),
                                    new KeyFrame(new Duration(durac+1000), new KeyValue(nodos[i].fillProperty(),Color.BEIGE)),
                                    new KeyFrame(new Duration(durac), new KeyValue(nodos[i].strokeProperty(),Color.BLACK)),
                                    new KeyFrame(new Duration(durac+1000), new KeyValue(nodos[i].strokeProperty(),Color.RED))                                   
                                     ); 
                              durac+=1000;
                         i  = this.nodos.length;
                       }else{
                                tl2.setCycleCount(1); 
                                tl2.getKeyFrames().addAll(                                 
                                   new KeyFrame(new Duration(durac), new KeyValue(nodos[i].fillProperty(),Color.GREENYELLOW)),
                                   new KeyFrame(new Duration(durac+1000), new KeyValue(nodos[i].fillProperty(),Color.BEIGE)),
                                   new KeyFrame(new Duration(durac), new KeyValue(nodos[i].strokeProperty(),Color.BLACK)),
                                   new KeyFrame(new Duration(durac+1000), new KeyValue(nodos[i].strokeProperty(),Color.RED))                                   
                                    ); 
                                durac+=1000;
                       }                        
                    }
                }
                tl2.play();
                break;
        }       
    }

    private void reajustarColores() {
        int j = this.simulador.conocerCapacidad();
        for(int i=0; i< this.nodos.length;i++){
            if(i>=j){
                nodos[i].setFill(Color.GREENYELLOW);
                nodos[i].setStroke(Color.GREEN);
            }else{
                nodos[i].setFill(Color.WHITE);
                nodos[i].setStroke(Color.BLACK);
            }
            
        }
    }

    
}
