/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.workingflow.gwt.client.ui;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Documentación de {@link Layout}.
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 *
 * Sectorial de Informática de Catastro
 */
public interface Layout extends IsWidget{

    SimplePanel getUnitRegion();
    
    SimplePanel getContentRegion();
    
    void maximiseCenter();
    
    
    
}
