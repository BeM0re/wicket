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
package org.apache.wicket.redirect;

import org.apache.wicket.WicketTestCase;
import org.apache.wicket.util.lang.PackageName;

public class RestartWithMountedPageTest extends WicketTestCase
{

    /**
	 * Construct.
	 */
	public RestartWithMountedPageTest()
	{
		super();
	}

	/**
	 * Construct.
	 *
	 * @param name
	 */
	public RestartWithMountedPageTest(String name)
	{
		super(name);
	}

    /**
     * FIXME fix this test
     * Tests that a protected page can redirect to a login page from a mounted package.
     */
    public void bugTestWithMountedPackage() {
        tester.getApplication().mount("/test", PackageName.forPackage(ProtectedPage.class.getPackage()));
        tester.startPage(ProtectedPage.class);
        tester.assertRenderedPage(LoginPage.class);
    }

    /**
     * FIXME fix this test
     * Tests that a protected page can redirect to a login page from mounted pages.
     */
    public void bugTestWithMountedLoginPage() {
        tester.getApplication().mountBookmarkablePage("/login", LoginPage.class);
        tester.startPage(ProtectedPage.class);
        tester.assertRenderedPage(LoginPage.class);
    }
    
    /**
     * FIXME remove this dummy test
     */
    public void testDummy() {}
}
