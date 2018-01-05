/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.release.plugin.mojos;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import java.io.File;

/**
 * Unit tests for {@link CommonsSiteCompressionMojo}.
 *
 * @author chtompki
 * @since 1.0
 */
public class CommonsSiteCompressionMojoTest extends AbstractMojoTestCase {

    protected CommonsSiteCompressionMojo mojo;

    protected void setUp() throws Exception {
        super.setUp();
        File testFile = getTestFile("target/test-classes/mojos/compress-site/compress-site.xml");
        mojo = (CommonsSiteCompressionMojo) lookupMojo("compress-site", testFile);
    }

    public void testCompressSite() throws MojoExecutionException, MojoFailureException {
        mojo.execute();
    }
}
