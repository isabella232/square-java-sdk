
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import java.util.Objects;


/**
 * This is a model class for V1Category type.
 */
public class V1Category {
    private HttpContext httpContext;
    private final String id;
    private final String name;
    private final String v2Id;

    /**
     * Initialization constructor.
     * @param id String value for id.
     * @param name String value for name.
     * @param v2Id String value for v2Id.
     */
    @JsonCreator
    public V1Category(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("v2_id") String v2Id) {
        this.id = id;
        this.name = name;
        this.v2Id = v2Id;
    }

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Id.
     * The category's unique ID.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Getter for Name.
     * The category's name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    /**
     * Getter for V2Id.
     * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple
     * locations share the same v2 ID.
     * @return Returns the String
     */
    @JsonGetter("v2_id")
    public String getV2Id() {
        return this.v2Id;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(id, name, v2Id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1Category)) {
            return false;
        }
        V1Category other = (V1Category) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(name, other.name)
            && Objects.equals(v2Id, other.v2Id);
    }

    /**
     * Builds a new {@link V1Category.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1Category.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .id(getId())
            .name(getName())
            .v2Id(getV2Id());
        return builder;
    }

    /**
     * Class to build instances of {@link V1Category}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private String id;
        private String name;
        private String v2Id;



        /**
         * Setter for httpContext.
         * @param httpContext HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for id.
         * @param id String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param name String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for v2Id.
         * @param v2Id String value for v2Id.
         * @return Builder
         */
        public Builder v2Id(String v2Id) {
            this.v2Id = v2Id;
            return this;
        }

        /**
         * Builds a new {@link V1Category} object using the set fields.
         * @return {@link V1Category}
         */
        public V1Category build() {
            V1Category model =
                    new V1Category(id,
                            name,
                            v2Id);
            model.httpContext = httpContext;
            return model;
        }
    }
}
