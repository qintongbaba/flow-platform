/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

/**
 * @author yang
 */
public class FileUtil {

    public static void write(InputStream is, Path target) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target.toFile()))) {
            byte[] buffer = new byte[8 * 1024];

            try (BufferedInputStream bis = new BufferedInputStream(is)) {
                int read;
                while((read = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, read);
                }
            }
        }
    }

}
