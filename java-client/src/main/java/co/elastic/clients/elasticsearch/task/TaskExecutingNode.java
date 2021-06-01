/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.task;

import co.elastic.clients.elasticsearch._spec_utils.BaseNode;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: task._types.TaskExecutingNode
public final class TaskExecutingNode extends BaseNode {
	private final JsonValue tasks;

	// ---------------------------------------------------------------------------------------------

	protected TaskExecutingNode(Builder builder) {
		super(builder);
		this.tasks = Objects.requireNonNull(builder.tasks, "tasks");

	}

	/**
	 * API name: {@code tasks}
	 */
	public JsonValue tasks() {
		return this.tasks;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("tasks");
		generator.write(this.tasks);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskExecutingNode}.
	 */
	public static class Builder extends BaseNode.AbstractBuilder<Builder> implements ObjectBuilder<TaskExecutingNode> {
		private JsonValue tasks;

		/**
		 * API name: {@code tasks}
		 */
		public Builder tasks(JsonValue value) {
			this.tasks = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TaskExecutingNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskExecutingNode build() {

			return new TaskExecutingNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TaskExecutingNode
	 */
	public static final JsonpValueParser<TaskExecutingNode> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TaskExecutingNode::setupTaskExecutingNodeParser);

	protected static void setupTaskExecutingNodeParser(DelegatingJsonpValueParser<TaskExecutingNode.Builder> op) {
		BaseNode.setupBaseNodeParser(op);
		op.add(Builder::tasks, JsonpValueParser.jsonValueParser(), "tasks");

	}

}