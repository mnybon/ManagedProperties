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

package dk.netdesign.common.osgi.config.filters;

import dk.netdesign.common.osgi.config.exception.TypeFilterException;
import dk.netdesign.common.osgi.config.service.TypeFilter;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author mnn
 */
public class StringToCharacterArrayFilter extends TypeFilter<String, Character[]>{

    @Override
    public Character[] parse(String input) throws TypeFilterException {
	char[] charArray = input.toCharArray();
	return ArrayUtils.toObject(charArray);
    }

    @Override
    public String revert(Character[] input) throws TypeFilterException {
        return new String(ArrayUtils.toPrimitive(input));
    }
    
    
    
    
    
}
