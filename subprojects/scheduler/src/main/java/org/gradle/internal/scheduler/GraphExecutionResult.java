/*
 * Copyright 2018 the original author or authors.
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

package org.gradle.internal.scheduler;

import java.util.List;

public class GraphExecutionResult {
    private final List<Node> liveNodes;
    private final List<Node> executedNodes;
    private final List<Node> filteredNodes;
    private final List<Throwable> failures;

    public GraphExecutionResult(List<Node> liveNodes, List<Node> executedNodes, List<Node> filteredNodes, List<Throwable> failures) {
        this.liveNodes = liveNodes;
        this.executedNodes = executedNodes;
        this.filteredNodes = filteredNodes;
        this.failures = failures;
    }

    public List<Node> getLiveNodes() {
        return liveNodes;
    }

    public List<Node> getExecutedNodes() {
        return executedNodes;
    }

    public List<Node> getFilteredNodes() {
        return filteredNodes;
    }

    public List<Throwable> getFailures() {
        return failures;
    }
}
