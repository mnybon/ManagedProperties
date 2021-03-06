/*
 * Copyright 2016 mnn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dk.netdesign.common.osgi.config.service;

import dk.netdesign.common.osgi.config.enhancement.ConfigurationTarget;
import dk.netdesign.common.osgi.config.exception.InvocationException;
import dk.netdesign.common.osgi.config.exception.UnknownValueException;
import java.util.Map;

/**
 *
 * @author mnn
 */
public abstract class ManagedPropertiesProvider{
    private final ConfigurationTarget target;
    
    public ManagedPropertiesProvider(ConfigurationTarget target){
	this.target = target;
    }
    
    protected ConfigurationTarget getTarget(){
	return target;
    }
    
    public abstract void persistConfiguration(Map<String, Object> newConfiguration) throws InvocationException;
    
    public abstract Class getReturnType(String configID) throws UnknownValueException;
    
    public abstract void start() throws Exception;
    
    public abstract void stop() throws Exception;
    
    
    
}
