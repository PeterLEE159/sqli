/*
 * Copyright 2020 io.xream.sqli
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.xream.sqli.cache;

import io.xream.sqli.builder.BuildingBlock;
import io.xream.sqli.builder.Criteria;
import io.xream.sqli.builder.KV;
import io.xream.sqli.builder.Sort;
import io.xream.sqli.util.SqliStringUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @Author Sim
 */
public interface CriteriaCacheKeyBuildable {

    default String buildCacheKey(Criteria criteria){
        return buildCacheKey(criteria,false);
    }

    default String buildCacheKeyOfTotalRows(Criteria criteria){
        return buildCacheKey(criteria,true);
    }

   String buildCacheKey(Criteria criteria, boolean isOfTotalRows);

}
