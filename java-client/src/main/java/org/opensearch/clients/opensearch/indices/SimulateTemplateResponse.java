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

package org.opensearch.clients.opensearch.indices;

import org.opensearch.clients.opensearch.indices.simulate_template.Template;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: indices.simulate_template.Response

@JsonpDeserializable
public class SimulateTemplateResponse implements JsonpSerializable {
	private final Template template;

	// ---------------------------------------------------------------------------------------------

	private SimulateTemplateResponse(Builder builder) {

		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");

	}

	public static SimulateTemplateResponse of(Function<Builder, ObjectBuilder<SimulateTemplateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code template}
	 */
	public final Template template() {
		return this.template;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("template");
		this.template.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateTemplateResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimulateTemplateResponse> {
		private Template template;

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(Template value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(Function<Template.Builder, ObjectBuilder<Template>> fn) {
			return this.template(fn.apply(new Template.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateTemplateResponse build() {
			_checkSingleUse();

			return new SimulateTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateTemplateResponse}
	 */
	public static final JsonpDeserializer<SimulateTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateTemplateResponse::setupSimulateTemplateResponseDeserializer);

	protected static void setupSimulateTemplateResponseDeserializer(
			ObjectDeserializer<SimulateTemplateResponse.Builder> op) {

		op.add(Builder::template, Template._DESERIALIZER, "template");

	}

}