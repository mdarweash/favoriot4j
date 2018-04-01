
package com.qoudra.favoriot.beans.generated;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GetAllDevicesResponse {

    private int numResults;
    private List<Result> results = new ArrayList<Result>();

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numResults", numResults).append("results", results).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numResults).append(results).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAllDevicesResponse) == false) {
            return false;
        }
        GetAllDevicesResponse rhs = ((GetAllDevicesResponse) other);
        return new EqualsBuilder().append(numResults, rhs.numResults).append(results, rhs.results).isEquals();
    }

}
