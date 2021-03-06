
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for TipSettings type.
 */
public class TipSettings {
    private final Boolean allowTipping;
    private final Boolean separateTipScreen;
    private final Boolean customTipField;

    /**
     * Initialization constructor.
     * @param allowTipping Boolean value for allowTipping.
     * @param separateTipScreen Boolean value for separateTipScreen.
     * @param customTipField Boolean value for customTipField.
     */
    @JsonCreator
    public TipSettings(
            @JsonProperty("allow_tipping") Boolean allowTipping,
            @JsonProperty("separate_tip_screen") Boolean separateTipScreen,
            @JsonProperty("custom_tip_field") Boolean customTipField) {
        this.allowTipping = allowTipping;
        this.separateTipScreen = separateTipScreen;
        this.customTipField = customTipField;
    }

    /**
     * Getter for AllowTipping.
     * Indicates whether tipping is enabled for this checkout. Defaults to false.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_tipping")
    public Boolean getAllowTipping() {
        return this.allowTipping;
    }

    /**
     * Getter for SeparateTipScreen.
     * Indicates whether tip options should be presented on their own screen before presenting the
     * signature screen during card payment. Defaults to false.
     * @return Returns the Boolean
     */
    @JsonGetter("separate_tip_screen")
    public Boolean getSeparateTipScreen() {
        return this.separateTipScreen;
    }

    /**
     * Getter for CustomTipField.
     * Indicates whether custom tip amounts are allowed during the checkout flow. Defaults to false.
     * @return Returns the Boolean
     */
    @JsonGetter("custom_tip_field")
    public Boolean getCustomTipField() {
        return this.customTipField;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(allowTipping, separateTipScreen, customTipField);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TipSettings)) {
            return false;
        }
        TipSettings other = (TipSettings) obj;
        return Objects.equals(allowTipping, other.allowTipping)
            && Objects.equals(separateTipScreen, other.separateTipScreen)
            && Objects.equals(customTipField, other.customTipField);
    }

    /**
     * Builds a new {@link TipSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TipSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .allowTipping(getAllowTipping())
            .separateTipScreen(getSeparateTipScreen())
            .customTipField(getCustomTipField());
        return builder;
    }

    /**
     * Class to build instances of {@link TipSettings}.
     */
    public static class Builder {
        private Boolean allowTipping;
        private Boolean separateTipScreen;
        private Boolean customTipField;



        /**
         * Setter for allowTipping.
         * @param allowTipping Boolean value for allowTipping.
         * @return Builder
         */
        public Builder allowTipping(Boolean allowTipping) {
            this.allowTipping = allowTipping;
            return this;
        }

        /**
         * Setter for separateTipScreen.
         * @param separateTipScreen Boolean value for separateTipScreen.
         * @return Builder
         */
        public Builder separateTipScreen(Boolean separateTipScreen) {
            this.separateTipScreen = separateTipScreen;
            return this;
        }

        /**
         * Setter for customTipField.
         * @param customTipField Boolean value for customTipField.
         * @return Builder
         */
        public Builder customTipField(Boolean customTipField) {
            this.customTipField = customTipField;
            return this;
        }

        /**
         * Builds a new {@link TipSettings} object using the set fields.
         * @return {@link TipSettings}
         */
        public TipSettings build() {
            return new TipSettings(allowTipping,
                separateTipScreen,
                customTipField);
        }
    }
}
