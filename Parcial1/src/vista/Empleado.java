/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
/**
 *
 * @author pc01
 */
public class Empleado extends Persona {
    private String codigo;
    private int sueldo, bono, total;
    
    public Empleado(){}

    public Empleado(String codigo, int sueldo, int bono, int total, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.sueldo = sueldo;
        this.bono = bono;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getTotal() {
        total = sueldo + bono;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    protected String[] crear() {
        try
        {
            String datos[] = new String[9];
            datos[0] = getCodigo();
            datos[1] = getNombres();
            datos[2] = getApellidos();
            datos[3] = getDireccion();
            datos[4] = getTelefono();
            datos[5] = getFecha_nacimiento();
            datos[6] = Integer.toString(getSueldo());
            datos[7] = Integer.toString(getBono());
            datos[8] = Integer.toString(getTotal());
            return datos;
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en Query", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    
    
}
