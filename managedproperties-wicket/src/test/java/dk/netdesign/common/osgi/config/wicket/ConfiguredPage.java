/*
 * Copyright 2017 mnn.
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
package dk.netdesign.common.osgi.config.wicket;

import javax.inject.Inject;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author mnn
 */
public class ConfiguredPage extends WebPage{
    @Inject
    private ConfigurationItemFactory factory;
    
    public ConfiguredPage() {
        
        add(new RequiredConfigBehavior(factory, SetterConfig.class){
            @Override
            protected Class<? extends ConfigurationPage> getRedirectPage() {
                return InjectingConfigurationPage.class;
            }
        });
        
        Label testLabel = new Label("testLabel", "Only show me if SetterConfigs getString returns a propper value");
        add(testLabel);
        
    }

    public ConfigurationItemFactory getFactory() {
        return factory;
    }

    public void setFactory(ConfigurationItemFactory factory) {
        this.factory = factory;
    }
    
    
    
    
    
}
