package com.example.search;

import android.content.ClipData;

import java.util.ArrayList;
import java.util.List;

public class GitResult {
    private int totalCount;
    private boolean incompleteResults;
    private List<ClipData.Item> items = new ArrayList<>();

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<ClipData.Item> getItems() {
        return items;
    }

    public void setItems(List<ClipData.Item> items) {
        this.items = items;
    }
}
