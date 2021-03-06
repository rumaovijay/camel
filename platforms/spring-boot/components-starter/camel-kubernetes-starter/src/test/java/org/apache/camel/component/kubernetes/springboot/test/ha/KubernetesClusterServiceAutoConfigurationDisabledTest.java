/**
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
package org.apache.camel.component.kubernetes.springboot.test.ha;

import org.apache.camel.component.kubernetes.ha.KubernetesClusterService;
import org.apache.camel.component.kubernetes.springboot.ha.KubernetesClusterServiceAutoConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNull;

/**
 * Testing that the service is not enabled by default.
 */
@RunWith(SpringRunner.class)
@SpringBootApplication
@ContextConfiguration(classes = KubernetesClusterServiceAutoConfiguration.class)
public class KubernetesClusterServiceAutoConfigurationDisabledTest {

    @Autowired(required = false)
    private KubernetesClusterService clusterService;

    @Test
    public void testPropertiesMapped() {
        assertNull(clusterService);
    }

}

