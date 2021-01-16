package com.wildCrane.reliability.entity;

import java.util.List;

public class ReliabilityParserResult<R,S> {
    private FileResult fileResults;

    private RunRecordResult runRecordResults;

    private List<R> rawRelResults;

    private List<S> summResults;

    public FileResult getFileResults() {
        return fileResults;
    }

    public void setFileResults(FileResult fileResults) {
        this.fileResults = fileResults;
    }

    public RunRecordResult getRunRecordResults() {
        return runRecordResults;
    }

    public void setRunRecordResults(RunRecordResult runRecordResults) {
        this.runRecordResults = runRecordResults;
    }

    public List<R> getRawRelResults() {
        return rawRelResults;
    }

    public void setRawRelResults(List<R> rawRelResult) {
        this.rawRelResults = rawRelResult;
    }

    public List<S> getSummResults() {
        return summResults;
    }

    public void setSummResults(List<S> summResult) {
        this.summResults = summResult;
    }
}
