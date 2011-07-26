/*
 *  Copyright (c) 2011 The SCAPE Project Partners.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package ${global_package_name}.util;

import org.apache.axis2.databinding.types.URI;

/**
 * These are generic string utilities.
 *
 * @author SCAPE Project Development Team
 * @version 0.1
 */
public final class StringUtils {

    
    /**
     * Empty private constructor avoids instantiation.
     */
    private StringUtils() {
    }


    /**
     * Get file extension
     * @param path Path of the file
     * @return file extension
     */
    public static String getFileExtension(String path) {
        int dot = path.lastIndexOf(".");
        return path.substring(dot + 1);
    }


    public static String getFilenameFromURI(URI uri, boolean preserveExtension) {
        int slashIndex = uri.toString().lastIndexOf('/');
        int dotIndex = uri.toString().lastIndexOf('.');
        String filenameWithoutExtension = null;
        if (dotIndex == -1 || preserveExtension) {
            filenameWithoutExtension = uri.toString().substring(slashIndex + 1);
        } else {
            filenameWithoutExtension = uri.toString().substring(slashIndex + 1, dotIndex);
        }
        return filenameWithoutExtension;
    }
}