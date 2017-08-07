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
package com.flow.platform.api.service;

import com.flow.platform.api.domain.Job;
import com.flow.platform.api.domain.JobNode;
import com.flow.platform.api.domain.Node;
import java.math.BigInteger;

/**
 * @author yh@firim
 */
public interface JobNodeService {

    /**
     * create node and children
     */
    JobNode create(Job job);

    /**
     * find node by node path
     */
    JobNode find(String nodePath, BigInteger jobId);

    /**
     * save node
     */
    JobNode save(BigInteger jobId, Node node);

    JobNode update(JobNode jobNode);


    /**
     * create job node by node path
     *
     * @param nodePath can copy every node
     */
//    JobNode createJobNode(String nodePath, BigInteger jobId);

}
