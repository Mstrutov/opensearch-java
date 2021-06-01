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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.NodeStatistics;
import co.elastic.clients.elasticsearch.watcher.stats.WatcherNodeStats;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.stats.Response
public final class StatsResponse implements ToJsonp {
	private final String clusterName;

	private final Boolean manuallyStopped;

	private final List<WatcherNodeStats> stats;

	private final NodeStatistics _nodes;

	// ---------------------------------------------------------------------------------------------

	protected StatsResponse(Builder builder) {

		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.manuallyStopped = Objects.requireNonNull(builder.manuallyStopped, "manually_stopped");
		this.stats = Objects.requireNonNull(builder.stats, "stats");
		this._nodes = Objects.requireNonNull(builder._nodes, "_nodes");

	}

	/**
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code manually_stopped}
	 */
	public Boolean manuallyStopped() {
		return this.manuallyStopped;
	}

	/**
	 * API name: {@code stats}
	 */
	public List<WatcherNodeStats> stats() {
		return this.stats;
	}

	/**
	 * API name: {@code _nodes}
	 */
	public NodeStatistics _nodes() {
		return this._nodes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("manually_stopped");
		generator.write(this.manuallyStopped);

		generator.writeKey("stats");
		generator.writeStartArray();
		for (WatcherNodeStats item0 : this.stats) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("_nodes");
		this._nodes.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StatsResponse> {
		private String clusterName;

		private Boolean manuallyStopped;

		private List<WatcherNodeStats> stats;

		private NodeStatistics _nodes;

		/**
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code manually_stopped}
		 */
		public Builder manuallyStopped(Boolean value) {
			this.manuallyStopped = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(List<WatcherNodeStats> value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(WatcherNodeStats... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stats(List)}, creating the list if needed.
		 */
		public Builder addStats(WatcherNodeStats value) {
			if (this.stats == null) {
				this.stats = new ArrayList<>();
			}
			this.stats.add(value);
			return this;
		}

		/**
		 * Set {@link #stats(List)} to a singleton list.
		 */
		public Builder stats(Function<WatcherNodeStats.Builder, ObjectBuilder<WatcherNodeStats>> fn) {
			return this.stats(fn.apply(new WatcherNodeStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #stats(List)}, creating the list if needed.
		 */
		public Builder addStats(Function<WatcherNodeStats.Builder, ObjectBuilder<WatcherNodeStats>> fn) {
			return this.addStats(fn.apply(new WatcherNodeStats.Builder()).build());
		}

		/**
		 * API name: {@code _nodes}
		 */
		public Builder _nodes(NodeStatistics value) {
			this._nodes = value;
			return this;
		}

		/**
		 * API name: {@code _nodes}
		 */
		public Builder _nodes(Function<NodeStatistics.Builder, ObjectBuilder<NodeStatistics>> fn) {
			return this._nodes(fn.apply(new NodeStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link StatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsResponse build() {

			return new StatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for StatsResponse
	 */
	public static final JsonpValueParser<StatsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, StatsResponse::setupStatsResponseParser);

	protected static void setupStatsResponseParser(DelegatingJsonpValueParser<StatsResponse.Builder> op) {

		op.add(Builder::clusterName, JsonpValueParser.stringParser(), "cluster_name");
		op.add(Builder::manuallyStopped, JsonpValueParser.booleanParser(), "manually_stopped");
		op.add(Builder::stats, JsonpValueParser.arrayParser(WatcherNodeStats.JSONP_PARSER), "stats");
		op.add(Builder::_nodes, NodeStatistics.JSONP_PARSER, "_nodes");

	}

}