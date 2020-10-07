package com.github.currencies.rates.payload;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "asset_id_base",
        "rates"
})
public class CurrentRates {

    @JsonProperty("asset_id_base")
    private String assetIdBase;

    @JsonProperty("rates")
    private List<Rate> rates = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("asset_id_base")
    public String getAssetIdBase() {
        return assetIdBase;
    }

    @JsonProperty("asset_id_base")
    public void setAssetIdBase(String assetIdBase) {
        this.assetIdBase = assetIdBase;
    }

    @JsonProperty("rates")
    public List<Rate> getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}