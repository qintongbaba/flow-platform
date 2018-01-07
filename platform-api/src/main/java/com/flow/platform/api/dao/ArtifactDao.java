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

package com.flow.platform.api.dao;

import com.flow.platform.api.domain.Artifact;
import com.flow.platform.core.dao.BaseDao;
import com.flow.platform.core.domain.Page;
import com.flow.platform.core.domain.Pageable;
import java.math.BigInteger;
import java.util.List;

/**
 * @author yh@firim
 */
public interface ArtifactDao extends BaseDao<Integer, Artifact> {

    List<Artifact> list(BigInteger jobId);

    Page<Artifact> list(BigInteger jobId, Pageable pageable);
}
