/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.netdesign.common.osgi.config.test.consumer;

import dk.netdesign.common.osgi.config.enhancement.EnhancedProperty;
import dk.netdesign.common.osgi.config.service.ManagedPropertiesService;
import java.util.logging.Level;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author mnn
 */
public class Consumer implements BundleActivator{
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private static ServiceTracker<ManagedPropertiesService, ManagedPropertiesService> tracker;
    private PropertiesWithStandardTypes props;
    private Thread printer;
    private boolean run = true;

    @Override
    public void start(BundleContext context) throws Exception {
	logger.info("Getting tracker");
	tracker = new ServiceTracker(context, ManagedPropertiesService.class, null);
        tracker.open();
	logger.info("Tracker open");
	ManagedPropertiesService service = tracker.getService();
	logger.info("Service: "+service);
	props = service.register(PropertiesWithStandardTypes.class, new DefaultProperties());
	logger.info("Getting properties");
	logger.info(props.getCharacterProperty()+"");
	logger.info(props.getDoubleProperty()+"");
	logger.info(props.getStringInteger()+"");
	logger.info(props.getStringProperty()+"");
	logger.info(props.getStringListProperty()+"");
	logger.info(props+"");	
	printer = new PrinterThread();
	printer.start();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
	tracker.close();
	((EnhancedProperty)props).unregisterProperties();
	run = false;
	
    }
    
    private class PrinterThread extends Thread{

	public PrinterThread() {
	    setName("TestConsumer PrinterThread");
	}

	@Override
	public void run() {
	    while(run){
		logger.info(props.toString());
		try {
		    Thread.sleep(10000);
		} catch (InterruptedException ex) {
		    logger.warn("Consumer interrupted", ex);
		    run = false;
		}
	    }
	    
	    
	}
	
	
	
	
	
    }
    
    
    
}