/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Delimited text write settings.
 */
public class DelimitedTextWriteSetting extends FormatWriteSetting {
    /**
     * Indicates whether string values should always be enclosed with quotes.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "quoteAllText")
    private Object quoteAllText;

    /**
     * The file extension used to create the files. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "fileExtension", required = true)
    private Object fileExtension;

    /**
     * Get indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     *
     * @return the quoteAllText value
     */
    public Object quoteAllText() {
        return this.quoteAllText;
    }

    /**
     * Set indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     *
     * @param quoteAllText the quoteAllText value to set
     * @return the DelimitedTextWriteSetting object itself.
     */
    public DelimitedTextWriteSetting withQuoteAllText(Object quoteAllText) {
        this.quoteAllText = quoteAllText;
        return this;
    }

    /**
     * Get the file extension used to create the files. Type: string (or Expression with resultType string).
     *
     * @return the fileExtension value
     */
    public Object fileExtension() {
        return this.fileExtension;
    }

    /**
     * Set the file extension used to create the files. Type: string (or Expression with resultType string).
     *
     * @param fileExtension the fileExtension value to set
     * @return the DelimitedTextWriteSetting object itself.
     */
    public DelimitedTextWriteSetting withFileExtension(Object fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }

}
