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
package dk.netdesign.common.osgi.config.test.properties;

/**
 *
 * @author mnn
 */
public class WrapperTypesDefaults implements WrapperTypes {

    @Override
    public Long getLong() {
	return 42l;
    }

    @Override
    public Integer getInt() {
	return 22;
    }

    @Override
    public Short getShort() {
	return 2;
    }

    @Override
    public Double getDouble() {
	return 4.44444444444;
    }

    @Override
    public Float getFloat() {
	return 2.22f;
    }

    @Override
    public Byte getByte() {
	return 7;
    }

    @Override
    public Boolean getBoolean() {
	return true;
    }

    @Override
    public Character getChar() {
        return 'A';
    }

    @Override
    public Character[] getPassword() {
        return new Character[]{'1','2','3','4'};
    }
    
    

}
