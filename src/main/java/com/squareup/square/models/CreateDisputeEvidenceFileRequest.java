
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for CreateDisputeEvidenceFileRequest type.
 */
public class CreateDisputeEvidenceFileRequest {
    private final String idempotencyKey;
    private final String evidenceType;
    private final String contentType;

    /**
     * Initialization constructor.
     * @param idempotencyKey String value for idempotencyKey.
     * @param evidenceType String value for evidenceType.
     * @param contentType String value for contentType.
     */
    @JsonCreator
    public CreateDisputeEvidenceFileRequest(
            @JsonProperty("idempotency_key") String idempotencyKey,
            @JsonProperty("evidence_type") String evidenceType,
            @JsonProperty("content_type") String contentType) {
        this.idempotencyKey = idempotencyKey;
        this.evidenceType = evidenceType;
        this.contentType = contentType;
    }

    /**
     * Getter for IdempotencyKey.
     * Unique ID. For more information, see
     * [Idempotency](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
     * @return Returns the String
     */
    @JsonGetter("idempotency_key")
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /**
     * Getter for EvidenceType.
     * Type of the dispute evidence.
     * @return Returns the String
     */
    @JsonGetter("evidence_type")
    public String getEvidenceType() {
        return this.evidenceType;
    }

    /**
     * Getter for ContentType.
     * The MIME type of the uploaded file. One of image/heic, image/heif, image/jpeg,
     * application/pdf, image/png, image/tiff.
     * @return Returns the String
     */
    @JsonGetter("content_type")
    public String getContentType() {
        return this.contentType;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(idempotencyKey, evidenceType, contentType);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateDisputeEvidenceFileRequest)) {
            return false;
        }
        CreateDisputeEvidenceFileRequest other = (CreateDisputeEvidenceFileRequest) obj;
        return Objects.equals(idempotencyKey, other.idempotencyKey)
            && Objects.equals(evidenceType, other.evidenceType)
            && Objects.equals(contentType, other.contentType);
    }

    /**
     * Builds a new {@link CreateDisputeEvidenceFileRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateDisputeEvidenceFileRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(idempotencyKey)
            .evidenceType(getEvidenceType())
            .contentType(getContentType());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateDisputeEvidenceFileRequest}.
     */
    public static class Builder {
        private String idempotencyKey;
        private String evidenceType;
        private String contentType;

        /**
         * Initialization constructor.
         * @param idempotencyKey String value for idempotencyKey.
         */
        public Builder(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
        }

        /**
         * Setter for idempotencyKey.
         * @param idempotencyKey String value for idempotencyKey.
         * @return Builder
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * Setter for evidenceType.
         * @param evidenceType String value for evidenceType.
         * @return Builder
         */
        public Builder evidenceType(String evidenceType) {
            this.evidenceType = evidenceType;
            return this;
        }

        /**
         * Setter for contentType.
         * @param contentType String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Builds a new {@link CreateDisputeEvidenceFileRequest} object using the set fields.
         * @return {@link CreateDisputeEvidenceFileRequest}
         */
        public CreateDisputeEvidenceFileRequest build() {
            return new CreateDisputeEvidenceFileRequest(idempotencyKey,
                evidenceType,
                contentType);
        }
    }
}
