/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.netdesign.common.osgi.config.filters;

import dk.netdesign.common.osgi.config.exception.TypeFilterException;
import dk.netdesign.common.osgi.config.service.TypeFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mnn
 */
public class URLFilter extends TypeFilter<String>{

    @Override
    public URL parse(String input) throws TypeFilterException {
	try {
	    return new URL(input);
	} catch (MalformedURLException ex) {
	    throw new TypeFilterException("Could not create an URL from the input", ex);
	}
    }
    
}