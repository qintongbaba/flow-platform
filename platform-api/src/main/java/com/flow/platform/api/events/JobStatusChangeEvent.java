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

package com.flow.platform.api.events;

import com.flow.platform.api.domain.job.JobStatus;
import java.math.BigInteger;
import org.springframework.context.ApplicationEvent;

/**
 * @author yang
 */
public class JobStatusChangeEvent extends ApplicationEvent {

    private final BigInteger jobId;

    private final JobStatus from;

    private final JobStatus to;

    public JobStatusChangeEvent(Object sender, BigInteger jobId, JobStatus from, JobStatus to) {
        super(sender);
        this.jobId = jobId;
        this.from = from;
        this.to = to;
    }

    public BigInteger getJobId() {
        return jobId;
    }

    public JobStatus getFrom() {
        return from;
    }

    public JobStatus getTo() {
        return to;
    }
}
