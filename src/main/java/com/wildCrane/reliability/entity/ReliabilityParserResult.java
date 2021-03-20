package com.wildCrane.reliability.entity;

import com.wildCrane.reliability.entity.rf.TRFRawRelResult;
import com.wildCrane.reliability.entity.rf.TRFSummResult;

import java.util.List;

public class ReliabilityParserResult<R,S> {
    private FileResult fileResults;

    private RunRecordResult runRecordResults;

    private List<TRFRawRelResult> rawRelResults;

    private List<TRFSummResult> summResults;

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

    public List<TRFRawRelResult> getRawRelResults() {
        return rawRelResults;
    }

    public void setRawRelResults(List<TRFRawRelResult> rawRelResults) {
        this.rawRelResults = rawRelResults;
    }

    public List<TRFSummResult> getSummResults() {
        return summResults;
    }

    public void setSummResults(List<TRFSummResult> summResults) {
        this.summResults = summResults;
    }
}
